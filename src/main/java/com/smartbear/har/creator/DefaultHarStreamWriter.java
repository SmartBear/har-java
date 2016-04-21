package com.smartbear.har.creator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartbear.har.model.HarBrowser;
import com.smartbear.har.model.HarCreator;
import com.smartbear.har.model.HarEntry;
import com.smartbear.har.model.HarPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DefaultHarStreamWriter implements HarStreamWriter {

    private final JsonGenerator jGenerator;

    private DefaultHarStreamWriter(File harFile, String version, HarCreator creator, HarBrowser browser, List<HarPage> pages, String comment, boolean usePrettyPrint) throws IOException {
        jGenerator = new JsonFactory().createGenerator(harFile, JsonEncoding.UTF8);
        jGenerator.setCodec(new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL));
        if (usePrettyPrint) {
            jGenerator.useDefaultPrettyPrinter();
        }

        jGenerator.writeStartObject();
        jGenerator.writeFieldName("log");
        jGenerator.writeStartObject();
        jGenerator.writeFieldName("comment");
        jGenerator.writeObject(comment);
        jGenerator.writeFieldName("browser");
        jGenerator.writeObject(browser);
        jGenerator.writeFieldName("pages");
        jGenerator.writeObject(pages);
        jGenerator.writeFieldName("creator");
        jGenerator.writeObject(creator);
        jGenerator.writeFieldName("version");
        jGenerator.writeObject(version);
        jGenerator.writeFieldName("entries");
        jGenerator.writeStartArray();
    }

    @Override
    public void addEntry(HarEntry harEntry) throws IOException {
        jGenerator.writeObject(harEntry);
        jGenerator.flush();
    }

    public void closeHar() throws IOException {
        jGenerator.writeEndArray();
        jGenerator.writeEndObject();
        jGenerator.close();
    }

    public static class Builder {
        private File harFile;
        private String version = "1.2";
        private HarCreator creator;
        private HarBrowser browser;
        private List<HarPage> pages;
        private String comment;
        private boolean usePrettyPrint = false;

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder withCreator(HarCreator creator) {
            this.creator = creator;
            return this;
        }

        public Builder withBrowser(HarBrowser browser) {
            this.browser = browser;
            return this;
        }

        public Builder withPages(List<HarPage> pages) {
            this.pages = pages;
            return this;
        }

        public Builder withComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder withHarFile(File harFile) {
            this.harFile = harFile;
            return this;
        }

        public Builder withUsePrettyPrint(boolean usePrettyPrint) {
            this.usePrettyPrint = usePrettyPrint;
            return this;
        }


        public DefaultHarStreamWriter build() throws IOException {

            return new DefaultHarStreamWriter(harFile, version, creator, browser, pages, comment, usePrettyPrint);
        }
    }
}