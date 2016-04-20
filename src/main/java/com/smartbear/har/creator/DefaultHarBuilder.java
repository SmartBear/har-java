package com.smartbear.har.creator;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartbear.har.model.HarEntry;
import com.smartbear.har.model.HarLog;

import java.io.File;
import java.io.IOException;

public class DefaultHarBuilder implements HarBuilder {

    private final JsonFactory jfactory = new JsonFactory();
    private final JsonGenerator jGenerator;

    public DefaultHarBuilder(File harFile, HarLog harLog) throws IOException {
        jGenerator = jfactory.createGenerator(harFile, JsonEncoding.UTF8);

        jGenerator.enable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        jGenerator.enable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
        jGenerator.setCodec(new ObjectMapper());
        jGenerator.useDefaultPrettyPrinter();

        jGenerator.writeStartObject();
        jGenerator.writeFieldName("log");
        jGenerator.writeStartObject();
        jGenerator.writeFieldName("comment");
        jGenerator.writeObject(harLog.getComment());
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
}