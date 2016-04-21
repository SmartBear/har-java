package com.smartbear.har.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

/**
 * This object represents the root of exported data.
 *
 * @see <a href="http://www.softwareishard.com/blog/har-12-spec/#log">specification</a>
 */
@JsonPropertyOrder({
        "version",
        "creator",
        "browser",
        "pages",
        "entries",
        "comment"
})
public class HarLog {

    private String version = "1.2";
    private HarCreator creator;
    private HarBrowser browser;
    private List<HarPage> pages;
    private List<HarEntry> entries;
    private String comment;

    @JsonCreator
    public HarLog(@JsonProperty("version") String version, @JsonProperty("creator") HarCreator creator,
                  @JsonProperty("browser") HarBrowser browser, @JsonProperty("pages") List<HarPage> pages,
                  @JsonProperty("entries") List<HarEntry> entries, @JsonProperty("comment") String comment) {
        this.version = version;
        this.creator = creator;
        this.browser = browser;
        this.pages = pages;
        this.entries = entries;
        this.comment = comment;
    }

    public String getVersion() {
        return version;
    }

    public HarCreator getCreator() {
        return creator;
    }

    public HarBrowser getBrowser() {
        return browser;
    }

    public List<HarPage> getPages() {
        return pages;
    }

    public List<HarEntry> getEntries() {
        return entries;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "HarLog [pages = " + pages + ", browser = " + browser + ", entries = " + entries + ", comment = " + comment + ", creator = " + creator + ", version = " + version + "]";
    }
}
