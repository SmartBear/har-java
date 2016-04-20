package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HarLogRoot {

    @JsonProperty("log")
    private HarLog log;

    protected HarLogRoot() {
    }

    public HarLog getLog() {
        return log;
    }
}
