package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This objects contains info about a request coming from browser cache.
 *
 * @see <a href=
 *      "http://www.softwareishard.com/blog/har-12-spec/#cache">specification</a>
 */
@JsonPropertyOrder({
        "beforeRequest",
        "afterRequest",
        "comment"
})
public class HarCache {

    private HarCacheRequest beforeRequest;
    private HarCacheRequest afterRequest;
    private String comment;

    @JsonCreator
    public HarCache() {
    }

    @JsonCreator
    public HarCache(@JsonProperty("beforeRequest") HarCacheRequest beforeRequest,
            @JsonProperty("afterRequest") HarCacheRequest afterRequest, @JsonProperty("comment") String comment) {
        this.beforeRequest = beforeRequest;
        this.afterRequest = afterRequest;
        this.comment = comment;
    }

    public HarCacheRequest getBeforeRequest() {
        return beforeRequest;
    }

    public HarCacheRequest getAfterRequest() {
        return afterRequest;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "HarCache [beforeRequest = " + beforeRequest + ", afterRequest = " + afterRequest + ", comment = "
                + comment + "]";
    }
}
