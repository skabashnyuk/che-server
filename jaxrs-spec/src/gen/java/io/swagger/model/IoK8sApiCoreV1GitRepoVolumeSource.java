package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a volume that is populated with the contents of a git repository. Git repo volumes do not support ownership management. Git repo volumes support SELinux relabeling.")

public class IoK8sApiCoreV1GitRepoVolumeSource   {
  
  private @Valid String directory = null;
  private @Valid String repository = null;
  private @Valid String revision = null;

  /**
   * Target directory name. Must not contain or start with &#39;..&#39;.  If &#39;.&#39; is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.
   **/
  public IoK8sApiCoreV1GitRepoVolumeSource directory(String directory) {
    this.directory = directory;
    return this;
  }

  
  @ApiModelProperty(value = "Target directory name. Must not contain or start with '..'.  If '.' is supplied, the volume directory will be the git repository.  Otherwise, if specified, the volume will contain the git repository in the subdirectory with the given name.")
  @JsonProperty("directory")
  public String getDirectory() {
    return directory;
  }
  public void setDirectory(String directory) {
    this.directory = directory;
  }

  /**
   * Repository URL
   **/
  public IoK8sApiCoreV1GitRepoVolumeSource repository(String repository) {
    this.repository = repository;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Repository URL")
  @JsonProperty("repository")
  @NotNull
  public String getRepository() {
    return repository;
  }
  public void setRepository(String repository) {
    this.repository = repository;
  }

  /**
   * Commit hash for the specified revision.
   **/
  public IoK8sApiCoreV1GitRepoVolumeSource revision(String revision) {
    this.revision = revision;
    return this;
  }

  
  @ApiModelProperty(value = "Commit hash for the specified revision.")
  @JsonProperty("revision")
  public String getRevision() {
    return revision;
  }
  public void setRevision(String revision) {
    this.revision = revision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1GitRepoVolumeSource ioK8sApiCoreV1GitRepoVolumeSource = (IoK8sApiCoreV1GitRepoVolumeSource) o;
    return Objects.equals(directory, ioK8sApiCoreV1GitRepoVolumeSource.directory) &&
        Objects.equals(repository, ioK8sApiCoreV1GitRepoVolumeSource.repository) &&
        Objects.equals(revision, ioK8sApiCoreV1GitRepoVolumeSource.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directory, repository, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1GitRepoVolumeSource {\n");
    
    sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

