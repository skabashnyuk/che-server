package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1HTTPHeader;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * HTTPGetAction describes an action based on HTTP Get requests.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "HTTPGetAction describes an action based on HTTP Get requests.")

public class IoK8sApiCoreV1HTTPGetAction   {
  
  private @Valid String host = null;
  private @Valid List<IoK8sApiCoreV1HTTPHeader> httpHeaders = new ArrayList<IoK8sApiCoreV1HTTPHeader>();
  private @Valid String path = null;
  private @Valid String port = null;
  private @Valid String scheme = null;

  /**
   * Host name to connect to, defaults to the pod IP. You probably want to set \&quot;Host\&quot; in httpHeaders instead.
   **/
  public IoK8sApiCoreV1HTTPGetAction host(String host) {
    this.host = host;
    return this;
  }

  
  @ApiModelProperty(value = "Host name to connect to, defaults to the pod IP. You probably want to set \"Host\" in httpHeaders instead.")
  @JsonProperty("host")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }

  /**
   * Custom headers to set in the request. HTTP allows repeated headers.
   **/
  public IoK8sApiCoreV1HTTPGetAction httpHeaders(List<IoK8sApiCoreV1HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
    return this;
  }

  
  @ApiModelProperty(value = "Custom headers to set in the request. HTTP allows repeated headers.")
  @JsonProperty("httpHeaders")
  public List<IoK8sApiCoreV1HTTPHeader> getHttpHeaders() {
    return httpHeaders;
  }
  public void setHttpHeaders(List<IoK8sApiCoreV1HTTPHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
  }

  /**
   * Path to access on the HTTP server.
   **/
  public IoK8sApiCoreV1HTTPGetAction path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(value = "Path to access on the HTTP server.")
  @JsonProperty("path")
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }

  /**
   * Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
   **/
  public IoK8sApiCoreV1HTTPGetAction port(String port) {
    this.port = port;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.")
  @JsonProperty("port")
  @NotNull
  public String getPort() {
    return port;
  }
  public void setPort(String port) {
    this.port = port;
  }

  /**
   * Scheme to use for connecting to the host. Defaults to HTTP.
   **/
  public IoK8sApiCoreV1HTTPGetAction scheme(String scheme) {
    this.scheme = scheme;
    return this;
  }

  
  @ApiModelProperty(value = "Scheme to use for connecting to the host. Defaults to HTTP.")
  @JsonProperty("scheme")
  public String getScheme() {
    return scheme;
  }
  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1HTTPGetAction ioK8sApiCoreV1HTTPGetAction = (IoK8sApiCoreV1HTTPGetAction) o;
    return Objects.equals(host, ioK8sApiCoreV1HTTPGetAction.host) &&
        Objects.equals(httpHeaders, ioK8sApiCoreV1HTTPGetAction.httpHeaders) &&
        Objects.equals(path, ioK8sApiCoreV1HTTPGetAction.path) &&
        Objects.equals(port, ioK8sApiCoreV1HTTPGetAction.port) &&
        Objects.equals(scheme, ioK8sApiCoreV1HTTPGetAction.scheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, httpHeaders, path, port, scheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1HTTPGetAction {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
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

