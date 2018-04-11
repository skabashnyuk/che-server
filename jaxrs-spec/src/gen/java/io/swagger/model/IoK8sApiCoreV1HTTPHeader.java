package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * HTTPHeader describes a custom header to be used in HTTP probes
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "HTTPHeader describes a custom header to be used in HTTP probes")

public class IoK8sApiCoreV1HTTPHeader   {
  
  private @Valid String name = null;
  private @Valid String value = null;

  /**
   * The header field name
   **/
  public IoK8sApiCoreV1HTTPHeader name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The header field name")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The header field value
   **/
  public IoK8sApiCoreV1HTTPHeader value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The header field value")
  @JsonProperty("value")
  @NotNull
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1HTTPHeader ioK8sApiCoreV1HTTPHeader = (IoK8sApiCoreV1HTTPHeader) o;
    return Objects.equals(name, ioK8sApiCoreV1HTTPHeader.name) &&
        Objects.equals(value, ioK8sApiCoreV1HTTPHeader.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1HTTPHeader {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

