package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "StatusCause provides more information about an api.Status failure, including cases when multiple errors are encountered.")

public class IoK8sApimachineryPkgApisMetaV1StatusCause   {
  
  private @Valid String field = null;
  private @Valid String message = null;
  private @Valid String reason = null;

  /**
   * The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.  Examples:   \&quot;name\&quot; - the field \&quot;name\&quot; on the current resource   \&quot;items[0].name\&quot; - the field \&quot;name\&quot; on the first array entry in \&quot;items\&quot;
   **/
  public IoK8sApimachineryPkgApisMetaV1StatusCause field(String field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(value = "The field of the resource that has caused this error, as named by its JSON serialization. May include dot and postfix notation for nested attributes. Arrays are zero-indexed.  Fields may appear more than once in an array of causes due to fields having multiple errors. Optional.  Examples:   \"name\" - the field \"name\" on the current resource   \"items[0].name\" - the field \"name\" on the first array entry in \"items\"")
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  /**
   * A human-readable description of the cause of the error.  This field may be presented as-is to a reader.
   **/
  public IoK8sApimachineryPkgApisMetaV1StatusCause message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "A human-readable description of the cause of the error.  This field may be presented as-is to a reader.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * A machine-readable description of the cause of the error. If this value is empty there is no information available.
   **/
  public IoK8sApimachineryPkgApisMetaV1StatusCause reason(String reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(value = "A machine-readable description of the cause of the error. If this value is empty there is no information available.")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1StatusCause ioK8sApimachineryPkgApisMetaV1StatusCause = (IoK8sApimachineryPkgApisMetaV1StatusCause) o;
    return Objects.equals(field, ioK8sApimachineryPkgApisMetaV1StatusCause.field) &&
        Objects.equals(message, ioK8sApimachineryPkgApisMetaV1StatusCause.message) &&
        Objects.equals(reason, ioK8sApimachineryPkgApisMetaV1StatusCause.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1StatusCause {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

