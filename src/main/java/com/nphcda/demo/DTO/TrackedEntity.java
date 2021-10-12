
package com.nphcda.demo.DTO;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "trackedEntityInstances"
})
@Generated("jsonschema2pojo")
public class TrackedEntity {

    @JsonProperty("trackedEntityInstances")
    private List<TrackedEntityInstance> trackedEntityInstances;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("trackedEntityInstances")
    public List<TrackedEntityInstance> getTrackedEntityInstances() {
        return trackedEntityInstances;
    }

    @JsonProperty("trackedEntityInstances")
    public void setTrackedEntityInstances(List<TrackedEntityInstance> trackedEntityInstances) {
        this.trackedEntityInstances = trackedEntityInstances;
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
