package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ConfigMapKeySelector;
import io.swagger.model.IoK8sApiCoreV1ObjectFieldSelector;
import io.swagger.model.IoK8sApiCoreV1ResourceFieldSelector;
import io.swagger.model.IoK8sApiCoreV1SecretKeySelector;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * EnvVarSource represents a source for the value of an EnvVar.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "EnvVarSource represents a source for the value of an EnvVar.")

public class IoK8sApiCoreV1EnvVarSource   {
  
  private @Valid IoK8sApiCoreV1ConfigMapKeySelector configMapKeyRef = null;
  private @Valid IoK8sApiCoreV1ObjectFieldSelector fieldRef = null;
  private @Valid IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef = null;
  private @Valid IoK8sApiCoreV1SecretKeySelector secretKeyRef = null;

  /**
   * Selects a key of a ConfigMap.
   **/
  public IoK8sApiCoreV1EnvVarSource configMapKeyRef(IoK8sApiCoreV1ConfigMapKeySelector configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

  
  @ApiModelProperty(value = "Selects a key of a ConfigMap.")
  @JsonProperty("configMapKeyRef")
  public IoK8sApiCoreV1ConfigMapKeySelector getConfigMapKeyRef() {
    return configMapKeyRef;
  }
  public void setConfigMapKeyRef(IoK8sApiCoreV1ConfigMapKeySelector configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }

  /**
   * Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.
   **/
  public IoK8sApiCoreV1EnvVarSource fieldRef(IoK8sApiCoreV1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

  
  @ApiModelProperty(value = "Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels, metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.")
  @JsonProperty("fieldRef")
  public IoK8sApiCoreV1ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }
  public void setFieldRef(IoK8sApiCoreV1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }

  /**
   * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
   **/
  public IoK8sApiCoreV1EnvVarSource resourceFieldRef(IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

  
  @ApiModelProperty(value = "Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.")
  @JsonProperty("resourceFieldRef")
  public IoK8sApiCoreV1ResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }
  public void setResourceFieldRef(IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }

  /**
   * Selects a key of a secret in the pod&#39;s namespace
   **/
  public IoK8sApiCoreV1EnvVarSource secretKeyRef(IoK8sApiCoreV1SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
    return this;
  }

  
  @ApiModelProperty(value = "Selects a key of a secret in the pod's namespace")
  @JsonProperty("secretKeyRef")
  public IoK8sApiCoreV1SecretKeySelector getSecretKeyRef() {
    return secretKeyRef;
  }
  public void setSecretKeyRef(IoK8sApiCoreV1SecretKeySelector secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1EnvVarSource ioK8sApiCoreV1EnvVarSource = (IoK8sApiCoreV1EnvVarSource) o;
    return Objects.equals(configMapKeyRef, ioK8sApiCoreV1EnvVarSource.configMapKeyRef) &&
        Objects.equals(fieldRef, ioK8sApiCoreV1EnvVarSource.fieldRef) &&
        Objects.equals(resourceFieldRef, ioK8sApiCoreV1EnvVarSource.resourceFieldRef) &&
        Objects.equals(secretKeyRef, ioK8sApiCoreV1EnvVarSource.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1EnvVarSource {\n");
    
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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

