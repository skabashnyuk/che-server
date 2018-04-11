package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1Affinity;
import io.swagger.model.IoK8sApiCoreV1Container;
import io.swagger.model.IoK8sApiCoreV1HostAlias;
import io.swagger.model.IoK8sApiCoreV1LocalObjectReference;
import io.swagger.model.IoK8sApiCoreV1PodDNSConfig;
import io.swagger.model.IoK8sApiCoreV1PodSecurityContext;
import io.swagger.model.IoK8sApiCoreV1Toleration;
import io.swagger.model.IoK8sApiCoreV1Volume;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * PodSpec is a description of a pod.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "PodSpec is a description of a pod.")

public class IoK8sApiCoreV1PodSpec   {
  
  private @Valid Long activeDeadlineSeconds = null;
  private @Valid IoK8sApiCoreV1Affinity affinity = null;
  private @Valid Boolean automountServiceAccountToken = null;
  private @Valid List<IoK8sApiCoreV1Container> containers = new ArrayList<IoK8sApiCoreV1Container>();
  private @Valid IoK8sApiCoreV1PodDNSConfig dnsConfig = null;
  private @Valid String dnsPolicy = null;
  private @Valid List<IoK8sApiCoreV1HostAlias> hostAliases = new ArrayList<IoK8sApiCoreV1HostAlias>();
  private @Valid Boolean hostIPC = null;
  private @Valid Boolean hostNetwork = null;
  private @Valid Boolean hostPID = null;
  private @Valid String hostname = null;
  private @Valid List<IoK8sApiCoreV1LocalObjectReference> imagePullSecrets = new ArrayList<IoK8sApiCoreV1LocalObjectReference>();
  private @Valid List<IoK8sApiCoreV1Container> initContainers = new ArrayList<IoK8sApiCoreV1Container>();
  private @Valid String nodeName = null;
  private @Valid Map<String, String> nodeSelector = new HashMap<String, String>();
  private @Valid Integer priority = null;
  private @Valid String priorityClassName = null;
  private @Valid String restartPolicy = null;
  private @Valid String schedulerName = null;
  private @Valid IoK8sApiCoreV1PodSecurityContext securityContext = null;
  private @Valid String serviceAccount = null;
  private @Valid String serviceAccountName = null;
  private @Valid String subdomain = null;
  private @Valid Long terminationGracePeriodSeconds = null;
  private @Valid List<IoK8sApiCoreV1Toleration> tolerations = new ArrayList<IoK8sApiCoreV1Toleration>();
  private @Valid List<IoK8sApiCoreV1Volume> volumes = new ArrayList<IoK8sApiCoreV1Volume>();

