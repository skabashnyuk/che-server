package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1NodeSelectorRequirement;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * A null or empty node selector term matches no objects.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "A null or empty node selector term matches no objects.")

public class IoK8sApiCoreV1NodeSelectorTerm   {
  
  private @Valid List<IoK8sApiCoreV1NodeSelectorRequirement> matchExpressions = new ArrayList<IoK8sApiCoreV1NodeSelectorRequirement>();

  /**
   * Required. A list of node selector requirements. The requirements are ANDed.
   **/
  public IoK8sApiCoreV1NodeSelectorTerm matchExpressions(List<IoK8sApiCoreV1NodeSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Required. A list of node selector requirements. The requirements are ANDed.")
  @JsonProperty("matchExpressions")
  @NotNull
  public List<IoK8sApiCoreV1NodeSelectorRequirement> getMatchExpressions() {
    return matchExpressions;
  }
  public void setMatchExpressions(List<IoK8sApiCoreV1NodeSelectorRequirement> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1NodeSelectorTerm ioK8sApiCoreV1NodeSelectorTerm = (IoK8sApiCoreV1NodeSelectorTerm) o;
    return Objects.equals(matchExpressions, ioK8sApiCoreV1NodeSelectorTerm.matchExpressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeSelectorTerm {\n");
    
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
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

