package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1VolumeProjection;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a projected volume source
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a projected volume source")

public class IoK8sApiCoreV1ProjectedVolumeSource   {
  
  private @Valid Integer defaultMode = null;
  private @Valid List<IoK8sApiCoreV1VolumeProjection> sources = new ArrayList<IoK8sApiCoreV1VolumeProjection>();

  /**
   * Mode bits to use on created files by default. Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   **/
  public IoK8sApiCoreV1ProjectedVolumeSource defaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

  
  @ApiModelProperty(value = "Mode bits to use on created files by default. Must be a value between 0 and 0777. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  @JsonProperty("defaultMode")
  public Integer getDefaultMode() {
    return defaultMode;
  }
  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }

  /**
   * list of volume projections
   **/
  public IoK8sApiCoreV1ProjectedVolumeSource sources(List<IoK8sApiCoreV1VolumeProjection> sources) {
    this.sources = sources;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "list of volume projections")
  @JsonProperty("sources")
  @NotNull
  public List<IoK8sApiCoreV1VolumeProjection> getSources() {
    return sources;
  }
  public void setSources(List<IoK8sApiCoreV1VolumeProjection> sources) {
    this.sources = sources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ProjectedVolumeSource ioK8sApiCoreV1ProjectedVolumeSource = (IoK8sApiCoreV1ProjectedVolumeSource) o;
    return Objects.equals(defaultMode, ioK8sApiCoreV1ProjectedVolumeSource.defaultMode) &&
        Objects.equals(sources, ioK8sApiCoreV1ProjectedVolumeSource.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ProjectedVolumeSource {\n");
    
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

