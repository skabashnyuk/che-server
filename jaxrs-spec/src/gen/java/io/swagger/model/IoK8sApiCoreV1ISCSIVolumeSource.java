package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1LocalObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Represents an ISCSI disk. ISCSI volumes can only be mounted as read/write once. ISCSI volumes support ownership management and SELinux relabeling.")

public class IoK8sApiCoreV1ISCSIVolumeSource   {
  
  private @Valid Boolean chapAuthDiscovery = null;
  private @Valid Boolean chapAuthSession = null;
  private @Valid String fsType = null;
  private @Valid String initiatorName = null;
  private @Valid String iqn = null;
  private @Valid String iscsiInterface = null;
  private @Valid Integer lun = null;
  private @Valid List<String> portals = new ArrayList<String>();
  private @Valid Boolean readOnly = null;
  private @Valid IoK8sApiCoreV1LocalObjectReference secretRef = null;
  private @Valid String targetPortal = null;

  /**
   * whether support iSCSI Discovery CHAP authentication
   **/
  public IoK8sApiCoreV1ISCSIVolumeSource chapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
    return this;
  }

  
  @ApiModelProperty(value = "whether support iSCSI Discovery CHAP authentication")
  @JsonProperty("chapAuthDiscovery")
  public Boolean isChapAuthDiscovery() {
    return chapAuthDiscovery;
  }
  public void setChapAuthDiscovery(Boolean chapAuthDiscovery) {
    this.chapAuthDiscovery = chapAuthDiscovery;
  }

  /**
   * whether support iSCSI Session CHAP authentication
   **/
  public IoK8sApiCoreV1ISCSIVolumeSource chapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
    return this;
  }

  
  @ApiModelProperty(value = "whether support iSCSI Session CHAP authentication")
  @JsonProperty("chapAuthSession")
  public Boolean isChapAuthSession() {
    return chapAuthSession;
  }
  public void setChapAuthSession(Boolean chapAuthSession) {
    this.chapAuthSession = chapAuthSession;
  }

  /**
   * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi
   **/
  public IoK8sApiCoreV1ISCSIVolumeSource fsType(String fsType) {
    this.fsType = fsType;
    return this;
  }

  
  @ApiModelProperty(value = "Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#iscsi")
  @JsonProperty("fsType")
  public String getFsType() {
    return fsType;
  }
  public void setFsType(String fsType) {
    this.fsType = fsType;
  }

  /**
   * Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface &lt;target portal&gt;:&lt;volume name&gt; will be created for the connection.
   **/
  public IoK8sApiCoreV1ISCSIVolumeSource initiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
    return this;
  }

  
  @ApiModelProperty(value = "Custom iSCSI Initiator Name. If initiatorName is specified with iscsiInterface simultaneously, new iSCSI interface <target portal>:<volume name> will be created for the connection.")
  @JsonProperty("initiatorName")
  public String getInitiatorName() {
    return initiatorName;
  }
  public void setInitiatorName(String initiatorName) {
    this.initiatorName = initiatorName;
  }

  /**
   * Target iSCSI Qualified Name.
   **/
  public IoK8sApiCoreV1ISCSIVolumeSource iqn(String iqn) {
    this.iqn = iqn;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Target iSCSI Qualified Name.")
  @JsonProperty("iqn")
  @NotNull
  public String getIqn() {
    return iqn;
  }
  public void setIqn(String iqn) {
    this.iqn = iqn;
  }

  /**
   * iSCSI Interface Name that uses an iSCSI transport. Defaults to &#39;default&#39; (tcp).
   **/
  public IoK8sApiCoreV1ISCSIVolumeSource iscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
    return this;
  }

  
  @ApiModelProperty(value = "iSCSI Interface Name that uses an iSCSI transport. Defaults to 'default' (tcp).")
  @JsonProperty("iscsiInterface")
  public String getIscsiInterface() {
    return iscsiInterface;
  }
  public void setIscsiInterface(String iscsiInterface) {
    this.iscsiInterface = iscsiInterface;
  }

  /**
   * iSCSI Target Lun number.
   **/
  public IoK8sApiCoreV1ISCSIVolumeSource lun(Integer lun) {
    this.lun = lun;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "iSCSI Target Lun number.")
  @JsonProperty("lun")
  @NotNull
  public Integer getLun() {
    return lun;
  }
  public void setLun(Integer lun) {
    this.lun = lun;
  }

  /**
   * iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   **/
  public IoK8sApiCoreV1ISCSIVolumeSource portals(List<String> portals) {
    this.portals = portals;
    return this;
  }

  
  @ApiModelProperty(value = "iSCSI Target Portal List. The portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
  @JsonProperty("portals")
  public List<String> getPortals() {
    return portals;
  }
  public void setPortals(List<String> portals) {
    this.portals = portals;
  }

  /**
   * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.
   **/
  public IoK8sApiCoreV1ISCSIVolumeSource readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  
  @ApiModelProperty(value = "ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false.")
  @JsonProperty("readOnly")
  public Boolean isReadOnly() {
    return readOnly;
  }
  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  /**
   * CHAP Secret for iSCSI target and initiator authentication
   **/
  public IoK8sApiCoreV1ISCSIVolumeSource secretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
    return this;
  }

  
  @ApiModelProperty(value = "CHAP Secret for iSCSI target and initiator authentication")
  @JsonProperty("secretRef")
  public IoK8sApiCoreV1LocalObjectReference getSecretRef() {
    return secretRef;
  }
  public void setSecretRef(IoK8sApiCoreV1LocalObjectReference secretRef) {
    this.secretRef = secretRef;
  }

  /**
   * iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).
   **/
  public IoK8sApiCoreV1ISCSIVolumeSource targetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "iSCSI Target Portal. The Portal is either an IP or ip_addr:port if the port is other than default (typically TCP ports 860 and 3260).")
  @JsonProperty("targetPortal")
  @NotNull
  public String getTargetPortal() {
    return targetPortal;
  }
  public void setTargetPortal(String targetPortal) {
    this.targetPortal = targetPortal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1ISCSIVolumeSource ioK8sApiCoreV1ISCSIVolumeSource = (IoK8sApiCoreV1ISCSIVolumeSource) o;
    return Objects.equals(chapAuthDiscovery, ioK8sApiCoreV1ISCSIVolumeSource.chapAuthDiscovery) &&
        Objects.equals(chapAuthSession, ioK8sApiCoreV1ISCSIVolumeSource.chapAuthSession) &&
        Objects.equals(fsType, ioK8sApiCoreV1ISCSIVolumeSource.fsType) &&
        Objects.equals(initiatorName, ioK8sApiCoreV1ISCSIVolumeSource.initiatorName) &&
        Objects.equals(iqn, ioK8sApiCoreV1ISCSIVolumeSource.iqn) &&
        Objects.equals(iscsiInterface, ioK8sApiCoreV1ISCSIVolumeSource.iscsiInterface) &&
        Objects.equals(lun, ioK8sApiCoreV1ISCSIVolumeSource.lun) &&
        Objects.equals(portals, ioK8sApiCoreV1ISCSIVolumeSource.portals) &&
        Objects.equals(readOnly, ioK8sApiCoreV1ISCSIVolumeSource.readOnly) &&
        Objects.equals(secretRef, ioK8sApiCoreV1ISCSIVolumeSource.secretRef) &&
        Objects.equals(targetPortal, ioK8sApiCoreV1ISCSIVolumeSource.targetPortal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chapAuthDiscovery, chapAuthSession, fsType, initiatorName, iqn, iscsiInterface, lun, portals, readOnly, secretRef, targetPortal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1ISCSIVolumeSource {\n");
    
    sb.append("    chapAuthDiscovery: ").append(toIndentedString(chapAuthDiscovery)).append("\n");
    sb.append("    chapAuthSession: ").append(toIndentedString(chapAuthSession)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    initiatorName: ").append(toIndentedString(initiatorName)).append("\n");
    sb.append("    iqn: ").append(toIndentedString(iqn)).append("\n");
    sb.append("    iscsiInterface: ").append(toIndentedString(iscsiInterface)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    portals: ").append(toIndentedString(portals)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    targetPortal: ").append(toIndentedString(targetPortal)).append("\n");
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

