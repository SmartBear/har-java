package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * HarHeader contains header information (used in request and response objects).
 *
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#headers">specification</a>
 */
@JsonPropertyOrder({
        "name",
        "value",
        "comment"
})
public class HarHeader {
    private String name;
    private String value;
    private String comment;

    @JsonCreator
    public HarHeader(@JsonProperty("name") String name, @JsonProperty("value") String value,
                     @JsonProperty("comment") String comment) {
        this.name = name;
        this.value = value;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "HarHeader [name = " + name + ", value = " + value + ", comment = " + comment + "]";
    }
}