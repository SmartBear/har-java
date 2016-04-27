package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "startedDateTime",
        "id",
        "title",
        "pageTimings",
        "comment"
})
public class HarPage {

    private String startedDateTime;
    private String id;
    private String title;
    private HarPageTimings pageTimings;
    private String comment;

    @JsonCreator
    public HarPage(@JsonProperty("startedDateTime") String startedDateTime, @JsonProperty("id") String id,
                   @JsonProperty("title") String title, @JsonProperty("pageTimings") HarPageTimings pageTimings,
                   @JsonProperty("comment") String comment) {
        this.startedDateTime = startedDateTime;
        this.id = id;
        this.title = title;
        this.pageTimings = pageTimings;
        this.comment = comment;
    }

    public String getStartedDateTime() {
        return startedDateTime;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public HarPageTimings getPageTimings() {
        return pageTimings;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "HarPage [id = " + id + ", title = " + title + ", pageTimings = " + pageTimings + ", comment = " + comment + ", startedDateTime = " + startedDateTime + "]";
    }
}
