package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * For testing only
 *
 */
public class HarLogRoot {

    @JsonProperty("log")
    private HarLog log;

    protected HarLogRoot() {
    }

    public HarLog getLog() {
        return log;
    }
}
