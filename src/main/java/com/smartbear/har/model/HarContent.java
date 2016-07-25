package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object describes details about response content (embedded in response object).
 *
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#content">specification</a>
 */
@JsonPropertyOrder({
        "size",
        "compression",
        "mimeType",
        "text",
        "comment"
})
public class HarContent {

    private Long size;
    private Long compression;
    private String mimeType;
    private String text;
    private String comment;

    @JsonCreator
    public HarContent(@JsonProperty("size") Long size, @JsonProperty("compression") Long compression,
                      @JsonProperty("mimeType") String mimeType, @JsonProperty("text") String text,
                      @JsonProperty("comment") String comment) {
        this.size = size;
        this.compression = compression;
        this.mimeType = mimeType;
        this.text = text;
        this.comment = comment;
    }

    public String getText() {
        return text;
    }

    public String getComment() {
        return comment;
    }

    public Long getCompression() {
        return compression;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Long getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "HarContent [text = " + text + ", comment = " + comment + ", compression = " + compression + ", mimeType = " + mimeType + ", size = " + size + "]";
    }
}

