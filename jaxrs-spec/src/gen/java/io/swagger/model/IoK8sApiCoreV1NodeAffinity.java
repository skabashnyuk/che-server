package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1NodeSelector;
import io.swagger.model.IoK8sApiCoreV1PreferredSchedulingTerm;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Node affinity is a group of node affinity scheduling rules.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Node affinity is a group of node affinity scheduling rules.")

public class IoK8sApiCoreV1NodeAffinity   {
  
  private @Valid List<IoK8sApiCoreV1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution = new ArrayList<IoK8sApiCoreV1PreferredSchedulingTerm>();
  private @Valid IoK8sApiCoreV1NodeSelector requiredDuringSchedulingIgnoredDuringExecution = null;

  /**
   * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \&quot;weight\&quot; to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.
   **/
  public IoK8sApiCoreV1NodeAffinity preferredDuringSchedulingIgnoredDuringExecution(List<IoK8sApiCoreV1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  
  @ApiModelProperty(value = "The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \"weight\" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.")
  @JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
  public List<IoK8sApiCoreV1PreferredSchedulingTerm> getPreferredDuringSchedulingIgnoredDuringExecution() {
    return preferredDuringSchedulingIgnoredDuringExecution;
  }
  public void setPreferredDuringSchedulingIgnoredDuringExecution(List<IoK8sApiCoreV1PreferredSchedulingTerm> preferredDuringSchedulingIgnoredDuringExecution) {
    this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
  }

  /**
   * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.
   **/
  public IoK8sApiCoreV1NodeAffinity requiredDuringSchedulingIgnoredDuringExecution(IoK8sApiCoreV1NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    return this;
  }

  
  @ApiModelProperty(value = "If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.")
  @JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
  public IoK8sApiCoreV1NodeSelector getRequiredDuringSchedulingIgnoredDuringExecution() {
    return requiredDuringSchedulingIgnoredDuringExecution;
  }
  public void setRequiredDuringSchedulingIgnoredDuringExecution(IoK8sApiCoreV1NodeSelector requiredDuringSchedulingIgnoredDuringExecution) {
    this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1NodeAffinity ioK8sApiCoreV1NodeAffinity = (IoK8sApiCoreV1NodeAffinity) o;
    return Objects.equals(preferredDuringSchedulingIgnoredDuringExecution, ioK8sApiCoreV1NodeAffinity.preferredDuringSchedulingIgnoredDuringExecution) &&
        Objects.equals(requiredDuringSchedulingIgnoredDuringExecution, ioK8sApiCoreV1NodeAffinity.requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferredDuringSchedulingIgnoredDuringExecution, requiredDuringSchedulingIgnoredDuringExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1NodeAffinity {\n");
    
    sb.append("    preferredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(preferredDuringSchedulingIgnoredDuringExecution)).append("\n");
    sb.append("    requiredDuringSchedulingIgnoredDuringExecution: ").append(toIndentedString(requiredDuringSchedulingIgnoredDuringExecution)).append("\n");
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

