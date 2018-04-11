package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1PodAffinityTerm;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "The weights of all of the matched WeightedPodAffinityTerm fields are added per-node to find the most preferred node(s)")

public class IoK8sApiCoreV1WeightedPodAffinityTerm   {
  
  private @Valid IoK8sApiCoreV1PodAffinityTerm podAffinityTerm = null;
  private @Valid Integer weight = null;

  /**
   * Required. A pod affinity term, associated with the corresponding weight.
   **/
  public IoK8sApiCoreV1WeightedPodAffinityTerm podAffinityTerm(IoK8sApiCoreV1PodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Required. A pod affinity term, associated with the corresponding weight.")
  @JsonProperty("podAffinityTerm")
  @NotNull
  public IoK8sApiCoreV1PodAffinityTerm getPodAffinityTerm() {
    return podAffinityTerm;
  }
  public void setPodAffinityTerm(IoK8sApiCoreV1PodAffinityTerm podAffinityTerm) {
    this.podAffinityTerm = podAffinityTerm;
  }

  /**
   * weight associated with matching the corresponding podAffinityTerm, in the range 1-100.
   **/
  public IoK8sApiCoreV1WeightedPodAffinityTerm weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "weight associated with matching the corresponding podAffinityTerm, in the range 1-100.")
  @JsonProperty("weight")
  @NotNull
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1WeightedPodAffinityTerm ioK8sApiCoreV1WeightedPodAffinityTerm = (IoK8sApiCoreV1WeightedPodAffinityTerm) o;
    return Objects.equals(podAffinityTerm, ioK8sApiCoreV1WeightedPodAffinityTerm.podAffinityTerm) &&
        Objects.equals(weight, ioK8sApiCoreV1WeightedPodAffinityTerm.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podAffinityTerm, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1WeightedPodAffinityTerm {\n");
    
    sb.append("    podAffinityTerm: ").append(toIndentedString(podAffinityTerm)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

