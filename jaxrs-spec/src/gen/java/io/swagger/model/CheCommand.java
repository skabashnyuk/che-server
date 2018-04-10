package io.swagger.model;

import io.swagger.model.CheCommandSpec;
import io.swagger.model.KubernetesObjectMeta;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheCommand   {
  
  private @Valid String apiVersion = null;
  private @Valid String kind = null;
  private @Valid KubernetesObjectMeta metadata = null;
  private @Valid CheCommandSpec spec = null;

  /**
   **/
  public CheCommand apiVersion(String apiVersion) {
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
  public CheCommand kind(String kind) {
    this.kind = kind;
    return this;
  }

  
  @ApiModelProperty(example = "CheCommand", required = true, value = "")
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
  public CheCommand metadata(KubernetesObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("metadata")
  @NotNull
  public KubernetesObjectMeta getMetadata() {
    return metadata;
  }
  public void setMetadata(KubernetesObjectMeta metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  public CheCommand spec(CheCommandSpec spec) {
    this.spec = spec;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("spec")
  @NotNull
  public CheCommandSpec getSpec() {
    return spec;
  }
  public void setSpec(CheCommandSpec spec) {
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
    CheCommand cheCommand = (CheCommand) o;
    return Objects.equals(apiVersion, cheCommand.apiVersion) &&
        Objects.equals(kind, cheCommand.kind) &&
        Objects.equals(metadata, cheCommand.metadata) &&
        Objects.equals(spec, cheCommand.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheCommand {\n");
    
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

