package com.smartbear.har.model;

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

    @JsonProperty("version")
    private String version = "1.2";
    @JsonProperty("creator")
    private HarCreator creator;
    @JsonProperty("browser")
    private HarBrowser browser;
    @JsonProperty("pages")
    private List<HarPage> pages;
    @JsonProperty("entries")
    private List<HarEntry> entries;
    @JsonProperty("comment")
    private String comment;

    protected HarLog() {
    }

    public HarLog(String version, HarCreator creator, HarBrowser browser, List<HarPage> pages, List<HarEntry> entries, String comment) {
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

    public void setVersion(String version) {
        this.version = version;
    }

    public HarCreator getCreator() {
        return creator;
    }

    public void setCreator(HarCreator creator) {
        this.creator = creator;
    }

    public HarBrowser getBrowser() {
        return browser;
    }

    public void setBrowser(HarBrowser browser) {
        this.browser = browser;
    }

    public List<HarPage> getPages() {
        return pages;
    }

    public void setPages(List<HarPage> pages) {
        this.pages = pages;
    }

    public List<HarEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<HarEntry> entries) {
        this.entries = entries;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "HarLog [pages = " + pages + ", browser = " + browser + ", entries = " + entries + ", comment = " + comment + ", creator = " + creator + ", version = " + version + "]";
    }
}
