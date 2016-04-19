package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object describes details about response content (embedded in <response> object).
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

    @JsonProperty("size")
    private Long size;
    @JsonProperty("compression")
    private Long compression;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("text")
    private String text;
    @JsonProperty("comment")
    private String comment;

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getComment ()
    {
        return comment;
    }

    public void setComment (String comment)
    {
        this.comment = comment;
    }

    public Long getCompression ()
    {
        return compression;
    }

    public void setCompression (Long compression)
    {
        this.compression = compression;
    }

    public String getMimeType ()
    {
        return mimeType;
    }

    public void setMimeType (String mimeType)
    {
        this.mimeType = mimeType;
    }

    public Long getSize ()
    {
        return size;
    }

    public void setSize (Long size)
    {
        this.size = size;
    }

    @Override
    public String toString()
    {
        return "HarContent [text = "+text+", comment = "+comment+", compression = "+compression+", mimeType = "+mimeType+", size = "+size+"]";
    }
}

