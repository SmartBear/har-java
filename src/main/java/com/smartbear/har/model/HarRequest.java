package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * This object contains detailed info about performed request.
 *
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#request">specification</a>
 */
@JsonPropertyOrder({
        "method",
        "url",
        "httpVersion",
        "cookies",
        "headers",
        "queryString",
        "postData",
        "headersSize",
        "bodySize",
        "comment"
})
public class HarRequest {

    private String method;
    private String url;
    private String httpVersion;
    private List<HarCookie> cookies = new ArrayList<>();
    private List<HarHeader> headers = new ArrayList<>();
    private List<HarQueryString> queryString = new ArrayList<>();
    private HarPostData postData;
    private Long headersSize;
    private Long bodySize;
    private String comment;

    @JsonCreator
    public HarRequest(@JsonProperty("headersSize") Long headersSize, @JsonProperty("method") String method,
                      @JsonProperty("url") String url, @JsonProperty("httpVersion") String httpVersion,
                      @JsonProperty("cookies") List<HarCookie> cookies, @JsonProperty("headers") List<HarHeader> headers,
                      @JsonProperty("queryString") List<HarQueryString> queryString,
                      @JsonProperty("postData") HarPostData postData, @JsonProperty("bodySize") Long bodySize,
                      @JsonProperty("comment") String comment) {
        this.headersSize = headersSize;
        this.method = method;
        this.url = url;
        this.httpVersion = httpVersion;
        this.cookies = cookies;
        this.headers = headers;
        this.queryString = queryString;
        this.postData = postData;
        this.bodySize = bodySize;
        this.comment = comment;
    }

    public List<HarHeader> getHeaders() {
        return headers;
    }

    public List<HarQueryString> getQueryString() {
        return queryString;
    }

    public Long getBodySize() {
        return bodySize;
    }

    public HarPostData getPostData() {
        return postData;
    }

    public String getHttpVersion() {
        return httpVersion;
    }

    public String getMethod() {
        return method;
    }

    public String getComment() {
        return comment;
    }

    public List<HarCookie> getCookies() {
        return cookies;
    }

    public String getUrl() {
        return url;
    }

    public Long getHeadersSize() {
        return headersSize;
    }

    @Override
    public String toString() {
        return "HarRequest [headers = " + headers + ", queryString = " + queryString + ", bodySize = " + bodySize + ", postData = " + postData + ", httpVersion = " + httpVersion + ", method = " + method + ", comment = " + comment + ", cookies = " + cookies + ", url = " + url + ", headersSize = " + headersSize + "]";
    }
}


