package com.smartbear.har.builder;

import com.smartbear.har.model.HarCache;
import com.smartbear.har.model.HarCacheRequest;

public class HarCacheBuilder {
    private HarCacheRequest beforeRequest;
    private HarCacheRequest afterRequest;
    private String comment;

    public HarCacheBuilder withBeforeRequest(HarCacheRequest beforeRequest) {
        this.beforeRequest = beforeRequest;
        return this;
    }

    public HarCacheBuilder withAfterRequest(HarCacheRequest afterRequest) {
        this.afterRequest = afterRequest;
        return this;
    }

    public HarCacheBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarCache build() {
        return new HarCache(beforeRequest, afterRequest, comment);
    }
}