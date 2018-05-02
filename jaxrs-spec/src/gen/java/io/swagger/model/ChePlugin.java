package io.swagger.model;

import io.swagger.model.PluginLicense;
import io.swagger.model.PluginOwner;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChePlugin   {
  
  private @Valid String name = null;
  private @Valid String version = null;
  private @Valid String title = null;
  private @Valid String createdAt = null;
  private @Valid String updatedAt = null;
  private @Valid Integer installationCount = null;
  private @Valid String description = null;
  private @Valid PluginLicense licese = null;
  private @Valid PluginOwner owner = null;

  /**
   * Plugin Name
   **/
  public ChePlugin name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "che-theia-ide", required = true, value = "Plugin Name")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Plugin version
   **/
  public ChePlugin version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "0.0.1", required = true, value = "Plugin version")
  @JsonProperty("version")
  @NotNull
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Plugin title
   **/
  public ChePlugin title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "Theia IDE service", required = true, value = "Plugin title")
  @JsonProperty("title")
  @NotNull
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Plugin created time
   **/
  public ChePlugin createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "2015-11-22T05:40:57Z", value = "Plugin created time")
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Plugin updated time
   **/
  public ChePlugin updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  
  @ApiModelProperty(example = "2018-04-22T00:27:28Z", value = "Plugin updated time")
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Plugin installation count
   **/
  public ChePlugin installationCount(Integer installationCount) {
    this.installationCount = installationCount;
    return this;
  }

  
  @ApiModelProperty(example = "88", value = "Plugin installation count")
  @JsonProperty("installation_count")
  public Integer getInstallationCount() {
    return installationCount;
  }
  public void setInstallationCount(Integer installationCount) {
    this.installationCount = installationCount;
  }

  /**
   * Plugin description
   **/
  public ChePlugin description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "Eclipse Che Theia IDE", required = true, value = "Plugin description")
  @JsonProperty("description")
  @NotNull
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public ChePlugin licese(PluginLicense licese) {
    this.licese = licese;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("licese")
  public PluginLicense getLicese() {
    return licese;
  }
  public void setLicese(PluginLicense licese) {
    this.licese = licese;
  }

  /**
   **/
  public ChePlugin owner(PluginOwner owner) {
    this.owner = owner;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("owner")
  @NotNull
  public PluginOwner getOwner() {
    return owner;
  }
  public void setOwner(PluginOwner owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChePlugin chePlugin = (ChePlugin) o;
    return Objects.equals(name, chePlugin.name) &&
        Objects.equals(version, chePlugin.version) &&
        Objects.equals(title, chePlugin.title) &&
        Objects.equals(createdAt, chePlugin.createdAt) &&
        Objects.equals(updatedAt, chePlugin.updatedAt) &&
        Objects.equals(installationCount, chePlugin.installationCount) &&
        Objects.equals(description, chePlugin.description) &&
        Objects.equals(licese, chePlugin.licese) &&
        Objects.equals(owner, chePlugin.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, title, createdAt, updatedAt, installationCount, description, licese, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChePlugin {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    installationCount: ").append(toIndentedString(installationCount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    licese: ").append(toIndentedString(licese)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

