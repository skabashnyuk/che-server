package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1EnvVarSource;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * EnvVar represents an environment variable present in a Container.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "EnvVar represents an environment variable present in a Container.")

public class IoK8sApiCoreV1EnvVar   {
  
  private @Valid String name = null;
  private @Valid String value = null;
  private @Valid IoK8sApiCoreV1EnvVarSource valueFrom = null;

  /**
   * Name of the environment variable. Must be a C_IDENTIFIER.
   **/
  public IoK8sApiCoreV1EnvVar name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the environment variable. Must be a C_IDENTIFIER.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to \&quot;\&quot;.
   **/
  public IoK8sApiCoreV1EnvVar value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any service environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to \"\".")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Source for the environment variable&#39;s value. Cannot be used if value is not empty.
   **/
  public IoK8sApiCoreV1EnvVar valueFrom(IoK8sApiCoreV1EnvVarSource valueFrom) {
    this.valueFrom = valueFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Source for the environment variable's value. Cannot be used if value is not empty.")
  @JsonProperty("valueFrom")
  public IoK8sApiCoreV1EnvVarSource getValueFrom() {
    return valueFrom;
  }
  public void setValueFrom(IoK8sApiCoreV1EnvVarSource valueFrom) {
    this.valueFrom = valueFrom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1EnvVar ioK8sApiCoreV1EnvVar = (IoK8sApiCoreV1EnvVar) o;
    return Objects.equals(name, ioK8sApiCoreV1EnvVar.name) &&
        Objects.equals(value, ioK8sApiCoreV1EnvVar.value) &&
        Objects.equals(valueFrom, ioK8sApiCoreV1EnvVar.valueFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, valueFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EnvVar {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueFrom: ").append(toIndentedString(valueFrom)).append("\n");
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

