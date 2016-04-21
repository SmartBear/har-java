package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HarLogRoot {

    @JsonProperty("log")
    private HarLog harLog;

    public HarLogRoot(HarLog harLog) {
        this.harLog = harLog;
    }

    protected HarLogRoot() {
    }

    public HarLog getLog() {
        return harLog;
    }
}
