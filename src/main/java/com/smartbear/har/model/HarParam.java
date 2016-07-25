package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Posted parameters, if any (embedded in postData object).
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
    private String name;
    private String value;
    private String fileName;
    private String contentType;
    private String comment;

    @JsonCreator
    public HarParam(@JsonProperty("name") String name, @JsonProperty("value") String value,
                    @JsonProperty("fileName") String fileName,
                    @JsonProperty("contentType") String contentType,
                    @JsonProperty("comment") String comment) {
        this.name = name;
        this.value = value;
        this.fileName = fileName;
        this.contentType = contentType;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getFileName() {
        return fileName;
    }

    public String getValue() {
        return value;
    }

    public String getContentType() {
        return contentType;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "HarParam [name = " + name + ", fileName = " + fileName + ", value = " + value + ", contentType = " + contentType + ", comment = " + comment + "]";
    }
}


