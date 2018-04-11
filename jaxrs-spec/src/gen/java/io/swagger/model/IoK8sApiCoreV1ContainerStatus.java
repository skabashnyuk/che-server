package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ContainerState;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ContainerStatus contains details for the current status of this container.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ContainerStatus contains details for the current status of this container.")

public class IoK8sApiCoreV1ContainerStatus   {
  
  private @Valid String containerID = null;
  private @Valid String image = null;
  private @Valid String imageID = null;
  private @Valid IoK8sApiCoreV1ContainerState lastState = null;
  private @Valid String name = null;
  private @Valid Boolean ready = null;
  private @Valid Integer restartCount = null;
  private @Valid IoK8sApiCoreV1ContainerState state = null;

  /**
   * Container&#39;s ID in the format &#39;docker://&lt;container_id&gt;&#39;.
   **/
  public IoK8sApiCoreV1ContainerStatus containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  
  @ApiModelProperty(value = "Container's ID in the format 'docker://<container_id>'.")
  @JsonProperty("containerID")
  public String getContainerID() {
    return containerID;
  }
  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  /**
   * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images
   **/
  public IoK8sApiCoreV1ContainerStatus image(String image) {
    this.image = image;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images")
  @JsonProperty("image")
  @NotNull
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * ImageID of the container&#39;s image.
   **/
  public IoK8sApiCoreV1ContainerStatus imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ImageID of the container's image.")
  @JsonProperty("imageID")
  @NotNull
  public String getImageID() {
    return imageID;
  }
  public void setImageID(String imageID) {
    this.imageID = imageID;
  }

  /**
   * Details about the container&#39;s last termination condition.
   **/
  public IoK8sApiCoreV1ContainerStatus lastState(IoK8sApiCoreV1ContainerState lastState) {
    this.lastState = lastState;
    return this;
  }

  
  @ApiModelProperty(value = "Details about the container's last termination condition.")
  @JsonProperty("lastState")
  public IoK8sApiCoreV1ContainerState getLastState() {
    return lastState;
  }
  public void setLastState(IoK8sApiCoreV1ContainerState lastState) {
    this.lastState = lastState;
  }

  /**
   * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
   **/
  public IoK8sApiCoreV1ContainerStatus name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Specifies whether the container has passed its readiness probe.
   **/
  public IoK8sApiCoreV1ContainerStatus ready(Boolean ready) {
    this.ready = ready;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Specifies whether the container has passed its readiness probe.")
  @JsonProperty("ready")
  @NotNull
  public Boolean isReady() {
    return ready;
  }
  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  /**
   * The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.
   **/
  public IoK8sApiCoreV1ContainerStatus restartCount(Integer restartCount) {
    this.restartCount = restartCount;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.")
  @JsonProperty("restartCount")
  @NotNull
  public Integer getRestartCount() {
    return restartCount;
  }
  public void setRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
  }

  /**
   * Details about the container&#39;s current condition.
   **/
  public IoK8sApiCoreV1ContainerStatus state(IoK8sApiCoreV1ContainerState state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(value = "Details about the container's current condition.")
  @JsonProperty("state")
  public IoK8sApiCoreV1ContainerState getState() {
    return state;
  }
  public void setState(IoK8sApiCoreV1ContainerState state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ContainerStatus ioK8sApiCoreV1ContainerStatus = (IoK8sApiCoreV1ContainerStatus) o;
    return Objects.equals(containerID, ioK8sApiCoreV1ContainerStatus.containerID) &&
        Objects.equals(image, ioK8sApiCoreV1ContainerStatus.image) &&
        Objects.equals(imageID, ioK8sApiCoreV1ContainerStatus.imageID) &&
        Objects.equals(lastState, ioK8sApiCoreV1ContainerStatus.lastState) &&
        Objects.equals(name, ioK8sApiCoreV1ContainerStatus.name) &&
        Objects.equals(ready, ioK8sApiCoreV1ContainerStatus.ready) &&
        Objects.equals(restartCount, ioK8sApiCoreV1ContainerStatus.restartCount) &&
        Objects.equals(state, ioK8sApiCoreV1ContainerStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID, image, imageID, lastState, name, ready, restartCount, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerStatus {\n");
    
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    lastState: ").append(toIndentedString(lastState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

