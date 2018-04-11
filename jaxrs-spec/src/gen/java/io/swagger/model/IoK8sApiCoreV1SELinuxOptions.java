package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * SELinuxOptions are the labels to be applied to the container
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "SELinuxOptions are the labels to be applied to the container")

public class IoK8sApiCoreV1SELinuxOptions   {
  
  private @Valid String level = null;
  private @Valid String role = null;
  private @Valid String type = null;
  private @Valid String user = null;

  /**
   * Level is SELinux level label that applies to the container.
   **/
  public IoK8sApiCoreV1SELinuxOptions level(String level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(value = "Level is SELinux level label that applies to the container.")
  @JsonProperty("level")
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }

  /**
   * Role is a SELinux role label that applies to the container.
   **/
  public IoK8sApiCoreV1SELinuxOptions role(String role) {
    this.role = role;
    return this;
  }

  
  @ApiModelProperty(value = "Role is a SELinux role label that applies to the container.")
  @JsonProperty("role")
  public String getRole() {
    return role;
  }
  public void setRole(String role) {
    this.role = role;
  }

  /**
   * Type is a SELinux type label that applies to the container.
   **/
  public IoK8sApiCoreV1SELinuxOptions type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Type is a SELinux type label that applies to the container.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * User is a SELinux user label that applies to the container.
   **/
  public IoK8sApiCoreV1SELinuxOptions user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "User is a SELinux user label that applies to the container.")
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1SELinuxOptions ioK8sApiCoreV1SELinuxOptions = (IoK8sApiCoreV1SELinuxOptions) o;
    return Objects.equals(level, ioK8sApiCoreV1SELinuxOptions.level) &&
        Objects.equals(role, ioK8sApiCoreV1SELinuxOptions.role) &&
        Objects.equals(type, ioK8sApiCoreV1SELinuxOptions.type) &&
        Objects.equals(user, ioK8sApiCoreV1SELinuxOptions.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, role, type, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1SELinuxOptions {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

