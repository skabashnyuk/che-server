package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a Photon Controller persistent disk resource.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a Photon Controller persistent disk resource.")

public class IoK8sApiCoreV1PhotonPersistentDiskVolumeSource   {
  
  private @Valid String fsType = null;
  private @Valid String pdID = null;

  /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   **/
  public IoK8sApiCoreV1PhotonPersistentDiskVolumeSource fsType(String fsType) {
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
   * ID that identifies Photon Controller persistent disk
   **/
  public IoK8sApiCoreV1PhotonPersistentDiskVolumeSource pdID(String pdID) {
    this.pdID = pdID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ID that identifies Photon Controller persistent disk")
  @JsonProperty("pdID")
  @NotNull
  public String getPdID() {
    return pdID;
  }
  public void setPdID(String pdID) {
    this.pdID = pdID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PhotonPersistentDiskVolumeSource ioK8sApiCoreV1PhotonPersistentDiskVolumeSource = (IoK8sApiCoreV1PhotonPersistentDiskVolumeSource) o;
    return Objects.equals(fsType, ioK8sApiCoreV1PhotonPersistentDiskVolumeSource.fsType) &&
        Objects.equals(pdID, ioK8sApiCoreV1PhotonPersistentDiskVolumeSource.pdID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, pdID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PhotonPersistentDiskVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    pdID: ").append(toIndentedString(pdID)).append("\n");
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

