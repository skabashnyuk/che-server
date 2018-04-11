package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ServicePort contains information on service&#39;s port.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ServicePort contains information on service's port.")

public class IoK8sApiCoreV1ServicePort   {
  
  private @Valid String name = null;
  private @Valid Integer nodePort = null;
  private @Valid Integer port = null;
  private @Valid String protocol = null;
  private @Valid String targetPort = null;

  /**
   * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. This maps to the &#39;Name&#39; field in EndpointPort objects. Optional if only one ServicePort is defined on this service.
   **/
  public IoK8sApiCoreV1ServicePort name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. This maps to the 'Name' field in EndpointPort objects. Optional if only one ServicePort is defined on this service.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The port on each node on which this service is exposed when type&#x3D;NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport
   **/
  public IoK8sApiCoreV1ServicePort nodePort(Integer nodePort) {
    this.nodePort = nodePort;
    return this;
  }

  
  @ApiModelProperty(value = "The port on each node on which this service is exposed when type=NodePort or LoadBalancer. Usually assigned by the system. If specified, it will be allocated to the service if unused or else creation of the service will fail. Default is to auto-allocate a port if the ServiceType of this Service requires one. More info: https://kubernetes.io/docs/concepts/services-networking/service/#type-nodeport")
  @JsonProperty("nodePort")
  public Integer getNodePort() {
    return nodePort;
  }
  public void setNodePort(Integer nodePort) {
    this.nodePort = nodePort;
  }

  /**
   * The port that will be exposed by this service.
   **/
  public IoK8sApiCoreV1ServicePort port(Integer port) {
    this.port = port;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The port that will be exposed by this service.")
  @JsonProperty("port")
  @NotNull
  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   * The IP protocol for this port. Supports \&quot;TCP\&quot; and \&quot;UDP\&quot;. Default is TCP.
   **/
  public IoK8sApiCoreV1ServicePort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  
  @ApiModelProperty(value = "The IP protocol for this port. Supports \"TCP\" and \"UDP\". Default is TCP.")
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  /**
   * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod&#39;s container ports. If this is not specified, the value of the &#39;port&#39; field is used (an identity map). This field is ignored for services with clusterIP&#x3D;None, and should be omitted or set equal to the &#39;port&#39; field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service
   **/
  public IoK8sApiCoreV1ServicePort targetPort(String targetPort) {
    this.targetPort = targetPort;
    return this;
  }

  
  @ApiModelProperty(value = "Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field. More info: https://kubernetes.io/docs/concepts/services-networking/service/#defining-a-service")
  @JsonProperty("targetPort")
  public String getTargetPort() {
    return targetPort;
  }
  public void setTargetPort(String targetPort) {
    this.targetPort = targetPort;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ServicePort ioK8sApiCoreV1ServicePort = (IoK8sApiCoreV1ServicePort) o;
    return Objects.equals(name, ioK8sApiCoreV1ServicePort.name) &&
        Objects.equals(nodePort, ioK8sApiCoreV1ServicePort.nodePort) &&
        Objects.equals(port, ioK8sApiCoreV1ServicePort.port) &&
        Objects.equals(protocol, ioK8sApiCoreV1ServicePort.protocol) &&
        Objects.equals(targetPort, ioK8sApiCoreV1ServicePort.targetPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nodePort, port, protocol, targetPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ServicePort {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodePort: ").append(toIndentedString(nodePort)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
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

