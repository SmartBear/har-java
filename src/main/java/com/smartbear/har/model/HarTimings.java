package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object describes various phases within request-response round trip. All
 * times are specified in milliseconds.
 *
 * @see <a href=
 *      "http://www.softwareishard.com/blog/har-12-spec/#timings">specification</a>
 */
@JsonPropertyOrder({
        "blocked",
        "dns",
        "connect",
        "send",
        "wait",
        "receive",
        "ssl",
        "comment"
})
public class HarTimings {

    private Long blocked;
    private Long dns;
    private Long connect;
    private Long send;
    private Long wait;
    private Long receive;
    private Long ssl;
    private String comment;

    @JsonCreator
    public HarTimings(@JsonProperty("blocked") @JsonInclude(Include.NON_DEFAULT) Long blocked,
            @JsonProperty("dns") @JsonInclude(Include.NON_DEFAULT) Long dns,
            @JsonProperty("connect") @JsonInclude(Include.NON_DEFAULT) Long connect,
            @JsonProperty("send") Long send,
            @JsonProperty("wait") Long wait, @JsonProperty("receive") Long receive,
            @JsonProperty("ssl") @JsonInclude(Include.NON_DEFAULT) Long ssl,
            @JsonProperty("comment") @JsonInclude(Include.NON_EMPTY) String comment) {
        this.blocked = blocked;
        this.dns = dns;
        this.connect = connect;
        this.send = send;
        this.wait = wait;
        this.receive = receive;
        this.ssl = ssl;
        this.comment = comment;
    }

    public Long getSend() {
        return send;
    }

    public Long getConnect() {
        return connect;
    }

    public Long getDns() {
        return dns;
    }

    public Long getSsl() {
        return ssl;
    }

    public Long getBlocked() {
        return blocked;
    }

    public Long getWait() {
        return wait;
    }

    public String getComment() {
        return comment;
    }

    public Long getReceive() {
        return receive;
    }

    @Override
    public String toString() {
        return "HarTimings [send = " + send + ", connect = " + connect + ", dns = " + dns + ", ssl = " + ssl
                + ", blocked = " + blocked + ", wait = " + wait + ", comment = " + comment + ", receive = " + receive
                + "]";
    }
}
