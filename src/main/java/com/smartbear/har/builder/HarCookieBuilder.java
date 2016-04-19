package com.smartbear.har.builder;

import com.smartbear.har.model.HarCookie;

public class HarCookieBuilder {
    private String name;
    private String value;
    private String path;
    private String domain;
    private String expires;
    private boolean httpOnly;
    private boolean secure;
    private String comment;

    public HarCookieBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public HarCookieBuilder withValue(String value) {
        this.value = value;
        return this;
    }

    public HarCookieBuilder withPath(String path) {
        this.path = path;
        return this;
    }

    public HarCookieBuilder withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public HarCookieBuilder withExpires(String expires) {
        this.expires = expires;
        return this;
    }

    public HarCookieBuilder withHttpOnly(boolean httpOnly) {
        this.httpOnly = httpOnly;
        return this;
    }

    public HarCookieBuilder withSecure(boolean secure) {
        this.secure = secure;
        return this;
    }

    public HarCookieBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarCookie build() {
        return new HarCookie(name, value, path, domain, expires, httpOnly, secure, comment);
    }
}