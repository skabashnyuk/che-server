package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "LoadBalancerIngress represents the status of a load-balancer ingress point: traffic intended for the service should be sent to an ingress point.")

public class IoK8sApiCoreV1LoadBalancerIngress   {
  
  private @Valid String hostname = null;
  private @Valid String ip = null;

  /**
   * Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)
   **/
  public IoK8sApiCoreV1LoadBalancerIngress hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  
  @ApiModelProperty(value = "Hostname is set for load-balancer ingress points that are DNS based (typically AWS load-balancers)")
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  /**
   * IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)
   **/
  public IoK8sApiCoreV1LoadBalancerIngress ip(String ip) {
    this.ip = ip;
    return this;
  }

  
  @ApiModelProperty(value = "IP is set for load-balancer ingress points that are IP based (typically GCE or OpenStack load-balancers)")
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1LoadBalancerIngress ioK8sApiCoreV1LoadBalancerIngress = (IoK8sApiCoreV1LoadBalancerIngress) o;
    return Objects.equals(hostname, ioK8sApiCoreV1LoadBalancerIngress.hostname) &&
        Objects.equals(ip, ioK8sApiCoreV1LoadBalancerIngress.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1LoadBalancerIngress {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

