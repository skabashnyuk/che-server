package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1LocalObjectReference;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ScaleIOVolumeSource represents a persistent ScaleIO volume
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ScaleIOVolumeSource represents a persistent ScaleIO volume")

public class IoK8sApiCoreV1ScaleIOVolumeSource   {
  
  private @Valid String fsType = null;
  private @Valid String gateway = null;
  private @Valid String protectionDomain = null;
  private @Valid Boolean readOnly = null;
  private @Valid IoK8sApiCoreV1LocalObjectReference secretRef = null;
  private @Valid Boolean sslEnabled = null;
  private @Valid String storageMode = null;
  private @Valid String storagePool = null;
  private @Valid String system = null;
  private @Valid String volumeName = null;

  /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   **/
  public IoK8sApiCoreV1ScaleIOVolumeSource fsType(String fsType) {
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
   * The host address of the ScaleIO API Gateway.
   **/
  public IoK8sApiCoreV1ScaleIOVolumeSource gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The host address of the ScaleIO API Gateway.")
  @JsonProperty("gateway")
  @NotNull
  public String getGateway() {
    return gateway;
  }
  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  /**
   * The name of the ScaleIO Protection Domain for the configured storage.
   **/
  public IoK8sApiCoreV1ScaleIOVolumeSource protectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the ScaleIO Protection Domain for the configured storage.")
  @JsonProperty("protectionDomain")
  public String getProtectionDomain() {
    return protectionDomain;
  }
  public void setProtectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
  }

  /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   **/
  public IoK8sApiCoreV1ScaleIOVolumeSource readOnly(Boolean readOnly) {
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
   * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
   **/
  public IoK8sApiCoreV1ScaleIOVolumeSource secretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.")
  @JsonProperty("secretRef")
  @NotNull
  public IoK8sApiCoreV1LocalObjectReference getSecretRef() {
    return secretRef;
  }
  public void setSecretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  /**
   * Flag to enable/disable SSL communication with Gateway, default false
   **/
  public IoK8sApiCoreV1ScaleIOVolumeSource sslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Flag to enable/disable SSL communication with Gateway, default false")
  @JsonProperty("sslEnabled")
  public Boolean isSslEnabled() {
    return sslEnabled;
  }
  public void setSslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }

  /**
   * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.
   **/
  public IoK8sApiCoreV1ScaleIOVolumeSource storageMode(String storageMode) {
    this.storageMode = storageMode;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned.")
  @JsonProperty("storageMode")
  public String getStorageMode() {
    return storageMode;
  }
  public void setStorageMode(String storageMode) {
    this.storageMode = storageMode;
  }

  /**
   * The ScaleIO Storage Pool associated with the protection domain.
   **/
  public IoK8sApiCoreV1ScaleIOVolumeSource storagePool(String storagePool) {
    this.storagePool = storagePool;
    return this;
  }

  
  @ApiModelProperty(value = "The ScaleIO Storage Pool associated with the protection domain.")
  @JsonProperty("storagePool")
  public String getStoragePool() {
    return storagePool;
  }
  public void setStoragePool(String storagePool) {
    this.storagePool = storagePool;
  }

  /**
   * The name of the storage system as configured in ScaleIO.
   **/
  public IoK8sApiCoreV1ScaleIOVolumeSource system(String system) {
    this.system = system;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the storage system as configured in ScaleIO.")
  @JsonProperty("system")
  @NotNull
  public String getSystem() {
    return system;
  }
  public void setSystem(String system) {
    this.system = system;
  }

  /**
   * The name of a volume already created in the ScaleIO system that is associated with this volume source.
   **/
  public IoK8sApiCoreV1ScaleIOVolumeSource volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  
  @ApiModelProperty(value = "The name of a volume already created in the ScaleIO system that is associated with this volume source.")
  @JsonProperty("volumeName")
  public String getVolumeName() {
    return volumeName;
  }
  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ScaleIOVolumeSource ioK8sApiCoreV1ScaleIOVolumeSource = (IoK8sApiCoreV1ScaleIOVolumeSource) o;
    return Objects.equals(fsType, ioK8sApiCoreV1ScaleIOVolumeSource.fsType) &&
        Objects.equals(gateway, ioK8sApiCoreV1ScaleIOVolumeSource.gateway) &&
        Objects.equals(protectionDomain, ioK8sApiCoreV1ScaleIOVolumeSource.protectionDomain) &&
        Objects.equals(readOnly, ioK8sApiCoreV1ScaleIOVolumeSource.readOnly) &&
        Objects.equals(secretRef, ioK8sApiCoreV1ScaleIOVolumeSource.secretRef) &&
        Objects.equals(sslEnabled, ioK8sApiCoreV1ScaleIOVolumeSource.sslEnabled) &&
        Objects.equals(storageMode, ioK8sApiCoreV1ScaleIOVolumeSource.storageMode) &&
        Objects.equals(storagePool, ioK8sApiCoreV1ScaleIOVolumeSource.storagePool) &&
        Objects.equals(system, ioK8sApiCoreV1ScaleIOVolumeSource.system) &&
        Objects.equals(volumeName, ioK8sApiCoreV1ScaleIOVolumeSource.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, gateway, protectionDomain, readOnly, secretRef, sslEnabled, storageMode, storagePool, system, volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ScaleIOVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    protectionDomain: ").append(toIndentedString(protectionDomain)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
    sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
    sb.append("    storagePool: ").append(toIndentedString(storagePool)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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

