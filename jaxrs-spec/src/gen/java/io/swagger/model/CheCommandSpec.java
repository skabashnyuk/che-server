package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheCommandSpec   {
  
  private @Valid String targetLabelSelector = null;
  private @Valid String workingDir = null;
  private @Valid List<String> command = new ArrayList<String>();

  /**
   **/
  public CheCommandSpec targetLabelSelector(String targetLabelSelector) {
    this.targetLabelSelector = targetLabelSelector;
    return this;
  }

  
  @ApiModelProperty(example = "che.eclipse.org/container-name= theia-maven-sidecar", required = true, value = "")
  @JsonProperty("target-label-selector")
  @NotNull
  public String getTargetLabelSelector() {
    return targetLabelSelector;
  }
  public void setTargetLabelSelector(String targetLabelSelector) {
    this.targetLabelSelector = targetLabelSelector;
  }

  /**
   **/
  public CheCommandSpec workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  
  @ApiModelProperty(example = "$(project)", required = true, value = "")
  @JsonProperty("working-dir")
  @NotNull
  public String getWorkingDir() {
    return workingDir;
  }
  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }

  /**
   **/
  public CheCommandSpec command(List<String> command) {
    this.command = command;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("command")
  @NotNull
  public List<String> getCommand() {
    return command;
  }
  public void setCommand(List<String> command) {
    this.command = command;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheCommandSpec cheCommandSpec = (CheCommandSpec) o;
    return Objects.equals(targetLabelSelector, cheCommandSpec.targetLabelSelector) &&
        Objects.equals(workingDir, cheCommandSpec.workingDir) &&
        Objects.equals(command, cheCommandSpec.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetLabelSelector, workingDir, command);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheCommandSpec {\n");
    
    sb.append("    targetLabelSelector: ").append(toIndentedString(targetLabelSelector)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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

