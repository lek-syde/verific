
package com.nphcda.demo.EventDTO;

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
    "lastUpdated",
    "created",
    "dataElement",
    "value",
    "providedElsewhere",
    "createdByUserInfo",
    "lastUpdatedByUserInfo"
})
@Generated("jsonschema2pojo")
public class DataValue {

    @JsonProperty("lastUpdated")
    private String lastUpdated;
    @JsonProperty("created")
    private String created;
    @JsonProperty("dataElement")
    private String dataElement;
    @JsonProperty("value")
    private String value;
    @JsonProperty("providedElsewhere")
    private Boolean providedElsewhere;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("dataElement")
    public String getDataElement() {
        return dataElement;
    }

    @JsonProperty("dataElement")
    public void setDataElement(String dataElement) {
        this.dataElement = dataElement;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("providedElsewhere")
    public Boolean getProvidedElsewhere() {
        return providedElsewhere;
    }

    @JsonProperty("providedElsewhere")
    public void setProvidedElsewhere(Boolean providedElsewhere) {
        this.providedElsewhere = providedElsewhere;
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
