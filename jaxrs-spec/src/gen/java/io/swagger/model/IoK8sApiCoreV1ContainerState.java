package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ContainerStateRunning;
import io.swagger.model.IoK8sApiCoreV1ContainerStateTerminated;
import io.swagger.model.IoK8sApiCoreV1ContainerStateWaiting;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.")

public class IoK8sApiCoreV1ContainerState   {
  
  private @Valid IoK8sApiCoreV1ContainerStateRunning running = null;
  private @Valid IoK8sApiCoreV1ContainerStateTerminated terminated = null;
  private @Valid IoK8sApiCoreV1ContainerStateWaiting waiting = null;

  /**
   * Details about a running container
   **/
  public IoK8sApiCoreV1ContainerState running(IoK8sApiCoreV1ContainerStateRunning running) {
    this.running = running;
    return this;
  }

  
  @ApiModelProperty(value = "Details about a running container")
  @JsonProperty("running")
  public IoK8sApiCoreV1ContainerStateRunning getRunning() {
    return running;
  }
  public void setRunning(IoK8sApiCoreV1ContainerStateRunning running) {
    this.running = running;
  }

  /**
   * Details about a terminated container
   **/
  public IoK8sApiCoreV1ContainerState terminated(IoK8sApiCoreV1ContainerStateTerminated terminated) {
    this.terminated = terminated;
    return this;
  }

  
  @ApiModelProperty(value = "Details about a terminated container")
  @JsonProperty("terminated")
  public IoK8sApiCoreV1ContainerStateTerminated getTerminated() {
    return terminated;
  }
  public void setTerminated(IoK8sApiCoreV1ContainerStateTerminated terminated) {
    this.terminated = terminated;
  }

  /**
   * Details about a waiting container
   **/
  public IoK8sApiCoreV1ContainerState waiting(IoK8sApiCoreV1ContainerStateWaiting waiting) {
    this.waiting = waiting;
    return this;
  }

  
  @ApiModelProperty(value = "Details about a waiting container")
  @JsonProperty("waiting")
  public IoK8sApiCoreV1ContainerStateWaiting getWaiting() {
    return waiting;
  }
  public void setWaiting(IoK8sApiCoreV1ContainerStateWaiting waiting) {
    this.waiting = waiting;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ContainerState ioK8sApiCoreV1ContainerState = (IoK8sApiCoreV1ContainerState) o;
    return Objects.equals(running, ioK8sApiCoreV1ContainerState.running) &&
        Objects.equals(terminated, ioK8sApiCoreV1ContainerState.terminated) &&
        Objects.equals(waiting, ioK8sApiCoreV1ContainerState.waiting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(running, terminated, waiting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerState {\n");
    
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    terminated: ").append(toIndentedString(terminated)).append("\n");
    sb.append("    waiting: ").append(toIndentedString(waiting)).append("\n");
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

