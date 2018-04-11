package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1Capabilities;
import io.swagger.model.IoK8sApiCoreV1SELinuxOptions;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext.  When both are set, the values in SecurityContext take precedence.")

public class IoK8sApiCoreV1SecurityContext   {
  
  private @Valid Boolean allowPrivilegeEscalation = null;
  private @Valid IoK8sApiCoreV1Capabilities capabilities = null;
  private @Valid Boolean privileged = null;
  private @Valid Boolean readOnlyRootFilesystem = null;
  private @Valid Boolean runAsNonRoot = null;
  private @Valid Long runAsUser = null;
  private @Valid IoK8sApiCoreV1SELinuxOptions seLinuxOptions = null;

  /**
   * AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN
   **/
  public IoK8sApiCoreV1SecurityContext allowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    return this;
  }

  
  @ApiModelProperty(value = "AllowPrivilegeEscalation controls whether a process can gain more privileges than its parent process. This bool directly controls if the no_new_privs flag will be set on the container process. AllowPrivilegeEscalation is true always when the container is: 1) run as Privileged 2) has CAP_SYS_ADMIN")
  @JsonProperty("allowPrivilegeEscalation")
  public Boolean isAllowPrivilegeEscalation() {
    return allowPrivilegeEscalation;
  }
  public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
    this.allowPrivilegeEscalation = allowPrivilegeEscalation;
  }

  /**
   * The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime.
   **/
  public IoK8sApiCoreV1SecurityContext capabilities(IoK8sApiCoreV1Capabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  
  @ApiModelProperty(value = "The capabilities to add/drop when running containers. Defaults to the default set of capabilities granted by the container runtime.")
  @JsonProperty("capabilities")
  public IoK8sApiCoreV1Capabilities getCapabilities() {
    return capabilities;
  }
  public void setCapabilities(IoK8sApiCoreV1Capabilities capabilities) {
    this.capabilities = capabilities;
  }

  /**
   * Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.
   **/
  public IoK8sApiCoreV1SecurityContext privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  
  @ApiModelProperty(value = "Run container in privileged mode. Processes in privileged containers are essentially equivalent to root on the host. Defaults to false.")
  @JsonProperty("privileged")
  public Boolean isPrivileged() {
    return privileged;
  }
  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  /**
   * Whether this container has a read-only root filesystem. Default is false.
   **/
  public IoK8sApiCoreV1SecurityContext readOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    return this;
  }

  
  @ApiModelProperty(value = "Whether this container has a read-only root filesystem. Default is false.")
  @JsonProperty("readOnlyRootFilesystem")
  public Boolean isReadOnlyRootFilesystem() {
    return readOnlyRootFilesystem;
  }
  public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
    this.readOnlyRootFilesystem = readOnlyRootFilesystem;
  }

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   **/
  public IoK8sApiCoreV1SecurityContext runAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  @JsonProperty("runAsNonRoot")
  public Boolean isRunAsNonRoot() {
    return runAsNonRoot;
  }
  public void setRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   **/
  public IoK8sApiCoreV1SecurityContext runAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

  
  @ApiModelProperty(value = "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  @JsonProperty("runAsUser")
  public Long getRunAsUser() {
    return runAsUser;
  }
  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }

  /**
   * The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   **/
  public IoK8sApiCoreV1SecurityContext seLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

  
  @ApiModelProperty(value = "The SELinux context to be applied to the container. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in PodSecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  @JsonProperty("seLinuxOptions")
  public IoK8sApiCoreV1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }
  public void setSeLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1SecurityContext ioK8sApiCoreV1SecurityContext = (IoK8sApiCoreV1SecurityContext) o;
    return Objects.equals(allowPrivilegeEscalation, ioK8sApiCoreV1SecurityContext.allowPrivilegeEscalation) &&
        Objects.equals(capabilities, ioK8sApiCoreV1SecurityContext.capabilities) &&
        Objects.equals(privileged, ioK8sApiCoreV1SecurityContext.privileged) &&
        Objects.equals(readOnlyRootFilesystem, ioK8sApiCoreV1SecurityContext.readOnlyRootFilesystem) &&
        Objects.equals(runAsNonRoot, ioK8sApiCoreV1SecurityContext.runAsNonRoot) &&
        Objects.equals(runAsUser, ioK8sApiCoreV1SecurityContext.runAsUser) &&
        Objects.equals(seLinuxOptions, ioK8sApiCoreV1SecurityContext.seLinuxOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowPrivilegeEscalation, capabilities, privileged, readOnlyRootFilesystem, runAsNonRoot, runAsUser, seLinuxOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SecurityContext {\n");
    
    sb.append("    allowPrivilegeEscalation: ").append(toIndentedString(allowPrivilegeEscalation)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    readOnlyRootFilesystem: ").append(toIndentedString(readOnlyRootFilesystem)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
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

