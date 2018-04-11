package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ConfigMapEnvSource;
import io.swagger.model.IoK8sApiCoreV1SecretEnvSource;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * EnvFromSource represents the source of a set of ConfigMaps
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "EnvFromSource represents the source of a set of ConfigMaps")

public class IoK8sApiCoreV1EnvFromSource   {
  
  private @Valid IoK8sApiCoreV1ConfigMapEnvSource configMapRef = null;
  private @Valid String prefix = null;
  private @Valid IoK8sApiCoreV1SecretEnvSource secretRef = null;

  /**
   * The ConfigMap to select from
   **/
  public IoK8sApiCoreV1EnvFromSource configMapRef(IoK8sApiCoreV1ConfigMapEnvSource configMapRef) {
    this.configMapRef = configMapRef;
    return this;
  }

  
  @ApiModelProperty(value = "The ConfigMap to select from")
  @JsonProperty("configMapRef")
  public IoK8sApiCoreV1ConfigMapEnvSource getConfigMapRef() {
    return configMapRef;
  }
  public void setConfigMapRef(IoK8sApiCoreV1ConfigMapEnvSource configMapRef) {
    this.configMapRef = configMapRef;
  }

  /**
   * An optional identifer to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
   **/
  public IoK8sApiCoreV1EnvFromSource prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  
  @ApiModelProperty(value = "An optional identifer to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.")
  @JsonProperty("prefix")
  public String getPrefix() {
    return prefix;
  }
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  /**
   * The Secret to select from
   **/
  public IoK8sApiCoreV1EnvFromSource secretRef(IoK8sApiCoreV1SecretEnvSource secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  
  @ApiModelProperty(value = "The Secret to select from")
  @JsonProperty("secretRef")
  public IoK8sApiCoreV1SecretEnvSource getSecretRef() {
    return secretRef;
  }
  public void setSecretRef(IoK8sApiCoreV1SecretEnvSource secretRef) {
    this.secretRef = secretRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1EnvFromSource ioK8sApiCoreV1EnvFromSource = (IoK8sApiCoreV1EnvFromSource) o;
    return Objects.equals(configMapRef, ioK8sApiCoreV1EnvFromSource.configMapRef) &&
        Objects.equals(prefix, ioK8sApiCoreV1EnvFromSource.prefix) &&
        Objects.equals(secretRef, ioK8sApiCoreV1EnvFromSource.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapRef, prefix, secretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EnvFromSource {\n");
    
    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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

