package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1Handler;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Lifecycle describes actions that the management system should take in response to container lifecycle events. For the PostStart and PreStop lifecycle handlers, management of the container blocks until the action is complete, unless the container process fails, in which case the handler is aborted.")

public class IoK8sApiCoreV1Lifecycle   {
  
  private @Valid IoK8sApiCoreV1Handler postStart = null;
  private @Valid IoK8sApiCoreV1Handler preStop = null;

  /**
   * PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
   **/
  public IoK8sApiCoreV1Lifecycle postStart(IoK8sApiCoreV1Handler postStart) {
    this.postStart = postStart;
    return this;
  }

  
  @ApiModelProperty(value = "PostStart is called immediately after a container is created. If the handler fails, the container is terminated and restarted according to its restart policy. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks")
  @JsonProperty("postStart")
  public IoK8sApiCoreV1Handler getPostStart() {
    return postStart;
  }
  public void setPostStart(IoK8sApiCoreV1Handler postStart) {
    this.postStart = postStart;
  }

  /**
   * PreStop is called immediately before a container is terminated. The container is terminated after the handler completes. The reason for termination is passed to the handler. Regardless of the outcome of the handler, the container is eventually terminated. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks
   **/
  public IoK8sApiCoreV1Lifecycle preStop(IoK8sApiCoreV1Handler preStop) {
    this.preStop = preStop;
    return this;
  }

  
  @ApiModelProperty(value = "PreStop is called immediately before a container is terminated. The container is terminated after the handler completes. The reason for termination is passed to the handler. Regardless of the outcome of the handler, the container is eventually terminated. Other management of the container blocks until the hook completes. More info: https://kubernetes.io/docs/concepts/containers/container-lifecycle-hooks/#container-hooks")
  @JsonProperty("preStop")
  public IoK8sApiCoreV1Handler getPreStop() {
    return preStop;
  }
  public void setPreStop(IoK8sApiCoreV1Handler preStop) {
    this.preStop = preStop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Lifecycle ioK8sApiCoreV1Lifecycle = (IoK8sApiCoreV1Lifecycle) o;
    return Objects.equals(postStart, ioK8sApiCoreV1Lifecycle.postStart) &&
        Objects.equals(preStop, ioK8sApiCoreV1Lifecycle.preStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postStart, preStop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Lifecycle {\n");
    
    sb.append("    postStart: ").append(toIndentedString(postStart)).append("\n");
    sb.append("    preStop: ").append(toIndentedString(preStop)).append("\n");
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

