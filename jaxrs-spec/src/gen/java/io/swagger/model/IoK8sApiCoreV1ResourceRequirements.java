package io.swagger.model;

import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ResourceRequirements describes the compute resource requirements.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ResourceRequirements describes the compute resource requirements.")

public class IoK8sApiCoreV1ResourceRequirements   {
  
  private @Valid Map<String, String> limits = new HashMap<String, String>();
  private @Valid Map<String, String> requests = new HashMap<String, String>();

  /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
   **/
  public IoK8sApiCoreV1ResourceRequirements limits(Map<String, String> limits) {
    this.limits = limits;
    return this;
  }

  
  @ApiModelProperty(value = "Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/")
  @JsonProperty("limits")
  public Map<String, String> getLimits() {
    return limits;
  }
  public void setLimits(Map<String, String> limits) {
    this.limits = limits;
  }

  /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
   **/
  public IoK8sApiCoreV1ResourceRequirements requests(Map<String, String> requests) {
    this.requests = requests;
    return this;
  }

  
  @ApiModelProperty(value = "Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/")
  @JsonProperty("requests")
  public Map<String, String> getRequests() {
    return requests;
  }
  public void setRequests(Map<String, String> requests) {
    this.requests = requests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ResourceRequirements ioK8sApiCoreV1ResourceRequirements = (IoK8sApiCoreV1ResourceRequirements) o;
    return Objects.equals(limits, ioK8sApiCoreV1ResourceRequirements.limits) &&
        Objects.equals(requests, ioK8sApiCoreV1ResourceRequirements.requests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, requests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ResourceRequirements {\n");
    
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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

