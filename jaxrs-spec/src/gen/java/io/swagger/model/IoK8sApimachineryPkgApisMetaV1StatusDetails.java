package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApimachineryPkgApisMetaV1StatusCause;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "StatusDetails is a set of additional properties that MAY be set by the server to provide additional information about a response. The Reason field of a Status object defines what attributes will be set. Clients must ignore fields that do not match the defined type of each attribute, and should assume that any attribute may be empty, invalid, or under defined.")

public class IoK8sApimachineryPkgApisMetaV1StatusDetails   {
  
  private @Valid List<IoK8sApimachineryPkgApisMetaV1StatusCause> causes = new ArrayList<IoK8sApimachineryPkgApisMetaV1StatusCause>();
  private @Valid String group = null;
  private @Valid String kind = null;
  private @Valid String name = null;
  private @Valid Integer retryAfterSeconds = null;
  private @Valid String uid = null;

  /**
   * The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.
   **/
  public IoK8sApimachineryPkgApisMetaV1StatusDetails causes(List<IoK8sApimachineryPkgApisMetaV1StatusCause> causes) {
    this.causes = causes;
    return this;
  }

  
  @ApiModelProperty(value = "The Causes array includes more details associated with the StatusReason failure. Not all StatusReasons may provide detailed causes.")
  @JsonProperty("causes")
  public List<IoK8sApimachineryPkgApisMetaV1StatusCause> getCauses() {
    return causes;
  }
  public void setCauses(List<IoK8sApimachineryPkgApisMetaV1StatusCause> causes) {
    this.causes = causes;
  }

  /**
   * The group attribute of the resource associated with the status StatusReason.
   **/
  public IoK8sApimachineryPkgApisMetaV1StatusDetails group(String group) {
    this.group = group;
    return this;
  }

  
  @ApiModelProperty(value = "The group attribute of the resource associated with the status StatusReason.")
  @JsonProperty("group")
  public String getGroup() {
    return group;
  }
  public void setGroup(String group) {
    this.group = group;
  }

  /**
   * The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   **/
  public IoK8sApimachineryPkgApisMetaV1StatusDetails kind(String kind) {
    this.kind = kind;
    return this;
  }

  
  @ApiModelProperty(value = "The kind attribute of the resource associated with the status StatusReason. On some operations may differ from the requested resource Kind. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }
  public void setKind(String kind) {
    this.kind = kind;
  }

  /**
   * The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).
   **/
  public IoK8sApimachineryPkgApisMetaV1StatusDetails name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name attribute of the resource associated with the status StatusReason (when there is a single name which can be described).")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.
   **/
  public IoK8sApimachineryPkgApisMetaV1StatusDetails retryAfterSeconds(Integer retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
    return this;
  }

  
  @ApiModelProperty(value = "If specified, the time in seconds before the operation should be retried. Some errors may indicate the client must take an alternate action - for those errors this field may indicate how long to wait before taking the alternate action.")
  @JsonProperty("retryAfterSeconds")
  public Integer getRetryAfterSeconds() {
    return retryAfterSeconds;
  }
  public void setRetryAfterSeconds(Integer retryAfterSeconds) {
    this.retryAfterSeconds = retryAfterSeconds;
  }

  /**
   * UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   **/
  public IoK8sApimachineryPkgApisMetaV1StatusDetails uid(String uid) {
    this.uid = uid;
    return this;
  }

  
  @ApiModelProperty(value = "UID of the resource. (when there is a single resource which can be described). More info: http://kubernetes.io/docs/user-guide/identifiers#uids")
  @JsonProperty("uid")
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
    IoK8sApimachineryPkgApisMetaV1StatusDetails ioK8sApimachineryPkgApisMetaV1StatusDetails = (IoK8sApimachineryPkgApisMetaV1StatusDetails) o;
    return Objects.equals(causes, ioK8sApimachineryPkgApisMetaV1StatusDetails.causes) &&
        Objects.equals(group, ioK8sApimachineryPkgApisMetaV1StatusDetails.group) &&
        Objects.equals(kind, ioK8sApimachineryPkgApisMetaV1StatusDetails.kind) &&
        Objects.equals(name, ioK8sApimachineryPkgApisMetaV1StatusDetails.name) &&
        Objects.equals(retryAfterSeconds, ioK8sApimachineryPkgApisMetaV1StatusDetails.retryAfterSeconds) &&
        Objects.equals(uid, ioK8sApimachineryPkgApisMetaV1StatusDetails.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(causes, group, kind, name, retryAfterSeconds, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1StatusDetails {\n");
    
    sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retryAfterSeconds: ").append(toIndentedString(retryAfterSeconds)).append("\n");
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

