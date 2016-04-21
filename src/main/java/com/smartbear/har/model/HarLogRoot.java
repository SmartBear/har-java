package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HarLogRoot {

    private HarLog harLog;

    @JsonCreator
    public HarLogRoot(@JsonProperty("log") HarLog harLog) {
        this.harLog = harLog;
    }

    public HarLog getLog() {
        return harLog;
    }
}
