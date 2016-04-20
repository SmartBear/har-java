package com.smartbear.har.creator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartbear.har.builder.HarEntryBuilder;
import com.smartbear.har.builder.HarLogBuilder;
import com.smartbear.har.model.HarLogRoot;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DefaultHarBuilderTest {

    private File tempHarFile;
    private HarBuilder harBuilder;

    @Before
    public void setUp() throws Exception {
        tempHarFile = File.createTempFile("virt", ".har");
        System.err.println("HAR file " + tempHarFile.getAbsolutePath());
        harBuilder = new DefaultHarBuilder(tempHarFile, new HarLogBuilder().withComment("Test Har").build());
    }

    @After
    public void tearDown() throws Exception {
        tempHarFile.deleteOnExit();
    }

    @Test
    public void harBuilderAppendsMultipleEntriesToHarLog() throws Exception {
        harBuilder.addEntry(new HarEntryBuilder().withComment("Test Entry").build());
        harBuilder.addEntry(new HarEntryBuilder().withComment("Another Test Entry").build());
        harBuilder.closeHar();

        ObjectMapper mapper = new ObjectMapper();
        HarLogRoot harLogRoot = mapper.readValue(tempHarFile, HarLogRoot.class);

        assertThat(harLogRoot.getLog().getEntries().size(), is(2));
    }
}