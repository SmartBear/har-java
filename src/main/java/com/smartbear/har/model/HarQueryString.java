package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object contains list of all parameters and values parsed from a query
 * string, if any (embedded in request object).
 * 
 * @see <a href=
 *      "http://www.softwareishard.com/blog/har-12-spec/#queryString">specification</a>
 */
@JsonPropertyOrder({
        "name",
        "value",
        "comment"
})
public class HarQueryString {
    private String name;
    private String value;
    private String comment;

    @JsonCreator
    public HarQueryString(@JsonProperty("name") String name, @JsonProperty("value") String value,
            @JsonProperty("comment") @JsonInclude(Include.NON_DEFAULT) String comment) {
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
        return "HarQueryString [name = " + name + ", value = " + value + ", comment = " + comment + "]";
    }
}