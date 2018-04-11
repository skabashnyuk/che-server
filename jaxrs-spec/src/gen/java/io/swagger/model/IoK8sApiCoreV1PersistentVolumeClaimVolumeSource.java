package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * PersistentVolumeClaimVolumeSource references the user&#39;s PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "PersistentVolumeClaimVolumeSource references the user's PVC in the same namespace. This volume finds the bound PV and mounts that volume for the pod. A PersistentVolumeClaimVolumeSource is, essentially, a wrapper around another type of volume that is owned by someone else (the system).")

public class IoK8sApiCoreV1PersistentVolumeClaimVolumeSource   {
  
  private @Valid String claimName = null;
  private @Valid Boolean readOnly = null;

  /**
   * ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   **/
  public IoK8sApiCoreV1PersistentVolumeClaimVolumeSource claimName(String claimName) {
    this.claimName = claimName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  @JsonProperty("claimName")
  @NotNull
  public String getClaimName() {
    return claimName;
  }
  public void setClaimName(String claimName) {
    this.claimName = claimName;
  }

  /**
   * Will force the ReadOnly setting in VolumeMounts. Default false.
   **/
  public IoK8sApiCoreV1PersistentVolumeClaimVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Will force the ReadOnly setting in VolumeMounts. Default false.")
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
    IoK8sApiCoreV1PersistentVolumeClaimVolumeSource ioK8sApiCoreV1PersistentVolumeClaimVolumeSource = (IoK8sApiCoreV1PersistentVolumeClaimVolumeSource) o;
    return Objects.equals(claimName, ioK8sApiCoreV1PersistentVolumeClaimVolumeSource.claimName) &&
        Objects.equals(readOnly, ioK8sApiCoreV1PersistentVolumeClaimVolumeSource.readOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimName, readOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PersistentVolumeClaimVolumeSource {\n");
    
    sb.append("    claimName: ").append(toIndentedString(claimName)).append("\n");
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

