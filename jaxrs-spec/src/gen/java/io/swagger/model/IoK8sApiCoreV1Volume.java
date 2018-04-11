package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource;
import io.swagger.model.IoK8sApiCoreV1AzureDiskVolumeSource;
import io.swagger.model.IoK8sApiCoreV1AzureFileVolumeSource;
import io.swagger.model.IoK8sApiCoreV1CephFSVolumeSource;
import io.swagger.model.IoK8sApiCoreV1CinderVolumeSource;
import io.swagger.model.IoK8sApiCoreV1ConfigMapVolumeSource;
import io.swagger.model.IoK8sApiCoreV1DownwardAPIVolumeSource;
import io.swagger.model.IoK8sApiCoreV1EmptyDirVolumeSource;
import io.swagger.model.IoK8sApiCoreV1FCVolumeSource;
import io.swagger.model.IoK8sApiCoreV1FlexVolumeSource;
import io.swagger.model.IoK8sApiCoreV1FlockerVolumeSource;
import io.swagger.model.IoK8sApiCoreV1GCEPersistentDiskVolumeSource;
import io.swagger.model.IoK8sApiCoreV1GitRepoVolumeSource;
import io.swagger.model.IoK8sApiCoreV1GlusterfsVolumeSource;
import io.swagger.model.IoK8sApiCoreV1HostPathVolumeSource;
import io.swagger.model.IoK8sApiCoreV1ISCSIVolumeSource;
import io.swagger.model.IoK8sApiCoreV1NFSVolumeSource;
import io.swagger.model.IoK8sApiCoreV1PersistentVolumeClaimVolumeSource;
import io.swagger.model.IoK8sApiCoreV1PhotonPersistentDiskVolumeSource;
import io.swagger.model.IoK8sApiCoreV1PortworxVolumeSource;
import io.swagger.model.IoK8sApiCoreV1ProjectedVolumeSource;
import io.swagger.model.IoK8sApiCoreV1QuobyteVolumeSource;
import io.swagger.model.IoK8sApiCoreV1RBDVolumeSource;
import io.swagger.model.IoK8sApiCoreV1ScaleIOVolumeSource;
import io.swagger.model.IoK8sApiCoreV1SecretVolumeSource;
import io.swagger.model.IoK8sApiCoreV1StorageOSVolumeSource;
import io.swagger.model.IoK8sApiCoreV1VsphereVirtualDiskVolumeSource;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "Volume represents a named volume in a pod that may be accessed by any container in the pod.")

public class IoK8sApiCoreV1Volume   {
  
  private @Valid IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore = null;
  private @Valid IoK8sApiCoreV1AzureDiskVolumeSource azureDisk = null;
  private @Valid IoK8sApiCoreV1AzureFileVolumeSource azureFile = null;
  private @Valid IoK8sApiCoreV1CephFSVolumeSource cephfs = null;
  private @Valid IoK8sApiCoreV1CinderVolumeSource cinder = null;
  private @Valid IoK8sApiCoreV1ConfigMapVolumeSource configMap = null;
  private @Valid IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI = null;
  private @Valid IoK8sApiCoreV1EmptyDirVolumeSource emptyDir = null;
  private @Valid IoK8sApiCoreV1FCVolumeSource fc = null;
  private @Valid IoK8sApiCoreV1FlexVolumeSource flexVolume = null;
  private @Valid IoK8sApiCoreV1FlockerVolumeSource flocker = null;
  private @Valid IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk = null;
  private @Valid IoK8sApiCoreV1GitRepoVolumeSource gitRepo = null;
  private @Valid IoK8sApiCoreV1GlusterfsVolumeSource glusterfs = null;
  private @Valid IoK8sApiCoreV1HostPathVolumeSource hostPath = null;
  private @Valid IoK8sApiCoreV1ISCSIVolumeSource iscsi = null;
  private @Valid String name = null;
  private @Valid IoK8sApiCoreV1NFSVolumeSource nfs = null;
  private @Valid IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim = null;
  private @Valid IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk = null;
  private @Valid IoK8sApiCoreV1PortworxVolumeSource portworxVolume = null;
  private @Valid IoK8sApiCoreV1ProjectedVolumeSource projected = null;
  private @Valid IoK8sApiCoreV1QuobyteVolumeSource quobyte = null;
  private @Valid IoK8sApiCoreV1RBDVolumeSource rbd = null;
  private @Valid IoK8sApiCoreV1ScaleIOVolumeSource scaleIO = null;
  private @Valid IoK8sApiCoreV1SecretVolumeSource secret = null;
  private @Valid IoK8sApiCoreV1StorageOSVolumeSource storageos = null;
  private @Valid IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume = null;

