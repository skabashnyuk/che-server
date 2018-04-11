package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ContainerStateRunning is a running state of a container.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ContainerStateRunning is a running state of a container.")

public class IoK8sApiCoreV1ContainerStateRunning   {
  
  private @Valid String startedAt = null;

  /**
   * Time at which the container was last (re-)started
   **/
  public IoK8sApiCoreV1ContainerStateRunning startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Time at which the container was last (re-)started")
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
    IoK8sApiCoreV1ContainerStateRunning ioK8sApiCoreV1ContainerStateRunning = (IoK8sApiCoreV1ContainerStateRunning) o;
    return Objects.equals(startedAt, ioK8sApiCoreV1ContainerStateRunning.startedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerStateRunning {\n");
    
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

