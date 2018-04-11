package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1SELinuxOptions;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "PodSecurityContext holds pod-level security attributes and common container settings. Some fields are also present in container.securityContext.  Field values of container.securityContext take precedence over field values of PodSecurityContext.")

public class IoK8sApiCoreV1PodSecurityContext   {
  
  private @Valid Long fsGroup = null;
  private @Valid Boolean runAsNonRoot = null;
  private @Valid Long runAsUser = null;
  private @Valid IoK8sApiCoreV1SELinuxOptions seLinuxOptions = null;
  private @Valid List<Long> supplementalGroups = new ArrayList<Long>();

  /**
   * A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR&#39;d with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume.
   **/
  public IoK8sApiCoreV1PodSecurityContext fsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
    return this;
  }

  
  @ApiModelProperty(value = "A special supplemental group that applies to all containers in a pod. Some volume types allow the Kubelet to change the ownership of that volume to be owned by the pod:  1. The owning GID will be the FSGroup 2. The setgid bit is set (new files created in the volume will be owned by FSGroup) 3. The permission bits are OR'd with rw-rw----  If unset, the Kubelet will not modify the ownership and permissions of any volume.")
  @JsonProperty("fsGroup")
  public Long getFsGroup() {
    return fsGroup;
  }
  public void setFsGroup(Long fsGroup) {
    this.fsGroup = fsGroup;
  }

  /**
   * Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
   **/
  public IoK8sApiCoreV1PodSecurityContext runAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates that the container must run as a non-root user. If true, the Kubelet will validate the image at runtime to ensure that it does not run as UID 0 (root) and fail to start the container if it does. If unset or false, no such validation will be performed. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.")
  @JsonProperty("runAsNonRoot")
  public Boolean isRunAsNonRoot() {
    return runAsNonRoot;
  }
  public void setRunAsNonRoot(Boolean runAsNonRoot) {
    this.runAsNonRoot = runAsNonRoot;
  }

  /**
   * The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
   **/
  public IoK8sApiCoreV1PodSecurityContext runAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
    return this;
  }

  
  @ApiModelProperty(value = "The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
  @JsonProperty("runAsUser")
  public Long getRunAsUser() {
    return runAsUser;
  }
  public void setRunAsUser(Long runAsUser) {
    this.runAsUser = runAsUser;
  }

  /**
   * The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.
   **/
  public IoK8sApiCoreV1PodSecurityContext seLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
    return this;
  }

  
  @ApiModelProperty(value = "The SELinux context to be applied to all containers. If unspecified, the container runtime will allocate a random SELinux context for each container.  May also be set in SecurityContext.  If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence for that container.")
  @JsonProperty("seLinuxOptions")
  public IoK8sApiCoreV1SELinuxOptions getSeLinuxOptions() {
    return seLinuxOptions;
  }
  public void setSeLinuxOptions(IoK8sApiCoreV1SELinuxOptions seLinuxOptions) {
    this.seLinuxOptions = seLinuxOptions;
  }

  /**
   * A list of groups applied to the first process run in each container, in addition to the container&#39;s primary GID.  If unspecified, no groups will be added to any container.
   **/
  public IoK8sApiCoreV1PodSecurityContext supplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
    return this;
  }

  
  @ApiModelProperty(value = "A list of groups applied to the first process run in each container, in addition to the container's primary GID.  If unspecified, no groups will be added to any container.")
  @JsonProperty("supplementalGroups")
  public List<Long> getSupplementalGroups() {
    return supplementalGroups;
  }
  public void setSupplementalGroups(List<Long> supplementalGroups) {
    this.supplementalGroups = supplementalGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PodSecurityContext ioK8sApiCoreV1PodSecurityContext = (IoK8sApiCoreV1PodSecurityContext) o;
    return Objects.equals(fsGroup, ioK8sApiCoreV1PodSecurityContext.fsGroup) &&
        Objects.equals(runAsNonRoot, ioK8sApiCoreV1PodSecurityContext.runAsNonRoot) &&
        Objects.equals(runAsUser, ioK8sApiCoreV1PodSecurityContext.runAsUser) &&
        Objects.equals(seLinuxOptions, ioK8sApiCoreV1PodSecurityContext.seLinuxOptions) &&
        Objects.equals(supplementalGroups, ioK8sApiCoreV1PodSecurityContext.supplementalGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsGroup, runAsNonRoot, runAsUser, seLinuxOptions, supplementalGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodSecurityContext {\n");
    
    sb.append("    fsGroup: ").append(toIndentedString(fsGroup)).append("\n");
    sb.append("    runAsNonRoot: ").append(toIndentedString(runAsNonRoot)).append("\n");
    sb.append("    runAsUser: ").append(toIndentedString(runAsUser)).append("\n");
    sb.append("    seLinuxOptions: ").append(toIndentedString(seLinuxOptions)).append("\n");
    sb.append("    supplementalGroups: ").append(toIndentedString(supplementalGroups)).append("\n");
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

