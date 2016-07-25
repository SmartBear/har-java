package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * This object describes posted data, if any (embedded in request object).
 *
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#postData">specification</a>
 */
@JsonPropertyOrder({
        "mimeType",
        "params",
        "text",
        "comment"
})
public class HarPostData {

    private String mimeType;
    private List<HarParam> params = new ArrayList<>();
    private String text;
    private String comment;

    @JsonCreator
    public HarPostData(@JsonProperty("mimeType") String mimeType,
                       @JsonProperty("params") List<HarParam> params,
                       @JsonProperty("text") String text,
                       @JsonProperty("comment") String comment) {
        this.mimeType = mimeType;
        this.params = params;
        this.text = text;
        this.comment = comment;
    }

    public String getText() {
        return text;
    }

    public List<HarParam> getParams() {
        return params;
    }

    public String getComment() {
        return comment;
    }

    public String getMimeType() {
        return mimeType;
    }

    @Override
    public String toString() {
        return "HarPostData [text = " + text + ", params = " + params + ", comment = " + comment + ", mimeType = " + mimeType + "]";
    }
}

