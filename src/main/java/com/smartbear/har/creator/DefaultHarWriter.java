package com.smartbear.har.creator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.smartbear.har.model.HarLog;
import com.smartbear.har.model.HarLogRoot;

import java.io.File;
import java.io.IOException;

public class DefaultHarWriter implements HarWriter {
    private final JsonFactory jsonFactory = new JsonFactory();

    @Override
    public void writeHarLogToFile(HarLog harLog, File logFile) throws IOException {
        JsonGenerator jsonGenerator = jsonFactory.createGenerator(logFile, JsonEncoding.UTF8);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            jsonGenerator.setCodec(objectMapper);
            jsonGenerator.writeObject(new HarLogRoot(harLog));
        } finally {
            jsonGenerator.flush();
            jsonGenerator.close();
        }
    }
}
