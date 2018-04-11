package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * SecretKeySelector selects a key of a Secret.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "SecretKeySelector selects a key of a Secret.")

public class IoK8sApiCoreV1SecretKeySelector   {
  
  private @Valid String key = null;
  private @Valid String name = null;
  private @Valid Boolean optional = null;

  /**
   * The key of the secret to select from.  Must be a valid secret key.
   **/
  public IoK8sApiCoreV1SecretKeySelector key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The key of the secret to select from.  Must be a valid secret key.")
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
  public IoK8sApiCoreV1SecretKeySelector name(String name) {
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
   * Specify whether the Secret or it&#39;s key must be defined
   **/
  public IoK8sApiCoreV1SecretKeySelector optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  
  @ApiModelProperty(value = "Specify whether the Secret or it's key must be defined")
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
    IoK8sApiCoreV1SecretKeySelector ioK8sApiCoreV1SecretKeySelector = (IoK8sApiCoreV1SecretKeySelector) o;
    return Objects.equals(key, ioK8sApiCoreV1SecretKeySelector.key) &&
        Objects.equals(name, ioK8sApiCoreV1SecretKeySelector.name) &&
        Objects.equals(optional, ioK8sApiCoreV1SecretKeySelector.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, optional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SecretKeySelector {\n");
    
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

