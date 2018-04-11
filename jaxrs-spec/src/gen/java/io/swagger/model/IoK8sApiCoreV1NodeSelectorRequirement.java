package io.swagger.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "A node selector requirement is a selector that contains values, a key, and an operator that relates the key and values.")

public class IoK8sApiCoreV1NodeSelectorRequirement   {
  
  private @Valid String key = null;
  private @Valid String operator = null;
  private @Valid List<String> values = new ArrayList<String>();

  /**
   * The label key that the selector applies to.
   **/
  public IoK8sApiCoreV1NodeSelectorRequirement key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The label key that the selector applies to.")
  @JsonProperty("key")
  @NotNull
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Represents a key&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.
   **/
  public IoK8sApiCoreV1NodeSelectorRequirement operator(String operator) {
    this.operator = operator;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist. Gt, and Lt.")
  @JsonProperty("operator")
  @NotNull
  public String getOperator() {
    return operator;
  }
  public void setOperator(String operator) {
    this.operator = operator;
  }

  /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.
   **/
  public IoK8sApiCoreV1NodeSelectorRequirement values(List<String> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(value = "An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. If the operator is Gt or Lt, the values array must have a single element, which will be interpreted as an integer. This array is replaced during a strategic merge patch.")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1NodeSelectorRequirement ioK8sApiCoreV1NodeSelectorRequirement = (IoK8sApiCoreV1NodeSelectorRequirement) o;
    return Objects.equals(key, ioK8sApiCoreV1NodeSelectorRequirement.key) &&
        Objects.equals(operator, ioK8sApiCoreV1NodeSelectorRequirement.operator) &&
        Objects.equals(values, ioK8sApiCoreV1NodeSelectorRequirement.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, operator, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeSelectorRequirement {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

