package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;

@JsonPropertyOrder({
        "expires",
        "lastAccess",
        "eTag",
        "hitCount",
        "comment"
})
public class HarCacheRequest {
    private Date expires;
    private Date lastAccess;
    private String eTag;
    private Long hitCount;
    private String comment;

    @JsonCreator
    public HarCacheRequest(@JsonProperty("expires") Date expires, @JsonProperty("lastAccess") Date lastAccess,
                           @JsonProperty("eTag") String eTag, @JsonProperty("hitCount") Long hitCount,
                           @JsonProperty("comment") String comment) {
        this.expires = expires;
        this.lastAccess = lastAccess;
        this.eTag = eTag;
        this.hitCount = hitCount;
        this.comment = comment;
    }

    public String getETag() {
        return eTag;
    }

    public Date getExpires() {
        return expires;
    }

    public Long getHitCount() {
        return hitCount;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "HarCacheRequest [eTag = " + eTag + ", expires = " + expires + ", hitCount = " + hitCount + ", lastAccess = " + lastAccess + ", comment = " + comment + "]";
    }
}
