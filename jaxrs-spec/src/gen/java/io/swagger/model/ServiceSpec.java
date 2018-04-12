package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.ServicePort;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ServiceSpec describes the attributes that a user creates on a service.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ServiceSpec describes the attributes that a user creates on a service.")

public class ServiceSpec   {
  
  private @Valid List<ServicePort> ports = new ArrayList<ServicePort>();
  private @Valid Map<String, String> selector = new HashMap<String, String>();

  /**
   * The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   **/
  public ServiceSpec ports(List<ServicePort> ports) {
    this.ports = ports;
    return this;
  }

  
  @ApiModelProperty(value = "The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  @JsonProperty("ports")
  public List<ServicePort> getPorts() {
    return ports;
  }
  public void setPorts(List<ServicePort> ports) {
    this.ports = ports;
  }

  /**
   * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
   **/
  public ServiceSpec selector(Map<String, String> selector) {
    this.selector = selector;
    return this;
  }

  
  @ApiModelProperty(value = "Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/")
  @JsonProperty("selector")
  public Map<String, String> getSelector() {
    return selector;
  }
  public void setSelector(Map<String, String> selector) {
    this.selector = selector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSpec serviceSpec = (ServiceSpec) o;
    return Objects.equals(ports, serviceSpec.ports) &&
        Objects.equals(selector, serviceSpec.selector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ports, selector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpec {\n");
    
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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

