package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a vSphere volume resource.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a vSphere volume resource.")

public class IoK8sApiCoreV1VsphereVirtualDiskVolumeSource   {
  
  private @Valid String fsType = null;
  private @Valid String storagePolicyID = null;
  private @Valid String storagePolicyName = null;
  private @Valid String volumePath = null;

  /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   **/
  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource fsType(String fsType) {
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
   * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
   **/
  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource storagePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
    return this;
  }

  
  @ApiModelProperty(value = "Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.")
  @JsonProperty("storagePolicyID")
  public String getStoragePolicyID() {
    return storagePolicyID;
  }
  public void setStoragePolicyID(String storagePolicyID) {
    this.storagePolicyID = storagePolicyID;
  }

  /**
   * Storage Policy Based Management (SPBM) profile name.
   **/
  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource storagePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
    return this;
  }

  
  @ApiModelProperty(value = "Storage Policy Based Management (SPBM) profile name.")
  @JsonProperty("storagePolicyName")
  public String getStoragePolicyName() {
    return storagePolicyName;
  }
  public void setStoragePolicyName(String storagePolicyName) {
    this.storagePolicyName = storagePolicyName;
  }

  /**
   * Path that identifies vSphere volume vmdk
   **/
  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource volumePath(String volumePath) {
    this.volumePath = volumePath;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Path that identifies vSphere volume vmdk")
  @JsonProperty("volumePath")
  @NotNull
  public String getVolumePath() {
    return volumePath;
  }
  public void setVolumePath(String volumePath) {
    this.volumePath = volumePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1VsphereVirtualDiskVolumeSource ioK8sApiCoreV1VsphereVirtualDiskVolumeSource = (IoK8sApiCoreV1VsphereVirtualDiskVolumeSource) o;
    return Objects.equals(fsType, ioK8sApiCoreV1VsphereVirtualDiskVolumeSource.fsType) &&
        Objects.equals(storagePolicyID, ioK8sApiCoreV1VsphereVirtualDiskVolumeSource.storagePolicyID) &&
        Objects.equals(storagePolicyName, ioK8sApiCoreV1VsphereVirtualDiskVolumeSource.storagePolicyName) &&
        Objects.equals(volumePath, ioK8sApiCoreV1VsphereVirtualDiskVolumeSource.volumePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, storagePolicyID, storagePolicyName, volumePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VsphereVirtualDiskVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    storagePolicyID: ").append(toIndentedString(storagePolicyID)).append("\n");
    sb.append("    storagePolicyName: ").append(toIndentedString(storagePolicyName)).append("\n");
    sb.append("    volumePath: ").append(toIndentedString(volumePath)).append("\n");
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

