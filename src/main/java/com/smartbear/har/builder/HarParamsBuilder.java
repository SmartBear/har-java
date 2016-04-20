package com.smartbear.har.builder;

import com.smartbear.har.model.HarParam;

public class HarParamsBuilder {
    private String name;
    private String value;
    private String fileName;
    private String contentType;
    private String comment;

    public HarParamsBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public HarParamsBuilder withValue(String value) {
        this.value = value;
        return this;
    }

    public HarParamsBuilder withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public HarParamsBuilder withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public HarParamsBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarParam build() {
        return new HarParam(name, value, fileName, contentType, comment);
    }
}