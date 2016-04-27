package com.smartbear.har.builder;

import com.smartbear.har.model.HarCache;
import com.smartbear.har.model.HarEntry;
import com.smartbear.har.model.HarRequest;
import com.smartbear.har.model.HarResponse;
import com.smartbear.har.model.HarTimings;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HarEntryBuilder {
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

    public HarEntryBuilder withPageref(String pageref) {
        this.pageref = pageref;
        return this;
    }

    public HarEntryBuilder withStartedDateTime(String startedDateTime) {
        this.startedDateTime = startedDateTime;
        return this;
    }

    public HarEntryBuilder withStartedDateTime(Date startedDateTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        this.startedDateTime = dateFormat.format(startedDateTime);
        return this;
    }

    public HarEntryBuilder withTime(long time) {
        this.time = time;
        return this;
    }

    public HarEntryBuilder withRequest(HarRequest request) {
        this.request = request;
        return this;
    }

    public HarEntryBuilder withResponse(HarResponse response) {
        this.response = response;
        return this;
    }

    public HarEntryBuilder withCache(HarCache cache) {
        this.cache = cache;
        return this;
    }

    public HarEntryBuilder withTimings(HarTimings timings) {
        this.timings = timings;
        return this;
    }

    public HarEntryBuilder withServerIPAddress(String serverIPAddress) {
        this.serverIPAddress = serverIPAddress;
        return this;
    }

    public HarEntryBuilder withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    public HarEntryBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarEntry build() {
        return new HarEntry(pageref, startedDateTime, time, request, response, cache, timings, serverIPAddress, connection, comment);
    }
}