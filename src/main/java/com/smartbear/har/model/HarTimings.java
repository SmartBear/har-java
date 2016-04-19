package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object describes various phases within request-response round trip. All times are specified in milliseconds.
 *
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#timings">specification</a>
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
    
    @JsonProperty("blocked")
    private Long blocked;
    @JsonProperty("dns")
    private Long dns;
    @JsonProperty("connect")
    private Long connect;
    @JsonProperty("send")
    private Long send;
    @JsonProperty("wait")
    private Long wait;
    @JsonProperty("receive")
    private Long receive;
    @JsonProperty("ssl")
    private Long ssl;
    @JsonProperty("comment")
    private String comment;

    public HarTimings(Long blocked, Long dns, Long connect, Long send, Long wait, Long receive, Long ssl, String comment) {
        this.blocked = blocked;
        this.dns = dns;
        this.connect = connect;
        this.send = send;
        this.wait = wait;
        this.receive = receive;
        this.ssl = ssl;
        this.comment = comment;
    }

    public Long getSend ()
    {
        return send;
    }

    public void setSend (Long send)
    {
        this.send = send;
    }

    public Long getConnect ()
    {
        return connect;
    }

    public void setConnect (Long connect)
    {
        this.connect = connect;
    }

    public Long getDns ()
    {
        return dns;
    }

    public void setDns (Long dns)
    {
        this.dns = dns;
    }

    public Long getSsl ()
    {
        return ssl;
    }

    public void setSsl (Long ssl)
    {
        this.ssl = ssl;
    }

    public Long getBlocked ()
    {
        return blocked;
    }

    public void setBlocked (Long blocked)
    {
        this.blocked = blocked;
    }

    public Long getWait ()
    {
        return wait;
    }

    public void setWait (Long wait)
    {
        this.wait = wait;
    }

    public String getComment ()
    {
        return comment;
    }

    public void setComment (String comment)
    {
        this.comment = comment;
    }

    public Long getReceive ()
    {
        return receive;
    }

    public void setReceive (Long receive)
    {
        this.receive = receive;
    }

    @Override
    public String toString()
    {
        return "HarTimings [send = "+send+", connect = "+connect+", dns = "+dns+", ssl = "+ssl+", blocked = "+blocked+", wait = "+wait+", comment = "+comment+", receive = "+receive+"]";
    }
}

