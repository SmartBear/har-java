package com.smartbear.har.builder;

import com.smartbear.har.model.HarContent;
import com.smartbear.har.model.HarCookie;
import com.smartbear.har.model.HarHeader;
import com.smartbear.har.model.HarResponse;

import java.util.ArrayList;
import java.util.List;

public class HarResponseBuilder {
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

    public HarResponseBuilder withStatus(int status) {
        this.status = status;
        return this;
    }

    public HarResponseBuilder withStatusText(String statusText) {
        this.statusText = statusText;
        return this;
    }

    public HarResponseBuilder withHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }

    public HarResponseBuilder withCookies(List<HarCookie> cookies) {
        this.cookies = cookies;
        return this;
    }

    public HarResponseBuilder withHeaders(List<HarHeader> headers) {
        this.headers = headers;
        return this;
    }

    public HarResponseBuilder withContent(HarContent content) {
        this.content = content;
        return this;
    }

    public HarResponseBuilder withRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
        return this;
    }

    public HarResponseBuilder withHeadersSize(Long headersSize) {
        this.headersSize = headersSize;
        return this;
    }

    public HarResponseBuilder withBodySize(Long bodySize) {
        this.bodySize = bodySize;
        return this;
    }

    public HarResponseBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarResponse build() {
        return new HarResponse(status, statusText, httpVersion, cookies, headers, content, redirectURL, headersSize, bodySize, comment);
    }
}