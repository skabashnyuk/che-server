package io.swagger.model;

import io.swagger.model.CheCommand;
import io.swagger.model.IoK8sApiCoreV1Pod;
import io.swagger.model.IoK8sApiCoreV1Service;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheServiceSpec   {
  
  private @Valid String version = null;
  private @Valid List<IoK8sApiCoreV1Service> services = new ArrayList<IoK8sApiCoreV1Service>();
  private @Valid List<IoK8sApiCoreV1Pod> pods = new ArrayList<IoK8sApiCoreV1Pod>();
  private @Valid List<CheCommand> commands = new ArrayList<CheCommand>();

  /**
   **/
  public CheServiceSpec version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "1.0.0", required = true, value = "")
  @JsonProperty("version")
  @NotNull
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   **/
  public CheServiceSpec services(List<IoK8sApiCoreV1Service> services) {
    this.services = services;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("services")
  @NotNull
  public List<IoK8sApiCoreV1Service> getServices() {
    return services;
  }
  public void setServices(List<IoK8sApiCoreV1Service> services) {
    this.services = services;
  }

  /**
   **/
  public CheServiceSpec pods(List<IoK8sApiCoreV1Pod> pods) {
    this.pods = pods;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("pods")
  @NotNull
  public List<IoK8sApiCoreV1Pod> getPods() {
    return pods;
  }
  public void setPods(List<IoK8sApiCoreV1Pod> pods) {
    this.pods = pods;
  }

  /**
   **/
  public CheServiceSpec commands(List<CheCommand> commands) {
    this.commands = commands;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("commands")
  @NotNull
  public List<CheCommand> getCommands() {
    return commands;
  }
  public void setCommands(List<CheCommand> commands) {
    this.commands = commands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheServiceSpec cheServiceSpec = (CheServiceSpec) o;
    return Objects.equals(version, cheServiceSpec.version) &&
        Objects.equals(services, cheServiceSpec.services) &&
        Objects.equals(pods, cheServiceSpec.pods) &&
        Objects.equals(commands, cheServiceSpec.commands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, services, pods, commands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheServiceSpec {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    commands: ").append(toIndentedString(commands)).append("\n");
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

