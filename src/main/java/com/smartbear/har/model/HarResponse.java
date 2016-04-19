package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * This object contains detailed info about the response.
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

    @JsonProperty("status")
    private int status;
    @JsonProperty("statusText")
    private String statusText;
    @JsonProperty("httpVersion")
    private String httpVersion;
    @JsonProperty("cookies")
    private List<HarCookie> cookies = new ArrayList<HarCookie>();
    @JsonProperty("headers")
    private List<HarHeader> headers = new ArrayList<HarHeader>();
    @JsonProperty("content")
    private HarContent content;
    @JsonProperty("redirectURL")
    private String redirectURL;
    @JsonProperty("headersSize")
    private Long headersSize;
    @JsonProperty("bodySize")
    private Long bodySize;
    @JsonProperty("comment")
    private String comment;

    public HarResponse(int status, String statusText, String httpVersion, List<HarCookie> cookies, List<HarHeader> headers, HarContent content, String redirectURL, Long headersSize, Long bodySize, String comment) {
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

    public HarContent getContent ()
    {
        return content;
    }

    public void setContent (HarContent content)
    {
        this.content = content;
    }

    public List<HarHeader> getHeaders ()
    {
        return headers;
    }

    public void setHeaders (List<HarHeader> headers)
    {
        this.headers = headers;
    }

    public Long getBodySize ()
    {
        return bodySize;
    }

    public void setBodySize (Long bodySize)
    {
        this.bodySize = bodySize;
    }

    public String getHttpVersion ()
    {
        return httpVersion;
    }

    public void setHttpVersion (String httpVersion)
    {
        this.httpVersion = httpVersion;
    }

    public int getStatus ()
    {
        return status;
    }

    public void setStatus (int status)
    {
        this.status = status;
    }

    public String getRedirectURL ()
    {
        return redirectURL;
    }

    public void setRedirectURL (String redirectURL)
    {
        this.redirectURL = redirectURL;
    }

    public String getStatusText ()
    {
        return statusText;
    }

    public void setStatusText (String statusText)
    {
        this.statusText = statusText;
    }

    public String getComment ()
    {
        return comment;
    }

    public void setComment (String comment)
    {
        this.comment = comment;
    }

    public List<HarCookie> getCookies ()
    {
        return cookies;
    }

    public void setCookies (List<HarCookie> cookies)
    {
        this.cookies = cookies;
    }

    public Long getHeadersSize ()
    {
        return headersSize;
    }

    public void setHeadersSize (Long headersSize)
    {
        this.headersSize = headersSize;
    }

    @Override
    public String toString()
    {
        return "HarResponse [content = "+content+", headers = "+headers+", bodySize = "+bodySize+", httpVersion = "+httpVersion+", status = "+status+", redirectURL = "+redirectURL+", statusText = "+statusText+", comment = "+comment+", cookies = "+cookies+", headersSize = "+headersSize+"]";
    }
}


