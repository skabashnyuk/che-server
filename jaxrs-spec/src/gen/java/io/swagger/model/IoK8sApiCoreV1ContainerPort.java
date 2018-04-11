package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ContainerPort represents a network port in a single container.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ContainerPort represents a network port in a single container.")

public class IoK8sApiCoreV1ContainerPort   {
  
  private @Valid Integer containerPort = null;
  private @Valid String hostIP = null;
  private @Valid Integer hostPort = null;
  private @Valid String name = null;
  private @Valid String protocol = null;

  /**
   * Number of port to expose on the pod&#39;s IP address. This must be a valid port number, 0 &lt; x &lt; 65536.
   **/
  public IoK8sApiCoreV1ContainerPort containerPort(Integer containerPort) {
    this.containerPort = containerPort;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number of port to expose on the pod's IP address. This must be a valid port number, 0 < x < 65536.")
  @JsonProperty("containerPort")
  @NotNull
  public Integer getContainerPort() {
    return containerPort;
  }
  public void setContainerPort(Integer containerPort) {
    this.containerPort = containerPort;
  }

  /**
   * What host IP to bind the external port to.
   **/
  public IoK8sApiCoreV1ContainerPort hostIP(String hostIP) {
    this.hostIP = hostIP;
    return this;
  }

  
  @ApiModelProperty(value = "What host IP to bind the external port to.")
  @JsonProperty("hostIP")
  public String getHostIP() {
    return hostIP;
  }
  public void setHostIP(String hostIP) {
    this.hostIP = hostIP;
  }

  /**
   * Number of port to expose on the host. If specified, this must be a valid port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.
   **/
  public IoK8sApiCoreV1ContainerPort hostPort(Integer hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  
  @ApiModelProperty(value = "Number of port to expose on the host. If specified, this must be a valid port number, 0 < x < 65536. If HostNetwork is specified, this must match ContainerPort. Most containers do not need this.")
  @JsonProperty("hostPort")
  public Integer getHostPort() {
    return hostPort;
  }
  public void setHostPort(Integer hostPort) {
    this.hostPort = hostPort;
  }

  /**
   * If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.
   **/
  public IoK8sApiCoreV1ContainerPort name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Protocol for port. Must be UDP or TCP. Defaults to \&quot;TCP\&quot;.
   **/
  public IoK8sApiCoreV1ContainerPort protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  
  @ApiModelProperty(value = "Protocol for port. Must be UDP or TCP. Defaults to \"TCP\".")
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ContainerPort ioK8sApiCoreV1ContainerPort = (IoK8sApiCoreV1ContainerPort) o;
    return Objects.equals(containerPort, ioK8sApiCoreV1ContainerPort.containerPort) &&
        Objects.equals(hostIP, ioK8sApiCoreV1ContainerPort.hostIP) &&
        Objects.equals(hostPort, ioK8sApiCoreV1ContainerPort.hostPort) &&
        Objects.equals(name, ioK8sApiCoreV1ContainerPort.name) &&
        Objects.equals(protocol, ioK8sApiCoreV1ContainerPort.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerPort, hostIP, hostPort, name, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ContainerPort {\n");
    
    sb.append("    containerPort: ").append(toIndentedString(containerPort)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

