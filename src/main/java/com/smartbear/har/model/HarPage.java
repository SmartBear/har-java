package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Date;

@JsonPropertyOrder({
        "startedDateTime",
        "id",
        "title",
        "pageTimings",
        "comment"
})
public class HarPage {

    @JsonProperty("startedDateTime")
    private Date startedDateTime;
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("pageTimings")
    private HarPageTimings pageTimings;
    @JsonProperty("comment")
    private String comment;

    public HarPage(Date startedDateTime, String id, String title, HarPageTimings pageTimings, String comment) {
        this.startedDateTime = startedDateTime;
        this.id = id;
        this.title = title;
        this.pageTimings = pageTimings;
        this.comment = comment;
    }

    public Date getStartedDateTime() {
        return startedDateTime;
    }

    public void setStartedDateTime(Date startedDateTime) {
        this.startedDateTime = startedDateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HarPageTimings getPageTimings() {
        return pageTimings;
    }

    public void setPageTimings(HarPageTimings pageTimings) {
        this.pageTimings = pageTimings;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString()
    {
        return "HarPage [id = "+id+", title = "+title+", pageTimings = "+pageTimings+", comment = "+comment+", startedDateTime = "+startedDateTime+"]";
    }
}
