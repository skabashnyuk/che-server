package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")

public class IoK8sApiCoreV1AzureFileVolumeSource   {
  
  private @Valid Boolean readOnly = null;
  private @Valid String secretName = null;
  private @Valid String shareName = null;

  /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   **/
  public IoK8sApiCoreV1AzureFileVolumeSource readOnly(Boolean readOnly) {
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
   * the name of secret that contains Azure Storage Account Name and Key
   **/
  public IoK8sApiCoreV1AzureFileVolumeSource secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "the name of secret that contains Azure Storage Account Name and Key")
  @JsonProperty("secretName")
  @NotNull
  public String getSecretName() {
    return secretName;
  }
  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }

  /**
   * Share Name
   **/
  public IoK8sApiCoreV1AzureFileVolumeSource shareName(String shareName) {
    this.shareName = shareName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Share Name")
  @JsonProperty("shareName")
  @NotNull
  public String getShareName() {
    return shareName;
  }
  public void setShareName(String shareName) {
    this.shareName = shareName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1AzureFileVolumeSource ioK8sApiCoreV1AzureFileVolumeSource = (IoK8sApiCoreV1AzureFileVolumeSource) o;
    return Objects.equals(readOnly, ioK8sApiCoreV1AzureFileVolumeSource.readOnly) &&
        Objects.equals(secretName, ioK8sApiCoreV1AzureFileVolumeSource.secretName) &&
        Objects.equals(shareName, ioK8sApiCoreV1AzureFileVolumeSource.shareName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readOnly, secretName, shareName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1AzureFileVolumeSource {\n");
    
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    shareName: ").append(toIndentedString(shareName)).append("\n");
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

