package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a Persistent Disk resource in AWS.  An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a Persistent Disk resource in AWS.  An AWS EBS disk must exist before mounting to a container. The disk must also be in the same AWS zone as the kubelet. An AWS EBS disk can only be mounted as read/write once. AWS EBS volumes support ownership management and SELinux relabeling.")

public class IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource   {
  
  private @Valid String fsType = null;
  private @Valid Integer partition = null;
  private @Valid Boolean readOnly = null;
  private @Valid String volumeID = null;

  /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   **/
  public IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  
  @ApiModelProperty(value = "Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }
  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  /**
   * The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as \&quot;1\&quot;. Similarly, the volume partition for /dev/sda is \&quot;0\&quot; (or you can leave the property empty).
   **/
  public IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource partition(Integer partition) {
    this.partition = partition;
    return this;
  }

  
  @ApiModelProperty(value = "The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as \"1\". Similarly, the volume partition for /dev/sda is \"0\" (or you can leave the property empty).")
  @JsonProperty("partition")
  public Integer getPartition() {
    return partition;
  }
  public void setPartition(Integer partition) {
    this.partition = partition;
  }

  /**
   * Specify \&quot;true\&quot; to force and set the ReadOnly property in VolumeMounts to \&quot;true\&quot;. If omitted, the default is \&quot;false\&quot;. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   **/
  public IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Specify \"true\" to force and set the ReadOnly property in VolumeMounts to \"true\". If omitted, the default is \"false\". More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   **/
  public IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource volumeID(String volumeID) {
    this.volumeID = volumeID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique ID of the persistent disk resource in AWS (Amazon EBS volume). More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
  @JsonProperty("volumeID")
  @NotNull
  public String getVolumeID() {
    return volumeID;
  }
  public void setVolumeID(String volumeID) {
    this.volumeID = volumeID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource ioK8sApiCoreV1AWSElasticBlockStoreVolumeSource = (IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource) o;
    return Objects.equals(fsType, ioK8sApiCoreV1AWSElasticBlockStoreVolumeSource.fsType) &&
        Objects.equals(partition, ioK8sApiCoreV1AWSElasticBlockStoreVolumeSource.partition) &&
        Objects.equals(readOnly, ioK8sApiCoreV1AWSElasticBlockStoreVolumeSource.readOnly) &&
        Objects.equals(volumeID, ioK8sApiCoreV1AWSElasticBlockStoreVolumeSource.volumeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, partition, readOnly, volumeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    partition: ").append(toIndentedString(partition)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeID: ").append(toIndentedString(volumeID)).append("\n");
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

