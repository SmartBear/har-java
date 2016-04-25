package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object represents the root of exported data.
 */
public class HarLogRoot {

    private HarLog log;

    @JsonCreator
    public HarLogRoot(@JsonProperty("log") HarLog log) {
        this.log = log;
    }

    public HarLog getLog() {
        return log;
    }
}
