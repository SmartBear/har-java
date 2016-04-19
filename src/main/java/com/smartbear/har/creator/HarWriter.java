package com.smartbear.har.creator;

import com.smartbear.har.model.HarEntry;

import java.io.IOException;
import java.util.List;

public interface HarWriter {

    void writeEntries(List<HarEntry> harEnties) throws IOException;
}
