package io.swagger.model;

import io.swagger.model.CheFeatureSpec;
import io.swagger.model.ObjectMeta;
import io.swagger.model.TypeMeta;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheFeature extends TypeMeta  {
  
  private @Valid ObjectMeta metadata = null;
  private @Valid CheFeatureSpec spec = null;

  /**
   **/
  public CheFeature metadata(ObjectMeta metadata) {
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
    return Objects.equals(metadata, cheFeature.metadata) &&
        Objects.equals(spec, cheFeature.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheFeature {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

