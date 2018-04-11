package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ServicePort;
import io.swagger.model.IoK8sApiCoreV1SessionAffinityConfig;
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

public class IoK8sApiCoreV1ServiceSpec   {
  
  private @Valid String clusterIP = null;
  private @Valid List<String> externalIPs = new ArrayList<String>();
  private @Valid String externalName = null;
  private @Valid String externalTrafficPolicy = null;
  private @Valid Integer healthCheckNodePort = null;
  private @Valid String loadBalancerIP = null;
  private @Valid List<String> loadBalancerSourceRanges = new ArrayList<String>();
  private @Valid List<IoK8sApiCoreV1ServicePort> ports = new ArrayList<IoK8sApiCoreV1ServicePort>();
  private @Valid Boolean publishNotReadyAddresses = null;
  private @Valid Map<String, String> selector = new HashMap<String, String>();
  private @Valid String sessionAffinity = null;
  private @Valid IoK8sApiCoreV1SessionAffinityConfig sessionAffinityConfig = null;
  private @Valid String type = null;

  /**
   * clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \&quot;None\&quot;, empty string (\&quot;\&quot;), or a valid IP address. \&quot;None\&quot; can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   **/
  public IoK8sApiCoreV1ServiceSpec clusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
    return this;
  }

  
  @ApiModelProperty(value = "clusterIP is the IP address of the service and is usually assigned randomly by the master. If an address is specified manually and is not in use by others, it will be allocated to the service; otherwise, creation of the service will fail. This field can not be changed through updates. Valid values are \"None\", empty string (\"\"), or a valid IP address. \"None\" can be specified for headless services when proxying is not required. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  @JsonProperty("clusterIP")
  public String getClusterIP() {
    return clusterIP;
  }
  public void setClusterIP(String clusterIP) {
    this.clusterIP = clusterIP;
  }

  /**
   * externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.
   **/
  public IoK8sApiCoreV1ServiceSpec externalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
    return this;
  }

  
  @ApiModelProperty(value = "externalIPs is a list of IP addresses for which nodes in the cluster will also accept traffic for this service.  These IPs are not managed by Kubernetes.  The user is responsible for ensuring that traffic arrives at a node with this IP.  A common example is external load-balancers that are not part of the Kubernetes system.")
  @JsonProperty("externalIPs")
  public List<String> getExternalIPs() {
    return externalIPs;
  }
  public void setExternalIPs(List<String> externalIPs) {
    this.externalIPs = externalIPs;
  }

  /**
   * externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.
   **/
  public IoK8sApiCoreV1ServiceSpec externalName(String externalName) {
    this.externalName = externalName;
    return this;
  }

  
  @ApiModelProperty(value = "externalName is the external reference that kubedns or equivalent will return as a CNAME record for this service. No proxying will be involved. Must be a valid RFC-1123 hostname (https://tools.ietf.org/html/rfc1123) and requires Type to be ExternalName.")
  @JsonProperty("externalName")
  public String getExternalName() {
    return externalName;
  }
  public void setExternalName(String externalName) {
    this.externalName = externalName;
  }

  /**
   * externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints. \&quot;Local\&quot; preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. \&quot;Cluster\&quot; obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.
   **/
  public IoK8sApiCoreV1ServiceSpec externalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
    return this;
  }

  
  @ApiModelProperty(value = "externalTrafficPolicy denotes if this Service desires to route external traffic to node-local or cluster-wide endpoints. \"Local\" preserves the client source IP and avoids a second hop for LoadBalancer and Nodeport type services, but risks potentially imbalanced traffic spreading. \"Cluster\" obscures the client source IP and may cause a second hop to another node, but should have good overall load-spreading.")
  @JsonProperty("externalTrafficPolicy")
  public String getExternalTrafficPolicy() {
    return externalTrafficPolicy;
  }
  public void setExternalTrafficPolicy(String externalTrafficPolicy) {
    this.externalTrafficPolicy = externalTrafficPolicy;
  }

  /**
   * healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.
   **/
  public IoK8sApiCoreV1ServiceSpec healthCheckNodePort(Integer healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
    return this;
  }

  
  @ApiModelProperty(value = "healthCheckNodePort specifies the healthcheck nodePort for the service. If not specified, HealthCheckNodePort is created by the service api backend with the allocated nodePort. Will use user-specified nodePort value if specified by the client. Only effects when Type is set to LoadBalancer and ExternalTrafficPolicy is set to Local.")
  @JsonProperty("healthCheckNodePort")
  public Integer getHealthCheckNodePort() {
    return healthCheckNodePort;
  }
  public void setHealthCheckNodePort(Integer healthCheckNodePort) {
    this.healthCheckNodePort = healthCheckNodePort;
  }

  /**
   * Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.
   **/
  public IoK8sApiCoreV1ServiceSpec loadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
    return this;
  }

  
  @ApiModelProperty(value = "Only applies to Service Type: LoadBalancer LoadBalancer will get created with the IP specified in this field. This feature depends on whether the underlying cloud-provider supports specifying the loadBalancerIP when a load balancer is created. This field will be ignored if the cloud-provider does not support the feature.")
  @JsonProperty("loadBalancerIP")
  public String getLoadBalancerIP() {
    return loadBalancerIP;
  }
  public void setLoadBalancerIP(String loadBalancerIP) {
    this.loadBalancerIP = loadBalancerIP;
  }

  /**
   * If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\&quot; More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/
   **/
  public IoK8sApiCoreV1ServiceSpec loadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    return this;
  }

  
  @ApiModelProperty(value = "If specified and supported by the platform, this will restrict traffic through the cloud-provider load-balancer will be restricted to the specified client IPs. This field will be ignored if the cloud-provider does not support the feature.\" More info: https://kubernetes.io/docs/tasks/access-application-cluster/configure-cloud-provider-firewall/")
  @JsonProperty("loadBalancerSourceRanges")
  public List<String> getLoadBalancerSourceRanges() {
    return loadBalancerSourceRanges;
  }
  public void setLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
    this.loadBalancerSourceRanges = loadBalancerSourceRanges;
  }

  /**
   * The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   **/
  public IoK8sApiCoreV1ServiceSpec ports(List<IoK8sApiCoreV1ServicePort> ports) {
    this.ports = ports;
    return this;
  }

  
  @ApiModelProperty(value = "The list of ports that are exposed by this service. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  @JsonProperty("ports")
  public List<IoK8sApiCoreV1ServicePort> getPorts() {
    return ports;
  }
  public void setPorts(List<IoK8sApiCoreV1ServicePort> ports) {
    this.ports = ports;
  }

  /**
   * publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service. The default value is false. The primary use case for setting this field is to use a StatefulSet&#39;s Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery. This field will replace the service.alpha.kubernetes.io/tolerate-unready-endpoints when that annotation is deprecated and all clients have been converted to use this field.
   **/
  public IoK8sApiCoreV1ServiceSpec publishNotReadyAddresses(Boolean publishNotReadyAddresses) {
    this.publishNotReadyAddresses = publishNotReadyAddresses;
    return this;
  }

  
  @ApiModelProperty(value = "publishNotReadyAddresses, when set to true, indicates that DNS implementations must publish the notReadyAddresses of subsets for the Endpoints associated with the Service. The default value is false. The primary use case for setting this field is to use a StatefulSet's Headless Service to propagate SRV records for its Pods without respect to their readiness for purpose of peer discovery. This field will replace the service.alpha.kubernetes.io/tolerate-unready-endpoints when that annotation is deprecated and all clients have been converted to use this field.")
  @JsonProperty("publishNotReadyAddresses")
  public Boolean isPublishNotReadyAddresses() {
    return publishNotReadyAddresses;
  }
  public void setPublishNotReadyAddresses(Boolean publishNotReadyAddresses) {
    this.publishNotReadyAddresses = publishNotReadyAddresses;
  }

  /**
   * Route service traffic to pods with label keys and values matching this selector. If empty or not present, the service is assumed to have an external process managing its endpoints, which Kubernetes will not modify. Only applies to types ClusterIP, NodePort, and LoadBalancer. Ignored if type is ExternalName. More info: https://kubernetes.io/docs/concepts/services-networking/service/
   **/
  public IoK8sApiCoreV1ServiceSpec selector(Map<String, String> selector) {
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

  /**
   * Supports \&quot;ClientIP\&quot; and \&quot;None\&quot;. Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies
   **/
  public IoK8sApiCoreV1ServiceSpec sessionAffinity(String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
    return this;
  }

  
  @ApiModelProperty(value = "Supports \"ClientIP\" and \"None\". Used to maintain session affinity. Enable client IP based session affinity. Must be ClientIP or None. Defaults to None. More info: https://kubernetes.io/docs/concepts/services-networking/service/#virtual-ips-and-service-proxies")
  @JsonProperty("sessionAffinity")
  public String getSessionAffinity() {
    return sessionAffinity;
  }
  public void setSessionAffinity(String sessionAffinity) {
    this.sessionAffinity = sessionAffinity;
  }

  /**
   * sessionAffinityConfig contains the configurations of session affinity.
   **/
  public IoK8sApiCoreV1ServiceSpec sessionAffinityConfig(IoK8sApiCoreV1SessionAffinityConfig sessionAffinityConfig) {
    this.sessionAffinityConfig = sessionAffinityConfig;
    return this;
  }

  
  @ApiModelProperty(value = "sessionAffinityConfig contains the configurations of session affinity.")
  @JsonProperty("sessionAffinityConfig")
  public IoK8sApiCoreV1SessionAffinityConfig getSessionAffinityConfig() {
    return sessionAffinityConfig;
  }
  public void setSessionAffinityConfig(IoK8sApiCoreV1SessionAffinityConfig sessionAffinityConfig) {
    this.sessionAffinityConfig = sessionAffinityConfig;
  }

  /**
   * type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \&quot;ExternalName\&quot; maps to the specified externalName. \&quot;ClusterIP\&quot; allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is \&quot;None\&quot;, no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. \&quot;NodePort\&quot; builds on ClusterIP and allocates a port on every node which routes to the clusterIP. \&quot;LoadBalancer\&quot; builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types
   **/
  public IoK8sApiCoreV1ServiceSpec type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "type determines how the Service is exposed. Defaults to ClusterIP. Valid options are ExternalName, ClusterIP, NodePort, and LoadBalancer. \"ExternalName\" maps to the specified externalName. \"ClusterIP\" allocates a cluster-internal IP address for load-balancing to endpoints. Endpoints are determined by the selector or if that is not specified, by manual construction of an Endpoints object. If clusterIP is \"None\", no virtual IP is allocated and the endpoints are published as a set of endpoints rather than a stable IP. \"NodePort\" builds on ClusterIP and allocates a port on every node which routes to the clusterIP. \"LoadBalancer\" builds on NodePort and creates an external load-balancer (if supported in the current cloud) which routes to the clusterIP. More info: https://kubernetes.io/docs/concepts/services-networking/service/#publishing-services---service-types")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ServiceSpec ioK8sApiCoreV1ServiceSpec = (IoK8sApiCoreV1ServiceSpec) o;
    return Objects.equals(clusterIP, ioK8sApiCoreV1ServiceSpec.clusterIP) &&
        Objects.equals(externalIPs, ioK8sApiCoreV1ServiceSpec.externalIPs) &&
        Objects.equals(externalName, ioK8sApiCoreV1ServiceSpec.externalName) &&
        Objects.equals(externalTrafficPolicy, ioK8sApiCoreV1ServiceSpec.externalTrafficPolicy) &&
        Objects.equals(healthCheckNodePort, ioK8sApiCoreV1ServiceSpec.healthCheckNodePort) &&
        Objects.equals(loadBalancerIP, ioK8sApiCoreV1ServiceSpec.loadBalancerIP) &&
        Objects.equals(loadBalancerSourceRanges, ioK8sApiCoreV1ServiceSpec.loadBalancerSourceRanges) &&
        Objects.equals(ports, ioK8sApiCoreV1ServiceSpec.ports) &&
        Objects.equals(publishNotReadyAddresses, ioK8sApiCoreV1ServiceSpec.publishNotReadyAddresses) &&
        Objects.equals(selector, ioK8sApiCoreV1ServiceSpec.selector) &&
        Objects.equals(sessionAffinity, ioK8sApiCoreV1ServiceSpec.sessionAffinity) &&
        Objects.equals(sessionAffinityConfig, ioK8sApiCoreV1ServiceSpec.sessionAffinityConfig) &&
        Objects.equals(type, ioK8sApiCoreV1ServiceSpec.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterIP, externalIPs, externalName, externalTrafficPolicy, healthCheckNodePort, loadBalancerIP, loadBalancerSourceRanges, ports, publishNotReadyAddresses, selector, sessionAffinity, sessionAffinityConfig, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ServiceSpec {\n");
    
    sb.append("    clusterIP: ").append(toIndentedString(clusterIP)).append("\n");
    sb.append("    externalIPs: ").append(toIndentedString(externalIPs)).append("\n");
    sb.append("    externalName: ").append(toIndentedString(externalName)).append("\n");
    sb.append("    externalTrafficPolicy: ").append(toIndentedString(externalTrafficPolicy)).append("\n");
    sb.append("    healthCheckNodePort: ").append(toIndentedString(healthCheckNodePort)).append("\n");
    sb.append("    loadBalancerIP: ").append(toIndentedString(loadBalancerIP)).append("\n");
    sb.append("    loadBalancerSourceRanges: ").append(toIndentedString(loadBalancerSourceRanges)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    publishNotReadyAddresses: ").append(toIndentedString(publishNotReadyAddresses)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    sessionAffinity: ").append(toIndentedString(sessionAffinity)).append("\n");
    sb.append("    sessionAffinityConfig: ").append(toIndentedString(sessionAffinityConfig)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

