package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * VolumeMount describes a mounting of a Volume within a container.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "VolumeMount describes a mounting of a Volume within a container.")

public class IoK8sApiCoreV1VolumeMount   {
  
  private @Valid String mountPath = null;
  private @Valid String mountPropagation = null;
  private @Valid String name = null;
  private @Valid Boolean readOnly = null;
  private @Valid String subPath = null;

  /**
   * Path within the container at which the volume should be mounted.  Must not contain &#39;:&#39;.
   **/
  public IoK8sApiCoreV1VolumeMount mountPath(String mountPath) {
    this.mountPath = mountPath;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Path within the container at which the volume should be mounted.  Must not contain ':'.")
  @JsonProperty("mountPath")
  @NotNull
  public String getMountPath() {
    return mountPath;
  }
  public void setMountPath(String mountPath) {
    this.mountPath = mountPath;
  }

  /**
   * mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationHostToContainer is used. This field is alpha in 1.8 and can be reworked or removed in a future release.
   **/
  public IoK8sApiCoreV1VolumeMount mountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
    return this;
  }

  
  @ApiModelProperty(value = "mountPropagation determines how mounts are propagated from the host to container and the other way around. When not set, MountPropagationHostToContainer is used. This field is alpha in 1.8 and can be reworked or removed in a future release.")
  @JsonProperty("mountPropagation")
  public String getMountPropagation() {
    return mountPropagation;
  }
  public void setMountPropagation(String mountPropagation) {
    this.mountPropagation = mountPropagation;
  }

  /**
   * This must match the Name of a Volume.
   **/
  public IoK8sApiCoreV1VolumeMount name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "This must match the Name of a Volume.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.
   **/
  public IoK8sApiCoreV1VolumeMount readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Mounted read-only if true, read-write otherwise (false or unspecified). Defaults to false.")
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * Path within the volume from which the container&#39;s volume should be mounted. Defaults to \&quot;\&quot; (volume&#39;s root).
   **/
  public IoK8sApiCoreV1VolumeMount subPath(String subPath) {
    this.subPath = subPath;
    return this;
  }

  
  @ApiModelProperty(value = "Path within the volume from which the container's volume should be mounted. Defaults to \"\" (volume's root).")
  @JsonProperty("subPath")
  public String getSubPath() {
    return subPath;
  }
  public void setSubPath(String subPath) {
    this.subPath = subPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1VolumeMount ioK8sApiCoreV1VolumeMount = (IoK8sApiCoreV1VolumeMount) o;
    return Objects.equals(mountPath, ioK8sApiCoreV1VolumeMount.mountPath) &&
        Objects.equals(mountPropagation, ioK8sApiCoreV1VolumeMount.mountPropagation) &&
        Objects.equals(name, ioK8sApiCoreV1VolumeMount.name) &&
        Objects.equals(readOnly, ioK8sApiCoreV1VolumeMount.readOnly) &&
        Objects.equals(subPath, ioK8sApiCoreV1VolumeMount.subPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mountPath, mountPropagation, name, readOnly, subPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VolumeMount {\n");
    
    sb.append("    mountPath: ").append(toIndentedString(mountPath)).append("\n");
    sb.append("    mountPropagation: ").append(toIndentedString(mountPropagation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    subPath: ").append(toIndentedString(subPath)).append("\n");
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

