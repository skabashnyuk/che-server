package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ClientIPConfig represents the configurations of Client IP based session affinity.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ClientIPConfig represents the configurations of Client IP based session affinity.")

public class IoK8sApiCoreV1ClientIPConfig   {
  
  private @Valid Integer timeoutSeconds = null;

  /**
   * timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be &gt;0 &amp;&amp; &lt;&#x3D;86400(for 1 day) if ServiceAffinity &#x3D;&#x3D; \&quot;ClientIP\&quot;. Default value is 10800(for 3 hours).
   **/
  public IoK8sApiCoreV1ClientIPConfig timeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  
  @ApiModelProperty(value = "timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if ServiceAffinity == \"ClientIP\". Default value is 10800(for 3 hours).")
  @JsonProperty("timeoutSeconds")
  public Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }
  public void setTimeoutSeconds(Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ClientIPConfig ioK8sApiCoreV1ClientIPConfig = (IoK8sApiCoreV1ClientIPConfig) o;
    return Objects.equals(timeoutSeconds, ioK8sApiCoreV1ClientIPConfig.timeoutSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeoutSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ClientIPConfig {\n");
    
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

