package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1NodeSelectorTerm;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it&#39;s a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "An empty preferred scheduling term matches all objects with implicit weight 0 (i.e. it's a no-op). A null preferred scheduling term matches no objects (i.e. is also a no-op).")

public class IoK8sApiCoreV1PreferredSchedulingTerm   {
  
  private @Valid IoK8sApiCoreV1NodeSelectorTerm preference = null;
  private @Valid Integer weight = null;

  /**
   * A node selector term, associated with the corresponding weight.
   **/
  public IoK8sApiCoreV1PreferredSchedulingTerm preference(IoK8sApiCoreV1NodeSelectorTerm preference) {
    this.preference = preference;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A node selector term, associated with the corresponding weight.")
  @JsonProperty("preference")
  @NotNull
  public IoK8sApiCoreV1NodeSelectorTerm getPreference() {
    return preference;
  }
  public void setPreference(IoK8sApiCoreV1NodeSelectorTerm preference) {
    this.preference = preference;
  }

  /**
   * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
   **/
  public IoK8sApiCoreV1PreferredSchedulingTerm weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.")
  @JsonProperty("weight")
  @NotNull
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PreferredSchedulingTerm ioK8sApiCoreV1PreferredSchedulingTerm = (IoK8sApiCoreV1PreferredSchedulingTerm) o;
    return Objects.equals(preference, ioK8sApiCoreV1PreferredSchedulingTerm.preference) &&
        Objects.equals(weight, ioK8sApiCoreV1PreferredSchedulingTerm.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preference, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PreferredSchedulingTerm {\n");
    
    sb.append("    preference: ").append(toIndentedString(preference)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

