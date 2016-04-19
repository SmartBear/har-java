package com.smartbear.har.model;

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

    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;
    @JsonProperty("path")
    private String path;
    @JsonProperty("domain")
    private String domain;
    @JsonProperty("expires")
    private String expires;
    @JsonProperty("httpOnly")
    private boolean httpOnly;
    @JsonProperty("secure")
    private boolean secure;
    @JsonProperty("comment")
    private String comment;

    public HarCookie(String name, String value, String path, String domain, String expires, boolean httpOnly, boolean secure, String comment) {
        this.name = name;
        this.value = value;
        this.path = path;
        this.domain = domain;
        this.expires = expires;
        this.httpOnly = httpOnly;
        this.secure = secure;
        this.comment = comment;
    }

    public String getExpires ()
    {
        return expires;
    }

    public void setExpires (String expires)
    {
        this.expires = expires;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public boolean getSecure ()
    {
        return secure;
    }

    public void setSecure (boolean secure)
    {
        this.secure = secure;
    }

    public String getDomain ()
    {
        return domain;
    }

    public void setDomain (String domain)
    {
        this.domain = domain;
    }

    public String getPath ()
    {
        return path;
    }

    public void setPath (String path)
    {
        this.path = path;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public boolean getHttpOnly ()
    {
        return httpOnly;
    }

    public void setHttpOnly (boolean httpOnly)
    {
        this.httpOnly = httpOnly;
    }

    public String getComment ()
    {
        return comment;
    }

    public void setComment (String comment)
    {
        this.comment = comment;
    }

    @Override
    public String toString()
    {
        return "HarCookie [expires = "+expires+", name = "+name+", secure = "+secure+", domain = "+domain+", path = "+path+", value = "+value+", httpOnly = "+httpOnly+", comment = "+comment+"]";
    }
}

