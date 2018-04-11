package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents an NFS mount that lasts the lifetime of a pod. NFS volumes do not support ownership management or SELinux relabeling.")

public class IoK8sApiCoreV1NFSVolumeSource   {
  
  private @Valid String path = null;
  private @Valid Boolean readOnly = null;
  private @Valid String server = null;

  /**
   * Path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   **/
  public IoK8sApiCoreV1NFSVolumeSource path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Path that is exported by the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  @JsonProperty("path")
  @NotNull
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   **/
  public IoK8sApiCoreV1NFSVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  
  @ApiModelProperty(value = "ReadOnly here will force the NFS export to be mounted with read-only permissions. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * Server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   **/
  public IoK8sApiCoreV1NFSVolumeSource server(String server) {
    this.server = server;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Server is the hostname or IP address of the NFS server. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  @JsonProperty("server")
  @NotNull
  public String getServer() {
    return server;
  }
  public void setServer(String server) {
    this.server = server;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1NFSVolumeSource ioK8sApiCoreV1NFSVolumeSource = (IoK8sApiCoreV1NFSVolumeSource) o;
    return Objects.equals(path, ioK8sApiCoreV1NFSVolumeSource.path) &&
        Objects.equals(readOnly, ioK8sApiCoreV1NFSVolumeSource.readOnly) &&
        Objects.equals(server, ioK8sApiCoreV1NFSVolumeSource.server);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, readOnly, server);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NFSVolumeSource {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
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

