package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Cookie used in <request> and <response> objects.
 *
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#cookies">specification</a>
 */
@JsonPropertyOrder({
        "name",
        "value",
        "path",
        "domain",
        "expires",
        "httpOnly",
        "secure",
        "comment"
})
public class HarCookie {

    private String name;
    private String value;
    private String path;
    private String domain;
    private String expires;
    private boolean httpOnly;
    private boolean secure;
    private String comment;

    @JsonCreator
    public HarCookie(@JsonProperty("name") String name, @JsonProperty("value") String value,
                     @JsonProperty("path") String path, @JsonProperty("domain") String domain,
                     @JsonProperty("expires") String expires, @JsonProperty("httpOnly") boolean httpOnly,
                     @JsonProperty("secure") boolean secure, @JsonProperty("comment") String comment) {
        this.name = name;
        this.value = value;
        this.path = path;
        this.domain = domain;
        this.expires = expires;
        this.httpOnly = httpOnly;
        this.secure = secure;
        this.comment = comment;
    }

    public String getExpires() {
        return expires;
    }

    public String getName() {
        return name;
    }

    public boolean getSecure() {
        return secure;
    }

    public String getDomain() {
        return domain;
    }

    public String getPath() {
        return path;
    }

    public String getValue() {
        return value;
    }

    public boolean getHttpOnly() {
        return httpOnly;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "HarCookie [expires = " + expires + ", name = " + name + ", secure = " + secure + ", domain = " + domain + ", path = " + path + ", value = " + value + ", httpOnly = " + httpOnly + ", comment = " + comment + "]";
    }
}

