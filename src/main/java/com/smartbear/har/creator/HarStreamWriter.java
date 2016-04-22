package com.smartbear.har.creator;

import com.smartbear.har.model.HarEntry;

import java.io.IOException;

/**
 * Writes HAR log to an output file in a streaming way. It should be used when entries need to be appended over time.
 *
 */
public interface HarStreamWriter {

    /**
     * Adds an entry to an already created HarLog.
     *
     * @param      harEntry    the harEntry you want to append.
     * @exception  IOException  if it fails to write the entry
     */
    void addEntry(HarEntry harEntry) throws IOException;

    /**
     * Closes the entries array and the root HarLog object.
     *
     * @exception  IOException  if it fails to close the HarLog
     */
    void closeHar() throws IOException;
}
