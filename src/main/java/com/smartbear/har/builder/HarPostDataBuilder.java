package com.smartbear.har.builder;

import com.smartbear.har.model.HarParam;
import com.smartbear.har.model.HarPostData;

import java.util.ArrayList;
import java.util.List;

public class HarPostDataBuilder {
    private String mimeType;
    private List<HarParam> params = new ArrayList<>();
    private String text;
    private String comment;

    public HarPostDataBuilder withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public HarPostDataBuilder withParams(List<HarParam> params) {
        this.params.addAll(params);
        return this;
    }

    public HarPostDataBuilder addParam(HarParam param) {
        this.params.add(param);
        return this;
    }

    public HarPostDataBuilder withText(String text) {
        this.text = text;
        return this;
    }

    public HarPostDataBuilder withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarPostData build() {
        return new HarPostData(mimeType, params, text, comment);
    }
}