package com.smartbear.har.model;

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

    @JsonProperty("pageref")
    private String pageref;
    @JsonProperty("startedDateTime")
    private String startedDateTime;
    @JsonProperty("time")
    private long time;
    @JsonProperty("request")
    private HarRequest request;
    @JsonProperty("response")
    private HarResponse response;
    @JsonProperty("cache")
    private HarCache cache;
    @JsonProperty("timings")
    private HarTimings timings;
    @JsonProperty("serverIPAddress")
    private String serverIPAddress;
    @JsonProperty("connection")
    private String connection;
    @JsonProperty("comment")
    private String comment;

    public String getPageref() {
        return pageref;
    }

    public void setPageref(String pageref) {
        this.pageref = pageref;
    }

    public String getStartedDateTime() {
        return startedDateTime;
    }

    public void setStartedDateTime(String startedDateTime) {
        this.startedDateTime = startedDateTime;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public HarRequest getRequest() {
        return request;
    }

    public void setRequest(HarRequest request) {
        this.request = request;
    }

    public HarResponse getResponse() {
        return response;
    }

    public void setResponse(HarResponse response) {
        this.response = response;
    }

    public HarCache getCache() {
        return cache;
    }

    public void setCache(HarCache cache) {
        this.cache = cache;
    }

    public HarTimings getTimings() {
        return timings;
    }

    public void setTimings(HarTimings timings) {
        this.timings = timings;
    }

    public String getServerIPAddress() {
        return serverIPAddress;
    }

    public void setServerIPAddress(String serverIPAddress) {
        this.serverIPAddress = serverIPAddress;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "HarEntry [response = " + response + ", connection = " + connection + ", time = " + time + ", pageref = " + pageref + ", cache = " + cache + ", timings = " + timings + ", request = " + request + ", comment = " + comment + ", serverIPAddress = " + serverIPAddress + ", startedDateTime = " + startedDateTime + "]";
    }
}
