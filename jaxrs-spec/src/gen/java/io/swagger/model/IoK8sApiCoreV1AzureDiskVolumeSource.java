package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")

public class IoK8sApiCoreV1AzureDiskVolumeSource   {
  
  private @Valid String cachingMode = null;
  private @Valid String diskName = null;
  private @Valid String diskURI = null;
  private @Valid String fsType = null;
  private @Valid String kind = null;
  private @Valid Boolean readOnly = null;

  /**
   * Host Caching mode: None, Read Only, Read Write.
   **/
  public IoK8sApiCoreV1AzureDiskVolumeSource cachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
    return this;
  }

  
  @ApiModelProperty(value = "Host Caching mode: None, Read Only, Read Write.")
  @JsonProperty("cachingMode")
  public String getCachingMode() {
    return cachingMode;
  }
  public void setCachingMode(String cachingMode) {
    this.cachingMode = cachingMode;
  }

  /**
   * The Name of the data disk in the blob storage
   **/
  public IoK8sApiCoreV1AzureDiskVolumeSource diskName(String diskName) {
    this.diskName = diskName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Name of the data disk in the blob storage")
  @JsonProperty("diskName")
  @NotNull
  public String getDiskName() {
    return diskName;
  }
  public void setDiskName(String diskName) {
    this.diskName = diskName;
  }

  /**
   * The URI the data disk in the blob storage
   **/
  public IoK8sApiCoreV1AzureDiskVolumeSource diskURI(String diskURI) {
    this.diskURI = diskURI;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The URI the data disk in the blob storage")
  @JsonProperty("diskURI")
  @NotNull
  public String getDiskURI() {
    return diskURI;
  }
  public void setDiskURI(String diskURI) {
    this.diskURI = diskURI;
  }

  /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   **/
  public IoK8sApiCoreV1AzureDiskVolumeSource fsType(String fsType) {
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
   * Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared
   **/
  public IoK8sApiCoreV1AzureDiskVolumeSource kind(String kind) {
    this.kind = kind;
    return this;
  }

  
  @ApiModelProperty(value = "Expected values Shared: multiple blob disks per storage account  Dedicated: single blob disk per storage account  Managed: azure managed data disk (only in managed availability set). defaults to shared")
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }
  public void setKind(String kind) {
    this.kind = kind;
  }

  /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   **/
  public IoK8sApiCoreV1AzureDiskVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")
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
    IoK8sApiCoreV1AzureDiskVolumeSource ioK8sApiCoreV1AzureDiskVolumeSource = (IoK8sApiCoreV1AzureDiskVolumeSource) o;
    return Objects.equals(cachingMode, ioK8sApiCoreV1AzureDiskVolumeSource.cachingMode) &&
        Objects.equals(diskName, ioK8sApiCoreV1AzureDiskVolumeSource.diskName) &&
        Objects.equals(diskURI, ioK8sApiCoreV1AzureDiskVolumeSource.diskURI) &&
        Objects.equals(fsType, ioK8sApiCoreV1AzureDiskVolumeSource.fsType) &&
        Objects.equals(kind, ioK8sApiCoreV1AzureDiskVolumeSource.kind) &&
        Objects.equals(readOnly, ioK8sApiCoreV1AzureDiskVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachingMode, diskName, diskURI, fsType, kind, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1AzureDiskVolumeSource {\n");
    
    sb.append("    cachingMode: ").append(toIndentedString(cachingMode)).append("\n");
    sb.append("    diskName: ").append(toIndentedString(diskName)).append("\n");
    sb.append("    diskURI: ").append(toIndentedString(diskURI)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

