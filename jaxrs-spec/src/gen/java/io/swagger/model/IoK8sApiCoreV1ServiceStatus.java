package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1LoadBalancerStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ServiceStatus represents the current status of a service.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ServiceStatus represents the current status of a service.")

public class IoK8sApiCoreV1ServiceStatus   {
  
  private @Valid IoK8sApiCoreV1LoadBalancerStatus loadBalancer = null;

  /**
   * LoadBalancer contains the current status of the load-balancer, if one is present.
   **/
  public IoK8sApiCoreV1ServiceStatus loadBalancer(IoK8sApiCoreV1LoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
    return this;
  }

  
  @ApiModelProperty(value = "LoadBalancer contains the current status of the load-balancer, if one is present.")
  @JsonProperty("loadBalancer")
  public IoK8sApiCoreV1LoadBalancerStatus getLoadBalancer() {
    return loadBalancer;
  }
  public void setLoadBalancer(IoK8sApiCoreV1LoadBalancerStatus loadBalancer) {
    this.loadBalancer = loadBalancer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ServiceStatus ioK8sApiCoreV1ServiceStatus = (IoK8sApiCoreV1ServiceStatus) o;
    return Objects.equals(loadBalancer, ioK8sApiCoreV1ServiceStatus.loadBalancer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loadBalancer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ServiceStatus {\n");
    
    sb.append("    loadBalancer: ").append(toIndentedString(loadBalancer)).append("\n");
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

