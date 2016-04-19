package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This objects contains info about a request coming from browser cache.
 *
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#cache">specification</a>
 */
@JsonPropertyOrder({
        "beforeRequest",
        "afterRequest",
        "comment"
})
public class HarCache {

    @JsonProperty("beforeRequest")
    private HarCacheRequest beforeRequest;
    @JsonProperty("afterRequest")
    private HarCacheRequest afterRequest;
    @JsonProperty("comment")
    private String comment;

    public HarCache(HarCacheRequest beforeRequest, HarCacheRequest afterRequest, String comment) {
        this.beforeRequest = beforeRequest;
        this.afterRequest = afterRequest;
        this.comment = comment;
    }

    public HarCacheRequest getBeforeRequest() {
        return beforeRequest;
    }

    public void setBeforeRequest(HarCacheRequest beforeRequest) {
        this.beforeRequest = beforeRequest;
    }

    public HarCacheRequest getAfterRequest() {
        return afterRequest;
    }

    public void setAfterRequest(HarCacheRequest afterRequest) {
        this.afterRequest = afterRequest;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "HarCache [beforeRequest = " + beforeRequest + ", afterRequest = " + afterRequest + ", comment = " + comment + "]";
    }
}


