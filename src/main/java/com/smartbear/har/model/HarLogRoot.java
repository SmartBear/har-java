package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents the root of exported data.
 */
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
