package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1ConfigMapProjection;
import io.swagger.model.IoK8sApiCoreV1DownwardAPIProjection;
import io.swagger.model.IoK8sApiCoreV1SecretProjection;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Projection that may be projected along with other supported volume types
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Projection that may be projected along with other supported volume types")

public class IoK8sApiCoreV1VolumeProjection   {
  
  private @Valid IoK8sApiCoreV1ConfigMapProjection configMap = null;
  private @Valid IoK8sApiCoreV1DownwardAPIProjection downwardAPI = null;
  private @Valid IoK8sApiCoreV1SecretProjection secret = null;

  /**
   * information about the configMap data to project
   **/
  public IoK8sApiCoreV1VolumeProjection configMap(IoK8sApiCoreV1ConfigMapProjection configMap) {
    this.configMap = configMap;
    return this;
  }

  
  @ApiModelProperty(value = "information about the configMap data to project")
  @JsonProperty("configMap")
  public IoK8sApiCoreV1ConfigMapProjection getConfigMap() {
    return configMap;
  }
  public void setConfigMap(IoK8sApiCoreV1ConfigMapProjection configMap) {
    this.configMap = configMap;
  }

  /**
   * information about the downwardAPI data to project
   **/
  public IoK8sApiCoreV1VolumeProjection downwardAPI(IoK8sApiCoreV1DownwardAPIProjection downwardAPI) {
    this.downwardAPI = downwardAPI;
    return this;
  }

  
  @ApiModelProperty(value = "information about the downwardAPI data to project")
  @JsonProperty("downwardAPI")
  public IoK8sApiCoreV1DownwardAPIProjection getDownwardAPI() {
    return downwardAPI;
  }
  public void setDownwardAPI(IoK8sApiCoreV1DownwardAPIProjection downwardAPI) {
    this.downwardAPI = downwardAPI;
  }

  /**
   * information about the secret data to project
   **/
  public IoK8sApiCoreV1VolumeProjection secret(IoK8sApiCoreV1SecretProjection secret) {
    this.secret = secret;
    return this;
  }

  
  @ApiModelProperty(value = "information about the secret data to project")
  @JsonProperty("secret")
  public IoK8sApiCoreV1SecretProjection getSecret() {
    return secret;
  }
  public void setSecret(IoK8sApiCoreV1SecretProjection secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1VolumeProjection ioK8sApiCoreV1VolumeProjection = (IoK8sApiCoreV1VolumeProjection) o;
    return Objects.equals(configMap, ioK8sApiCoreV1VolumeProjection.configMap) &&
        Objects.equals(downwardAPI, ioK8sApiCoreV1VolumeProjection.downwardAPI) &&
        Objects.equals(secret, ioK8sApiCoreV1VolumeProjection.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMap, downwardAPI, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1VolumeProjection {\n");
    
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

