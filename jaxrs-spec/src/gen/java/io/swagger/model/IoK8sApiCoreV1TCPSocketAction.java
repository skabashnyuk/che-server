package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * TCPSocketAction describes an action based on opening a socket
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "TCPSocketAction describes an action based on opening a socket")

public class IoK8sApiCoreV1TCPSocketAction   {
  
  private @Valid String host = null;
  private @Valid String port = null;

  /**
   * Optional: Host name to connect to, defaults to the pod IP.
   **/
  public IoK8sApiCoreV1TCPSocketAction host(String host) {
    this.host = host;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: Host name to connect to, defaults to the pod IP.")
  @JsonProperty("host")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
   **/
  public IoK8sApiCoreV1TCPSocketAction port(String port) {
    this.port = port;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.")
  @JsonProperty("port")
  @NotNull
  public String getPort() {
    return port;
  }
  public void setPort(String port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1TCPSocketAction ioK8sApiCoreV1TCPSocketAction = (IoK8sApiCoreV1TCPSocketAction) o;
    return Objects.equals(host, ioK8sApiCoreV1TCPSocketAction.host) &&
        Objects.equals(port, ioK8sApiCoreV1TCPSocketAction.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1TCPSocketAction {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

