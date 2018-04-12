package io.swagger.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ObjectMeta   {
  
  private @Valid String name = null;
  private @Valid Map<String, String> labels = new HashMap<String, String>();

  /**
   * Object name. Name must be unique.
   **/
  public ObjectMeta name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "org.eclipse.che.theia.git", required = true, value = "Object name. Name must be unique.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
   **/
  public ObjectMeta labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(value = "Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels")
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectMeta objectMeta = (ObjectMeta) o;
    return Objects.equals(name, objectMeta.name) &&
        Objects.equals(labels, objectMeta.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectMeta {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

