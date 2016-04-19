package com.smartbear.har.builder;

import com.smartbear.har.model.HarContent;

public class HarContentBuilder {
    private Long size;
    private Long compression;
    private String mimeType;
    private String text;
    private String comment;

    public HarContentBuilder withSize(Long size) {
        this.size = size;
        return this;
    }

    public HarContentBuilder withCompression(Long compression) {
        this.compression = compression;
        return this;
    }

    public HarContentBuilder withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public HarContentBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public HarContentBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarContent build() {
        return new HarContent(size, compression, mimeType, text, comment);
    }
}