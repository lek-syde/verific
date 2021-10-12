
package com.nphcda.demo.kobo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.nphcda.demo.kobo.Attachment;
import com.nphcda.demo.kobo.ValidationStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_id",
        "formhub/uuid",
        "start",
        "end",
        "location",
        "barcode",
        "image",
        "Vaccination_Number",
        "__version__",
        "meta/instanceID",
        "_xform_id_string",
        "_uuid",
        "_attachments",
        "_status",
        "_geolocation",
        "_submission_time",
        "_tags",
        "_notes",
        "_validation_status",
        "_submitted_by"
})
@Generated("jsonschema2pojo")
public class Validator {

    @JsonProperty("_id")
    private Integer id;
    @JsonProperty("formhub/uuid")
    private String formhubUuid;
    @JsonProperty("start")
    private String start;
    @JsonProperty("end")
    private String end;
    @JsonProperty("location")
    private String location;
    @JsonProperty("barcode")
    private String barcode;
    @JsonProperty("image")
    private String image;
    @JsonProperty("Vaccination_Number")
    private String vaccinationNumber;
    @JsonProperty("__version__")
    private String version;
    @JsonProperty("meta/instanceID")
    private String metaInstanceID;
    @JsonProperty("_xform_id_string")
    private String xformIdString;
    @JsonProperty("_uuid")
    private String uuid;
    @JsonProperty("_attachments")
    private List<Attachment> attachments = null;
    @JsonProperty("_status")
    private String status;
    @JsonProperty("_geolocation")
    private List<Double> geolocation = null;
    @JsonProperty("_submission_time")
    private String submissionTime;
    @JsonProperty("_tags")
    private List<Object> tags = null;
    @JsonProperty("_notes")
    private List<Object> notes = null;
    @JsonProperty("_validation_status")
    private ValidationStatus validationStatus;
    @JsonProperty("_submitted_by")
    private String submittedBy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("formhub/uuid")
    public String getFormhubUuid() {
        return formhubUuid;
    }

    @JsonProperty("formhub/uuid")
    public void setFormhubUuid(String formhubUuid) {
        this.formhubUuid = formhubUuid;
    }

    @JsonProperty("start")
    public String getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(String start) {
        this.start = start;
    }

    @JsonProperty("end")
    public String getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(String end) {
        this.end = end;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("barcode")
    public String getBarcode() {
        return barcode;
    }

    @JsonProperty("barcode")
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("Vaccination_Number")
    public String getVaccinationNumber() {
        return vaccinationNumber;
    }

    @JsonProperty("Vaccination_Number")
    public void setVaccinationNumber(String vaccinationNumber) {
        this.vaccinationNumber = vaccinationNumber;
    }

    @JsonProperty("__version__")
    public String getVersion() {
        return version;
    }

    @JsonProperty("__version__")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("meta/instanceID")
    public String getMetaInstanceID() {
        return metaInstanceID;
    }

    @JsonProperty("meta/instanceID")
    public void setMetaInstanceID(String metaInstanceID) {
        this.metaInstanceID = metaInstanceID;
    }

    @JsonProperty("_xform_id_string")
    public String getXformIdString() {
        return xformIdString;
    }

    @JsonProperty("_xform_id_string")
    public void setXformIdString(String xformIdString) {
        this.xformIdString = xformIdString;
    }

    @JsonProperty("_uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("_uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("_attachments")
    public List<Attachment> getAttachments() {
        return attachments;
    }

    @JsonProperty("_attachments")
    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    @JsonProperty("_status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("_status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("_geolocation")
    public List<Double> getGeolocation() {
        return geolocation;
    }

    @JsonProperty("_geolocation")
    public void setGeolocation(List<Double> geolocation) {
        this.geolocation = geolocation;
    }

    @JsonProperty("_submission_time")
    public String getSubmissionTime() {
        return submissionTime;
    }

    @JsonProperty("_submission_time")
    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
    }

    @JsonProperty("_tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("_tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("_notes")
    public List<Object> getNotes() {
        return notes;
    }

    @JsonProperty("_notes")
    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

    @JsonProperty("_validation_status")
    public ValidationStatus getValidationStatus() {
        return validationStatus;
    }

    @JsonProperty("_validation_status")
    public void setValidationStatus(ValidationStatus validationStatus) {
        this.validationStatus = validationStatus;
    }

    @JsonProperty("_submitted_by")
    public String getSubmittedBy() {
        return submittedBy;
    }

    @JsonProperty("_submitted_by")
    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
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
