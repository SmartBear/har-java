package com.smartbear.har.builder;

import com.smartbear.har.model.HarPage;
import com.smartbear.har.model.HarPageTimings;

import java.util.Date;

public class HarPageBuilder {
    private Date startedDateTime;
    private String id;
    private String title;
    private HarPageTimings pageTimings;
    private String comment;

    public HarPageBuilder withStartedDateTime(Date startedDateTime) {
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