package com.smartbear.har.builder;

import com.smartbear.har.model.HarParams;
import com.smartbear.har.model.HarPostData;

import java.util.List;

public class HarPostDataBuilder {
    private String mimeType;
    private List<HarParams> params;
    private String text;
    private String comment;

    public HarPostDataBuilder setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public HarPostDataBuilder setParams(List<HarParams> params) {
        this.params = params;
        return this;
    }

    public HarPostDataBuilder setText(String text) {
        this.text = text;
        return this;
    }

    public HarPostDataBuilder setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public HarPostData createHarPostData() {
        return new HarPostData(mimeType, params, text, comment);
    }
}