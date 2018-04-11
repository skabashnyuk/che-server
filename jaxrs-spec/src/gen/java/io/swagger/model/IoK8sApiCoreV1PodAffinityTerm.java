package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApimachineryPkgApisMetaV1LabelSelector;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key &lt;topologyKey&gt; matches that of any node on which a pod of the set of pods is running
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Defines a set of pods (namely those matching the labelSelector relative to the given namespace(s)) that this pod should be co-located (affinity) or not co-located (anti-affinity) with, where co-located is defined as running on a node whose value of the label with key <topologyKey> matches that of any node on which a pod of the set of pods is running")

public class IoK8sApiCoreV1PodAffinityTerm   {
  
  private @Valid IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector = null;
  private @Valid List<String> namespaces = new ArrayList<String>();
  private @Valid String topologyKey = null;

  /**
   * A label query over a set of resources, in this case pods.
   **/
  public IoK8sApiCoreV1PodAffinityTerm labelSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
    return this;
  }

  
  @ApiModelProperty(value = "A label query over a set of resources, in this case pods.")
  @JsonProperty("labelSelector")
  public IoK8sApimachineryPkgApisMetaV1LabelSelector getLabelSelector() {
    return labelSelector;
  }
  public void setLabelSelector(IoK8sApimachineryPkgApisMetaV1LabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }

  /**
   * namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means \&quot;this pod&#39;s namespace\&quot;
   **/
  public IoK8sApiCoreV1PodAffinityTerm namespaces(List<String> namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  
  @ApiModelProperty(value = "namespaces specifies which namespaces the labelSelector applies to (matches against); null or empty list means \"this pod's namespace\"")
  @JsonProperty("namespaces")
  public List<String> getNamespaces() {
    return namespaces;
  }
  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }

  /**
   * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
   **/
  public IoK8sApiCoreV1PodAffinityTerm topologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.")
  @JsonProperty("topologyKey")
  @NotNull
  public String getTopologyKey() {
    return topologyKey;
  }
  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PodAffinityTerm ioK8sApiCoreV1PodAffinityTerm = (IoK8sApiCoreV1PodAffinityTerm) o;
    return Objects.equals(labelSelector, ioK8sApiCoreV1PodAffinityTerm.labelSelector) &&
        Objects.equals(namespaces, ioK8sApiCoreV1PodAffinityTerm.namespaces) &&
        Objects.equals(topologyKey, ioK8sApiCoreV1PodAffinityTerm.topologyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, namespaces, topologyKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodAffinityTerm {\n");
    
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
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

