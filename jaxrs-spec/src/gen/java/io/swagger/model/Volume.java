package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.PersistentVolumeClaimVolumeSource;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Volume represents a named volume in a pod that may be accessed by any container in the pod.")

public class Volume   {
  
  private @Valid String name = null;
  private @Valid PersistentVolumeClaimVolumeSource persistentVolumeClaim = null;

  /**
   * Volume&#39;s name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   **/
  public Volume name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.
   **/
  public Volume persistentVolumeClaim(PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

  
  @ApiModelProperty(value = "PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace.")
  @JsonProperty("persistentVolumeClaim")
  public PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }
  public void setPersistentVolumeClaim(PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Volume volume = (Volume) o;
    return Objects.equals(name, volume.name) &&
        Objects.equals(persistentVolumeClaim, volume.persistentVolumeClaim);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, persistentVolumeClaim);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Volume {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    persistentVolumeClaim: ").append(toIndentedString(persistentVolumeClaim)).append("\n");
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

