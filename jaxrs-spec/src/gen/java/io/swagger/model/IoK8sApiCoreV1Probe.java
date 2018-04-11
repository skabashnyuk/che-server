package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ExecAction;
import io.swagger.model.IoK8sApiCoreV1HTTPGetAction;
import io.swagger.model.IoK8sApiCoreV1TCPSocketAction;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.")

public class IoK8sApiCoreV1Probe   {
  
  private @Valid IoK8sApiCoreV1ExecAction exec = null;
  private @Valid Integer failureThreshold = null;
  private @Valid IoK8sApiCoreV1HTTPGetAction httpGet = null;
  private @Valid Integer initialDelaySeconds = null;
  private @Valid Integer periodSeconds = null;
  private @Valid Integer successThreshold = null;
  private @Valid IoK8sApiCoreV1TCPSocketAction tcpSocket = null;
  private @Valid Integer timeoutSeconds = null;

  /**
   * One and only one of the following should be specified. Exec specifies the action to take.
   **/
  public IoK8sApiCoreV1Probe exec(IoK8sApiCoreV1ExecAction exec) {
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
   * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
   **/
  public IoK8sApiCoreV1Probe failureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.")
  @JsonProperty("failureThreshold")
  public Integer getFailureThreshold() {
    return failureThreshold;
  }
  public void setFailureThreshold(Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
  }

  /**
   * HTTPGet specifies the http request to perform.
   **/
  public IoK8sApiCoreV1Probe httpGet(IoK8sApiCoreV1HTTPGetAction httpGet) {
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
   * Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   **/
  public IoK8sApiCoreV1Probe initialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

  
  @ApiModelProperty(value = "Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  @JsonProperty("initialDelaySeconds")
  public Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }
  public void setInitialDelaySeconds(Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
  }

  /**
   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
   **/
  public IoK8sApiCoreV1Probe periodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

  
  @ApiModelProperty(value = "How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.")
  @JsonProperty("periodSeconds")
  public Integer getPeriodSeconds() {
    return periodSeconds;
  }
  public void setPeriodSeconds(Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
  }

  /**
   * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
   **/
  public IoK8sApiCoreV1Probe successThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.")
  @JsonProperty("successThreshold")
  public Integer getSuccessThreshold() {
    return successThreshold;
  }
  public void setSuccessThreshold(Integer successThreshold) {
    this.successThreshold = successThreshold;
  }

  /**
   * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
   **/
  public IoK8sApiCoreV1Probe tcpSocket(IoK8sApiCoreV1TCPSocketAction tcpSocket) {
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

  /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   **/
  public IoK8sApiCoreV1Probe timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  
  @ApiModelProperty(value = "Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }
  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Probe ioK8sApiCoreV1Probe = (IoK8sApiCoreV1Probe) o;
    return Objects.equals(exec, ioK8sApiCoreV1Probe.exec) &&
        Objects.equals(failureThreshold, ioK8sApiCoreV1Probe.failureThreshold) &&
        Objects.equals(httpGet, ioK8sApiCoreV1Probe.httpGet) &&
        Objects.equals(initialDelaySeconds, ioK8sApiCoreV1Probe.initialDelaySeconds) &&
        Objects.equals(periodSeconds, ioK8sApiCoreV1Probe.periodSeconds) &&
        Objects.equals(successThreshold, ioK8sApiCoreV1Probe.successThreshold) &&
        Objects.equals(tcpSocket, ioK8sApiCoreV1Probe.tcpSocket) &&
        Objects.equals(timeoutSeconds, ioK8sApiCoreV1Probe.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exec, failureThreshold, httpGet, initialDelaySeconds, periodSeconds, successThreshold, tcpSocket, timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Probe {\n");
    
    sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
    sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
    sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
    sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
    sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
    sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
    sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

