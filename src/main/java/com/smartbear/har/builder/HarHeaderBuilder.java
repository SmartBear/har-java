package com.smartbear.har.builder;

import com.smartbear.har.model.HarHeader;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class HarHeaderBuilder {
    private String name;
    private List<String> values = new ArrayList<>();
    private String comment;

    public HarHeaderBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public HarHeaderBuilder withValue(String value) {
        this.values.add(value);
        return this;
    }

    public HarHeaderBuilder withValues(List<String> values) {
        if (values != null) {
            this.values.addAll(values);
        }
        return this;
    }

    public HarHeaderBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarHeader build() {
        return new HarHeader(name, StringUtils.join(values, ","), comment);
    }
}