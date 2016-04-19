package com.smartbear.har.builder;

import com.smartbear.har.model.HarCreator;

public class HarCreatorBuilder {
    private String name;
    private String comment;
    private String version;

    public HarCreatorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HarCreatorBuilder setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarCreatorBuilder setVersion(String version) {
        this.version = version;
        return this;
    }

    public HarCreator createHarCreator() {
        return new HarCreator(name, comment, version);
    }
}