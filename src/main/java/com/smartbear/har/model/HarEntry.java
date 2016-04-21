package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object represents an array with all exported HTTP requests.
 *
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#entries">specification</a>
 */
@JsonPropertyOrder({
        "pageref",
        "startedDateTime",
        "time",
        "request",
        "response",
        "cache",
        "timings",
        "serverIPAddress",
        "connection",
        "comment"
})
public class HarEntry {

    private String pageref;
    private String startedDateTime;
    private long time;
    private HarRequest request;
    private HarResponse response;
    private HarCache cache;
    private HarTimings timings;
    private String serverIPAddress;
    private String connection;
    private String comment;

    @JsonCreator
    public HarEntry(@JsonProperty("pageref") String pageref, @JsonProperty("startedDateTime") String startedDateTime,
                    @JsonProperty("time") long time, @JsonProperty("request") HarRequest request,
                    @JsonProperty("response") HarResponse response, @JsonProperty("cache") HarCache cache,
                    @JsonProperty("timings") HarTimings timings, @JsonProperty("serverIPAddress") String serverIPAddress,
                    @JsonProperty("connection") String connection, @JsonProperty("comment") String comment) {
        this.pageref = pageref;
        this.startedDateTime = startedDateTime;
        this.time = time;
        this.request = request;
        this.response = response;
        this.cache = cache;
        this.timings = timings;
        this.serverIPAddress = serverIPAddress;
        this.connection = connection;
        this.comment = comment;
    }

    public String getPageref() {
        return pageref;
    }

    public String getStartedDateTime() {
        return startedDateTime;
    }

    public long getTime() {
        return time;
    }

    public HarRequest getRequest() {
        return request;
    }

    public HarResponse getResponse() {
        return response;
    }

    public HarCache getCache() {
        return cache;
    }

    public HarTimings getTimings() {
        return timings;
    }

    public String getServerIPAddress() {
        return serverIPAddress;
    }

    public String getConnection() {
        return connection;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "HarEntry [response = " + response + ", connection = " + connection + ", time = " + time + ", pageref = " + pageref + ", cache = " + cache + ", timings = " + timings + ", request = " + request + ", comment = " + comment + ", serverIPAddress = " + serverIPAddress + ", startedDateTime = " + startedDateTime + "]";
    }
}
