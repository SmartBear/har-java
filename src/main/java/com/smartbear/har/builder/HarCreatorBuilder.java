package com.smartbear.har.builder;

import com.smartbear.har.model.HarCreator;

public class HarCreatorBuilder {
    private String name;
    private String comment;
    private String version;

    public HarCreatorBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public HarCreatorBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarCreatorBuilder withVersion(String version) {
        this.version = version;
        return this;
    }

    public HarCreator build() {
        return new HarCreator(name, comment, version);
    }
}