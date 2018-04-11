package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ContainerPort;
import io.swagger.model.IoK8sApiCoreV1EnvFromSource;
import io.swagger.model.IoK8sApiCoreV1EnvVar;
import io.swagger.model.IoK8sApiCoreV1Lifecycle;
import io.swagger.model.IoK8sApiCoreV1Probe;
import io.swagger.model.IoK8sApiCoreV1ResourceRequirements;
import io.swagger.model.IoK8sApiCoreV1SecurityContext;
import io.swagger.model.IoK8sApiCoreV1VolumeDevice;
import io.swagger.model.IoK8sApiCoreV1VolumeMount;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * A single application container that you want to run within a pod.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "A single application container that you want to run within a pod.")

public class IoK8sApiCoreV1Container   {
  
  private @Valid List<String> args = new ArrayList<String>();
  private @Valid List<String> command = new ArrayList<String>();
  private @Valid List<IoK8sApiCoreV1EnvVar> env = new ArrayList<IoK8sApiCoreV1EnvVar>();
  private @Valid List<IoK8sApiCoreV1EnvFromSource> envFrom = new ArrayList<IoK8sApiCoreV1EnvFromSource>();
  private @Valid String image = null;
  private @Valid String imagePullPolicy = null;
  private @Valid IoK8sApiCoreV1Lifecycle lifecycle = null;
  private @Valid IoK8sApiCoreV1Probe livenessProbe = null;
  private @Valid String name = null;
  private @Valid List<IoK8sApiCoreV1ContainerPort> ports = new ArrayList<IoK8sApiCoreV1ContainerPort>();
  private @Valid IoK8sApiCoreV1Probe readinessProbe = null;
  private @Valid IoK8sApiCoreV1ResourceRequirements resources = null;
  private @Valid IoK8sApiCoreV1SecurityContext securityContext = null;
  private @Valid Boolean stdin = null;
  private @Valid Boolean stdinOnce = null;
  private @Valid String terminationMessagePath = null;
  private @Valid String terminationMessagePolicy = null;
  private @Valid Boolean tty = null;
  private @Valid List<IoK8sApiCoreV1VolumeDevice> volumeDevices = new ArrayList<IoK8sApiCoreV1VolumeDevice>();
  private @Valid List<IoK8sApiCoreV1VolumeMount> volumeMounts = new ArrayList<IoK8sApiCoreV1VolumeMount>();
  private @Valid String workingDir = null;

