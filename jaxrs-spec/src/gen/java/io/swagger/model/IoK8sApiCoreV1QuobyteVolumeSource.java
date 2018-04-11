package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.")

public class IoK8sApiCoreV1QuobyteVolumeSource   {
  
  private @Valid String group = null;
  private @Valid Boolean readOnly = null;
  private @Valid String registry = null;
  private @Valid String user = null;
  private @Valid String volume = null;

  /**
   * Group to map volume access to Default is no group
   **/
  public IoK8sApiCoreV1QuobyteVolumeSource group(String group) {
    this.group = group;
    return this;
  }

  
  @ApiModelProperty(value = "Group to map volume access to Default is no group")
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
  }

  /**
   * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
   **/
  public IoK8sApiCoreV1QuobyteVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  
  @ApiModelProperty(value = "ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.")
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
   **/
  public IoK8sApiCoreV1QuobyteVolumeSource registry(String registry) {
    this.registry = registry;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes")
  @JsonProperty("registry")
  @NotNull
  public String getRegistry() {
    return registry;
  }
  public void setRegistry(String registry) {
    this.registry = registry;
  }

  /**
   * User to map volume access to Defaults to serivceaccount user
   **/
  public IoK8sApiCoreV1QuobyteVolumeSource user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "User to map volume access to Defaults to serivceaccount user")
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Volume is a string that references an already created Quobyte volume by name.
   **/
  public IoK8sApiCoreV1QuobyteVolumeSource volume(String volume) {
    this.volume = volume;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Volume is a string that references an already created Quobyte volume by name.")
  @JsonProperty("volume")
  @NotNull
  public String getVolume() {
    return volume;
  }
  public void setVolume(String volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1QuobyteVolumeSource ioK8sApiCoreV1QuobyteVolumeSource = (IoK8sApiCoreV1QuobyteVolumeSource) o;
    return Objects.equals(group, ioK8sApiCoreV1QuobyteVolumeSource.group) &&
        Objects.equals(readOnly, ioK8sApiCoreV1QuobyteVolumeSource.readOnly) &&
        Objects.equals(registry, ioK8sApiCoreV1QuobyteVolumeSource.registry) &&
        Objects.equals(user, ioK8sApiCoreV1QuobyteVolumeSource.user) &&
        Objects.equals(volume, ioK8sApiCoreV1QuobyteVolumeSource.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, readOnly, registry, user, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1QuobyteVolumeSource {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

