package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * PodDNSConfigOption defines DNS resolver options of a pod.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "PodDNSConfigOption defines DNS resolver options of a pod.")

public class IoK8sApiCoreV1PodDNSConfigOption   {
  
  private @Valid String name = null;
  private @Valid String value = null;

  /**
   * Required.
   **/
  public IoK8sApiCoreV1PodDNSConfigOption name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Required.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public IoK8sApiCoreV1PodDNSConfigOption value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PodDNSConfigOption ioK8sApiCoreV1PodDNSConfigOption = (IoK8sApiCoreV1PodDNSConfigOption) o;
    return Objects.equals(name, ioK8sApiCoreV1PodDNSConfigOption.name) &&
        Objects.equals(value, ioK8sApiCoreV1PodDNSConfigOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodDNSConfigOption {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

