package com.smartbear.har.builder;

import com.smartbear.har.model.HarParams;

public class HarParamsBuilder {
    private String name;
    private String value;
    private String fileName;
    private String contentType;
    private String comment;

    public HarParamsBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HarParamsBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public HarParamsBuilder setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public HarParamsBuilder setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public HarParamsBuilder setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarParams createHarParams() {
        return new HarParams(name, value, fileName, contentType, comment);
    }
}