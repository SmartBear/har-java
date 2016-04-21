package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "onContentLoad",
        "onLoad",
        "comment"
})
public class HarPageTimings {

    private long onContentLoad;
    private long onLoad;
    private String comment;

    @JsonCreator
    public HarPageTimings(@JsonProperty("onContentLoad") long onContentLoad, @JsonProperty("onLoad") long onLoad,
                          @JsonProperty("comment") String comment) {
        this.onContentLoad = onContentLoad;
        this.onLoad = onLoad;
        this.comment = comment;
    }

    public long getOnContentLoad() {
        return onContentLoad;
    }

    public long getOnLoad() {
        return onLoad;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "HarPageTimings [onLoad = " + onLoad + ", onContentLoad = " + onContentLoad + ", comment = " + comment + "]";
    }

}
