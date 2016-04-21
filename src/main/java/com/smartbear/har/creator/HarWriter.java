package com.smartbear.har.creator;

import com.smartbear.har.model.HarLog;

import java.io.File;
import java.io.IOException;

public interface HarWriter {
    void writeHarLogToFile(HarLog harLog, File logFile) throws IOException;
}
