
package com.nphcda.demo.DTO;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "storedBy",
    "dueDate",
    "program",
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
    "completedDate",
    "followup",
    "deleted",
    "attributeOptionCombo",
    "dataValues",
    "notes",
    "relationships"
})
@Generated("jsonschema2pojo")
public class Event {

    @JsonProperty("storedBy")
    private String storedBy;
    @JsonProperty("dueDate")
    private String dueDate;
    @JsonProperty("program")
    private String program;
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
    @JsonProperty("completedDate")
    private String completedDate;
    @JsonProperty("followup")
    private Boolean followup;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("attributeOptionCombo")
    private String attributeOptionCombo;
    @JsonProperty("dataValues")
    private List<DataValue> dataValues;
    @JsonProperty("notes")
    private List<Object> notes;
    @JsonProperty("relationships")
    private List<Object> relationships;
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

    @JsonProperty("completedDate")
    public String getCompletedDate() {
        return completedDate;
    }

    @JsonProperty("completedDate")
    public void setCompletedDate(String completedDate) {
        this.completedDate = completedDate;
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

    @JsonProperty("relationships")
    public List<Object> getRelationships() {
        return relationships;
    }

    @JsonProperty("relationships")
    public void setRelationships(List<Object> relationships) {
        this.relationships = relationships;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


    @Override
    public String toString() {
        return "Event{" +
                "storedBy='" + storedBy + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", program='" + program + '\'' +
                ", event='" + event + '\'' +
                ", programStage='" + programStage + '\'' +
                ", orgUnit='" + orgUnit + '\'' +
                ", trackedEntityInstance='" + trackedEntityInstance + '\'' +
                ", enrollment='" + enrollment + '\'' +
                ", enrollmentStatus='" + enrollmentStatus + '\'' +
                ", status='" + status + '\'' +
                ", orgUnitName='" + orgUnitName + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", attributeCategoryOptions='" + attributeCategoryOptions + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", created='" + created + '\'' +
                ", completedDate='" + completedDate + '\'' +
                ", followup=" + followup +
                ", deleted=" + deleted +
                ", attributeOptionCombo='" + attributeOptionCombo + '\'' +
                ", dataValues=" + dataValues +
                ", notes=" + notes +
                ", relationships=" + relationships +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
