package io.swagger.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.")

public class IoK8sApiCoreV1FCVolumeSource   {
  
  private @Valid String fsType = null;
  private @Valid Integer lun = null;
  private @Valid Boolean readOnly = null;
  private @Valid List<String> targetWWNs = new ArrayList<String>();
  private @Valid List<String> wwids = new ArrayList<String>();

  /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   **/
  public IoK8sApiCoreV1FCVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }
  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  /**
   * Optional: FC target lun number
   **/
  public IoK8sApiCoreV1FCVolumeSource lun(Integer lun) {
    this.lun = lun;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: FC target lun number")
  @JsonProperty("lun")
  public Integer getLun() {
    return lun;
  }
  public void setLun(Integer lun) {
    this.lun = lun;
  }

  /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   **/
  public IoK8sApiCoreV1FCVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * Optional: FC target worldwide names (WWNs)
   **/
  public IoK8sApiCoreV1FCVolumeSource targetWWNs(List<String> targetWWNs) {
    this.targetWWNs = targetWWNs;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: FC target worldwide names (WWNs)")
  @JsonProperty("targetWWNs")
  public List<String> getTargetWWNs() {
    return targetWWNs;
  }
  public void setTargetWWNs(List<String> targetWWNs) {
    this.targetWWNs = targetWWNs;
  }

  /**
   * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
   **/
  public IoK8sApiCoreV1FCVolumeSource wwids(List<String> wwids) {
    this.wwids = wwids;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.")
  @JsonProperty("wwids")
  public List<String> getWwids() {
    return wwids;
  }
  public void setWwids(List<String> wwids) {
    this.wwids = wwids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1FCVolumeSource ioK8sApiCoreV1FCVolumeSource = (IoK8sApiCoreV1FCVolumeSource) o;
    return Objects.equals(fsType, ioK8sApiCoreV1FCVolumeSource.fsType) &&
        Objects.equals(lun, ioK8sApiCoreV1FCVolumeSource.lun) &&
        Objects.equals(readOnly, ioK8sApiCoreV1FCVolumeSource.readOnly) &&
        Objects.equals(targetWWNs, ioK8sApiCoreV1FCVolumeSource.targetWWNs) &&
        Objects.equals(wwids, ioK8sApiCoreV1FCVolumeSource.wwids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, lun, readOnly, targetWWNs, wwids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1FCVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    targetWWNs: ").append(toIndentedString(targetWWNs)).append("\n");
    sb.append("    wwids: ").append(toIndentedString(wwids)).append("\n");
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

