package io.swagger.model;

import io.swagger.model.CheServiceReference;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheFeatureSpec   {
  
  private @Valid String version = null;
  private @Valid List<CheServiceReference> services = new ArrayList<CheServiceReference>();

  /**
   **/
  public CheFeatureSpec version(String version) {
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
  public CheFeatureSpec services(List<CheServiceReference> services) {
    this.services = services;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("services")
  @NotNull
  public List<CheServiceReference> getServices() {
    return services;
  }
  public void setServices(List<CheServiceReference> services) {
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
    CheFeatureSpec cheFeatureSpec = (CheFeatureSpec) o;
    return Objects.equals(version, cheFeatureSpec.version) &&
        Objects.equals(services, cheFeatureSpec.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheFeatureSpec {\n");
    
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

