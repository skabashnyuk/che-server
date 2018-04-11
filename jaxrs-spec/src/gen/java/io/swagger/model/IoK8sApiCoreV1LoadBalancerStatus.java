package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1LoadBalancerIngress;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * LoadBalancerStatus represents the status of a load-balancer.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "LoadBalancerStatus represents the status of a load-balancer.")

public class IoK8sApiCoreV1LoadBalancerStatus   {
  
  private @Valid List<IoK8sApiCoreV1LoadBalancerIngress> ingress = new ArrayList<IoK8sApiCoreV1LoadBalancerIngress>();

  /**
   * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
   **/
  public IoK8sApiCoreV1LoadBalancerStatus ingress(List<IoK8sApiCoreV1LoadBalancerIngress> ingress) {
    this.ingress = ingress;
    return this;
  }

  
  @ApiModelProperty(value = "Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.")
  @JsonProperty("ingress")
  public List<IoK8sApiCoreV1LoadBalancerIngress> getIngress() {
    return ingress;
  }
  public void setIngress(List<IoK8sApiCoreV1LoadBalancerIngress> ingress) {
    this.ingress = ingress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1LoadBalancerStatus ioK8sApiCoreV1LoadBalancerStatus = (IoK8sApiCoreV1LoadBalancerStatus) o;
    return Objects.equals(ingress, ioK8sApiCoreV1LoadBalancerStatus.ingress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1LoadBalancerStatus {\n");
    
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
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

