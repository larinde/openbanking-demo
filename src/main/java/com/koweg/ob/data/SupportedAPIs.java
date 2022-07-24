
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
    "business-current-accounts",
    "personal-current-accounts",
    "unsecured-sme-loans",
    "fca-service-metrics",
    "atms",
    "branches",
    "commercial-credit-cards"
})
@Generated("jsonschema2pojo")
public class SupportedAPIs {

    @JsonProperty("business-current-accounts")
    @Valid
    private List<String> businessCurrentAccounts = null;
    @JsonProperty("personal-current-accounts")
    @Valid
    private List<String> personalCurrentAccounts = null;
    @JsonProperty("unsecured-sme-loans")
    @Valid
    private List<String> unsecuredSmeLoans = null;
    @JsonProperty("fca-service-metrics")
    @Valid
    private List<FcaServiceMetric> fcaServiceMetrics = null;
    @JsonProperty("atms")
    @Valid
    private List<String> atms = null;
    @JsonProperty("branches")
    @Valid
    private List<String> branches = null;
    @JsonProperty("commercial-credit-cards")
    @Valid
    private List<String> commercialCreditCards = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("business-current-accounts")
    public List<String> getBusinessCurrentAccounts() {
        return businessCurrentAccounts;
    }

    @JsonProperty("business-current-accounts")
    public void setBusinessCurrentAccounts(List<String> businessCurrentAccounts) {
        this.businessCurrentAccounts = businessCurrentAccounts;
    }

    public SupportedAPIs withBusinessCurrentAccounts(List<String> businessCurrentAccounts) {
        this.businessCurrentAccounts = businessCurrentAccounts;
        return this;
    }

    @JsonProperty("personal-current-accounts")
    public List<String> getPersonalCurrentAccounts() {
        return personalCurrentAccounts;
    }

    @JsonProperty("personal-current-accounts")
    public void setPersonalCurrentAccounts(List<String> personalCurrentAccounts) {
        this.personalCurrentAccounts = personalCurrentAccounts;
    }

    public SupportedAPIs withPersonalCurrentAccounts(List<String> personalCurrentAccounts) {
        this.personalCurrentAccounts = personalCurrentAccounts;
        return this;
    }

    @JsonProperty("unsecured-sme-loans")
    public List<String> getUnsecuredSmeLoans() {
        return unsecuredSmeLoans;
    }

    @JsonProperty("unsecured-sme-loans")
    public void setUnsecuredSmeLoans(List<String> unsecuredSmeLoans) {
        this.unsecuredSmeLoans = unsecuredSmeLoans;
    }

    public SupportedAPIs withUnsecuredSmeLoans(List<String> unsecuredSmeLoans) {
        this.unsecuredSmeLoans = unsecuredSmeLoans;
        return this;
    }

    @JsonProperty("fca-service-metrics")
    public List<FcaServiceMetric> getFcaServiceMetrics() {
        return fcaServiceMetrics;
    }

    @JsonProperty("fca-service-metrics")
    public void setFcaServiceMetrics(List<FcaServiceMetric> fcaServiceMetrics) {
        this.fcaServiceMetrics = fcaServiceMetrics;
    }

    public SupportedAPIs withFcaServiceMetrics(List<FcaServiceMetric> fcaServiceMetrics) {
        this.fcaServiceMetrics = fcaServiceMetrics;
        return this;
    }

    @JsonProperty("atms")
    public List<String> getAtms() {
        return atms;
    }

    @JsonProperty("atms")
    public void setAtms(List<String> atms) {
        this.atms = atms;
    }

    public SupportedAPIs withAtms(List<String> atms) {
        this.atms = atms;
        return this;
    }

    @JsonProperty("branches")
    public List<String> getBranches() {
        return branches;
    }

    @JsonProperty("branches")
    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    public SupportedAPIs withBranches(List<String> branches) {
        this.branches = branches;
        return this;
    }

    @JsonProperty("commercial-credit-cards")
    public List<String> getCommercialCreditCards() {
        return commercialCreditCards;
    }

    @JsonProperty("commercial-credit-cards")
    public void setCommercialCreditCards(List<String> commercialCreditCards) {
        this.commercialCreditCards = commercialCreditCards;
    }

    public SupportedAPIs withCommercialCreditCards(List<String> commercialCreditCards) {
        this.commercialCreditCards = commercialCreditCards;
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

    public SupportedAPIs withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
