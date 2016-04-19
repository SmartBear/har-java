package com.smartbear.har.builder;

import com.smartbear.har.model.HarTimings;

public class HarTimingsBuilder {
    private Long blocked;
    private Long dns;
    private Long connect;
    private Long send;
    private Long wait;
    private Long receive;
    private Long ssl;
    private String comment;

    public HarTimingsBuilder withBlocked(Long blocked) {
        this.blocked = blocked;
        return this;
    }

    public HarTimingsBuilder withDns(Long dns) {
        this.dns = dns;
        return this;
    }

    public HarTimingsBuilder withConnect(Long connect) {
        this.connect = connect;
        return this;
    }

    public HarTimingsBuilder withSend(Long send) {
        this.send = send;
        return this;
    }

    public HarTimingsBuilder withWait(Long wait) {
        this.wait = wait;
        return this;
    }

    public HarTimingsBuilder withReceive(Long receive) {
        this.receive = receive;
        return this;
    }

    public HarTimingsBuilder withSsl(Long ssl) {
        this.ssl = ssl;
        return this;
    }

    public HarTimingsBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarTimings build() {
        return new HarTimings(blocked, dns, connect, send, wait, receive, ssl, comment);
    }
}