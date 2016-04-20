package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * This object describes posted data, if any (embedded in <request> object).
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
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("params")
    private List<HarParam> params = new ArrayList<>();
    @JsonProperty("text")
    private String text;
    @JsonProperty("comment")
    private String comment;

    public HarPostData(String mimeType, List<HarParam> params, String text, String comment) {
        this.mimeType = mimeType;
        this.params = params;
        this.text = text;
        this.comment = comment;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public List<HarParam> getParams ()
    {
        return params;
    }

    public void setParams (List<HarParam> params)
    {
        this.params = params;
    }

    public String getComment ()
    {
        return comment;
    }

    public void setComment (String comment)
    {
        this.comment = comment;
    }

    public String getMimeType ()
    {
        return mimeType;
    }

    public void setMimeType (String mimeType)
    {
        this.mimeType = mimeType;
    }

    @Override
    public String toString()
    {
        return "HarPostData [text = "+text+", params = "+params+", comment = "+comment+", mimeType = "+mimeType+"]";
    }
}

