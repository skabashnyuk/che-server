package io.swagger.model;

import io.swagger.model.Container;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheServiceSpec   {
  
  private @Valid String version = null;
  private @Valid List<Container> containers = new ArrayList<Container>();

  /**
   **/
  public CheServiceSpec version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "1.0.0", required = true, value = "")
  @JsonProperty("version")
  @NotNull
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   **/
  public CheServiceSpec containers(List<Container> containers) {
    this.containers = containers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    CheServiceSpec cheServiceSpec = (CheServiceSpec) o;
    return Objects.equals(version, cheServiceSpec.version) &&
        Objects.equals(containers, cheServiceSpec.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheServiceSpec {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

