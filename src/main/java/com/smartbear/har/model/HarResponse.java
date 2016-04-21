package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * This object contains detailed info about the response.
 *
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#response">specification</a>
 */
@JsonPropertyOrder({
        "status",
        "statusText",
        "httpVersion",
        "cookies",
        "headers",
        "content",
        "redirectURL",
        "headersSize",
        "bodySize",
        "comment"
})
public class HarResponse {

    private int status;
    private String statusText;
    private String httpVersion;
    private List<HarCookie> cookies = new ArrayList<>();
    private List<HarHeader> headers = new ArrayList<>();
    private HarContent content;
    private String redirectURL;
    private Long headersSize;
    private Long bodySize;
    private String comment;

    @JsonCreator
    public HarResponse(@JsonProperty("status") int status, @JsonProperty("statusText") String statusText,
                       @JsonProperty("httpVersion") String httpVersion, @JsonProperty("cookies") List<HarCookie> cookies,
                       @JsonProperty("headers") List<HarHeader> headers, @JsonProperty("content") HarContent content,
                       @JsonProperty("redirectURL") String redirectURL, @JsonProperty("headersSize") Long headersSize,
                       @JsonProperty("bodySize") Long bodySize, @JsonProperty("comment") String comment) {
        this.status = status;
        this.statusText = statusText;
        this.httpVersion = httpVersion;
        this.cookies = cookies;
        this.headers = headers;
        this.content = content;
        this.redirectURL = redirectURL;
        this.headersSize = headersSize;
        this.bodySize = bodySize;
        this.comment = comment;
    }

    public HarContent getContent() {
        return content;
    }

    public List<HarHeader> getHeaders() {
        return headers;
    }

    public Long getBodySize() {
        return bodySize;
    }

    public String getHttpVersion() {
        return httpVersion;
    }

    public int getStatus() {
        return status;
    }

    public String getRedirectURL() {
        return redirectURL;
    }

    public String getStatusText() {
        return statusText;
    }

    public String getComment() {
        return comment;
    }

    public List<HarCookie> getCookies() {
        return cookies;
    }

    public Long getHeadersSize() {
        return headersSize;
    }

    @Override
    public String toString() {
        return "HarResponse [content = " + content + ", headers = " + headers + ", bodySize = " + bodySize + ", httpVersion = " + httpVersion + ", status = " + status + ", redirectURL = " + redirectURL + ", statusText = " + statusText + ", comment = " + comment + ", cookies = " + cookies + ", headersSize = " + headersSize + "]";
    }
}


