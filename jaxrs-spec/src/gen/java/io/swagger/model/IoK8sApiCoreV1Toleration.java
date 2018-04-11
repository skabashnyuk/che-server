package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * The pod this Toleration is attached to tolerates any taint that matches the triple &lt;key,value,effect&gt; using the matching operator &lt;operator&gt;.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.")

public class IoK8sApiCoreV1Toleration   {
  
  private @Valid String effect = null;
  private @Valid String key = null;
  private @Valid String operator = null;
  private @Valid Long tolerationSeconds = null;
  private @Valid String value = null;

  /**
   * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
   **/
  public IoK8sApiCoreV1Toleration effect(String effect) {
    this.effect = effect;
    return this;
  }

  
  @ApiModelProperty(value = "Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.")
  @JsonProperty("effect")
  public String getEffect() {
    return effect;
  }
  public void setEffect(String effect) {
    this.effect = effect;
  }

  /**
   * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
   **/
  public IoK8sApiCoreV1Toleration key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(value = "Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Operator represents a key&#39;s relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
   **/
  public IoK8sApiCoreV1Toleration operator(String operator) {
    this.operator = operator;
    return this;
  }

  
  @ApiModelProperty(value = "Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.")
  @JsonProperty("operator")
  public String getOperator() {
    return operator;
  }
  public void setOperator(String operator) {
    this.operator = operator;
  }

  /**
   * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
   **/
  public IoK8sApiCoreV1Toleration tolerationSeconds(Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
    return this;
  }

  
  @ApiModelProperty(value = "TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.")
  @JsonProperty("tolerationSeconds")
  public Long getTolerationSeconds() {
    return tolerationSeconds;
  }
  public void setTolerationSeconds(Long tolerationSeconds) {
    this.tolerationSeconds = tolerationSeconds;
  }

  /**
   * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
   **/
  public IoK8sApiCoreV1Toleration value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(value = "Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Toleration ioK8sApiCoreV1Toleration = (IoK8sApiCoreV1Toleration) o;
    return Objects.equals(effect, ioK8sApiCoreV1Toleration.effect) &&
        Objects.equals(key, ioK8sApiCoreV1Toleration.key) &&
        Objects.equals(operator, ioK8sApiCoreV1Toleration.operator) &&
        Objects.equals(tolerationSeconds, ioK8sApiCoreV1Toleration.tolerationSeconds) &&
        Objects.equals(value, ioK8sApiCoreV1Toleration.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effect, key, operator, tolerationSeconds, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Toleration {\n");
    
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    tolerationSeconds: ").append(toIndentedString(tolerationSeconds)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

