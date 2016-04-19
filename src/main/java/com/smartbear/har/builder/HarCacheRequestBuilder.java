package com.smartbear.har.builder;

import com.smartbear.har.model.HarCacheRequest;

import java.util.Date;

public class HarCacheRequestBuilder {
    private Date expires;
    private Date lastAccess;
    private String eTag;
    private Long hitCount;
    private String comment;

    public HarCacheRequestBuilder withExpires(Date expires) {
        this.expires = expires;
        return this;
    }

    public HarCacheRequestBuilder withLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
        return this;
    }

    public HarCacheRequestBuilder witheTag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    public HarCacheRequestBuilder withHitCount(Long hitCount) {
        this.hitCount = hitCount;
        return this;
    }

    public HarCacheRequestBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarCacheRequest build() {
        return new HarCacheRequest(expires, lastAccess, eTag, hitCount, comment);
    }
}