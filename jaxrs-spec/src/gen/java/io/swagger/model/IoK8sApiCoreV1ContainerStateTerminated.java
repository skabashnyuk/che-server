package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ContainerStateTerminated is a terminated state of a container.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ContainerStateTerminated is a terminated state of a container.")

public class IoK8sApiCoreV1ContainerStateTerminated   {
  
  private @Valid String containerID = null;
  private @Valid Integer exitCode = null;
  private @Valid String finishedAt = null;
  private @Valid String message = null;
  private @Valid String reason = null;
  private @Valid Integer signal = null;
  private @Valid String startedAt = null;

  /**
   * Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;
   **/
  public IoK8sApiCoreV1ContainerStateTerminated containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  
  @ApiModelProperty(value = "Container's ID in the format 'docker://<container_id>'")
  @JsonProperty("containerID")
  public String getContainerID() {
    return containerID;
  }
  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  /**
   * Exit status from the last termination of the container
   **/
  public IoK8sApiCoreV1ContainerStateTerminated exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Exit status from the last termination of the container")
  @JsonProperty("exitCode")
  @NotNull
  public Integer getExitCode() {
    return exitCode;
  }
  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  /**
   * Time at which the container last terminated
   **/
  public IoK8sApiCoreV1ContainerStateTerminated finishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Time at which the container last terminated")
  @JsonProperty("finishedAt")
  public String getFinishedAt() {
    return finishedAt;
  }
  public void setFinishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
  }

  /**
   * Message regarding the last termination of the container
   **/
  public IoK8sApiCoreV1ContainerStateTerminated message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Message regarding the last termination of the container")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * (brief) reason from the last termination of the container
   **/
  public IoK8sApiCoreV1ContainerStateTerminated reason(String reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(value = "(brief) reason from the last termination of the container")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Signal from the last termination of the container
   **/
  public IoK8sApiCoreV1ContainerStateTerminated signal(Integer signal) {
    this.signal = signal;
    return this;
  }

  
  @ApiModelProperty(value = "Signal from the last termination of the container")
  @JsonProperty("signal")
  public Integer getSignal() {
    return signal;
  }
  public void setSignal(Integer signal) {
    this.signal = signal;
  }

  /**
   * Time at which previous execution of the container started
   **/
  public IoK8sApiCoreV1ContainerStateTerminated startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Time at which previous execution of the container started")
  @JsonProperty("startedAt")
  public String getStartedAt() {
    return startedAt;
  }
  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ContainerStateTerminated ioK8sApiCoreV1ContainerStateTerminated = (IoK8sApiCoreV1ContainerStateTerminated) o;
    return Objects.equals(containerID, ioK8sApiCoreV1ContainerStateTerminated.containerID) &&
        Objects.equals(exitCode, ioK8sApiCoreV1ContainerStateTerminated.exitCode) &&
        Objects.equals(finishedAt, ioK8sApiCoreV1ContainerStateTerminated.finishedAt) &&
        Objects.equals(message, ioK8sApiCoreV1ContainerStateTerminated.message) &&
        Objects.equals(reason, ioK8sApiCoreV1ContainerStateTerminated.reason) &&
        Objects.equals(signal, ioK8sApiCoreV1ContainerStateTerminated.signal) &&
        Objects.equals(startedAt, ioK8sApiCoreV1ContainerStateTerminated.startedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID, exitCode, finishedAt, message, reason, signal, startedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerStateTerminated {\n");
    
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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

