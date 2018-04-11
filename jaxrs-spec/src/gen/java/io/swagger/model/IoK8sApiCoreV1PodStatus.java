package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ContainerStatus;
import io.swagger.model.IoK8sApiCoreV1PodCondition;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * PodStatus represents information about the status of a pod. Status may trail the actual state of a system.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "PodStatus represents information about the status of a pod. Status may trail the actual state of a system.")

public class IoK8sApiCoreV1PodStatus   {
  
  private @Valid List<IoK8sApiCoreV1PodCondition> conditions = new ArrayList<IoK8sApiCoreV1PodCondition>();
  private @Valid List<IoK8sApiCoreV1ContainerStatus> containerStatuses = new ArrayList<IoK8sApiCoreV1ContainerStatus>();
  private @Valid String hostIP = null;
  private @Valid List<IoK8sApiCoreV1ContainerStatus> initContainerStatuses = new ArrayList<IoK8sApiCoreV1ContainerStatus>();
  private @Valid String message = null;
  private @Valid String phase = null;
  private @Valid String podIP = null;
  private @Valid String qosClass = null;
  private @Valid String reason = null;
  private @Valid String startTime = null;

  /**
   * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   **/
  public IoK8sApiCoreV1PodStatus conditions(List<IoK8sApiCoreV1PodCondition> conditions) {
    this.conditions = conditions;
    return this;
  }

  
  @ApiModelProperty(value = "Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")
  @JsonProperty("conditions")
  public List<IoK8sApiCoreV1PodCondition> getConditions() {
    return conditions;
  }
  public void setConditions(List<IoK8sApiCoreV1PodCondition> conditions) {
    this.conditions = conditions;
  }

  /**
   * The list has one entry per container in the manifest. Each entry is currently the output of &#x60;docker inspect&#x60;. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   **/
  public IoK8sApiCoreV1PodStatus containerStatuses(List<IoK8sApiCoreV1ContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
    return this;
  }

  
  @ApiModelProperty(value = "The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
  @JsonProperty("containerStatuses")
  public List<IoK8sApiCoreV1ContainerStatus> getContainerStatuses() {
    return containerStatuses;
  }
  public void setContainerStatuses(List<IoK8sApiCoreV1ContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
  }

  /**
   * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
   **/
  public IoK8sApiCoreV1PodStatus hostIP(String hostIP) {
    this.hostIP = hostIP;
    return this;
  }

  
  @ApiModelProperty(value = "IP address of the host to which the pod is assigned. Empty if not yet scheduled.")
  @JsonProperty("hostIP")
  public String getHostIP() {
    return hostIP;
  }
  public void setHostIP(String hostIP) {
    this.hostIP = hostIP;
  }

  /**
   * The list has one entry per init container in the manifest. The most recent successful init container will have ready &#x3D; true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   **/
  public IoK8sApiCoreV1PodStatus initContainerStatuses(List<IoK8sApiCoreV1ContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
    return this;
  }

  
  @ApiModelProperty(value = "The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")
  @JsonProperty("initContainerStatuses")
  public List<IoK8sApiCoreV1ContainerStatus> getInitContainerStatuses() {
    return initContainerStatuses;
  }
  public void setInitContainerStatuses(List<IoK8sApiCoreV1ContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
  }

  /**
   * A human readable message indicating details about why the pod is in this condition.
   **/
  public IoK8sApiCoreV1PodStatus message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "A human readable message indicating details about why the pod is in this condition.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Current condition of the pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
   **/
  public IoK8sApiCoreV1PodStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

  
  @ApiModelProperty(value = "Current condition of the pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase")
  @JsonProperty("phase")
  public String getPhase() {
    return phase;
  }
  public void setPhase(String phase) {
    this.phase = phase;
  }

  /**
   * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
   **/
  public IoK8sApiCoreV1PodStatus podIP(String podIP) {
    this.podIP = podIP;
    return this;
  }

  
  @ApiModelProperty(value = "IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.")
  @JsonProperty("podIP")
  public String getPodIP() {
    return podIP;
  }
  public void setPodIP(String podIP) {
    this.podIP = podIP;
  }

  /**
   * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://github.com/kubernetes/kubernetes/blob/master/docs/design/resource-qos.md
   **/
  public IoK8sApiCoreV1PodStatus qosClass(String qosClass) {
    this.qosClass = qosClass;
    return this;
  }

  
  @ApiModelProperty(value = "The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://github.com/kubernetes/kubernetes/blob/master/docs/design/resource-qos.md")
  @JsonProperty("qosClass")
  public String getQosClass() {
    return qosClass;
  }
  public void setQosClass(String qosClass) {
    this.qosClass = qosClass;
  }

  /**
   * A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;Evicted&#39;
   **/
  public IoK8sApiCoreV1PodStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(value = "A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
   **/
  public IoK8sApiCoreV1PodStatus startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(value = "RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.")
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PodStatus ioK8sApiCoreV1PodStatus = (IoK8sApiCoreV1PodStatus) o;
    return Objects.equals(conditions, ioK8sApiCoreV1PodStatus.conditions) &&
        Objects.equals(containerStatuses, ioK8sApiCoreV1PodStatus.containerStatuses) &&
        Objects.equals(hostIP, ioK8sApiCoreV1PodStatus.hostIP) &&
        Objects.equals(initContainerStatuses, ioK8sApiCoreV1PodStatus.initContainerStatuses) &&
        Objects.equals(message, ioK8sApiCoreV1PodStatus.message) &&
        Objects.equals(phase, ioK8sApiCoreV1PodStatus.phase) &&
        Objects.equals(podIP, ioK8sApiCoreV1PodStatus.podIP) &&
        Objects.equals(qosClass, ioK8sApiCoreV1PodStatus.qosClass) &&
        Objects.equals(reason, ioK8sApiCoreV1PodStatus.reason) &&
        Objects.equals(startTime, ioK8sApiCoreV1PodStatus.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, containerStatuses, hostIP, initContainerStatuses, message, phase, podIP, qosClass, reason, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodStatus {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    containerStatuses: ").append(toIndentedString(containerStatuses)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    initContainerStatuses: ").append(toIndentedString(initContainerStatuses)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    podIP: ").append(toIndentedString(podIP)).append("\n");
    sb.append("    qosClass: ").append(toIndentedString(qosClass)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

