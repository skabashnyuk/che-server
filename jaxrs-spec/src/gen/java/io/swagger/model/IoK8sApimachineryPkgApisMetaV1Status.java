package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApimachineryPkgApisMetaV1ListMeta;
import io.swagger.model.IoK8sApimachineryPkgApisMetaV1StatusDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Status is a return value for calls that don&#39;t return other objects.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Status is a return value for calls that don't return other objects.")

public class IoK8sApimachineryPkgApisMetaV1Status   {
  
  private @Valid String apiVersion = null;
  private @Valid Integer code = null;
  private @Valid IoK8sApimachineryPkgApisMetaV1StatusDetails details = null;
  private @Valid String kind = null;
  private @Valid String message = null;
  private @Valid IoK8sApimachineryPkgApisMetaV1ListMeta metadata = null;
  private @Valid String reason = null;
  private @Valid String status = null;

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
   **/
  public IoK8sApimachineryPkgApisMetaV1Status apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#resources")
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * Suggested HTTP return code for this status, 0 if not set.
   **/
  public IoK8sApimachineryPkgApisMetaV1Status code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "Suggested HTTP return code for this status, 0 if not set.")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Extended data associated with the reason.  Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.
   **/
  public IoK8sApimachineryPkgApisMetaV1Status details(IoK8sApimachineryPkgApisMetaV1StatusDetails details) {
    this.details = details;
    return this;
  }

  
  @ApiModelProperty(value = "Extended data associated with the reason.  Each reason may define its own extended details. This field is optional and the data returned is not guaranteed to conform to any schema except that defined by the reason type.")
  @JsonProperty("details")
  public IoK8sApimachineryPkgApisMetaV1StatusDetails getDetails() {
    return details;
  }
  public void setDetails(IoK8sApimachineryPkgApisMetaV1StatusDetails details) {
    this.details = details;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   **/
  public IoK8sApimachineryPkgApisMetaV1Status kind(String kind) {
    this.kind = kind;
    return this;
  }

  
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }
  public void setKind(String kind) {
    this.kind = kind;
  }

  /**
   * A human-readable description of the status of this operation.
   **/
  public IoK8sApimachineryPkgApisMetaV1Status message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "A human-readable description of the status of this operation.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
   **/
  public IoK8sApimachineryPkgApisMetaV1Status metadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds")
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ListMeta getMetadata() {
    return metadata;
  }
  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ListMeta metadata) {
    this.metadata = metadata;
  }

  /**
   * A machine-readable description of why this operation is in the \&quot;Failure\&quot; status. If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.
   **/
  public IoK8sApimachineryPkgApisMetaV1Status reason(String reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(value = "A machine-readable description of why this operation is in the \"Failure\" status. If this value is empty there is no information available. A Reason clarifies an HTTP status code but does not override it.")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Status of the operation. One of: \&quot;Success\&quot; or \&quot;Failure\&quot;. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   **/
  public IoK8sApimachineryPkgApisMetaV1Status status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "Status of the operation. One of: \"Success\" or \"Failure\". More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1Status ioK8sApimachineryPkgApisMetaV1Status = (IoK8sApimachineryPkgApisMetaV1Status) o;
    return Objects.equals(apiVersion, ioK8sApimachineryPkgApisMetaV1Status.apiVersion) &&
        Objects.equals(code, ioK8sApimachineryPkgApisMetaV1Status.code) &&
        Objects.equals(details, ioK8sApimachineryPkgApisMetaV1Status.details) &&
        Objects.equals(kind, ioK8sApimachineryPkgApisMetaV1Status.kind) &&
        Objects.equals(message, ioK8sApimachineryPkgApisMetaV1Status.message) &&
        Objects.equals(metadata, ioK8sApimachineryPkgApisMetaV1Status.metadata) &&
        Objects.equals(reason, ioK8sApimachineryPkgApisMetaV1Status.reason) &&
        Objects.equals(status, ioK8sApimachineryPkgApisMetaV1Status.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, code, details, kind, message, metadata, reason, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1Status {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

