package com.smartbear.har.builder;

import com.smartbear.har.model.HarHeader;

public class HarHeaderBuilder {
    private String name;
    private String value;
    private String comment;

    public HarHeaderBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public HarHeaderBuilder withValue(String value) {
        this.value = value;
        return this;
    }

    public HarHeaderBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarHeader build() {
        return new HarHeader(name, value, comment);
    }
}