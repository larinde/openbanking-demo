
package com.koweg.ob.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "brands",
    "baseUrl",
    "supportedAPIs"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("name")
    private String name;
    @JsonProperty("brands")
    @Valid
    private List<String> brands = null;
    @JsonProperty("baseUrl")
    private String baseUrl;
    @JsonProperty("supportedAPIs")
    @Valid
    private SupportedAPIs supportedAPIs;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Datum withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("brands")
    public List<String> getBrands() {
        return brands;
    }

    @JsonProperty("brands")
    public void setBrands(List<String> brands) {
        this.brands = brands;
    }

    public Datum withBrands(List<String> brands) {
        this.brands = brands;
        return this;
    }

    @JsonProperty("baseUrl")
    public String getBaseUrl() {
        return baseUrl;
    }

    @JsonProperty("baseUrl")
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public Datum withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    @JsonProperty("supportedAPIs")
    public SupportedAPIs getSupportedAPIs() {
        return supportedAPIs;
    }

    @JsonProperty("supportedAPIs")
    public void setSupportedAPIs(SupportedAPIs supportedAPIs) {
        this.supportedAPIs = supportedAPIs;
    }

    public Datum withSupportedAPIs(SupportedAPIs supportedAPIs) {
        this.supportedAPIs = supportedAPIs;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Datum withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
