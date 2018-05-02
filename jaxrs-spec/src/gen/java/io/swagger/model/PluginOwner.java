package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PluginOwner   {
  
  private @Valid String name = null;
  private @Valid String avatarUrl = null;
  private @Valid String gravatarId = null;
  private @Valid String url = null;

  /**
   * Plugin owner
   **/
  public PluginOwner name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "RedHat", required = true, value = "Plugin owner")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Owner awatar url
   **/
  public PluginOwner avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Owner awatar url")
  @JsonProperty("avatar_url")
  public String getAvatarUrl() {
    return avatarUrl;
  }
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  /**
   * Owner gravatar id
   **/
  public PluginOwner gravatarId(String gravatarId) {
    this.gravatarId = gravatarId;
    return this;
  }

  
  @ApiModelProperty(value = "Owner gravatar id")
  @JsonProperty("gravatar_id")
  public String getGravatarId() {
    return gravatarId;
  }
  public void setGravatarId(String gravatarId) {
    this.gravatarId = gravatarId;
  }

  /**
   * Owner url
   **/
  public PluginOwner url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "https://redhat.com", value = "Owner url")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginOwner pluginOwner = (PluginOwner) o;
    return Objects.equals(name, pluginOwner.name) &&
        Objects.equals(avatarUrl, pluginOwner.avatarUrl) &&
        Objects.equals(gravatarId, pluginOwner.gravatarId) &&
        Objects.equals(url, pluginOwner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, avatarUrl, gravatarId, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginOwner {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

