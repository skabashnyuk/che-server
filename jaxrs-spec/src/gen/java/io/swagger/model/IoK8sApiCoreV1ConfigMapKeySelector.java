package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Selects a key from a ConfigMap.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Selects a key from a ConfigMap.")

public class IoK8sApiCoreV1ConfigMapKeySelector   {
  
  private @Valid String key = null;
  private @Valid String name = null;
  private @Valid Boolean optional = null;

  /**
   * The key to select.
   **/
  public IoK8sApiCoreV1ConfigMapKeySelector key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The key to select.")
  @JsonProperty("key")
  @NotNull
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   **/
  public IoK8sApiCoreV1ConfigMapKeySelector name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Specify whether the ConfigMap or it&#39;s key must be defined
   **/
  public IoK8sApiCoreV1ConfigMapKeySelector optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  
  @ApiModelProperty(value = "Specify whether the ConfigMap or it's key must be defined")
  @JsonProperty("optional")
  public Boolean isOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ConfigMapKeySelector ioK8sApiCoreV1ConfigMapKeySelector = (IoK8sApiCoreV1ConfigMapKeySelector) o;
    return Objects.equals(key, ioK8sApiCoreV1ConfigMapKeySelector.key) &&
        Objects.equals(name, ioK8sApiCoreV1ConfigMapKeySelector.name) &&
        Objects.equals(optional, ioK8sApiCoreV1ConfigMapKeySelector.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, optional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ConfigMapKeySelector {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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

