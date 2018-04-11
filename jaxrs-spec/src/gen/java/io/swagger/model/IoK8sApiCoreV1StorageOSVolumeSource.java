package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1LocalObjectReference;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a StorageOS persistent volume resource.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a StorageOS persistent volume resource.")

public class IoK8sApiCoreV1StorageOSVolumeSource   {
  
  private @Valid String fsType = null;
  private @Valid Boolean readOnly = null;
  private @Valid IoK8sApiCoreV1LocalObjectReference secretRef = null;
  private @Valid String volumeName = null;
  private @Valid String volumeNamespace = null;

  /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   **/
  public IoK8sApiCoreV1StorageOSVolumeSource fsType(String fsType) {
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
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   **/
  public IoK8sApiCoreV1StorageOSVolumeSource readOnly(Boolean readOnly) {
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

  /**
   * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
   **/
  public IoK8sApiCoreV1StorageOSVolumeSource secretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  
  @ApiModelProperty(value = "SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.")
  @JsonProperty("secretRef")
  public IoK8sApiCoreV1LocalObjectReference getSecretRef() {
    return secretRef;
  }
  public void setSecretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  /**
   * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
   **/
  public IoK8sApiCoreV1StorageOSVolumeSource volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  
  @ApiModelProperty(value = "VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.")
  @JsonProperty("volumeName")
  public String getVolumeName() {
    return volumeName;
  }
  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }

  /**
   * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \&quot;default\&quot; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
   **/
  public IoK8sApiCoreV1StorageOSVolumeSource volumeNamespace(String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
    return this;
  }

  
  @ApiModelProperty(value = "VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to \"default\" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.")
  @JsonProperty("volumeNamespace")
  public String getVolumeNamespace() {
    return volumeNamespace;
  }
  public void setVolumeNamespace(String volumeNamespace) {
    this.volumeNamespace = volumeNamespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1StorageOSVolumeSource ioK8sApiCoreV1StorageOSVolumeSource = (IoK8sApiCoreV1StorageOSVolumeSource) o;
    return Objects.equals(fsType, ioK8sApiCoreV1StorageOSVolumeSource.fsType) &&
        Objects.equals(readOnly, ioK8sApiCoreV1StorageOSVolumeSource.readOnly) &&
        Objects.equals(secretRef, ioK8sApiCoreV1StorageOSVolumeSource.secretRef) &&
        Objects.equals(volumeName, ioK8sApiCoreV1StorageOSVolumeSource.volumeName) &&
        Objects.equals(volumeNamespace, ioK8sApiCoreV1StorageOSVolumeSource.volumeNamespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, readOnly, secretRef, volumeName, volumeNamespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1StorageOSVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
    sb.append("    volumeNamespace: ").append(toIndentedString(volumeNamespace)).append("\n");
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

