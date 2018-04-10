package io.swagger.model;

import io.swagger.model.CheServiceParameter;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheServiceReference   {
  
  private @Valid String name = null;
  private @Valid String version = null;
  private @Valid List<CheServiceParameter> services = new ArrayList<CheServiceParameter>();

  /**
   **/
  public CheServiceReference name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "o.typefox.theia-ide.che-service.mainpod", required = true, value = "")
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
  public CheServiceReference version(String version) {
    this.version = version;
    return this;
  }

  
  @ApiModelProperty(example = "51.233", required = true, value = "")
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
  public CheServiceReference services(List<CheServiceParameter> services) {
    this.services = services;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("services")
  public List<CheServiceParameter> getServices() {
    return services;
  }
  public void setServices(List<CheServiceParameter> services) {
    this.services = services;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheServiceReference cheServiceReference = (CheServiceReference) o;
    return Objects.equals(name, cheServiceReference.name) &&
        Objects.equals(version, cheServiceReference.version) &&
        Objects.equals(services, cheServiceReference.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheServiceReference {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

