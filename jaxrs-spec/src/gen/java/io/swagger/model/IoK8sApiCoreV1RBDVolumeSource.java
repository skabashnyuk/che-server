package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1LocalObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD volumes support ownership management and SELinux relabeling.")

public class IoK8sApiCoreV1RBDVolumeSource   {
  
  private @Valid String fsType = null;
  private @Valid String image = null;
  private @Valid String keyring = null;
  private @Valid List<String> monitors = new ArrayList<String>();
  private @Valid String pool = null;
  private @Valid Boolean readOnly = null;
  private @Valid IoK8sApiCoreV1LocalObjectReference secretRef = null;
  private @Valid String user = null;

  /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd
   **/
  public IoK8sApiCoreV1RBDVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  
  @ApiModelProperty(value = "Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#rbd")
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }
  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  /**
   * The rados image name. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1RBDVolumeSource image(String image) {
    this.image = image;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The rados image name. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it")
  @JsonProperty("image")
  @NotNull
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  /**
   * Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1RBDVolumeSource keyring(String keyring) {
    this.keyring = keyring;
    return this;
  }

  
  @ApiModelProperty(value = "Keyring is the path to key ring for RBDUser. Default is /etc/ceph/keyring. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it")
  @JsonProperty("keyring")
  public String getKeyring() {
    return keyring;
  }
  public void setKeyring(String keyring) {
    this.keyring = keyring;
  }

  /**
   * A collection of Ceph monitors. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1RBDVolumeSource monitors(List<String> monitors) {
    this.monitors = monitors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A collection of Ceph monitors. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it")
  @JsonProperty("monitors")
  @NotNull
  public List<String> getMonitors() {
    return monitors;
  }
  public void setMonitors(List<String> monitors) {
    this.monitors = monitors;
  }

  /**
   * The rados pool name. Default is rbd. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1RBDVolumeSource pool(String pool) {
    this.pool = pool;
    return this;
  }

  
  @ApiModelProperty(value = "The rados pool name. Default is rbd. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it")
  @JsonProperty("pool")
  public String getPool() {
    return pool;
  }
  public void setPool(String pool) {
    this.pool = pool;
  }

  /**
   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1RBDVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  
  @ApiModelProperty(value = "ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it")
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1RBDVolumeSource secretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  
  @ApiModelProperty(value = "SecretRef is name of the authentication secret for RBDUser. If provided overrides keyring. Default is nil. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it")
  @JsonProperty("secretRef")
  public IoK8sApiCoreV1LocalObjectReference getSecretRef() {
    return secretRef;
  }
  public void setSecretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  /**
   * The rados user name. Default is admin. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it
   **/
  public IoK8sApiCoreV1RBDVolumeSource user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "The rados user name. Default is admin. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it")
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1RBDVolumeSource ioK8sApiCoreV1RBDVolumeSource = (IoK8sApiCoreV1RBDVolumeSource) o;
    return Objects.equals(fsType, ioK8sApiCoreV1RBDVolumeSource.fsType) &&
        Objects.equals(image, ioK8sApiCoreV1RBDVolumeSource.image) &&
        Objects.equals(keyring, ioK8sApiCoreV1RBDVolumeSource.keyring) &&
        Objects.equals(monitors, ioK8sApiCoreV1RBDVolumeSource.monitors) &&
        Objects.equals(pool, ioK8sApiCoreV1RBDVolumeSource.pool) &&
        Objects.equals(readOnly, ioK8sApiCoreV1RBDVolumeSource.readOnly) &&
        Objects.equals(secretRef, ioK8sApiCoreV1RBDVolumeSource.secretRef) &&
        Objects.equals(user, ioK8sApiCoreV1RBDVolumeSource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, image, keyring, monitors, pool, readOnly, secretRef, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1RBDVolumeSource {\n");
    
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    keyring: ").append(toIndentedString(keyring)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

