package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.EnvVar;
import io.swagger.model.VolumeMount;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * A single application container that you want to run within a pod.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "A single application container that you want to run within a pod.")

public class Container   {
  
  private @Valid String image = null;
  private @Valid String name = null;
  private @Valid List<EnvVar> env = new ArrayList<EnvVar>();
  private @Valid List<VolumeMount> volumeMounts = new ArrayList<VolumeMount>();

  /**
   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
   **/
  public Container image(String image) {
    this.image = image;
    return this;
  }

  
  @ApiModelProperty(value = "Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
   **/
  public Container name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * List of environment variables to set in the container. Cannot be updated.
   **/
  public Container env(List<EnvVar> env) {
    this.env = env;
    return this;
  }

  
  @ApiModelProperty(value = "List of environment variables to set in the container. Cannot be updated.")
  @JsonProperty("env")
  public List<EnvVar> getEnv() {
    return env;
  }
  public void setEnv(List<EnvVar> env) {
    this.env = env;
  }

  /**
   * Pod volumes to mount into the container&#39;s filesystem. Cannot be updated.
   **/
  public Container volumeMounts(List<VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  
  @ApiModelProperty(value = "Pod volumes to mount into the container's filesystem. Cannot be updated.")
  @JsonProperty("volumeMounts")
  public List<VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }
  public void setVolumeMounts(List<VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Container container = (Container) o;
    return Objects.equals(image, container.image) &&
        Objects.equals(name, container.name) &&
        Objects.equals(env, container.env) &&
        Objects.equals(volumeMounts, container.volumeMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, name, env, volumeMounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Container {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
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

