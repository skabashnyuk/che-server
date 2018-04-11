package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1KeyToPath;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Adapts a ConfigMap into a projected volume.  The contents of the target ConfigMap&#39;s Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Adapts a ConfigMap into a projected volume.  The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.")

public class IoK8sApiCoreV1ConfigMapProjection   {
  
  private @Valid List<IoK8sApiCoreV1KeyToPath> items = new ArrayList<IoK8sApiCoreV1KeyToPath>();
  private @Valid String name = null;
  private @Valid Boolean optional = null;

  /**
   * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   **/
  public IoK8sApiCoreV1ConfigMapProjection items(List<IoK8sApiCoreV1KeyToPath> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")
  @JsonProperty("items")
  public List<IoK8sApiCoreV1KeyToPath> getItems() {
    return items;
  }
  public void setItems(List<IoK8sApiCoreV1KeyToPath> items) {
    this.items = items;
  }

  /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   **/
  public IoK8sApiCoreV1ConfigMapProjection name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Specify whether the ConfigMap or it&#39;s keys must be defined
   **/
  public IoK8sApiCoreV1ConfigMapProjection optional(Boolean optional) {
    this.optional = optional;
    return this;
  }

  
  @ApiModelProperty(value = "Specify whether the ConfigMap or it's keys must be defined")
  @JsonProperty("optional")
  public Boolean isOptional() {
    return optional;
  }
  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ConfigMapProjection ioK8sApiCoreV1ConfigMapProjection = (IoK8sApiCoreV1ConfigMapProjection) o;
    return Objects.equals(items, ioK8sApiCoreV1ConfigMapProjection.items) &&
        Objects.equals(name, ioK8sApiCoreV1ConfigMapProjection.name) &&
        Objects.equals(optional, ioK8sApiCoreV1ConfigMapProjection.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, name, optional);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ConfigMapProjection {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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

