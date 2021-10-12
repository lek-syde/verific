
package com.nphcda.demo.kobo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "download_url",
    "download_large_url",
    "download_medium_url",
    "download_small_url",
    "mimetype",
    "filename",
    "instance",
    "xform",
    "id"
})
@Generated("jsonschema2pojo")
public class Attachment {

    @JsonProperty("download_url")
    private String downloadUrl;
    @JsonProperty("download_large_url")
    private String downloadLargeUrl;
    @JsonProperty("download_medium_url")
    private String downloadMediumUrl;
    @JsonProperty("download_small_url")
    private String downloadSmallUrl;
    @JsonProperty("mimetype")
    private String mimetype;
    @JsonProperty("filename")
    private String filename;
    @JsonProperty("instance")
    private Integer instance;
    @JsonProperty("xform")
    private Integer xform;
    @JsonProperty("id")
    private Integer id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("download_url")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    @JsonProperty("download_url")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @JsonProperty("download_large_url")
    public String getDownloadLargeUrl() {
        return downloadLargeUrl;
    }

    @JsonProperty("download_large_url")
    public void setDownloadLargeUrl(String downloadLargeUrl) {
        this.downloadLargeUrl = downloadLargeUrl;
    }

    @JsonProperty("download_medium_url")
    public String getDownloadMediumUrl() {
        return downloadMediumUrl;
    }

    @JsonProperty("download_medium_url")
    public void setDownloadMediumUrl(String downloadMediumUrl) {
        this.downloadMediumUrl = downloadMediumUrl;
    }

    @JsonProperty("download_small_url")
    public String getDownloadSmallUrl() {
        return downloadSmallUrl;
    }

    @JsonProperty("download_small_url")
    public void setDownloadSmallUrl(String downloadSmallUrl) {
        this.downloadSmallUrl = downloadSmallUrl;
    }

    @JsonProperty("mimetype")
    public String getMimetype() {
        return mimetype;
    }

    @JsonProperty("mimetype")
    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    @JsonProperty("filename")
    public void setFilename(String filename) {
        this.filename = filename;
    }

    @JsonProperty("instance")
    public Integer getInstance() {
        return instance;
    }

    @JsonProperty("instance")
    public void setInstance(Integer instance) {
        this.instance = instance;
    }

    @JsonProperty("xform")
    public Integer getXform() {
        return xform;
    }

    @JsonProperty("xform")
    public void setXform(Integer xform) {
        this.xform = xform;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
