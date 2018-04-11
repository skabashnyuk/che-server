package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1DownwardAPIVolumeFile;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.")

public class IoK8sApiCoreV1DownwardAPIVolumeSource   {
  
  private @Valid Integer defaultMode = null;
  private @Valid List<IoK8sApiCoreV1DownwardAPIVolumeFile> items = new ArrayList<IoK8sApiCoreV1DownwardAPIVolumeFile>();

  /**
   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   **/
  public IoK8sApiCoreV1DownwardAPIVolumeSource defaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  @JsonProperty("defaultMode")
  public Integer getDefaultMode() {
    return defaultMode;
  }
  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }

  /**
   * Items is a list of downward API volume file
   **/
  public IoK8sApiCoreV1DownwardAPIVolumeSource items(List<IoK8sApiCoreV1DownwardAPIVolumeFile> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "Items is a list of downward API volume file")
  @JsonProperty("items")
  public List<IoK8sApiCoreV1DownwardAPIVolumeFile> getItems() {
    return items;
  }
  public void setItems(List<IoK8sApiCoreV1DownwardAPIVolumeFile> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1DownwardAPIVolumeSource ioK8sApiCoreV1DownwardAPIVolumeSource = (IoK8sApiCoreV1DownwardAPIVolumeSource) o;
    return Objects.equals(defaultMode, ioK8sApiCoreV1DownwardAPIVolumeSource.defaultMode) &&
        Objects.equals(items, ioK8sApiCoreV1DownwardAPIVolumeSource.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1DownwardAPIVolumeSource {\n");
    
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

