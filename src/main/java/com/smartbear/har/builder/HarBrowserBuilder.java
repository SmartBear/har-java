package com.smartbear.har.builder;

import com.smartbear.har.model.HarBrowser;

public class HarBrowserBuilder {
    private String name;
    private String version;
    private String comment;

    public HarBrowserBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public HarBrowserBuilder withVersion(String version) {
        this.version = version;
        return this;
    }

    public HarBrowserBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarBrowser build() {
        return new HarBrowser(name, version, comment);
    }
}