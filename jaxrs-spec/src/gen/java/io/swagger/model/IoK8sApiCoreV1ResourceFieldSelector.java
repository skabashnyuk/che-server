package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ResourceFieldSelector represents container resources (cpu, memory) and their output format
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ResourceFieldSelector represents container resources (cpu, memory) and their output format")

public class IoK8sApiCoreV1ResourceFieldSelector   {
  
  private @Valid String containerName = null;
  private @Valid String divisor = null;
  private @Valid String resource = null;

  /**
   * Container name: required for volumes, optional for env vars
   **/
  public IoK8sApiCoreV1ResourceFieldSelector containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

  
  @ApiModelProperty(value = "Container name: required for volumes, optional for env vars")
  @JsonProperty("containerName")
  public String getContainerName() {
    return containerName;
  }
  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }

  /**
   * Specifies the output format of the exposed resources, defaults to \&quot;1\&quot;
   **/
  public IoK8sApiCoreV1ResourceFieldSelector divisor(String divisor) {
    this.divisor = divisor;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the output format of the exposed resources, defaults to \"1\"")
  @JsonProperty("divisor")
  public String getDivisor() {
    return divisor;
  }
  public void setDivisor(String divisor) {
    this.divisor = divisor;
  }

  /**
   * Required: resource to select
   **/
  public IoK8sApiCoreV1ResourceFieldSelector resource(String resource) {
    this.resource = resource;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Required: resource to select")
  @JsonProperty("resource")
  @NotNull
  public String getResource() {
    return resource;
  }
  public void setResource(String resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ResourceFieldSelector ioK8sApiCoreV1ResourceFieldSelector = (IoK8sApiCoreV1ResourceFieldSelector) o;
    return Objects.equals(containerName, ioK8sApiCoreV1ResourceFieldSelector.containerName) &&
        Objects.equals(divisor, ioK8sApiCoreV1ResourceFieldSelector.divisor) &&
        Objects.equals(resource, ioK8sApiCoreV1ResourceFieldSelector.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, divisor, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ResourceFieldSelector {\n");
    
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    divisor: ").append(toIndentedString(divisor)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

