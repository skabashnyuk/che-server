package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1LocalObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.")

public class IoK8sApiCoreV1CephFSVolumeSource   {
  
  private @Valid List<String> monitors = new ArrayList<String>();
  private @Valid String path = null;
  private @Valid Boolean readOnly = null;
  private @Valid String secretFile = null;
  private @Valid IoK8sApiCoreV1LocalObjectReference secretRef = null;
  private @Valid String user = null;

  /**
   * Required: Monitors is a collection of Ceph monitors More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1CephFSVolumeSource monitors(List<String> monitors) {
    this.monitors = monitors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Required: Monitors is a collection of Ceph monitors More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it")
  @JsonProperty("monitors")
  @NotNull
  public List<String> getMonitors() {
    return monitors;
  }
  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }

  /**
   * Optional: Used as the mounted root, rather than the full Ceph tree, default is /
   **/
  public IoK8sApiCoreV1CephFSVolumeSource path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: Used as the mounted root, rather than the full Ceph tree, default is /")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1CephFSVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it")
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1CephFSVolumeSource secretFile(String secretFile) {
    this.secretFile = secretFile;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it")
  @JsonProperty("secretFile")
  public String getSecretFile() {
    return secretFile;
  }
  public void setSecretFile(String secretFile) {
    this.secretFile = secretFile;
  }

  /**
   * Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1CephFSVolumeSource secretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: SecretRef is reference to the authentication secret for User, default is empty. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it")
  @JsonProperty("secretRef")
  public IoK8sApiCoreV1LocalObjectReference getSecretRef() {
    return secretRef;
  }
  public void setSecretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  /**
   * Optional: User is the rados user name, default is admin More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1CephFSVolumeSource user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: User is the rados user name, default is admin More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it")
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1CephFSVolumeSource ioK8sApiCoreV1CephFSVolumeSource = (IoK8sApiCoreV1CephFSVolumeSource) o;
    return Objects.equals(monitors, ioK8sApiCoreV1CephFSVolumeSource.monitors) &&
        Objects.equals(path, ioK8sApiCoreV1CephFSVolumeSource.path) &&
        Objects.equals(readOnly, ioK8sApiCoreV1CephFSVolumeSource.readOnly) &&
        Objects.equals(secretFile, ioK8sApiCoreV1CephFSVolumeSource.secretFile) &&
        Objects.equals(secretRef, ioK8sApiCoreV1CephFSVolumeSource.secretRef) &&
        Objects.equals(user, ioK8sApiCoreV1CephFSVolumeSource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitors, path, readOnly, secretFile, secretRef, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1CephFSVolumeSource {\n");
    
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretFile: ").append(toIndentedString(secretFile)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

