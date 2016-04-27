package com.smartbear.har.builder;

import com.smartbear.har.model.HarPage;
import com.smartbear.har.model.HarPageTimings;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HarPageBuilder {
    private String startedDateTime;
    private String id;
    private String title;
    private HarPageTimings pageTimings;
    private String comment;

    public HarPageBuilder withStartedDateTime(Date startedDateTime) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        this.startedDateTime = dateFormat.format(startedDateTime);
        return this;
    }

    public HarPageBuilder withStartedDateTime(String startedDateTime) {
        this.startedDateTime = startedDateTime;
        return this;
    }

    public HarPageBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public HarPageBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public HarPageBuilder withPageTimings(HarPageTimings pageTimings) {
        this.pageTimings = pageTimings;
        return this;
    }

    public HarPageBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarPage build() {
        return new HarPage(startedDateTime, id, title, pageTimings, comment);
    }
}