package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApimachineryPkgApisMetaV1Initializer;
import io.swagger.model.IoK8sApimachineryPkgApisMetaV1Status;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Initializers tracks the progress of initialization.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Initializers tracks the progress of initialization.")

public class IoK8sApimachineryPkgApisMetaV1Initializers   {
  
  private @Valid List<IoK8sApimachineryPkgApisMetaV1Initializer> pending = new ArrayList<IoK8sApimachineryPkgApisMetaV1Initializer>();
  private @Valid IoK8sApimachineryPkgApisMetaV1Status result = null;

  /**
   * Pending is a list of initializers that must execute in order before this object is visible. When the last pending initializer is removed, and no failing result is set, the initializers struct will be set to nil and the object is considered as initialized and visible to all clients.
   **/
  public IoK8sApimachineryPkgApisMetaV1Initializers pending(List<IoK8sApimachineryPkgApisMetaV1Initializer> pending) {
    this.pending = pending;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Pending is a list of initializers that must execute in order before this object is visible. When the last pending initializer is removed, and no failing result is set, the initializers struct will be set to nil and the object is considered as initialized and visible to all clients.")
  @JsonProperty("pending")
  @NotNull
  public List<IoK8sApimachineryPkgApisMetaV1Initializer> getPending() {
    return pending;
  }
  public void setPending(List<IoK8sApimachineryPkgApisMetaV1Initializer> pending) {
    this.pending = pending;
  }

  /**
   * If result is set with the Failure field, the object will be persisted to storage and then deleted, ensuring that other clients can observe the deletion.
   **/
  public IoK8sApimachineryPkgApisMetaV1Initializers result(IoK8sApimachineryPkgApisMetaV1Status result) {
    this.result = result;
    return this;
  }

  
  @ApiModelProperty(value = "If result is set with the Failure field, the object will be persisted to storage and then deleted, ensuring that other clients can observe the deletion.")
  @JsonProperty("result")
  public IoK8sApimachineryPkgApisMetaV1Status getResult() {
    return result;
  }
  public void setResult(IoK8sApimachineryPkgApisMetaV1Status result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1Initializers ioK8sApimachineryPkgApisMetaV1Initializers = (IoK8sApimachineryPkgApisMetaV1Initializers) o;
    return Objects.equals(pending, ioK8sApimachineryPkgApisMetaV1Initializers.pending) &&
        Objects.equals(result, ioK8sApimachineryPkgApisMetaV1Initializers.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pending, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1Initializers {\n");
    
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

