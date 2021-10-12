
package com.nphcda.demo.DTO;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "storedBy",
    "created",
    "orgUnit",
    "createdAtClient",
    "program",
    "trackedEntityInstance",
    "enrollment",
    "lastUpdated",
    "trackedEntityType",
    "lastUpdatedAtClient",
    "orgUnitName",
    "enrollmentDate",
    "followup",
    "deleted",
    "geometry",
    "incidentDate",
    "status",
    "coordinate",
    "notes",
    "relationships",
    "attributes",
    "events"
})
@Generated("jsonschema2pojo")
public class Enrollment {

    @JsonProperty("storedBy")
    private String storedBy;
    @JsonProperty("created")
    private String created;
    @JsonProperty("orgUnit")
    private String orgUnit;
    @JsonProperty("createdAtClient")
    private String createdAtClient;
    @JsonProperty("program")
    private String program;
    @JsonProperty("trackedEntityInstance")
    private String trackedEntityInstance;
    @JsonProperty("enrollment")
    private String enrollment;
    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("trackedEntityType")
    private String trackedEntityType;
    @JsonProperty("lastUpdatedAtClient")
    private String lastUpdatedAtClient;
    @JsonProperty("orgUnitName")
    private String orgUnitName;
    @JsonProperty("enrollmentDate")
    private String enrollmentDate;
    @JsonProperty("followup")
    private Boolean followup;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("incidentDate")
    private String incidentDate;
    @JsonProperty("status")
    private String status;
    @JsonProperty("coordinate")
    private Coordinate coordinate;
    @JsonProperty("notes")
    private List<Object> notes;
    @JsonProperty("relationships")
    private List<Object> relationships;
    @JsonProperty("attributes")
    private List<Object> attributes;
    @JsonProperty("events")
    private List<Event> events;
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

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("orgUnit")
    public String getOrgUnit() {
        return orgUnit;
    }

    @JsonProperty("orgUnit")
    public void setOrgUnit(String orgUnit) {
        this.orgUnit = orgUnit;
    }

    @JsonProperty("createdAtClient")
    public String getCreatedAtClient() {
        return createdAtClient;
    }

    @JsonProperty("createdAtClient")
    public void setCreatedAtClient(String createdAtClient) {
        this.createdAtClient = createdAtClient;
    }

    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
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

    @JsonProperty("lastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("lastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("trackedEntityType")
    public String getTrackedEntityType() {
        return trackedEntityType;
    }

    @JsonProperty("trackedEntityType")
    public void setTrackedEntityType(String trackedEntityType) {
        this.trackedEntityType = trackedEntityType;
    }

    @JsonProperty("lastUpdatedAtClient")
    public String getLastUpdatedAtClient() {
        return lastUpdatedAtClient;
    }

    @JsonProperty("lastUpdatedAtClient")
    public void setLastUpdatedAtClient(String lastUpdatedAtClient) {
        this.lastUpdatedAtClient = lastUpdatedAtClient;
    }

    @JsonProperty("orgUnitName")
    public String getOrgUnitName() {
        return orgUnitName;
    }

    @JsonProperty("orgUnitName")
    public void setOrgUnitName(String orgUnitName) {
        this.orgUnitName = orgUnitName;
    }

    @JsonProperty("enrollmentDate")
    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    @JsonProperty("enrollmentDate")
    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
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

    @JsonProperty("geometry")
    public Geometry getGeometry() {
        return geometry;
    }

    @JsonProperty("geometry")
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @JsonProperty("incidentDate")
    public String getIncidentDate() {
        return incidentDate;
    }

    @JsonProperty("incidentDate")
    public void setIncidentDate(String incidentDate) {
        this.incidentDate = incidentDate;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("coordinate")
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @JsonProperty("coordinate")
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
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

    @JsonProperty("attributes")
    public List<Object> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    @JsonProperty("events")
    public List<Event> getEvents() {
        return events;
    }

    @JsonProperty("events")
    public void setEvents(List<Event> events) {
        this.events = events;
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
