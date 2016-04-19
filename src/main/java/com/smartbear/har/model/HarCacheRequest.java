package com.smartbear.har.model;

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

    @JsonProperty("expires")
    private Date expires;
    @JsonProperty("lastAccess")
    private Date lastAccess;
    @JsonProperty("eTag")
    private String eTag;
    @JsonProperty("hitCount")
    private Long hitCount;
    @JsonProperty("comment")
    private String comment;

    public String getETag() {
        return eTag;
    }

    public void setETag(String eTag) {
        this.eTag = eTag;
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public Long getHitCount() {
        return hitCount;
    }

    public void setHitCount(Long hitCount) {
        this.hitCount = hitCount;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "HarCacheRequest [eTag = " + eTag + ", expires = " + expires + ", hitCount = " + hitCount + ", lastAccess = " + lastAccess + ", comment = " + comment + "]";
    }
}
