package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * volumeDevice describes a mapping of a raw block device within a container.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "volumeDevice describes a mapping of a raw block device within a container.")

public class IoK8sApiCoreV1VolumeDevice   {
  
  private @Valid String devicePath = null;
  private @Valid String name = null;

  /**
   * devicePath is the path inside of the container that the device will be mapped to.
   **/
  public IoK8sApiCoreV1VolumeDevice devicePath(String devicePath) {
    this.devicePath = devicePath;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "devicePath is the path inside of the container that the device will be mapped to.")
  @JsonProperty("devicePath")
  @NotNull
  public String getDevicePath() {
    return devicePath;
  }
  public void setDevicePath(String devicePath) {
    this.devicePath = devicePath;
  }

  /**
   * name must match the name of a persistentVolumeClaim in the pod
   **/
  public IoK8sApiCoreV1VolumeDevice name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "name must match the name of a persistentVolumeClaim in the pod")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1VolumeDevice ioK8sApiCoreV1VolumeDevice = (IoK8sApiCoreV1VolumeDevice) o;
    return Objects.equals(devicePath, ioK8sApiCoreV1VolumeDevice.devicePath) &&
        Objects.equals(name, ioK8sApiCoreV1VolumeDevice.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devicePath, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VolumeDevice {\n");
    
    sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

