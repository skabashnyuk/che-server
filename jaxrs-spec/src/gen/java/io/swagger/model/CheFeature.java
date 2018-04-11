package io.swagger.model;

import io.swagger.model.CheFeatureSpec;
import io.swagger.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheFeature   {
  
  private @Valid String apiVersion = null;
  private @Valid String kind = null;
  private @Valid IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;
  private @Valid CheFeatureSpec spec = null;

  /**
   **/
  public CheFeature apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  
  @ApiModelProperty(example = "che.eclipse.org/v1", required = true, value = "")
  @JsonProperty("apiVersion")
  @NotNull
  public String getApiVersion() {
    return apiVersion;
  }
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   **/
  public CheFeature kind(String kind) {
    this.kind = kind;
    return this;
  }

  
  @ApiModelProperty(example = "CheFeature", required = true, value = "")
  @JsonProperty("kind")
  @NotNull
  public String getKind() {
    return kind;
  }
  public void setKind(String kind) {
    this.kind = kind;
  }

  /**
   **/
  public CheFeature metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("metadata")
  @NotNull
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }
  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  public CheFeature spec(CheFeatureSpec spec) {
    this.spec = spec;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("spec")
  @NotNull
  public CheFeatureSpec getSpec() {
    return spec;
  }
  public void setSpec(CheFeatureSpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheFeature cheFeature = (CheFeature) o;
    return Objects.equals(apiVersion, cheFeature.apiVersion) &&
        Objects.equals(kind, cheFeature.kind) &&
        Objects.equals(metadata, cheFeature.metadata) &&
        Objects.equals(spec, cheFeature.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheFeature {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

