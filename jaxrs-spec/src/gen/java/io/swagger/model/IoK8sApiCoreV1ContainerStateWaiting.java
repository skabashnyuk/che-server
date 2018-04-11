package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ContainerStateWaiting is a waiting state of a container.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ContainerStateWaiting is a waiting state of a container.")

public class IoK8sApiCoreV1ContainerStateWaiting   {
  
  private @Valid String message = null;
  private @Valid String reason = null;

  /**
   * Message regarding why the container is not yet running.
   **/
  public IoK8sApiCoreV1ContainerStateWaiting message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Message regarding why the container is not yet running.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * (brief) reason the container is not yet running.
   **/
  public IoK8sApiCoreV1ContainerStateWaiting reason(String reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(value = "(brief) reason the container is not yet running.")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ContainerStateWaiting ioK8sApiCoreV1ContainerStateWaiting = (IoK8sApiCoreV1ContainerStateWaiting) o;
    return Objects.equals(message, ioK8sApiCoreV1ContainerStateWaiting.message) &&
        Objects.equals(reason, ioK8sApiCoreV1ContainerStateWaiting.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerStateWaiting {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

