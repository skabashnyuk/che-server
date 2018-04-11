package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ClientIPConfig;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * SessionAffinityConfig represents the configurations of session affinity.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "SessionAffinityConfig represents the configurations of session affinity.")

public class IoK8sApiCoreV1SessionAffinityConfig   {
  
  private @Valid IoK8sApiCoreV1ClientIPConfig clientIP = null;

  /**
   * clientIP contains the configurations of Client IP based session affinity.
   **/
  public IoK8sApiCoreV1SessionAffinityConfig clientIP(IoK8sApiCoreV1ClientIPConfig clientIP) {
    this.clientIP = clientIP;
    return this;
  }

  
  @ApiModelProperty(value = "clientIP contains the configurations of Client IP based session affinity.")
  @JsonProperty("clientIP")
  public IoK8sApiCoreV1ClientIPConfig getClientIP() {
    return clientIP;
  }
  public void setClientIP(IoK8sApiCoreV1ClientIPConfig clientIP) {
    this.clientIP = clientIP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1SessionAffinityConfig ioK8sApiCoreV1SessionAffinityConfig = (IoK8sApiCoreV1SessionAffinityConfig) o;
    return Objects.equals(clientIP, ioK8sApiCoreV1SessionAffinityConfig.clientIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SessionAffinityConfig {\n");
    
    sb.append("    clientIP: ").append(toIndentedString(clientIP)).append("\n");
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

