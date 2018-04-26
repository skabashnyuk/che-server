package io.swagger.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Command   {
  
  private @Valid String name = null;
  private @Valid String workingDir = null;
  private @Valid List<String> command = new ArrayList<String>();

  /**
   **/
  public Command name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "build", required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Command workingDir(String workingDir) {
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
  public Command command(List<String> command) {
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
    Command command = (Command) o;
    return Objects.equals(name, command.name) &&
        Objects.equals(workingDir, command.workingDir) &&
        Objects.equals(command, command.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, workingDir, command);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Command {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