  /**
   * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.
   **/
  public IoK8sApiCoreV1PodSpec activeDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
    return this;
  }

  
  @ApiModelProperty(value = "Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers. Value must be a positive integer.")
  @JsonProperty("activeDeadlineSeconds")
  public Long getActiveDeadlineSeconds() {
    return activeDeadlineSeconds;
  }
  public void setActiveDeadlineSeconds(Long activeDeadlineSeconds) {
    this.activeDeadlineSeconds = activeDeadlineSeconds;
  }

  /**
   * If specified, the pod&#39;s scheduling constraints
   **/
  public IoK8sApiCoreV1PodSpec affinity(IoK8sApiCoreV1Affinity affinity) {
    this.affinity = affinity;
    return this;
  }

  
  @ApiModelProperty(value = "If specified, the pod's scheduling constraints")
  @JsonProperty("affinity")
  public IoK8sApiCoreV1Affinity getAffinity() {
    return affinity;
  }
  public void setAffinity(IoK8sApiCoreV1Affinity affinity) {
    this.affinity = affinity;
  }

  /**
   * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
   **/
  public IoK8sApiCoreV1PodSpec automountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

  
  @ApiModelProperty(value = "AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.")
  @JsonProperty("automountServiceAccountToken")
  public Boolean isAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }
  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }

  /**
   * List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
   **/
  public IoK8sApiCoreV1PodSpec containers(List<IoK8sApiCoreV1Container> containers) {
    this.containers = containers;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of containers belonging to the pod. Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.")
  @JsonProperty("containers")
  @NotNull
  public List<IoK8sApiCoreV1Container> getContainers() {
    return containers;
  }
  public void setContainers(List<IoK8sApiCoreV1Container> containers) {
    this.containers = containers;
  }

  /**
   * Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy. This is an alpha feature introduced in v1.9 and CustomPodDNS feature gate must be enabled to use it.
   **/
  public IoK8sApiCoreV1PodSpec dnsConfig(IoK8sApiCoreV1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the DNS parameters of a pod. Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy. This is an alpha feature introduced in v1.9 and CustomPodDNS feature gate must be enabled to use it.")
  @JsonProperty("dnsConfig")
  public IoK8sApiCoreV1PodDNSConfig getDnsConfig() {
    return dnsConfig;
  }
  public void setDnsConfig(IoK8sApiCoreV1PodDNSConfig dnsConfig) {
    this.dnsConfig = dnsConfig;
  }

  /**
   * Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;. Note that &#39;None&#39; policy is an alpha feature introduced in v1.9 and CustomPodDNS feature gate must be enabled to use it.
   **/
  public IoK8sApiCoreV1PodSpec dnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
    return this;
  }

  
  @ApiModelProperty(value = "Set DNS policy for the pod. Defaults to \"ClusterFirst\". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'. Note that 'None' policy is an alpha feature introduced in v1.9 and CustomPodDNS feature gate must be enabled to use it.")
  @JsonProperty("dnsPolicy")
  public String getDnsPolicy() {
    return dnsPolicy;
  }
  public void setDnsPolicy(String dnsPolicy) {
    this.dnsPolicy = dnsPolicy;
  }

  /**
   * HostAliases is an optional list of hosts and IPs that will be injected into the pod&#39;s hosts file if specified. This is only valid for non-hostNetwork pods.
   **/
  public IoK8sApiCoreV1PodSpec hostAliases(List<IoK8sApiCoreV1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
    return this;
  }

  
  @ApiModelProperty(value = "HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified. This is only valid for non-hostNetwork pods.")
  @JsonProperty("hostAliases")
  public List<IoK8sApiCoreV1HostAlias> getHostAliases() {
    return hostAliases;
  }
  public void setHostAliases(List<IoK8sApiCoreV1HostAlias> hostAliases) {
    this.hostAliases = hostAliases;
  }

  /**
   * Use the host&#39;s ipc namespace. Optional: Default to false.
   **/
  public IoK8sApiCoreV1PodSpec hostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
    return this;
  }

  
  @ApiModelProperty(value = "Use the host's ipc namespace. Optional: Default to false.")
  @JsonProperty("hostIPC")
  public Boolean isHostIPC() {
    return hostIPC;
  }
  public void setHostIPC(Boolean hostIPC) {
    this.hostIPC = hostIPC;
  }

  /**
   * Host networking requested for this pod. Use the host&#39;s network namespace. If this option is set, the ports that will be used must be specified. Default to false.
   **/
  public IoK8sApiCoreV1PodSpec hostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
    return this;
  }

  
  @ApiModelProperty(value = "Host networking requested for this pod. Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.")
  @JsonProperty("hostNetwork")
  public Boolean isHostNetwork() {
    return hostNetwork;
  }
  public void setHostNetwork(Boolean hostNetwork) {
    this.hostNetwork = hostNetwork;
  }

  /**
   * Use the host&#39;s pid namespace. Optional: Default to false.
   **/
  public IoK8sApiCoreV1PodSpec hostPID(Boolean hostPID) {
    this.hostPID = hostPID;
    return this;
  }

  
  @ApiModelProperty(value = "Use the host's pid namespace. Optional: Default to false.")
  @JsonProperty("hostPID")
  public Boolean isHostPID() {
    return hostPID;
  }
  public void setHostPID(Boolean hostPID) {
    this.hostPID = hostPID;
  }

  /**
   * Specifies the hostname of the Pod If not specified, the pod&#39;s hostname will be set to a system-defined value.
   **/
  public IoK8sApiCoreV1PodSpec hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.")
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  /**
   * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
   **/
  public IoK8sApiCoreV1PodSpec imagePullSecrets(List<IoK8sApiCoreV1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  
  @ApiModelProperty(value = "ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec. If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod")
  @JsonProperty("imagePullSecrets")
  public List<IoK8sApiCoreV1LocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }
  public void setImagePullSecrets(List<IoK8sApiCoreV1LocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }

  /**
   * List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, or Liveness probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
   **/
  public IoK8sApiCoreV1PodSpec initContainers(List<IoK8sApiCoreV1Container> initContainers) {
    this.initContainers = initContainers;
    return this;
  }

  
  @ApiModelProperty(value = "List of initialization containers belonging to the pod. Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, or Liveness probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/")
  @JsonProperty("initContainers")
  public List<IoK8sApiCoreV1Container> getInitContainers() {
    return initContainers;
  }
  public void setInitContainers(List<IoK8sApiCoreV1Container> initContainers) {
    this.initContainers = initContainers;
  }

  /**
   * NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
   **/
  public IoK8sApiCoreV1PodSpec nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  
  @ApiModelProperty(value = "NodeName is a request to schedule this pod onto a specific node. If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.")
  @JsonProperty("nodeName")
  public String getNodeName() {
    return nodeName;
  }
  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  /**
   * NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node&#39;s labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
   **/
  public IoK8sApiCoreV1PodSpec nodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
    return this;
  }

  
  @ApiModelProperty(value = "NodeSelector is a selector which must be true for the pod to fit on a node. Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/")
  @JsonProperty("nodeSelector")
  public Map<String, String> getNodeSelector() {
    return nodeSelector;
  }
  public void setNodeSelector(Map<String, String> nodeSelector) {
    this.nodeSelector = nodeSelector;
  }

  /**
   * The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
   **/
  public IoK8sApiCoreV1PodSpec priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  
  @ApiModelProperty(value = "The priority value. Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   * If specified, indicates the pod&#39;s priority. \&quot;SYSTEM\&quot; is a special keyword which indicates the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
   **/
  public IoK8sApiCoreV1PodSpec priorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
    return this;
  }

  
  @ApiModelProperty(value = "If specified, indicates the pod's priority. \"SYSTEM\" is a special keyword which indicates the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.")
  @JsonProperty("priorityClassName")
  public String getPriorityClassName() {
    return priorityClassName;
  }
  public void setPriorityClassName(String priorityClassName) {
    this.priorityClassName = priorityClassName;
  }

  /**
   * Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
   **/
  public IoK8sApiCoreV1PodSpec restartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

  
  @ApiModelProperty(value = "Restart policy for all containers within the pod. One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy")
  @JsonProperty("restartPolicy")
  public String getRestartPolicy() {
    return restartPolicy;
  }
  public void setRestartPolicy(String restartPolicy) {
    this.restartPolicy = restartPolicy;
  }

  /**
   * If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.
   **/
  public IoK8sApiCoreV1PodSpec schedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
    return this;
  }

  
  @ApiModelProperty(value = "If specified, the pod will be dispatched by specified scheduler. If not specified, the pod will be dispatched by default scheduler.")
  @JsonProperty("schedulerName")
  public String getSchedulerName() {
    return schedulerName;
  }
  public void setSchedulerName(String schedulerName) {
    this.schedulerName = schedulerName;
  }

  /**
   * SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.
   **/
  public IoK8sApiCoreV1PodSpec securityContext(IoK8sApiCoreV1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

  
  @ApiModelProperty(value = "SecurityContext holds pod-level security attributes and common container settings. Optional: Defaults to empty.  See type description for default values of each field.")
  @JsonProperty("securityContext")
  public IoK8sApiCoreV1PodSecurityContext getSecurityContext() {
    return securityContext;
  }
  public void setSecurityContext(IoK8sApiCoreV1PodSecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  /**
   * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.
   **/
  public IoK8sApiCoreV1PodSpec serviceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  
  @ApiModelProperty(value = "DeprecatedServiceAccount is a depreciated alias for ServiceAccountName. Deprecated: Use serviceAccountName instead.")
  @JsonProperty("serviceAccount")
  public String getServiceAccount() {
    return serviceAccount;
  }
  public void setServiceAccount(String serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  /**
   * ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
   **/
  public IoK8sApiCoreV1PodSpec serviceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

  
  @ApiModelProperty(value = "ServiceAccountName is the name of the ServiceAccount to use to run this pod. More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/")
  @JsonProperty("serviceAccountName")
  public String getServiceAccountName() {
    return serviceAccountName;
  }
  public void setServiceAccountName(String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
  }

  /**
   * If specified, the fully qualified Pod hostname will be \&quot;&lt;hostname&gt;.&lt;subdomain&gt;.&lt;pod namespace&gt;.svc.&lt;cluster domain&gt;\&quot;. If not specified, the pod will not have a domainname at all.
   **/
  public IoK8sApiCoreV1PodSpec subdomain(String subdomain) {
    this.subdomain = subdomain;
    return this;
  }

  
  @ApiModelProperty(value = "If specified, the fully qualified Pod hostname will be \"<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>\". If not specified, the pod will not have a domainname at all.")
  @JsonProperty("subdomain")
  public String getSubdomain() {
    return subdomain;
  }
  public void setSubdomain(String subdomain) {
    this.subdomain = subdomain;
  }

  /**
   * Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
   **/
  public IoK8sApiCoreV1PodSpec terminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    return this;
  }

  
  @ApiModelProperty(value = "Optional duration in seconds the pod needs to terminate gracefully. May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.")
  @JsonProperty("terminationGracePeriodSeconds")
  public Long getTerminationGracePeriodSeconds() {
    return terminationGracePeriodSeconds;
  }
  public void setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
    this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
  }

  /**
   * If specified, the pod&#39;s tolerations.
   **/
  public IoK8sApiCoreV1PodSpec tolerations(List<IoK8sApiCoreV1Toleration> tolerations) {
    this.tolerations = tolerations;
    return this;
  }

  
  @ApiModelProperty(value = "If specified, the pod's tolerations.")
  @JsonProperty("tolerations")
  public List<IoK8sApiCoreV1Toleration> getTolerations() {
    return tolerations;
  }
  public void setTolerations(List<IoK8sApiCoreV1Toleration> tolerations) {
    this.tolerations = tolerations;
  }

  /**
   * List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes
   **/
  public IoK8sApiCoreV1PodSpec volumes(List<IoK8sApiCoreV1Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  
  @ApiModelProperty(value = "List of volumes that can be mounted by containers belonging to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes")
  @JsonProperty("volumes")
  public List<IoK8sApiCoreV1Volume> getVolumes() {
    return volumes;
  }
  public void setVolumes(List<IoK8sApiCoreV1Volume> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PodSpec ioK8sApiCoreV1PodSpec = (IoK8sApiCoreV1PodSpec) o;
    return Objects.equals(activeDeadlineSeconds, ioK8sApiCoreV1PodSpec.activeDeadlineSeconds) &&
        Objects.equals(affinity, ioK8sApiCoreV1PodSpec.affinity) &&
        Objects.equals(automountServiceAccountToken, ioK8sApiCoreV1PodSpec.automountServiceAccountToken) &&
        Objects.equals(containers, ioK8sApiCoreV1PodSpec.containers) &&
        Objects.equals(dnsConfig, ioK8sApiCoreV1PodSpec.dnsConfig) &&
        Objects.equals(dnsPolicy, ioK8sApiCoreV1PodSpec.dnsPolicy) &&
        Objects.equals(hostAliases, ioK8sApiCoreV1PodSpec.hostAliases) &&
        Objects.equals(hostIPC, ioK8sApiCoreV1PodSpec.hostIPC) &&
        Objects.equals(hostNetwork, ioK8sApiCoreV1PodSpec.hostNetwork) &&
        Objects.equals(hostPID, ioK8sApiCoreV1PodSpec.hostPID) &&
        Objects.equals(hostname, ioK8sApiCoreV1PodSpec.hostname) &&
        Objects.equals(imagePullSecrets, ioK8sApiCoreV1PodSpec.imagePullSecrets) &&
        Objects.equals(initContainers, ioK8sApiCoreV1PodSpec.initContainers) &&
        Objects.equals(nodeName, ioK8sApiCoreV1PodSpec.nodeName) &&
        Objects.equals(nodeSelector, ioK8sApiCoreV1PodSpec.nodeSelector) &&
        Objects.equals(priority, ioK8sApiCoreV1PodSpec.priority) &&
        Objects.equals(priorityClassName, ioK8sApiCoreV1PodSpec.priorityClassName) &&
        Objects.equals(restartPolicy, ioK8sApiCoreV1PodSpec.restartPolicy) &&
        Objects.equals(schedulerName, ioK8sApiCoreV1PodSpec.schedulerName) &&
        Objects.equals(securityContext, ioK8sApiCoreV1PodSpec.securityContext) &&
        Objects.equals(serviceAccount, ioK8sApiCoreV1PodSpec.serviceAccount) &&
        Objects.equals(serviceAccountName, ioK8sApiCoreV1PodSpec.serviceAccountName) &&
        Objects.equals(subdomain, ioK8sApiCoreV1PodSpec.subdomain) &&
        Objects.equals(terminationGracePeriodSeconds, ioK8sApiCoreV1PodSpec.terminationGracePeriodSeconds) &&
        Objects.equals(tolerations, ioK8sApiCoreV1PodSpec.tolerations) &&
        Objects.equals(volumes, ioK8sApiCoreV1PodSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDeadlineSeconds, affinity, automountServiceAccountToken, containers, dnsConfig, dnsPolicy, hostAliases, hostIPC, hostNetwork, hostPID, hostname, imagePullSecrets, initContainers, nodeName, nodeSelector, priority, priorityClassName, restartPolicy, schedulerName, securityContext, serviceAccount, serviceAccountName, subdomain, terminationGracePeriodSeconds, tolerations, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodSpec {\n");
    
    sb.append("    activeDeadlineSeconds: ").append(toIndentedString(activeDeadlineSeconds)).append("\n");
    sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    dnsConfig: ").append(toIndentedString(dnsConfig)).append("\n");
    sb.append("    dnsPolicy: ").append(toIndentedString(dnsPolicy)).append("\n");
    sb.append("    hostAliases: ").append(toIndentedString(hostAliases)).append("\n");
    sb.append("    hostIPC: ").append(toIndentedString(hostIPC)).append("\n");
    sb.append("    hostNetwork: ").append(toIndentedString(hostNetwork)).append("\n");
    sb.append("    hostPID: ").append(toIndentedString(hostPID)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    nodeSelector: ").append(toIndentedString(nodeSelector)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    priorityClassName: ").append(toIndentedString(priorityClassName)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    schedulerName: ").append(toIndentedString(schedulerName)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    serviceAccountName: ").append(toIndentedString(serviceAccountName)).append("\n");
    sb.append("    subdomain: ").append(toIndentedString(subdomain)).append("\n");
    sb.append("    terminationGracePeriodSeconds: ").append(toIndentedString(terminationGracePeriodSeconds)).append("\n");
    sb.append("    tolerations: ").append(toIndentedString(tolerations)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

