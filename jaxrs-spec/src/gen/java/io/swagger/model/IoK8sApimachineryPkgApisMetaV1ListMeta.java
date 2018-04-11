package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ListMeta describes metadata that synthetic resources must have, including lists and various status objects. A resource may have only one of {ObjectMeta, ListMeta}.")

public class IoK8sApimachineryPkgApisMetaV1ListMeta   {
  
  private @Valid String _continue = null;
  private @Valid String resourceVersion = null;
  private @Valid String selfLink = null;

  /**
   * continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response.
   **/
  public IoK8sApimachineryPkgApisMetaV1ListMeta _continue(String _continue) {
    this._continue = _continue;
    return this;
  }

  
  @ApiModelProperty(value = "continue may be set if the user set a limit on the number of items returned, and indicates that the server has more data available. The value is opaque and may be used to issue another request to the endpoint that served this list to retrieve the next set of available objects. Continuing a list may not be possible if the server configuration has changed or more than a few minutes have passed. The resourceVersion field returned when using this continue value will be identical to the value in the first response.")
  @JsonProperty("continue")
  public String getContinue() {
    return _continue;
  }
  public void setContinue(String _continue) {
    this._continue = _continue;
  }

  /**
   * String that identifies the server&#39;s internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
   **/
  public IoK8sApimachineryPkgApisMetaV1ListMeta resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  
  @ApiModelProperty(value = "String that identifies the server's internal version of this object that can be used by clients to determine when objects have changed. Value must be treated as opaque by clients and passed unmodified back to the server. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency")
  @JsonProperty("resourceVersion")
  public String getResourceVersion() {
    return resourceVersion;
  }
  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  /**
   * selfLink is a URL representing this object. Populated by the system. Read-only.
   **/
  public IoK8sApimachineryPkgApisMetaV1ListMeta selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  
  @ApiModelProperty(value = "selfLink is a URL representing this object. Populated by the system. Read-only.")
  @JsonProperty("selfLink")
  public String getSelfLink() {
    return selfLink;
  }
  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1ListMeta ioK8sApimachineryPkgApisMetaV1ListMeta = (IoK8sApimachineryPkgApisMetaV1ListMeta) o;
    return Objects.equals(_continue, ioK8sApimachineryPkgApisMetaV1ListMeta._continue) &&
        Objects.equals(resourceVersion, ioK8sApimachineryPkgApisMetaV1ListMeta.resourceVersion) &&
        Objects.equals(selfLink, ioK8sApimachineryPkgApisMetaV1ListMeta.selfLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_continue, resourceVersion, selfLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1ListMeta {\n");
    
    sb.append("    _continue: ").append(toIndentedString(_continue)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
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

