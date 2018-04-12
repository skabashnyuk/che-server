package io.swagger.model;

import io.swagger.model.CheServiceSpec;
import io.swagger.model.ObjectMeta;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheService   {
  
  private @Valid String apiVersion = null;
  private @Valid String kind = null;
  private @Valid ObjectMeta metadata = null;
  private @Valid CheServiceSpec spec = null;

  /**
   **/
  public CheService apiVersion(String apiVersion) {
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
  public CheService kind(String kind) {
    this.kind = kind;
    return this;
  }

  
  @ApiModelProperty(example = "CheService", required = true, value = "")
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
  public CheService metadata(ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("metadata")
  @NotNull
  public ObjectMeta getMetadata() {
    return metadata;
  }
  public void setMetadata(ObjectMeta metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  public CheService spec(CheServiceSpec spec) {
    this.spec = spec;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("spec")
  @NotNull
  public CheServiceSpec getSpec() {
    return spec;
  }
  public void setSpec(CheServiceSpec spec) {
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
    CheService cheService = (CheService) o;
    return Objects.equals(apiVersion, cheService.apiVersion) &&
        Objects.equals(kind, cheService.kind) &&
        Objects.equals(metadata, cheService.metadata) &&
        Objects.equals(spec, cheService.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheService {\n");
    
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

