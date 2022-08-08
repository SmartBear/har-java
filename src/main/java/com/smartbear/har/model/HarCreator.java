package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Information about the creator of HAR
 *
 * @see <a href=
 *      "http://www.softwareishard.com/blog/har-12-spec/#creator">specification</a>
 */
@JsonPropertyOrder({
        "name",
        "version",
        "comment"
})
public class HarCreator {

    private String name;
    private String version;
    private String comment;

    @JsonCreator
    public HarCreator(@JsonProperty("name") String name,
            @JsonProperty("comment") @JsonInclude(Include.NON_EMPTY) String comment,
            @JsonProperty("version") String version) {
        this.name = name;
        this.comment = comment;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "HarCreator [name = " + name + ", comment = " + comment + ", version = " + version + "]";
    }
}