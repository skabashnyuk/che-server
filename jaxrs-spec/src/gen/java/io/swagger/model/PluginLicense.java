package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PluginLicense   {
  
  private @Valid String key = null;
  private @Valid String name = null;
  private @Valid String url = null;

  /**
   * License key
   **/
  public PluginLicense key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(example = "mit", required = true, value = "License key")
  @JsonProperty("key")
  @NotNull
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * License Name
   **/
  public PluginLicense name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "MIT License", required = true, value = "License Name")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * License url
   **/
  public PluginLicense url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "https://api.github.com/licenses/mit", required = true, value = "License url")
  @JsonProperty("url")
  @NotNull
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
    PluginLicense pluginLicense = (PluginLicense) o;
    return Objects.equals(key, pluginLicense.key) &&
        Objects.equals(name, pluginLicense.name) &&
        Objects.equals(url, pluginLicense.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginLicense {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

