
package com.nphcda.demo.DTO;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ownerOrgUnit",
    "program",
    "trackedEntityInstance"
})
@Generated("jsonschema2pojo")
public class ProgramOwner {

    @JsonProperty("ownerOrgUnit")
    private String ownerOrgUnit;
    @JsonProperty("program")
    private String program;
    @JsonProperty("trackedEntityInstance")
    private String trackedEntityInstance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ownerOrgUnit")
    public String getOwnerOrgUnit() {
        return ownerOrgUnit;
    }

    @JsonProperty("ownerOrgUnit")
    public void setOwnerOrgUnit(String ownerOrgUnit) {
        this.ownerOrgUnit = ownerOrgUnit;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
