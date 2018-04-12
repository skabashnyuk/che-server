package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.Container;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * PodSpec is a description of a pod.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "PodSpec is a description of a pod.")

public class PodSpec   {
  
  private @Valid List<Container> containers = new ArrayList<Container>();

  /**
   * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
   **/
  public PodSpec containers(List<Container> containers) {
    this.containers = containers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.")
  @JsonProperty("containers")
  @NotNull
  public List<Container> getContainers() {
    return containers;
  }
  public void setContainers(List<Container> containers) {
    this.containers = containers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodSpec podSpec = (PodSpec) o;
    return Objects.equals(containers, podSpec.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodSpec {\n");
    
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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

