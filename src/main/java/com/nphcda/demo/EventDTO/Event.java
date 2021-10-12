
package com.nphcda.demo.EventDTO;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "storedBy",
    "dueDate",
    "program",
    "href",
    "event",
    "programStage",
    "orgUnit",
    "trackedEntityInstance",
    "enrollment",
    "enrollmentStatus",
    "status",
    "orgUnitName",
    "eventDate",
    "attributeCategoryOptions",
    "lastUpdated",
    "created",
    "followup",
    "deleted",
    "attributeOptionCombo",
    "lastUpdatedByUserInfo",
    "createdByUserInfo",
    "dataValues",
    "notes",
    "completedDate"
})
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("storedBy")
    private String storedBy;
    @JsonProperty("dueDate")
    private String dueDate;
    @JsonProperty("program")
    private String program;
    @JsonProperty("href")
    private String href;
    @JsonProperty("event")
    private String event;
    @JsonProperty("programStage")
    private String programStage;
    @JsonProperty("orgUnit")
    private String orgUnit;
    @JsonProperty("trackedEntityInstance")
    private String trackedEntityInstance;
    @JsonProperty("enrollment")
    private String enrollment;
    @JsonProperty("enrollmentStatus")
    private String enrollmentStatus;
    @JsonProperty("status")
    private String status;
    @JsonProperty("orgUnitName")
    private String orgUnitName;
    @JsonProperty("eventDate")
    private String eventDate;
    @JsonProperty("attributeCategoryOptions")
    private String attributeCategoryOptions;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("created")
    private String created;
    @JsonProperty("followup")
    private Boolean followup;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("attributeOptionCombo")
    private String attributeOptionCombo;
    @JsonProperty("lastUpdatedByUserInfo")
    private LastUpdatedByUserInfo lastUpdatedByUserInfo;
    @JsonProperty("createdByUserInfo")
    private CreatedByUserInfo createdByUserInfo;
    @JsonProperty("dataValues")
    private List<DataValue> dataValues = null;
    @JsonProperty("notes")
    private List<Object> notes = null;
    @JsonProperty("completedDate")
    private String completedDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("storedBy")
    public String getStoredBy() {
        return storedBy;
    }

    @JsonProperty("storedBy")
    public void setStoredBy(String storedBy) {
        this.storedBy = storedBy;
    }

    @JsonProperty("dueDate")
    public String getDueDate() {
        return dueDate;
    }

    @JsonProperty("dueDate")
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    @JsonProperty("event")
    public void setEvent(String event) {
        this.event = event;
    }

    @JsonProperty("programStage")
    public String getProgramStage() {
        return programStage;
    }

    @JsonProperty("programStage")
    public void setProgramStage(String programStage) {
        this.programStage = programStage;
    }

    @JsonProperty("orgUnit")
    public String getOrgUnit() {
        return orgUnit;
    }

    @JsonProperty("orgUnit")
    public void setOrgUnit(String orgUnit) {
        this.orgUnit = orgUnit;
    }

    @JsonProperty("trackedEntityInstance")
    public String getTrackedEntityInstance() {
        return trackedEntityInstance;
    }

    @JsonProperty("trackedEntityInstance")
    public void setTrackedEntityInstance(String trackedEntityInstance) {
        this.trackedEntityInstance = trackedEntityInstance;
    }

    @JsonProperty("enrollment")
    public String getEnrollment() {
        return enrollment;
    }

    @JsonProperty("enrollment")
    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    @JsonProperty("enrollmentStatus")
    public String getEnrollmentStatus() {
        return enrollmentStatus;
    }

    @JsonProperty("enrollmentStatus")
    public void setEnrollmentStatus(String enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("orgUnitName")
    public String getOrgUnitName() {
        return orgUnitName;
    }

    @JsonProperty("orgUnitName")
    public void setOrgUnitName(String orgUnitName) {
        this.orgUnitName = orgUnitName;
    }

    @JsonProperty("eventDate")
    public String getEventDate() {
        return eventDate;
    }

    @JsonProperty("eventDate")
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    @JsonProperty("attributeCategoryOptions")
    public String getAttributeCategoryOptions() {
        return attributeCategoryOptions;
    }

    @JsonProperty("attributeCategoryOptions")
    public void setAttributeCategoryOptions(String attributeCategoryOptions) {
        this.attributeCategoryOptions = attributeCategoryOptions;
    }

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("followup")
    public Boolean getFollowup() {
        return followup;
    }

    @JsonProperty("followup")
    public void setFollowup(Boolean followup) {
        this.followup = followup;
    }

    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @JsonProperty("attributeOptionCombo")
    public String getAttributeOptionCombo() {
        return attributeOptionCombo;
    }

    @JsonProperty("attributeOptionCombo")
    public void setAttributeOptionCombo(String attributeOptionCombo) {
        this.attributeOptionCombo = attributeOptionCombo;
    }

    @JsonProperty("lastUpdatedByUserInfo")
    public LastUpdatedByUserInfo getLastUpdatedByUserInfo() {
        return lastUpdatedByUserInfo;
    }

    @JsonProperty("lastUpdatedByUserInfo")
    public void setLastUpdatedByUserInfo(LastUpdatedByUserInfo lastUpdatedByUserInfo) {
        this.lastUpdatedByUserInfo = lastUpdatedByUserInfo;
    }

    @JsonProperty("createdByUserInfo")
    public CreatedByUserInfo getCreatedByUserInfo() {
        return createdByUserInfo;
    }

    @JsonProperty("createdByUserInfo")
    public void setCreatedByUserInfo(CreatedByUserInfo createdByUserInfo) {
        this.createdByUserInfo = createdByUserInfo;
    }

    @JsonProperty("dataValues")
    public List<DataValue> getDataValues() {
        return dataValues;
    }

    @JsonProperty("dataValues")
    public void setDataValues(List<DataValue> dataValues) {
        this.dataValues = dataValues;
    }

    @JsonProperty("notes")
    public List<Object> getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(List<Object> notes) {
        this.notes = notes;
    }

    @JsonProperty("completedDate")
    public String getCompletedDate() {
        return completedDate;
    }

    @JsonProperty("completedDate")
    public void setCompletedDate(String completedDate) {
        this.completedDate = completedDate;
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
