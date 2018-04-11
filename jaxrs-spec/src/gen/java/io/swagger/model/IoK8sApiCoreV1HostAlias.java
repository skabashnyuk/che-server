package io.swagger.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod&#39;s hosts file.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.")

public class IoK8sApiCoreV1HostAlias   {
  
  private @Valid List<String> hostnames = new ArrayList<String>();
  private @Valid String ip = null;

  /**
   * Hostnames for the above IP address.
   **/
  public IoK8sApiCoreV1HostAlias hostnames(List<String> hostnames) {
    this.hostnames = hostnames;
    return this;
  }

  
  @ApiModelProperty(value = "Hostnames for the above IP address.")
  @JsonProperty("hostnames")
  public List<String> getHostnames() {
    return hostnames;
  }
  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }

  /**
   * IP address of the host file entry.
   **/
  public IoK8sApiCoreV1HostAlias ip(String ip) {
    this.ip = ip;
    return this;
  }

  
  @ApiModelProperty(value = "IP address of the host file entry.")
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1HostAlias ioK8sApiCoreV1HostAlias = (IoK8sApiCoreV1HostAlias) o;
    return Objects.equals(hostnames, ioK8sApiCoreV1HostAlias.hostnames) &&
        Objects.equals(ip, ioK8sApiCoreV1HostAlias.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostnames, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1HostAlias {\n");
    
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

