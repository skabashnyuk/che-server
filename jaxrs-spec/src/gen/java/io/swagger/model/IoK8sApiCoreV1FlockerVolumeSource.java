package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.")

public class IoK8sApiCoreV1FlockerVolumeSource   {
  
  private @Valid String datasetName = null;
  private @Valid String datasetUUID = null;

  /**
   * Name of the dataset stored as metadata -&gt; name on the dataset for Flocker should be considered as deprecated
   **/
  public IoK8sApiCoreV1FlockerVolumeSource datasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated")
  @JsonProperty("datasetName")
  public String getDatasetName() {
    return datasetName;
  }
  public void setDatasetName(String datasetName) {
    this.datasetName = datasetName;
  }

  /**
   * UUID of the dataset. This is unique identifier of a Flocker dataset
   **/
  public IoK8sApiCoreV1FlockerVolumeSource datasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
    return this;
  }

  
  @ApiModelProperty(value = "UUID of the dataset. This is unique identifier of a Flocker dataset")
  @JsonProperty("datasetUUID")
  public String getDatasetUUID() {
    return datasetUUID;
  }
  public void setDatasetUUID(String datasetUUID) {
    this.datasetUUID = datasetUUID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1FlockerVolumeSource ioK8sApiCoreV1FlockerVolumeSource = (IoK8sApiCoreV1FlockerVolumeSource) o;
    return Objects.equals(datasetName, ioK8sApiCoreV1FlockerVolumeSource.datasetName) &&
        Objects.equals(datasetUUID, ioK8sApiCoreV1FlockerVolumeSource.datasetUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetName, datasetUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1FlockerVolumeSource {\n");
    
    sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
    sb.append("    datasetUUID: ").append(toIndentedString(datasetUUID)).append("\n");
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

