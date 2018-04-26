package io.swagger.model;

import io.swagger.model.ResourceList;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ResourceRequirements   {
  
  private @Valid List<ResourceList> requests = new ArrayList<ResourceList>();

  /**
   * Requests describes the minimum amount of compute resources required.
   **/
  public ResourceRequirements requests(List<ResourceList> requests) {
    this.requests = requests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Requests describes the minimum amount of compute resources required.")
  @JsonProperty("requests")
  @NotNull
  public List<ResourceList> getRequests() {
    return requests;
  }
  public void setRequests(List<ResourceList> requests) {
    this.requests = requests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceRequirements resourceRequirements = (ResourceRequirements) o;
    return Objects.equals(requests, resourceRequirements.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceRequirements {\n");
    
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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

