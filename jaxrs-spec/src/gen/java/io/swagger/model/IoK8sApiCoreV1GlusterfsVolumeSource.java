package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.")

public class IoK8sApiCoreV1GlusterfsVolumeSource   {
  
  private @Valid String endpoints = null;
  private @Valid String path = null;
  private @Valid Boolean readOnly = null;

  /**
   * EndpointsName is the endpoint name that details Glusterfs topology. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
   **/
  public IoK8sApiCoreV1GlusterfsVolumeSource endpoints(String endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "EndpointsName is the endpoint name that details Glusterfs topology. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod")
  @JsonProperty("endpoints")
  @NotNull
  public String getEndpoints() {
    return endpoints;
  }
  public void setEndpoints(String endpoints) {
    this.endpoints = endpoints;
  }

  /**
   * Path is the Glusterfs volume path. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
   **/
  public IoK8sApiCoreV1GlusterfsVolumeSource path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Path is the Glusterfs volume path. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod")
  @JsonProperty("path")
  @NotNull
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
   **/
  public IoK8sApiCoreV1GlusterfsVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  
  @ApiModelProperty(value = "ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod")
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1GlusterfsVolumeSource ioK8sApiCoreV1GlusterfsVolumeSource = (IoK8sApiCoreV1GlusterfsVolumeSource) o;
    return Objects.equals(endpoints, ioK8sApiCoreV1GlusterfsVolumeSource.endpoints) &&
        Objects.equals(path, ioK8sApiCoreV1GlusterfsVolumeSource.path) &&
        Objects.equals(readOnly, ioK8sApiCoreV1GlusterfsVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, path, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1GlusterfsVolumeSource {\n");
    
    sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

