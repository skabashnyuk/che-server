package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * OwnerReference contains enough information to let you identify an owning object. Currently, an owning object must be in the same namespace, so there is no namespace field.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "OwnerReference contains enough information to let you identify an owning object. Currently, an owning object must be in the same namespace, so there is no namespace field.")

public class IoK8sApimachineryPkgApisMetaV1OwnerReference   {
  
  private @Valid String apiVersion = null;
  private @Valid Boolean blockOwnerDeletion = null;
  private @Valid Boolean controller = null;
  private @Valid String kind = null;
  private @Valid String name = null;
  private @Valid String uid = null;

  /**
   * API version of the referent.
   **/
  public IoK8sApimachineryPkgApisMetaV1OwnerReference apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "API version of the referent.")
  @JsonProperty("apiVersion")
  @NotNull
  public String getApiVersion() {
    return apiVersion;
  }
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * If true, AND if the owner has the \&quot;foregroundDeletion\&quot; finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs \&quot;delete\&quot; permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.
   **/
  public IoK8sApimachineryPkgApisMetaV1OwnerReference blockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
    return this;
  }

  
  @ApiModelProperty(value = "If true, AND if the owner has the \"foregroundDeletion\" finalizer, then the owner cannot be deleted from the key-value store until this reference is removed. Defaults to false. To set this field, a user needs \"delete\" permission of the owner, otherwise 422 (Unprocessable Entity) will be returned.")
  @JsonProperty("blockOwnerDeletion")
  public Boolean isBlockOwnerDeletion() {
    return blockOwnerDeletion;
  }
  public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
    this.blockOwnerDeletion = blockOwnerDeletion;
  }

  /**
   * If true, this reference points to the managing controller.
   **/
  public IoK8sApimachineryPkgApisMetaV1OwnerReference controller(Boolean controller) {
    this.controller = controller;
    return this;
  }

  
  @ApiModelProperty(value = "If true, this reference points to the managing controller.")
  @JsonProperty("controller")
  public Boolean isController() {
    return controller;
  }
  public void setController(Boolean controller) {
    this.controller = controller;
  }

  /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   **/
  public IoK8sApimachineryPkgApisMetaV1OwnerReference kind(String kind) {
    this.kind = kind;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  @JsonProperty("kind")
  @NotNull
  public String getKind() {
    return kind;
  }
  public void setKind(String kind) {
    this.kind = kind;
  }

  /**
   * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
   **/
  public IoK8sApimachineryPkgApisMetaV1OwnerReference name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   **/
  public IoK8sApimachineryPkgApisMetaV1OwnerReference uid(String uid) {
    this.uid = uid;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids")
  @JsonProperty("uid")
  @NotNull
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1OwnerReference ioK8sApimachineryPkgApisMetaV1OwnerReference = (IoK8sApimachineryPkgApisMetaV1OwnerReference) o;
    return Objects.equals(apiVersion, ioK8sApimachineryPkgApisMetaV1OwnerReference.apiVersion) &&
        Objects.equals(blockOwnerDeletion, ioK8sApimachineryPkgApisMetaV1OwnerReference.blockOwnerDeletion) &&
        Objects.equals(controller, ioK8sApimachineryPkgApisMetaV1OwnerReference.controller) &&
        Objects.equals(kind, ioK8sApimachineryPkgApisMetaV1OwnerReference.kind) &&
        Objects.equals(name, ioK8sApimachineryPkgApisMetaV1OwnerReference.name) &&
        Objects.equals(uid, ioK8sApimachineryPkgApisMetaV1OwnerReference.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, blockOwnerDeletion, controller, kind, name, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1OwnerReference {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    blockOwnerDeletion: ").append(toIndentedString(blockOwnerDeletion)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

