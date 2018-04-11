package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1NodeAffinity;
import io.swagger.model.IoK8sApiCoreV1PodAffinity;
import io.swagger.model.IoK8sApiCoreV1PodAntiAffinity;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Affinity is a group of affinity scheduling rules.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Affinity is a group of affinity scheduling rules.")

public class IoK8sApiCoreV1Affinity   {
  
  private @Valid IoK8sApiCoreV1NodeAffinity nodeAffinity = null;
  private @Valid IoK8sApiCoreV1PodAffinity podAffinity = null;
  private @Valid IoK8sApiCoreV1PodAntiAffinity podAntiAffinity = null;

  /**
   * Describes node affinity scheduling rules for the pod.
   **/
  public IoK8sApiCoreV1Affinity nodeAffinity(IoK8sApiCoreV1NodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
    return this;
  }

  
  @ApiModelProperty(value = "Describes node affinity scheduling rules for the pod.")
  @JsonProperty("nodeAffinity")
  public IoK8sApiCoreV1NodeAffinity getNodeAffinity() {
    return nodeAffinity;
  }
  public void setNodeAffinity(IoK8sApiCoreV1NodeAffinity nodeAffinity) {
    this.nodeAffinity = nodeAffinity;
  }

  /**
   * Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).
   **/
  public IoK8sApiCoreV1Affinity podAffinity(IoK8sApiCoreV1PodAffinity podAffinity) {
    this.podAffinity = podAffinity;
    return this;
  }

  
  @ApiModelProperty(value = "Describes pod affinity scheduling rules (e.g. co-locate this pod in the same node, zone, etc. as some other pod(s)).")
  @JsonProperty("podAffinity")
  public IoK8sApiCoreV1PodAffinity getPodAffinity() {
    return podAffinity;
  }
  public void setPodAffinity(IoK8sApiCoreV1PodAffinity podAffinity) {
    this.podAffinity = podAffinity;
  }

  /**
   * Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).
   **/
  public IoK8sApiCoreV1Affinity podAntiAffinity(IoK8sApiCoreV1PodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
    return this;
  }

  
  @ApiModelProperty(value = "Describes pod anti-affinity scheduling rules (e.g. avoid putting this pod in the same node, zone, etc. as some other pod(s)).")
  @JsonProperty("podAntiAffinity")
  public IoK8sApiCoreV1PodAntiAffinity getPodAntiAffinity() {
    return podAntiAffinity;
  }
  public void setPodAntiAffinity(IoK8sApiCoreV1PodAntiAffinity podAntiAffinity) {
    this.podAntiAffinity = podAntiAffinity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Affinity ioK8sApiCoreV1Affinity = (IoK8sApiCoreV1Affinity) o;
    return Objects.equals(nodeAffinity, ioK8sApiCoreV1Affinity.nodeAffinity) &&
        Objects.equals(podAffinity, ioK8sApiCoreV1Affinity.podAffinity) &&
        Objects.equals(podAntiAffinity, ioK8sApiCoreV1Affinity.podAntiAffinity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeAffinity, podAffinity, podAntiAffinity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Affinity {\n");
    
    sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
    sb.append("    podAffinity: ").append(toIndentedString(podAffinity)).append("\n");
    sb.append("    podAntiAffinity: ").append(toIndentedString(podAntiAffinity)).append("\n");
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

