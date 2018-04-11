package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1DownwardAPIVolumeFile;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.")

public class IoK8sApiCoreV1DownwardAPIProjection   {
  
  private @Valid List<IoK8sApiCoreV1DownwardAPIVolumeFile> items = new ArrayList<IoK8sApiCoreV1DownwardAPIVolumeFile>();

  /**
   * Items is a list of DownwardAPIVolume file
   **/
  public IoK8sApiCoreV1DownwardAPIProjection items(List<IoK8sApiCoreV1DownwardAPIVolumeFile> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "Items is a list of DownwardAPIVolume file")
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
    IoK8sApiCoreV1DownwardAPIProjection ioK8sApiCoreV1DownwardAPIProjection = (IoK8sApiCoreV1DownwardAPIProjection) o;
    return Objects.equals(items, ioK8sApiCoreV1DownwardAPIProjection.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1DownwardAPIProjection {\n");
    
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

