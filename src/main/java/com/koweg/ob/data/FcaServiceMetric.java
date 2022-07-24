
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
    "version",
    "product-type"
})
@Generated("jsonschema2pojo")
public class FcaServiceMetric {

    @JsonProperty("version")
    private String version;
    @JsonProperty("product-type")
    private String productType;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public FcaServiceMetric withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("product-type")
    public String getProductType() {
        return productType;
    }

    @JsonProperty("product-type")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    public FcaServiceMetric withProductType(String productType) {
        this.productType = productType;
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

    public FcaServiceMetric withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
