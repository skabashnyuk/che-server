package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Maps a string key to a path within a volume.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Maps a string key to a path within a volume.")

public class IoK8sApiCoreV1KeyToPath   {
  
  private @Valid String key = null;
  private @Valid Integer mode = null;
  private @Valid String path = null;

  /**
   * The key to project.
   **/
  public IoK8sApiCoreV1KeyToPath key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The key to project.")
  @JsonProperty("key")
  @NotNull
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   **/
  public IoK8sApiCoreV1KeyToPath mode(Integer mode) {
    this.mode = mode;
    return this;
  }

  
  @ApiModelProperty(value = "Optional: mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume defaultMode will be used. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")
  @JsonProperty("mode")
  public Integer getMode() {
    return mode;
  }
  public void setMode(Integer mode) {
    this.mode = mode;
  }

  /**
   * The relative path of the file to map the key to. May not be an absolute path. May not contain the path element &#39;..&#39;. May not start with the string &#39;..&#39;.
   **/
  public IoK8sApiCoreV1KeyToPath path(String path) {
    this.path = path;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The relative path of the file to map the key to. May not be an absolute path. May not contain the path element '..'. May not start with the string '..'.")
  @JsonProperty("path")
  @NotNull
  public String getPath() {
    return path;
  }
  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1KeyToPath ioK8sApiCoreV1KeyToPath = (IoK8sApiCoreV1KeyToPath) o;
    return Objects.equals(key, ioK8sApiCoreV1KeyToPath.key) &&
        Objects.equals(mode, ioK8sApiCoreV1KeyToPath.mode) &&
        Objects.equals(path, ioK8sApiCoreV1KeyToPath.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, mode, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1KeyToPath {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

