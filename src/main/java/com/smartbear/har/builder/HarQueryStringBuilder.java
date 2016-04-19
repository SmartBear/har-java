package com.smartbear.har.builder;

import com.smartbear.har.model.HarQueryString;

public class HarQueryStringBuilder {
    private String name;
    private String value;
    private String comment;

    public HarQueryStringBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public HarQueryStringBuilder withValue(String value) {
        this.value = value;
        return this;
    }

    public HarQueryStringBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarQueryString build() {
        return new HarQueryString(name, value, comment);
    }
}