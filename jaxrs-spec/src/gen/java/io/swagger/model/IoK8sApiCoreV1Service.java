package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ServiceSpec;
import io.swagger.model.IoK8sApiCoreV1ServiceStatus;
import io.swagger.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Service is a named abstraction of software service (for example, mysql) consisting of local port (for example 3306) that the proxy listens on, and the selector that determines which pods will answer requests sent through the proxy.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Service is a named abstraction of software service (for example, mysql) consisting of local port (for example 3306) that the proxy listens on, and the selector that determines which pods will answer requests sent through the proxy.")

public class IoK8sApiCoreV1Service   {
  
  private @Valid String apiVersion = null;
  private @Valid String kind = null;
  private @Valid IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;
  private @Valid IoK8sApiCoreV1ServiceSpec spec = null;
  private @Valid IoK8sApiCoreV1ServiceStatus status = null;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   **/
  public IoK8sApiCoreV1Service apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   **/
  public IoK8sApiCoreV1Service kind(String kind) {
    this.kind = kind;
    return this;
  }

  
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }
  public void setKind(String kind) {
    this.kind = kind;
  }

  /**
   * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   **/
  public IoK8sApiCoreV1Service metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }
  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  /**
   * Spec defines the behavior of a service. https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   **/
  public IoK8sApiCoreV1Service spec(IoK8sApiCoreV1ServiceSpec spec) {
    this.spec = spec;
    return this;
  }

  
  @ApiModelProperty(value = "Spec defines the behavior of a service. https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  @JsonProperty("spec")
  public IoK8sApiCoreV1ServiceSpec getSpec() {
    return spec;
  }
  public void setSpec(IoK8sApiCoreV1ServiceSpec spec) {
    this.spec = spec;
  }

  /**
   * Most recently observed status of the service. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   **/
  public IoK8sApiCoreV1Service status(IoK8sApiCoreV1ServiceStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Most recently observed status of the service. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  @JsonProperty("status")
  public IoK8sApiCoreV1ServiceStatus getStatus() {
    return status;
  }
  public void setStatus(IoK8sApiCoreV1ServiceStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Service ioK8sApiCoreV1Service = (IoK8sApiCoreV1Service) o;
    return Objects.equals(apiVersion, ioK8sApiCoreV1Service.apiVersion) &&
        Objects.equals(kind, ioK8sApiCoreV1Service.kind) &&
        Objects.equals(metadata, ioK8sApiCoreV1Service.metadata) &&
        Objects.equals(spec, ioK8sApiCoreV1Service.spec) &&
        Objects.equals(status, ioK8sApiCoreV1Service.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Service {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

