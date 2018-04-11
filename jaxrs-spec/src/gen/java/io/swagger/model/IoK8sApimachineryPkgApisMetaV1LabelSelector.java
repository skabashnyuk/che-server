package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.")

public class IoK8sApimachineryPkgApisMetaV1LabelSelector   {
  
  private @Valid List<IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement> matchExpressions = new ArrayList<IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement>();
  private @Valid Map<String, String> matchLabels = new HashMap<String, String>();

  /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
   **/
  public IoK8sApimachineryPkgApisMetaV1LabelSelector matchExpressions(List<IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  
  @ApiModelProperty(value = "matchExpressions is a list of label selector requirements. The requirements are ANDed.")
  @JsonProperty("matchExpressions")
  public List<IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }
  public void setMatchExpressions(List<IoK8sApimachineryPkgApisMetaV1LabelSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }

  /**
   * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \&quot;key\&quot;, the operator is \&quot;In\&quot;, and the values array contains only \&quot;value\&quot;. The requirements are ANDed.
   **/
  public IoK8sApimachineryPkgApisMetaV1LabelSelector matchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
    return this;
  }

  
  @ApiModelProperty(value = "matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")
  @JsonProperty("matchLabels")
  public Map<String, String> getMatchLabels() {
    return matchLabels;
  }
  public void setMatchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1LabelSelector ioK8sApimachineryPkgApisMetaV1LabelSelector = (IoK8sApimachineryPkgApisMetaV1LabelSelector) o;
    return Objects.equals(matchExpressions, ioK8sApimachineryPkgApisMetaV1LabelSelector.matchExpressions) &&
        Objects.equals(matchLabels, ioK8sApimachineryPkgApisMetaV1LabelSelector.matchLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1LabelSelector {\n");
    
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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

