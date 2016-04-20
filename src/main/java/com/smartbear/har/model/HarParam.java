package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Posted parameters, if any (embedded in <postData> object).
 *
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#params">specification</a>
 */
@JsonPropertyOrder({
        "name",
        "value",
        "fileName",
        "contentType",
        "comment"
})
public class HarParam {

    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private String value;
    @JsonProperty("fileName")
    private String fileName;
    @JsonProperty("contentType")
    private String contentType;
    @JsonProperty("comment")
    private String comment;

    public HarParam(String name, String value, String fileName, String contentType, String comment) {
        this.name = name;
        this.value = value;
        this.fileName = fileName;
        this.contentType = contentType;
        this.comment = comment;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getFileName ()
    {
        return fileName;
    }

    public void setFileName (String fileName)
    {
        this.fileName = fileName;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getContentType ()
    {
        return contentType;
    }

    public void setContentType (String contentType)
    {
        this.contentType = contentType;
    }

    public String getComment ()
    {
        return comment;
    }

    public void setComment (String comment)
    {
        this.comment = comment;
    }

    @Override
    public String toString()
    {
        return "HarParam [name = "+name+", fileName = "+fileName+", value = "+value+", contentType = "+contentType+", comment = "+comment+"]";
    }
}


