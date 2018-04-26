package io.swagger.model;

import io.swagger.model.EnvVar;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Container   {
  
  private @Valid String image = null;
  private @Valid List<EnvVar> env = new ArrayList<EnvVar>();

  /**
   **/
  public Container image(String image) {
    this.image = image;
    return this;
  }

  
  @ApiModelProperty(example = "eclipse/che-theia:nightly", required = true, value = "")
  @JsonProperty("image")
  @NotNull
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * List of environment variables to set in the container. Cannot be updated.
   **/
  public Container env(List<EnvVar> env) {
    this.env = env;
    return this;
  }

  
  @ApiModelProperty(value = "List of environment variables to set in the container. Cannot be updated.")
  @JsonProperty("env")
  public List<EnvVar> getEnv() {
    return env;
  }
  public void setEnv(List<EnvVar> env) {
    this.env = env;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Container container = (Container) o;
    return Objects.equals(image, container.image) &&
        Objects.equals(env, container.env);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, env);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Container {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
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

