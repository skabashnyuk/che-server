package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ExecAction;
import io.swagger.model.IoK8sApiCoreV1HTTPGetAction;
import io.swagger.model.IoK8sApiCoreV1TCPSocketAction;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Handler defines a specific action that should be taken
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Handler defines a specific action that should be taken")

public class IoK8sApiCoreV1Handler   {
  
  private @Valid IoK8sApiCoreV1ExecAction exec = null;
  private @Valid IoK8sApiCoreV1HTTPGetAction httpGet = null;
  private @Valid IoK8sApiCoreV1TCPSocketAction tcpSocket = null;

  /**
   * One and only one of the following should be specified. Exec specifies the action to take.
   **/
  public IoK8sApiCoreV1Handler exec(IoK8sApiCoreV1ExecAction exec) {
    this.exec = exec;
    return this;
  }

  
  @ApiModelProperty(value = "One and only one of the following should be specified. Exec specifies the action to take.")
  @JsonProperty("exec")
  public IoK8sApiCoreV1ExecAction getExec() {
    return exec;
  }
  public void setExec(IoK8sApiCoreV1ExecAction exec) {
    this.exec = exec;
  }

  /**
   * HTTPGet specifies the http request to perform.
   **/
  public IoK8sApiCoreV1Handler httpGet(IoK8sApiCoreV1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

  
  @ApiModelProperty(value = "HTTPGet specifies the http request to perform.")
  @JsonProperty("httpGet")
  public IoK8sApiCoreV1HTTPGetAction getHttpGet() {
    return httpGet;
  }
  public void setHttpGet(IoK8sApiCoreV1HTTPGetAction httpGet) {
    this.httpGet = httpGet;
  }

  /**
   * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
   **/
  public IoK8sApiCoreV1Handler tcpSocket(IoK8sApiCoreV1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

  
  @ApiModelProperty(value = "TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported")
  @JsonProperty("tcpSocket")
  public IoK8sApiCoreV1TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }
  public void setTcpSocket(IoK8sApiCoreV1TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Handler ioK8sApiCoreV1Handler = (IoK8sApiCoreV1Handler) o;
    return Objects.equals(exec, ioK8sApiCoreV1Handler.exec) &&
        Objects.equals(httpGet, ioK8sApiCoreV1Handler.httpGet) &&
        Objects.equals(tcpSocket, ioK8sApiCoreV1Handler.tcpSocket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, httpGet, tcpSocket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Handler {\n");
    
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
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