  /**
   * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
   **/
  public IoK8sApiCoreV1Volume awsElasticBlockStore(IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

  
  @ApiModelProperty(value = "AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
  @JsonProperty("awsElasticBlockStore")
  public IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource getAwsElasticBlockStore() {
    return awsElasticBlockStore;
  }
  public void setAwsElasticBlockStore(IoK8sApiCoreV1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
  }

  /**
   * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
   **/
  public IoK8sApiCoreV1Volume azureDisk(IoK8sApiCoreV1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
    return this;
  }

  
  @ApiModelProperty(value = "AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
  @JsonProperty("azureDisk")
  public IoK8sApiCoreV1AzureDiskVolumeSource getAzureDisk() {
    return azureDisk;
  }
  public void setAzureDisk(IoK8sApiCoreV1AzureDiskVolumeSource azureDisk) {
    this.azureDisk = azureDisk;
  }

  /**
   * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
   **/
  public IoK8sApiCoreV1Volume azureFile(IoK8sApiCoreV1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
    return this;
  }

  
  @ApiModelProperty(value = "AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")
  @JsonProperty("azureFile")
  public IoK8sApiCoreV1AzureFileVolumeSource getAzureFile() {
    return azureFile;
  }
  public void setAzureFile(IoK8sApiCoreV1AzureFileVolumeSource azureFile) {
    this.azureFile = azureFile;
  }

  /**
   * CephFS represents a Ceph FS mount on the host that shares a pod&#39;s lifetime
   **/
  public IoK8sApiCoreV1Volume cephfs(IoK8sApiCoreV1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
    return this;
  }

  
  @ApiModelProperty(value = "CephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
  @JsonProperty("cephfs")
  public IoK8sApiCoreV1CephFSVolumeSource getCephfs() {
    return cephfs;
  }
  public void setCephfs(IoK8sApiCoreV1CephFSVolumeSource cephfs) {
    this.cephfs = cephfs;
  }

  /**
   * Cinder represents a cinder volume attached and mounted on kubelets host machine More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
   **/
  public IoK8sApiCoreV1Volume cinder(IoK8sApiCoreV1CinderVolumeSource cinder) {
    this.cinder = cinder;
    return this;
  }

  
  @ApiModelProperty(value = "Cinder represents a cinder volume attached and mounted on kubelets host machine More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md")
  @JsonProperty("cinder")
  public IoK8sApiCoreV1CinderVolumeSource getCinder() {
    return cinder;
  }
  public void setCinder(IoK8sApiCoreV1CinderVolumeSource cinder) {
    this.cinder = cinder;
  }

  /**
   * ConfigMap represents a configMap that should populate this volume
   **/
  public IoK8sApiCoreV1Volume configMap(IoK8sApiCoreV1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
    return this;
  }

  
  @ApiModelProperty(value = "ConfigMap represents a configMap that should populate this volume")
  @JsonProperty("configMap")
  public IoK8sApiCoreV1ConfigMapVolumeSource getConfigMap() {
    return configMap;
  }
  public void setConfigMap(IoK8sApiCoreV1ConfigMapVolumeSource configMap) {
    this.configMap = configMap;
  }

  /**
   * DownwardAPI represents downward API about the pod that should populate this volume
   **/
  public IoK8sApiCoreV1Volume downwardAPI(IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
    return this;
  }

  
  @ApiModelProperty(value = "DownwardAPI represents downward API about the pod that should populate this volume")
  @JsonProperty("downwardAPI")
  public IoK8sApiCoreV1DownwardAPIVolumeSource getDownwardAPI() {
    return downwardAPI;
  }
  public void setDownwardAPI(IoK8sApiCoreV1DownwardAPIVolumeSource downwardAPI) {
    this.downwardAPI = downwardAPI;
  }

  /**
   * EmptyDir represents a temporary directory that shares a pod&#39;s lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
   **/
  public IoK8sApiCoreV1Volume emptyDir(IoK8sApiCoreV1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
    return this;
  }

  
  @ApiModelProperty(value = "EmptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
  @JsonProperty("emptyDir")
  public IoK8sApiCoreV1EmptyDirVolumeSource getEmptyDir() {
    return emptyDir;
  }
  public void setEmptyDir(IoK8sApiCoreV1EmptyDirVolumeSource emptyDir) {
    this.emptyDir = emptyDir;
  }

  /**
   * FC represents a Fibre Channel resource that is attached to a kubelet&#39;s host machine and then exposed to the pod.
   **/
  public IoK8sApiCoreV1Volume fc(IoK8sApiCoreV1FCVolumeSource fc) {
    this.fc = fc;
    return this;
  }

  
  @ApiModelProperty(value = "FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.")
  @JsonProperty("fc")
  public IoK8sApiCoreV1FCVolumeSource getFc() {
    return fc;
  }
  public void setFc(IoK8sApiCoreV1FCVolumeSource fc) {
    this.fc = fc;
  }

  /**
   * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
   **/
  public IoK8sApiCoreV1Volume flexVolume(IoK8sApiCoreV1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
    return this;
  }

  
  @ApiModelProperty(value = "FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")
  @JsonProperty("flexVolume")
  public IoK8sApiCoreV1FlexVolumeSource getFlexVolume() {
    return flexVolume;
  }
  public void setFlexVolume(IoK8sApiCoreV1FlexVolumeSource flexVolume) {
    this.flexVolume = flexVolume;
  }

  /**
   * Flocker represents a Flocker volume attached to a kubelet&#39;s host machine. This depends on the Flocker control service being running
   **/
  public IoK8sApiCoreV1Volume flocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
    return this;
  }

  
  @ApiModelProperty(value = "Flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running")
  @JsonProperty("flocker")
  public IoK8sApiCoreV1FlockerVolumeSource getFlocker() {
    return flocker;
  }
  public void setFlocker(IoK8sApiCoreV1FlockerVolumeSource flocker) {
    this.flocker = flocker;
  }

  /**
   * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
   **/
  public IoK8sApiCoreV1Volume gcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

  
  @ApiModelProperty(value = "GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
  @JsonProperty("gcePersistentDisk")
  public IoK8sApiCoreV1GCEPersistentDiskVolumeSource getGcePersistentDisk() {
    return gcePersistentDisk;
  }
  public void setGcePersistentDisk(IoK8sApiCoreV1GCEPersistentDiskVolumeSource gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }

  /**
   * GitRepo represents a git repository at a particular revision.
   **/
  public IoK8sApiCoreV1Volume gitRepo(IoK8sApiCoreV1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
    return this;
  }

  
  @ApiModelProperty(value = "GitRepo represents a git repository at a particular revision.")
  @JsonProperty("gitRepo")
  public IoK8sApiCoreV1GitRepoVolumeSource getGitRepo() {
    return gitRepo;
  }
  public void setGitRepo(IoK8sApiCoreV1GitRepoVolumeSource gitRepo) {
    this.gitRepo = gitRepo;
  }

  /**
   * Glusterfs represents a Glusterfs mount on the host that shares a pod&#39;s lifetime. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md
   **/
  public IoK8sApiCoreV1Volume glusterfs(IoK8sApiCoreV1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
    return this;
  }

  
  @ApiModelProperty(value = "Glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md")
  @JsonProperty("glusterfs")
  public IoK8sApiCoreV1GlusterfsVolumeSource getGlusterfs() {
    return glusterfs;
  }
  public void setGlusterfs(IoK8sApiCoreV1GlusterfsVolumeSource glusterfs) {
    this.glusterfs = glusterfs;
  }

  /**
   * HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
   **/
  public IoK8sApiCoreV1Volume hostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
    return this;
  }

  
  @ApiModelProperty(value = "HostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath")
  @JsonProperty("hostPath")
  public IoK8sApiCoreV1HostPathVolumeSource getHostPath() {
    return hostPath;
  }
  public void setHostPath(IoK8sApiCoreV1HostPathVolumeSource hostPath) {
    this.hostPath = hostPath;
  }

  /**
   * ISCSI represents an ISCSI Disk resource that is attached to a kubelet&#39;s host machine and then exposed to the pod. More info: https://releases.k8s.io/HEAD/examples/volumes/iscsi/README.md
   **/
  public IoK8sApiCoreV1Volume iscsi(IoK8sApiCoreV1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
    return this;
  }

  
  @ApiModelProperty(value = "ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://releases.k8s.io/HEAD/examples/volumes/iscsi/README.md")
  @JsonProperty("iscsi")
  public IoK8sApiCoreV1ISCSIVolumeSource getIscsi() {
    return iscsi;
  }
  public void setIscsi(IoK8sApiCoreV1ISCSIVolumeSource iscsi) {
    this.iscsi = iscsi;
  }

  /**
   * Volume&#39;s name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   **/
  public IoK8sApiCoreV1Volume name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * NFS represents an NFS mount on the host that shares a pod&#39;s lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
   **/
  public IoK8sApiCoreV1Volume nfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
    return this;
  }

  
  @ApiModelProperty(value = "NFS represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
  @JsonProperty("nfs")
  public IoK8sApiCoreV1NFSVolumeSource getNfs() {
    return nfs;
  }
  public void setNfs(IoK8sApiCoreV1NFSVolumeSource nfs) {
    this.nfs = nfs;
  }

  /**
   * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   **/
  public IoK8sApiCoreV1Volume persistentVolumeClaim(IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

  
  @ApiModelProperty(value = "PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  @JsonProperty("persistentVolumeClaim")
  public IoK8sApiCoreV1PersistentVolumeClaimVolumeSource getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }
  public void setPersistentVolumeClaim(IoK8sApiCoreV1PersistentVolumeClaimVolumeSource persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }

  /**
   * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
   **/
  public IoK8sApiCoreV1Volume photonPersistentDisk(IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

  
  @ApiModelProperty(value = "PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine")
  @JsonProperty("photonPersistentDisk")
  public IoK8sApiCoreV1PhotonPersistentDiskVolumeSource getPhotonPersistentDisk() {
    return photonPersistentDisk;
  }
  public void setPhotonPersistentDisk(IoK8sApiCoreV1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
  }

  /**
   * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
   **/
  public IoK8sApiCoreV1Volume portworxVolume(IoK8sApiCoreV1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
    return this;
  }

  
  @ApiModelProperty(value = "PortworxVolume represents a portworx volume attached and mounted on kubelets host machine")
  @JsonProperty("portworxVolume")
  public IoK8sApiCoreV1PortworxVolumeSource getPortworxVolume() {
    return portworxVolume;
  }
  public void setPortworxVolume(IoK8sApiCoreV1PortworxVolumeSource portworxVolume) {
    this.portworxVolume = portworxVolume;
  }

  /**
   * Items for all in one resources secrets, configmaps, and downward API
   **/
  public IoK8sApiCoreV1Volume projected(IoK8sApiCoreV1ProjectedVolumeSource projected) {
    this.projected = projected;
    return this;
  }

  
  @ApiModelProperty(value = "Items for all in one resources secrets, configmaps, and downward API")
  @JsonProperty("projected")
  public IoK8sApiCoreV1ProjectedVolumeSource getProjected() {
    return projected;
  }
  public void setProjected(IoK8sApiCoreV1ProjectedVolumeSource projected) {
    this.projected = projected;
  }

  /**
   * Quobyte represents a Quobyte mount on the host that shares a pod&#39;s lifetime
   **/
  public IoK8sApiCoreV1Volume quobyte(IoK8sApiCoreV1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
    return this;
  }

  
  @ApiModelProperty(value = "Quobyte represents a Quobyte mount on the host that shares a pod's lifetime")
  @JsonProperty("quobyte")
  public IoK8sApiCoreV1QuobyteVolumeSource getQuobyte() {
    return quobyte;
  }
  public void setQuobyte(IoK8sApiCoreV1QuobyteVolumeSource quobyte) {
    this.quobyte = quobyte;
  }

  /**
   * RBD represents a Rados Block Device mount on the host that shares a pod&#39;s lifetime. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md
   **/
  public IoK8sApiCoreV1Volume rbd(IoK8sApiCoreV1RBDVolumeSource rbd) {
    this.rbd = rbd;
    return this;
  }

  
  @ApiModelProperty(value = "RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://releases.k8s.io/HEAD/examples/volumes/rbd/README.md")
  @JsonProperty("rbd")
  public IoK8sApiCoreV1RBDVolumeSource getRbd() {
    return rbd;
  }
  public void setRbd(IoK8sApiCoreV1RBDVolumeSource rbd) {
    this.rbd = rbd;
  }

  /**
   * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
   **/
  public IoK8sApiCoreV1Volume scaleIO(IoK8sApiCoreV1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
    return this;
  }

  
  @ApiModelProperty(value = "ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
  @JsonProperty("scaleIO")
  public IoK8sApiCoreV1ScaleIOVolumeSource getScaleIO() {
    return scaleIO;
  }
  public void setScaleIO(IoK8sApiCoreV1ScaleIOVolumeSource scaleIO) {
    this.scaleIO = scaleIO;
  }

  /**
   * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
   **/
  public IoK8sApiCoreV1Volume secret(IoK8sApiCoreV1SecretVolumeSource secret) {
    this.secret = secret;
    return this;
  }

  
  @ApiModelProperty(value = "Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
  @JsonProperty("secret")
  public IoK8sApiCoreV1SecretVolumeSource getSecret() {
    return secret;
  }
  public void setSecret(IoK8sApiCoreV1SecretVolumeSource secret) {
    this.secret = secret;
  }

  /**
   * StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
   **/
  public IoK8sApiCoreV1Volume storageos(IoK8sApiCoreV1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
    return this;
  }

  
  @ApiModelProperty(value = "StorageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.")
  @JsonProperty("storageos")
  public IoK8sApiCoreV1StorageOSVolumeSource getStorageos() {
    return storageos;
  }
  public void setStorageos(IoK8sApiCoreV1StorageOSVolumeSource storageos) {
    this.storageos = storageos;
  }

  /**
   * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
   **/
  public IoK8sApiCoreV1Volume vsphereVolume(IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
    return this;
  }

  
  @ApiModelProperty(value = "VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine")
  @JsonProperty("vsphereVolume")
  public IoK8sApiCoreV1VsphereVirtualDiskVolumeSource getVsphereVolume() {
    return vsphereVolume;
  }
  public void setVsphereVolume(IoK8sApiCoreV1VsphereVirtualDiskVolumeSource vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1Volume ioK8sApiCoreV1Volume = (IoK8sApiCoreV1Volume) o;
    return Objects.equals(awsElasticBlockStore, ioK8sApiCoreV1Volume.awsElasticBlockStore) &&
        Objects.equals(azureDisk, ioK8sApiCoreV1Volume.azureDisk) &&
        Objects.equals(azureFile, ioK8sApiCoreV1Volume.azureFile) &&
        Objects.equals(cephfs, ioK8sApiCoreV1Volume.cephfs) &&
        Objects.equals(cinder, ioK8sApiCoreV1Volume.cinder) &&
        Objects.equals(configMap, ioK8sApiCoreV1Volume.configMap) &&
        Objects.equals(downwardAPI, ioK8sApiCoreV1Volume.downwardAPI) &&
        Objects.equals(emptyDir, ioK8sApiCoreV1Volume.emptyDir) &&
        Objects.equals(fc, ioK8sApiCoreV1Volume.fc) &&
        Objects.equals(flexVolume, ioK8sApiCoreV1Volume.flexVolume) &&
        Objects.equals(flocker, ioK8sApiCoreV1Volume.flocker) &&
        Objects.equals(gcePersistentDisk, ioK8sApiCoreV1Volume.gcePersistentDisk) &&
        Objects.equals(gitRepo, ioK8sApiCoreV1Volume.gitRepo) &&
        Objects.equals(glusterfs, ioK8sApiCoreV1Volume.glusterfs) &&
        Objects.equals(hostPath, ioK8sApiCoreV1Volume.hostPath) &&
        Objects.equals(iscsi, ioK8sApiCoreV1Volume.iscsi) &&
        Objects.equals(name, ioK8sApiCoreV1Volume.name) &&
        Objects.equals(nfs, ioK8sApiCoreV1Volume.nfs) &&
        Objects.equals(persistentVolumeClaim, ioK8sApiCoreV1Volume.persistentVolumeClaim) &&
        Objects.equals(photonPersistentDisk, ioK8sApiCoreV1Volume.photonPersistentDisk) &&
        Objects.equals(portworxVolume, ioK8sApiCoreV1Volume.portworxVolume) &&
        Objects.equals(projected, ioK8sApiCoreV1Volume.projected) &&
        Objects.equals(quobyte, ioK8sApiCoreV1Volume.quobyte) &&
        Objects.equals(rbd, ioK8sApiCoreV1Volume.rbd) &&
        Objects.equals(scaleIO, ioK8sApiCoreV1Volume.scaleIO) &&
        Objects.equals(secret, ioK8sApiCoreV1Volume.secret) &&
        Objects.equals(storageos, ioK8sApiCoreV1Volume.storageos) &&
        Objects.equals(vsphereVolume, ioK8sApiCoreV1Volume.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsElasticBlockStore, azureDisk, azureFile, cephfs, cinder, configMap, downwardAPI, emptyDir, fc, flexVolume, flocker, gcePersistentDisk, gitRepo, glusterfs, hostPath, iscsi, name, nfs, persistentVolumeClaim, photonPersistentDisk, portworxVolume, projected, quobyte, rbd, scaleIO, secret, storageos, vsphereVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1Volume {\n");
    
    sb.append("    awsElasticBlockStore: ").append(toIndentedString(awsElasticBlockStore)).append("\n");
    sb.append("    azureDisk: ").append(toIndentedString(azureDisk)).append("\n");
    sb.append("    azureFile: ").append(toIndentedString(azureFile)).append("\n");
    sb.append("    cephfs: ").append(toIndentedString(cephfs)).append("\n");
    sb.append("    cinder: ").append(toIndentedString(cinder)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    emptyDir: ").append(toIndentedString(emptyDir)).append("\n");
    sb.append("    fc: ").append(toIndentedString(fc)).append("\n");
    sb.append("    flexVolume: ").append(toIndentedString(flexVolume)).append("\n");
    sb.append("    flocker: ").append(toIndentedString(flocker)).append("\n");
    sb.append("    gcePersistentDisk: ").append(toIndentedString(gcePersistentDisk)).append("\n");
    sb.append("    gitRepo: ").append(toIndentedString(gitRepo)).append("\n");
    sb.append("    glusterfs: ").append(toIndentedString(glusterfs)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    persistentVolumeClaim: ").append(toIndentedString(persistentVolumeClaim)).append("\n");
    sb.append("    photonPersistentDisk: ").append(toIndentedString(photonPersistentDisk)).append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    projected: ").append(toIndentedString(projected)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    storageos: ").append(toIndentedString(storageos)).append("\n");
    sb.append("    vsphereVolume: ").append(toIndentedString(vsphereVolume)).append("\n");
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

