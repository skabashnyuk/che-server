package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * SecretEnvSource selects a Secret to populate the environment variables with.  The contents of the target Secret&#39;s Data field will represent the key-value pairs as environment variables.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "SecretEnvSource selects a Secret to populate the environment variables with.  The contents of the target Secret's Data field will represent the key-value pairs as environment variables.")

public class IoK8sApiCoreV1SecretEnvSource   {
  
  private @Valid String name = null;
  private @Valid Boolean optional = null;

  /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   **/
  public IoK8sApiCoreV1SecretEnvSource name(String name) {
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
   * Specify whether the Secret must be defined
   **/
  public IoK8sApiCoreV1SecretEnvSource optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  
  @ApiModelProperty(value = "Specify whether the Secret must be defined")
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
    IoK8sApiCoreV1SecretEnvSource ioK8sApiCoreV1SecretEnvSource = (IoK8sApiCoreV1SecretEnvSource) o;
    return Objects.equals(name, ioK8sApiCoreV1SecretEnvSource.name) &&
        Objects.equals(optional, ioK8sApiCoreV1SecretEnvSource.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, optional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SecretEnvSource {\n");
    
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

