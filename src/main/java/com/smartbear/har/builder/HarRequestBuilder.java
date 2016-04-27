package com.smartbear.har.builder;

import com.smartbear.har.model.HarCookie;
import com.smartbear.har.model.HarHeader;
import com.smartbear.har.model.HarPostData;
import com.smartbear.har.model.HarQueryString;
import com.smartbear.har.model.HarRequest;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class HarRequestBuilder {
    private Long headersSize;
    private String method;
    private String url;
    private String httpVersion;
    private List<HarCookie> cookies;
    private List<HarHeader> headers;
    private List<HarQueryString> queryString;
    private HarPostData postData;
    private Long bodySize;
    private String comment;

    public HarRequestBuilder withHeadersSize(Long headersSize) {
        this.headersSize = headersSize;
        return this;
    }

    public HarRequestBuilder withMethod(String method) {
        this.method = method;
        return this;
    }

    public HarRequestBuilder withUrl(String url) {
        this.url = url;
        return this;
    }

    public HarRequestBuilder withHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
        return this;
    }

    public HarRequestBuilder withCookies(List<HarCookie> cookies) {
        this.cookies = cookies;
        return this;
    }

    public HarRequestBuilder withHeaders(List<HarHeader> headers) {
        this.headers = headers;
        return this;
    }

    public HarRequestBuilder withQueryString(List<HarQueryString> queryString) {
        this.queryString = queryString;
        return this;
    }

    public HarRequestBuilder withQueryString(String queryString) throws UnsupportedEncodingException {
        List<HarQueryString> queryStrings = new ArrayList<>();

        final String[] parameters = queryString.split("&");
        for (String parameter : parameters) {
            final int idx = parameter.indexOf("=");
            final String key = idx > 0 ? URLDecoder.decode(parameter.substring(0, idx), "UTF-8") : parameter;
            final String value = idx > 0 && parameter.length() > idx + 1 ? URLDecoder.decode(parameter.substring(idx + 1), "UTF-8") : "";
            if (!key.isEmpty()) {
                queryStrings.add(new HarQueryString(key, value, ""));
            }
        }
        this.queryString = queryStrings;
        return this;
    }

    public HarRequestBuilder withPostData(HarPostData postData) {
        this.postData = postData;
        return this;
    }

    public HarRequestBuilder withBodySize(Long bodySize) {
        this.bodySize = bodySize;
        return this;
    }

    public HarRequestBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarRequest build() {
        return new HarRequest(headersSize, method, url, httpVersion, cookies, headers, queryString, postData, bodySize, comment);
    }
}