  /**
   * Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   **/
  public IoK8sApiCoreV1Container args(List<String> args) {
    this.args = args;
    return this;
  }

  
  @ApiModelProperty(value = "Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
  @JsonProperty("args")
  public List<String> getArgs() {
    return args;
  }
  public void setArgs(List<String> args) {
    this.args = args;
  }

  /**
   * Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   **/
  public IoK8sApiCoreV1Container command(List<String> command) {
    this.command = command;
    return this;
  }

  
  @ApiModelProperty(value = "Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
  @JsonProperty("command")
  public List<String> getCommand() {
    return command;
  }
  public void setCommand(List<String> command) {
    this.command = command;
  }

  /**
   * List of environment variables to set in the container. Cannot be updated.
   **/
  public IoK8sApiCoreV1Container env(List<IoK8sApiCoreV1EnvVar> env) {
    this.env = env;
    return this;
  }

  
  @ApiModelProperty(value = "List of environment variables to set in the container. Cannot be updated.")
  @JsonProperty("env")
  public List<IoK8sApiCoreV1EnvVar> getEnv() {
    return env;
  }
  public void setEnv(List<IoK8sApiCoreV1EnvVar> env) {
    this.env = env;
  }

  /**
   * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
   **/
  public IoK8sApiCoreV1Container envFrom(List<IoK8sApiCoreV1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
    return this;
  }

  
  @ApiModelProperty(value = "List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.")
  @JsonProperty("envFrom")
  public List<IoK8sApiCoreV1EnvFromSource> getEnvFrom() {
    return envFrom;
  }
  public void setEnvFrom(List<IoK8sApiCoreV1EnvFromSource> envFrom) {
    this.envFrom = envFrom;
  }

  /**
   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
   **/
  public IoK8sApiCoreV1Container image(String image) {
    this.image = image;
    return this;
  }

  
  @ApiModelProperty(value = "Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
   **/
  public IoK8sApiCoreV1Container imagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

  
  @ApiModelProperty(value = "Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images")
  @JsonProperty("imagePullPolicy")
  public String getImagePullPolicy() {
    return imagePullPolicy;
  }
  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }

  /**
   * Actions that the management system should take in response to container lifecycle events. Cannot be updated.
   **/
  public IoK8sApiCoreV1Container lifecycle(IoK8sApiCoreV1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  
  @ApiModelProperty(value = "Actions that the management system should take in response to container lifecycle events. Cannot be updated.")
  @JsonProperty("lifecycle")
  public IoK8sApiCoreV1Lifecycle getLifecycle() {
    return lifecycle;
  }
  public void setLifecycle(IoK8sApiCoreV1Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }

  /**
   * Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   **/
  public IoK8sApiCoreV1Container livenessProbe(IoK8sApiCoreV1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
    return this;
  }

  
  @ApiModelProperty(value = "Periodic probe of container liveness. Container will be restarted if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  @JsonProperty("livenessProbe")
  public IoK8sApiCoreV1Probe getLivenessProbe() {
    return livenessProbe;
  }
  public void setLivenessProbe(IoK8sApiCoreV1Probe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }

  /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
   **/
  public IoK8sApiCoreV1Container name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \&quot;0.0.0.0\&quot; address inside a container will be accessible from the network. Cannot be updated.
   **/
  public IoK8sApiCoreV1Container ports(List<IoK8sApiCoreV1ContainerPort> ports) {
    this.ports = ports;
    return this;
  }

  
  @ApiModelProperty(value = "List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Cannot be updated.")
  @JsonProperty("ports")
  public List<IoK8sApiCoreV1ContainerPort> getPorts() {
    return ports;
  }
  public void setPorts(List<IoK8sApiCoreV1ContainerPort> ports) {
    this.ports = ports;
  }

  /**
   * Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   **/
  public IoK8sApiCoreV1Container readinessProbe(IoK8sApiCoreV1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
    return this;
  }

  
  @ApiModelProperty(value = "Periodic probe of container service readiness. Container will be removed from service endpoints if the probe fails. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes")
  @JsonProperty("readinessProbe")
  public IoK8sApiCoreV1Probe getReadinessProbe() {
    return readinessProbe;
  }
  public void setReadinessProbe(IoK8sApiCoreV1Probe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }

  /**
   * Compute Resources required by this container. Cannot be updated. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
   **/
  public IoK8sApiCoreV1Container resources(IoK8sApiCoreV1ResourceRequirements resources) {
    this.resources = resources;
    return this;
  }

  
  @ApiModelProperty(value = "Compute Resources required by this container. Cannot be updated. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources")
  @JsonProperty("resources")
  public IoK8sApiCoreV1ResourceRequirements getResources() {
    return resources;
  }
  public void setResources(IoK8sApiCoreV1ResourceRequirements resources) {
    this.resources = resources;
  }

  /**
   * Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/
   **/
  public IoK8sApiCoreV1Container securityContext(IoK8sApiCoreV1SecurityContext securityContext) {
    this.securityContext = securityContext;
    return this;
  }

  
  @ApiModelProperty(value = "Security options the pod should run with. More info: https://kubernetes.io/docs/concepts/policy/security-context/ More info: https://kubernetes.io/docs/tasks/configure-pod-container/security-context/")
  @JsonProperty("securityContext")
  public IoK8sApiCoreV1SecurityContext getSecurityContext() {
    return securityContext;
  }
  public void setSecurityContext(IoK8sApiCoreV1SecurityContext securityContext) {
    this.securityContext = securityContext;
  }

  /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
   **/
  public IoK8sApiCoreV1Container stdin(Boolean stdin) {
    this.stdin = stdin;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.")
  @JsonProperty("stdin")
  public Boolean isStdin() {
    return stdin;
  }
  public void setStdin(Boolean stdin) {
    this.stdin = stdin;
  }

  /**
   * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
   **/
  public IoK8sApiCoreV1Container stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false")
  @JsonProperty("stdinOnce")
  public Boolean isStdinOnce() {
    return stdinOnce;
  }
  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }

  /**
   * Optional: Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
   **/
  public IoK8sApiCoreV1Container terminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.")
  @JsonProperty("terminationMessagePath")
  public String getTerminationMessagePath() {
    return terminationMessagePath;
  }
  public void setTerminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
  }

  /**
   * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
   **/
  public IoK8sApiCoreV1Container terminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
    return this;
  }

  
  @ApiModelProperty(value = "Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.")
  @JsonProperty("terminationMessagePolicy")
  public String getTerminationMessagePolicy() {
    return terminationMessagePolicy;
  }
  public void setTerminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
  }

  /**
   * Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be true. Default is false.
   **/
  public IoK8sApiCoreV1Container tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.")
  @JsonProperty("tty")
  public Boolean isTty() {
    return tty;
  }
  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  /**
   * volumeDevices is the list of block devices to be used by the container. This is an alpha feature and may change in the future.
   **/
  public IoK8sApiCoreV1Container volumeDevices(List<IoK8sApiCoreV1VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
    return this;
  }

  
  @ApiModelProperty(value = "volumeDevices is the list of block devices to be used by the container. This is an alpha feature and may change in the future.")
  @JsonProperty("volumeDevices")
  public List<IoK8sApiCoreV1VolumeDevice> getVolumeDevices() {
    return volumeDevices;
  }
  public void setVolumeDevices(List<IoK8sApiCoreV1VolumeDevice> volumeDevices) {
    this.volumeDevices = volumeDevices;
  }

  /**
   * Pod volumes to mount into the container&#39;s filesystem. Cannot be updated.
   **/
  public IoK8sApiCoreV1Container volumeMounts(List<IoK8sApiCoreV1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
    return this;
  }

  
  @ApiModelProperty(value = "Pod volumes to mount into the container's filesystem. Cannot be updated.")
  @JsonProperty("volumeMounts")
  public List<IoK8sApiCoreV1VolumeMount> getVolumeMounts() {
    return volumeMounts;
  }
  public void setVolumeMounts(List<IoK8sApiCoreV1VolumeMount> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }

  /**
   * Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image. Cannot be updated.
   **/
  public IoK8sApiCoreV1Container workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  
  @ApiModelProperty(value = "Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.")
  @JsonProperty("workingDir")
  public String getWorkingDir() {
    return workingDir;
  }
  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Container ioK8sApiCoreV1Container = (IoK8sApiCoreV1Container) o;
    return Objects.equals(args, ioK8sApiCoreV1Container.args) &&
        Objects.equals(command, ioK8sApiCoreV1Container.command) &&
        Objects.equals(env, ioK8sApiCoreV1Container.env) &&
        Objects.equals(envFrom, ioK8sApiCoreV1Container.envFrom) &&
        Objects.equals(image, ioK8sApiCoreV1Container.image) &&
        Objects.equals(imagePullPolicy, ioK8sApiCoreV1Container.imagePullPolicy) &&
        Objects.equals(lifecycle, ioK8sApiCoreV1Container.lifecycle) &&
        Objects.equals(livenessProbe, ioK8sApiCoreV1Container.livenessProbe) &&
        Objects.equals(name, ioK8sApiCoreV1Container.name) &&
        Objects.equals(ports, ioK8sApiCoreV1Container.ports) &&
        Objects.equals(readinessProbe, ioK8sApiCoreV1Container.readinessProbe) &&
        Objects.equals(resources, ioK8sApiCoreV1Container.resources) &&
        Objects.equals(securityContext, ioK8sApiCoreV1Container.securityContext) &&
        Objects.equals(stdin, ioK8sApiCoreV1Container.stdin) &&
        Objects.equals(stdinOnce, ioK8sApiCoreV1Container.stdinOnce) &&
        Objects.equals(terminationMessagePath, ioK8sApiCoreV1Container.terminationMessagePath) &&
        Objects.equals(terminationMessagePolicy, ioK8sApiCoreV1Container.terminationMessagePolicy) &&
        Objects.equals(tty, ioK8sApiCoreV1Container.tty) &&
        Objects.equals(volumeDevices, ioK8sApiCoreV1Container.volumeDevices) &&
        Objects.equals(volumeMounts, ioK8sApiCoreV1Container.volumeMounts) &&
        Objects.equals(workingDir, ioK8sApiCoreV1Container.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, command, env, envFrom, image, imagePullPolicy, lifecycle, livenessProbe, name, ports, readinessProbe, resources, securityContext, stdin, stdinOnce, terminationMessagePath, terminationMessagePolicy, tty, volumeDevices, volumeMounts, workingDir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Container {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    terminationMessagePath: ").append(toIndentedString(terminationMessagePath)).append("\n");
    sb.append("    terminationMessagePolicy: ").append(toIndentedString(terminationMessagePolicy)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    volumeDevices: ").append(toIndentedString(volumeDevices)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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

