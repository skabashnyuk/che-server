package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a host path mapped into a pod. Host path volumes do not support ownership management or SELinux relabeling.")

public class IoK8sApiCoreV1HostPathVolumeSource   {
  
  private @Valid String path = null;
  private @Valid String type = null;

  /**
   * Path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   **/
  public IoK8sApiCoreV1HostPathVolumeSource path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Path of the directory on the host. If the path is a symlink, it will follow the link to the real path. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath")
  @JsonProperty("path")
  @NotNull
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * Type for HostPath Volume Defaults to \&quot;\&quot; More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   **/
  public IoK8sApiCoreV1HostPathVolumeSource type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Type for HostPath Volume Defaults to \"\" More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1HostPathVolumeSource ioK8sApiCoreV1HostPathVolumeSource = (IoK8sApiCoreV1HostPathVolumeSource) o;
    return Objects.equals(path, ioK8sApiCoreV1HostPathVolumeSource.path) &&
        Objects.equals(type, ioK8sApiCoreV1HostPathVolumeSource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1HostPathVolumeSource {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

