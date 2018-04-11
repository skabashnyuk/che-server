package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ObjectFieldSelector selects an APIVersioned field of an object.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ObjectFieldSelector selects an APIVersioned field of an object.")

public class IoK8sApiCoreV1ObjectFieldSelector   {
  
  private @Valid String apiVersion = null;
  private @Valid String fieldPath = null;

  /**
   * Version of the schema the FieldPath is written in terms of, defaults to \&quot;v1\&quot;.
   **/
  public IoK8sApiCoreV1ObjectFieldSelector apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  
  @ApiModelProperty(value = "Version of the schema the FieldPath is written in terms of, defaults to \"v1\".")
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * Path of the field to select in the specified API version.
   **/
  public IoK8sApiCoreV1ObjectFieldSelector fieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Path of the field to select in the specified API version.")
  @JsonProperty("fieldPath")
  @NotNull
  public String getFieldPath() {
    return fieldPath;
  }
  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ObjectFieldSelector ioK8sApiCoreV1ObjectFieldSelector = (IoK8sApiCoreV1ObjectFieldSelector) o;
    return Objects.equals(apiVersion, ioK8sApiCoreV1ObjectFieldSelector.apiVersion) &&
        Objects.equals(fieldPath, ioK8sApiCoreV1ObjectFieldSelector.fieldPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, fieldPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ObjectFieldSelector {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
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

