package com.smartbear.har.builder;

import com.smartbear.har.model.HarPageTimings;

public class HarPageTimingsBuilder {
    private long onContentLoad = -1L;
    private long onLoad = -1L;
    private String comment;

    public HarPageTimingsBuilder withOnContentLoad(long onContentLoad) {
        this.onContentLoad = onContentLoad;
        return this;
    }

    public HarPageTimingsBuilder withOnLoad(long onLoad) {
        this.onLoad = onLoad;
        return this;
    }

    public HarPageTimingsBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarPageTimings build() {
        return new HarPageTimings(onContentLoad, onLoad, comment);
    }
}