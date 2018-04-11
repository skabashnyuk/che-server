package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1NodeSelectorTerm;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.")

public class IoK8sApiCoreV1NodeSelector   {
  
  private @Valid List<IoK8sApiCoreV1NodeSelectorTerm> nodeSelectorTerms = new ArrayList<IoK8sApiCoreV1NodeSelectorTerm>();

  /**
   * Required. A list of node selector terms. The terms are ORed.
   **/
  public IoK8sApiCoreV1NodeSelector nodeSelectorTerms(List<IoK8sApiCoreV1NodeSelectorTerm> nodeSelectorTerms) {
    this.nodeSelectorTerms = nodeSelectorTerms;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Required. A list of node selector terms. The terms are ORed.")
  @JsonProperty("nodeSelectorTerms")
  @NotNull
  public List<IoK8sApiCoreV1NodeSelectorTerm> getNodeSelectorTerms() {
    return nodeSelectorTerms;
  }
  public void setNodeSelectorTerms(List<IoK8sApiCoreV1NodeSelectorTerm> nodeSelectorTerms) {
    this.nodeSelectorTerms = nodeSelectorTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1NodeSelector ioK8sApiCoreV1NodeSelector = (IoK8sApiCoreV1NodeSelector) o;
    return Objects.equals(nodeSelectorTerms, ioK8sApiCoreV1NodeSelector.nodeSelectorTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeSelectorTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeSelector {\n");
    
    sb.append("    nodeSelectorTerms: ").append(toIndentedString(nodeSelectorTerms)).append("\n");
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

