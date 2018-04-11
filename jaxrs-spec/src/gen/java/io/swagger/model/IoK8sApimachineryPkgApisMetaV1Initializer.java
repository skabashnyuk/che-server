package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Initializer is information about an initializer that has not yet completed.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Initializer is information about an initializer that has not yet completed.")

public class IoK8sApimachineryPkgApisMetaV1Initializer   {
  
  private @Valid String name = null;

  /**
   * name of the process that is responsible for initializing this object.
   **/
  public IoK8sApimachineryPkgApisMetaV1Initializer name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "name of the process that is responsible for initializing this object.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1Initializer ioK8sApimachineryPkgApisMetaV1Initializer = (IoK8sApimachineryPkgApisMetaV1Initializer) o;
    return Objects.equals(name, ioK8sApimachineryPkgApisMetaV1Initializer.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1Initializer {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

