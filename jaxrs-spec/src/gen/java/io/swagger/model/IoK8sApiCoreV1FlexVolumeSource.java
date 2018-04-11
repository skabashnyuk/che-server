package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1LocalObjectReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")

public class IoK8sApiCoreV1FlexVolumeSource   {
  
  private @Valid String driver = null;
  private @Valid String fsType = null;
  private @Valid Map<String, String> options = new HashMap<String, String>();
  private @Valid Boolean readOnly = null;
  private @Valid IoK8sApiCoreV1LocalObjectReference secretRef = null;

  /**
   * Driver is the name of the driver to use for this volume.
   **/
  public IoK8sApiCoreV1FlexVolumeSource driver(String driver) {
    this.driver = driver;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Driver is the name of the driver to use for this volume.")
  @JsonProperty("driver")
  @NotNull
  public String getDriver() {
    return driver;
  }
  public void setDriver(String driver) {
    this.driver = driver;
  }

  /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. The default filesystem depends on FlexVolume script.
   **/
  public IoK8sApiCoreV1FlexVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". The default filesystem depends on FlexVolume script.")
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }
  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  /**
   * Optional: Extra command options if any.
   **/
  public IoK8sApiCoreV1FlexVolumeSource options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: Extra command options if any.")
  @JsonProperty("options")
  public Map<String, String> getOptions() {
    return options;
  }
  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   **/
  public IoK8sApiCoreV1FlexVolumeSource readOnly(Boolean readOnly) {
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
   * Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.
   **/
  public IoK8sApiCoreV1FlexVolumeSource secretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: SecretRef is reference to the secret object containing sensitive information to pass to the plugin scripts. This may be empty if no secret object is specified. If the secret object contains more than one secret, all secrets are passed to the plugin scripts.")
  @JsonProperty("secretRef")
  public IoK8sApiCoreV1LocalObjectReference getSecretRef() {
    return secretRef;
  }
  public void setSecretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1FlexVolumeSource ioK8sApiCoreV1FlexVolumeSource = (IoK8sApiCoreV1FlexVolumeSource) o;
    return Objects.equals(driver, ioK8sApiCoreV1FlexVolumeSource.driver) &&
        Objects.equals(fsType, ioK8sApiCoreV1FlexVolumeSource.fsType) &&
        Objects.equals(options, ioK8sApiCoreV1FlexVolumeSource.options) &&
        Objects.equals(readOnly, ioK8sApiCoreV1FlexVolumeSource.readOnly) &&
        Objects.equals(secretRef, ioK8sApiCoreV1FlexVolumeSource.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, fsType, options, readOnly, secretRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1FlexVolumeSource {\n");
    
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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

