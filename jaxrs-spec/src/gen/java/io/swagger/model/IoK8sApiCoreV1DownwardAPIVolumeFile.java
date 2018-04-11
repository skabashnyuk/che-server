package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ObjectFieldSelector;
import io.swagger.model.IoK8sApiCoreV1ResourceFieldSelector;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * DownwardAPIVolumeFile represents information to create the file containing the pod field
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "DownwardAPIVolumeFile represents information to create the file containing the pod field")

public class IoK8sApiCoreV1DownwardAPIVolumeFile   {
  
  private @Valid IoK8sApiCoreV1ObjectFieldSelector fieldRef = null;
  private @Valid Integer mode = null;
  private @Valid String path = null;
  private @Valid IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef = null;

  /**
   * Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.
   **/
  public IoK8sApiCoreV1DownwardAPIVolumeFile fieldRef(IoK8sApiCoreV1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
    return this;
  }

  
  @ApiModelProperty(value = "Required: Selects a field of the pod: only annotations, labels, name and namespace are supported.")
  @JsonProperty("fieldRef")
  public IoK8sApiCoreV1ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }
  public void setFieldRef(IoK8sApiCoreV1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }

  /**
   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   **/
  public IoK8sApiCoreV1DownwardAPIVolumeFile mode(Integer mode) {
    this.mode = mode;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  @JsonProperty("mode")
  public Integer getMode() {
    return mode;
  }
  public void setMode(Integer mode) {
    this.mode = mode;
  }

  /**
   * Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the &#39;..&#39; path. Must be utf-8 encoded. The first item of the relative path must not start with &#39;..&#39;
   **/
  public IoK8sApiCoreV1DownwardAPIVolumeFile path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Required: Path is  the relative path name of the file to be created. Must not be absolute or contain the '..' path. Must be utf-8 encoded. The first item of the relative path must not start with '..'")
  @JsonProperty("path")
  @NotNull
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
   **/
  public IoK8sApiCoreV1DownwardAPIVolumeFile resourceFieldRef(IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

  
  @ApiModelProperty(value = "Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.")
  @JsonProperty("resourceFieldRef")
  public IoK8sApiCoreV1ResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }
  public void setResourceFieldRef(IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1DownwardAPIVolumeFile ioK8sApiCoreV1DownwardAPIVolumeFile = (IoK8sApiCoreV1DownwardAPIVolumeFile) o;
    return Objects.equals(fieldRef, ioK8sApiCoreV1DownwardAPIVolumeFile.fieldRef) &&
        Objects.equals(mode, ioK8sApiCoreV1DownwardAPIVolumeFile.mode) &&
        Objects.equals(path, ioK8sApiCoreV1DownwardAPIVolumeFile.path) &&
        Objects.equals(resourceFieldRef, ioK8sApiCoreV1DownwardAPIVolumeFile.resourceFieldRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, mode, path, resourceFieldRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1DownwardAPIVolumeFile {\n");
    
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
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

