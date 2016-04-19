package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * This object contains detailed info about performed request.
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
    @JsonProperty("method")
    private String method;
    @JsonProperty("url")
    private String url;
    @JsonProperty("httpVersion")
    private String httpVersion;
    @JsonProperty("cookies")
    private List<HarCookie> cookies = new ArrayList<HarCookie>();
    @JsonProperty("headers")
    private List<HarHeader> headers = new ArrayList<HarHeader>();
    @JsonProperty("queryString")
    private List<HarQueryString> queryString = new ArrayList<HarQueryString>();
    @JsonProperty("postData")
    private HarPostData postData;
    @JsonProperty("headersSize")
    private Long headersSize;
    @JsonProperty("bodySize")
    private Long bodySize;
    @JsonProperty("comment")
    private String comment;

    public List<HarHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(List<HarHeader> headers) {
        this.headers = headers;
    }

    public List<HarQueryString> getQueryString() {
        return queryString;
    }

    public void setQueryString(List<HarQueryString> queryString) {
        this.queryString = queryString;
    }

    public Long getBodySize() {
        return bodySize;
    }

    public void setBodySize(Long bodySize) {
        this.bodySize = bodySize;
    }

    public HarPostData getPostData() {
        return postData;
    }

    public void setPostData(HarPostData postData) {
        this.postData = postData;
    }

    public String getHttpVersion() {
        return httpVersion;
    }

    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<HarCookie> getCookies() {
        return cookies;
    }

    public void setCookies(List<HarCookie> cookies) {
        this.cookies = cookies;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getHeadersSize() {
        return headersSize;
    }

    public void setHeadersSize(Long headersSize) {
        this.headersSize = headersSize;
    }

    @Override
    public String toString() {
        return "HarRequest [headers = " + headers + ", queryString = " + queryString + ", bodySize = " + bodySize + ", postData = " + postData + ", httpVersion = " + httpVersion + ", method = " + method + ", comment = " + comment + ", cookies = " + cookies + ", url = " + url + ", headersSize = " + headersSize + "]";
    }
}


