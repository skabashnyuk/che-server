package io.swagger.model;

import io.swagger.model.ObjectMeta;
import io.swagger.model.ServiceSpec;
import io.swagger.model.TypeMeta;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Service extends TypeMeta  {
  
  private @Valid ObjectMeta metadata = null;
  private @Valid ServiceSpec spec = null;

  /**
   **/
  public Service metadata(ObjectMeta metadata) {
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
  public Service spec(ServiceSpec spec) {
    this.spec = spec;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("spec")
  @NotNull
  public ServiceSpec getSpec() {
    return spec;
  }
  public void setSpec(ServiceSpec spec) {
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
    Service service = (Service) o;
    return Objects.equals(metadata, service.metadata) &&
        Objects.equals(spec, service.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
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

