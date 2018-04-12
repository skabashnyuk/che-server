package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ObjectMeta;
import io.swagger.model.PodSpec;
import io.swagger.model.TypeMeta;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Pod is a collection of containers that can run on a host. This resource is created by clients and scheduled onto hosts.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Pod is a collection of containers that can run on a host. This resource is created by clients and scheduled onto hosts.")

public class Pod extends TypeMeta  {
  
  private @Valid ObjectMeta metadata = null;
  private @Valid PodSpec spec = null;

  /**
   **/
  public Pod metadata(ObjectMeta metadata) {
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
  public Pod spec(PodSpec spec) {
    this.spec = spec;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("spec")
  @NotNull
  public PodSpec getSpec() {
    return spec;
  }
  public void setSpec(PodSpec spec) {
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
    Pod pod = (Pod) o;
    return Objects.equals(metadata, pod.metadata) &&
        Objects.equals(spec, pod.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pod {\n");
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

