package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "onContentLoad",
        "onLoad",
        "comment"
})
public class HarPageTimings {
    @JsonProperty("onContentLoad")
    private long onContentLoad;
    @JsonProperty("onLoad")
    private long onLoad;
    @JsonProperty("comment")
    private String comment;

    public HarPageTimings(long onContentLoad, long onLoad, String comment) {
        this.onContentLoad = onContentLoad;
        this.onLoad = onLoad;
        this.comment = comment;
    }

    public long getOnContentLoad() {
        return onContentLoad;
    }

    public void setOnContentLoad(long onContentLoad) {
        this.onContentLoad = onContentLoad;
    }

    public long getOnLoad() {
        return onLoad;
    }

    public void setOnLoad(long onLoad) {
        this.onLoad = onLoad;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
