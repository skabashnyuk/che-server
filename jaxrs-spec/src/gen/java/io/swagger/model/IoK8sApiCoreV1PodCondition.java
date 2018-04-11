package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * PodCondition contains details for the current condition of this pod.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "PodCondition contains details for the current condition of this pod.")

public class IoK8sApiCoreV1PodCondition   {
  
  private @Valid String lastProbeTime = null;
  private @Valid String lastTransitionTime = null;
  private @Valid String message = null;
  private @Valid String reason = null;
  private @Valid String status = null;
  private @Valid String type = null;

  /**
   * Last time we probed the condition.
   **/
  public IoK8sApiCoreV1PodCondition lastProbeTime(String lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
    return this;
  }

  
  @ApiModelProperty(value = "Last time we probed the condition.")
  @JsonProperty("lastProbeTime")
  public String getLastProbeTime() {
    return lastProbeTime;
  }
  public void setLastProbeTime(String lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }

  /**
   * Last time the condition transitioned from one status to another.
   **/
  public IoK8sApiCoreV1PodCondition lastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  
  @ApiModelProperty(value = "Last time the condition transitioned from one status to another.")
  @JsonProperty("lastTransitionTime")
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }
  public void setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }

  /**
   * Human-readable message indicating details about last transition.
   **/
  public IoK8sApiCoreV1PodCondition message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Human-readable message indicating details about last transition.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Unique, one-word, CamelCase reason for the condition&#39;s last transition.
   **/
  public IoK8sApiCoreV1PodCondition reason(String reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(value = "Unique, one-word, CamelCase reason for the condition's last transition.")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   **/
  public IoK8sApiCoreV1PodCondition status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * Type is the type of the condition. Currently only Ready. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   **/
  public IoK8sApiCoreV1PodCondition type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Type is the type of the condition. Currently only Ready. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PodCondition ioK8sApiCoreV1PodCondition = (IoK8sApiCoreV1PodCondition) o;
    return Objects.equals(lastProbeTime, ioK8sApiCoreV1PodCondition.lastProbeTime) &&
        Objects.equals(lastTransitionTime, ioK8sApiCoreV1PodCondition.lastTransitionTime) &&
        Objects.equals(message, ioK8sApiCoreV1PodCondition.message) &&
        Objects.equals(reason, ioK8sApiCoreV1PodCondition.reason) &&
        Objects.equals(status, ioK8sApiCoreV1PodCondition.status) &&
        Objects.equals(type, ioK8sApiCoreV1PodCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProbeTime, lastTransitionTime, message, reason, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodCondition {\n");
    
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

