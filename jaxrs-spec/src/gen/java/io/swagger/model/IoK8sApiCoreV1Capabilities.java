package io.swagger.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Adds and removes POSIX capabilities from running containers.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Adds and removes POSIX capabilities from running containers.")

public class IoK8sApiCoreV1Capabilities   {
  
  private @Valid List<String> add = new ArrayList<String>();
  private @Valid List<String> drop = new ArrayList<String>();

  /**
   * Added capabilities
   **/
  public IoK8sApiCoreV1Capabilities add(List<String> add) {
    this.add = add;
    return this;
  }

  
  @ApiModelProperty(value = "Added capabilities")
  @JsonProperty("add")
  public List<String> getAdd() {
    return add;
  }
  public void setAdd(List<String> add) {
    this.add = add;
  }

  /**
   * Removed capabilities
   **/
  public IoK8sApiCoreV1Capabilities drop(List<String> drop) {
    this.drop = drop;
    return this;
  }

  
  @ApiModelProperty(value = "Removed capabilities")
  @JsonProperty("drop")
  public List<String> getDrop() {
    return drop;
  }
  public void setDrop(List<String> drop) {
    this.drop = drop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Capabilities ioK8sApiCoreV1Capabilities = (IoK8sApiCoreV1Capabilities) o;
    return Objects.equals(add, ioK8sApiCoreV1Capabilities.add) &&
        Objects.equals(drop, ioK8sApiCoreV1Capabilities.drop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, drop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Capabilities {\n");
    
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    drop: ").append(toIndentedString(drop)).append("\n");
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

