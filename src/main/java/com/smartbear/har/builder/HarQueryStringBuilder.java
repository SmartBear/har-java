package com.smartbear.har.builder;

import com.smartbear.har.model.HarQueryString;

public class HarQueryStringBuilder {
    private String name;
    private String value;
    private String comment;

    public HarQueryStringBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public HarQueryStringBuilder setValue(String value) {
        this.value = value;
        return this;
    }

    public HarQueryStringBuilder setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarQueryString createHarQueryString() {
        return new HarQueryString(name, value, comment);
    }
}