package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * This object contains list of all parameters & values parsed from a query string, if any (embedded in <request> object).
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#queryString">specification</a>
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

    public HarQueryString(String name, String value, String comment) {
        this.name = name;
        this.value = value;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "HarQueryString [name = " + name + ", value = " + value + ", comment = " + comment + "]";
    }
}