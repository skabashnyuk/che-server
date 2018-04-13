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

public class ServicePort   {
  
  private @Valid String name = null;
  private @Valid Integer port = null;
  private @Valid String protocol = null;
  private @Valid String targetPort = null;

  /**
   * The name of this port within the service. This must be a DNS_LABEL. All ports within a ServiceSpec must have unique names. This maps to the &#39;Name&#39; field in EndpointPort objects. Optional if only one ServicePort is defined on this service.
   **/
  public ServicePort name(String name) {
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
   * The port that will be exposed by this service.
   **/
  public ServicePort port(Integer port) {
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
  public ServicePort protocol(String protocol) {
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
   * Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod&#39;s container ports. If this is not specified, the value of the &#39;port&#39; field is used (an identity map). This field is ignored for services with clusterIP&#x3D;None, and should be omitted or set equal to the &#39;port&#39; field.
   **/
  public ServicePort targetPort(String targetPort) {
    this.targetPort = targetPort;
    return this;
  }

  
  @ApiModelProperty(value = "Number or name of the port to access on the pods targeted by the service. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. If this is a string, it will be looked up as a named port in the target Pod's container ports. If this is not specified, the value of the 'port' field is used (an identity map). This field is ignored for services with clusterIP=None, and should be omitted or set equal to the 'port' field.")
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
    ServicePort servicePort = (ServicePort) o;
    return Objects.equals(name, servicePort.name) &&
        Objects.equals(port, servicePort.port) &&
        Objects.equals(protocol, servicePort.protocol) &&
        Objects.equals(targetPort, servicePort.targetPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, port, protocol, targetPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicePort {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

