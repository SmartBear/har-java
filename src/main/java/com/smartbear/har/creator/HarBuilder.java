package com.smartbear.har.creator;

import com.smartbear.har.model.HarEntry;

import java.io.IOException;

public interface HarBuilder {

    void addEntry(HarEntry harEntry) throws IOException;

    void closeHar() throws IOException;
}
