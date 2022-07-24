
package com.koweg.ob.data;

import java.util.HashMap;
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
    "Agreement",
    "TotalResults",
    "LastUpdated",
    "License",
    "TermsOfUse"
})
@Generated("jsonschema2pojo")
public class Meta {

    @JsonProperty("Agreement")
    private String agreement;
    @JsonProperty("TotalResults")
    private Integer totalResults;
    @JsonProperty("LastUpdated")
    private String lastUpdated;
    @JsonProperty("License")
    private String license;
    @JsonProperty("TermsOfUse")
    private String termsOfUse;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Agreement")
    public String getAgreement() {
        return agreement;
    }

    @JsonProperty("Agreement")
    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public Meta withAgreement(String agreement) {
        this.agreement = agreement;
        return this;
    }

    @JsonProperty("TotalResults")
    public Integer getTotalResults() {
        return totalResults;
    }

    @JsonProperty("TotalResults")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Meta withTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
        return this;
    }

    @JsonProperty("LastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("LastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Meta withLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    @JsonProperty("License")
    public String getLicense() {
        return license;
    }

    @JsonProperty("License")
    public void setLicense(String license) {
        this.license = license;
    }

    public Meta withLicense(String license) {
        this.license = license;
        return this;
    }

    @JsonProperty("TermsOfUse")
    public String getTermsOfUse() {
        return termsOfUse;
    }

    @JsonProperty("TermsOfUse")
    public void setTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }

    public Meta withTermsOfUse(String termsOfUse) {
        this.termsOfUse = termsOfUse;
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

    public Meta withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
