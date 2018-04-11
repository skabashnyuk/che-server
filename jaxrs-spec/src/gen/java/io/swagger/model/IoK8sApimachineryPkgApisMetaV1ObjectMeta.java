package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApimachineryPkgApisMetaV1Initializers;
import io.swagger.model.IoK8sApimachineryPkgApisMetaV1OwnerReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "ObjectMeta is metadata that all persisted resources must have, which includes all objects users must create.")

public class IoK8sApimachineryPkgApisMetaV1ObjectMeta   {
  
  private @Valid Map<String, String> annotations = new HashMap<String, String>();
  private @Valid String clusterName = null;
  private @Valid String creationTimestamp = null;
  private @Valid Long deletionGracePeriodSeconds = null;
  private @Valid String deletionTimestamp = null;
  private @Valid List<String> finalizers = new ArrayList<String>();
  private @Valid String generateName = null;
  private @Valid Long generation = null;
  private @Valid IoK8sApimachineryPkgApisMetaV1Initializers initializers = null;
  private @Valid Map<String, String> labels = new HashMap<String, String>();
  private @Valid String name = null;
  private @Valid String namespace = null;
  private @Valid List<IoK8sApimachineryPkgApisMetaV1OwnerReference> ownerReferences = new ArrayList<IoK8sApimachineryPkgApisMetaV1OwnerReference>();
  private @Valid String resourceVersion = null;
  private @Valid String selfLink = null;
  private @Valid String uid = null;

  /**
   * Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  
  @ApiModelProperty(value = "Annotations is an unstructured key value map stored with a resource that may be set by external tools to store and retrieve arbitrary metadata. They are not queryable and should be preserved when modifying objects. More info: http://kubernetes.io/docs/user-guide/annotations")
  @JsonProperty("annotations")
  public Map<String, String> getAnnotations() {
    return annotations;
  }
  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  /**
   * The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the cluster which the object belongs to. This is used to distinguish resources with same name and namespace in different clusters. This field is not set anywhere right now and apiserver is going to ignore it if set in create or update request.")
  @JsonProperty("clusterName")
  public String getClusterName() {
    return clusterName;
  }
  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  /**
   * CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.  Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta creationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "CreationTimestamp is a timestamp representing the server time when this object was created. It is not guaranteed to be set in happens-before order across separate operations. Clients may not set this value. It is represented in RFC3339 form and is in UTC.  Populated by the system. Read-only. Null for lists. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  @JsonProperty("creationTimestamp")
  public String getCreationTimestamp() {
    return creationTimestamp;
  }
  public void setCreationTimestamp(String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }

  /**
   * Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta deletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    return this;
  }

  
  @ApiModelProperty(value = "Number of seconds allowed for this object to gracefully terminate before it will be removed from the system. Only set when deletionTimestamp is also set. May only be shortened. Read-only.")
  @JsonProperty("deletionGracePeriodSeconds")
  public Long getDeletionGracePeriodSeconds() {
    return deletionGracePeriodSeconds;
  }
  public void setDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
    this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
  }

  /**
   * DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.  Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta deletionTimestamp(String deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
    return this;
  }

  
  @ApiModelProperty(value = "DeletionTimestamp is RFC 3339 date and time at which this resource will be deleted. This field is set by the server when a graceful deletion is requested by the user, and is not directly settable by a client. The resource is expected to be deleted (no longer visible from resource lists, and not reachable by name) after the time in this field, once the finalizers list is empty. As long as the finalizers list contains items, deletion is blocked. Once the deletionTimestamp is set, this value may not be unset or be set further into the future, although it may be shortened or the resource may be deleted prior to this time. For example, a user may request that a pod is deleted in 30 seconds. The Kubelet will react by sending a graceful termination signal to the containers in the pod. After that 30 seconds, the Kubelet will send a hard termination signal (SIGKILL) to the container and after cleanup, remove the pod from the API. In the presence of network partitions, this object may still exist after this timestamp, until an administrator or automated process can determine the resource is fully terminated. If not set, graceful deletion of the object has not been requested.  Populated by the system when a graceful deletion is requested. Read-only. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  @JsonProperty("deletionTimestamp")
  public String getDeletionTimestamp() {
    return deletionTimestamp;
  }
  public void setDeletionTimestamp(String deletionTimestamp) {
    this.deletionTimestamp = deletionTimestamp;
  }

  /**
   * Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed.
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta finalizers(List<String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  
  @ApiModelProperty(value = "Must be empty before the object is deleted from the registry. Each entry is an identifier for the responsible component that will remove the entry from the list. If the deletionTimestamp of the object is non-nil, entries in this list can only be removed.")
  @JsonProperty("finalizers")
  public List<String> getFinalizers() {
    return finalizers;
  }
  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }

  /**
   * GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.  If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).  Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#idempotency
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta generateName(String generateName) {
    this.generateName = generateName;
    return this;
  }

  
  @ApiModelProperty(value = "GenerateName is an optional prefix, used by the server, to generate a unique name ONLY IF the Name field has not been provided. If this field is used, the name returned to the client will be different than the name passed. This value will also be combined with a unique suffix. The provided value has the same validation rules as the Name field, and may be truncated by the length of the suffix required to make the value unique on the server.  If this field is specified and the generated name exists, the server will NOT return a 409 - instead, it will either return 201 Created or 500 with Reason ServerTimeout indicating a unique name could not be found in the time allotted, and the client should retry (optionally after the time indicated in the Retry-After header).  Applied only if Name is not specified. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#idempotency")
  @JsonProperty("generateName")
  public String getGenerateName() {
    return generateName;
  }
  public void setGenerateName(String generateName) {
    this.generateName = generateName;
  }

  /**
   * A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta generation(Long generation) {
    this.generation = generation;
    return this;
  }

  
  @ApiModelProperty(value = "A sequence number representing a specific generation of the desired state. Populated by the system. Read-only.")
  @JsonProperty("generation")
  public Long getGeneration() {
    return generation;
  }
  public void setGeneration(Long generation) {
    this.generation = generation;
  }

  /**
   * An initializer is a controller which enforces some system invariant at object creation time. This field is a list of initializers that have not yet acted on this object. If nil or empty, this object has been completely initialized. Otherwise, the object is considered uninitialized and is hidden (in list/watch and get calls) from clients that haven&#39;t explicitly asked to observe uninitialized objects.  When an object is created, the system will populate this list with the current set of initializers. Only privileged users may set or modify this list. Once it is empty, it may not be modified further by any user.
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta initializers(IoK8sApimachineryPkgApisMetaV1Initializers initializers) {
    this.initializers = initializers;
    return this;
  }

  
  @ApiModelProperty(value = "An initializer is a controller which enforces some system invariant at object creation time. This field is a list of initializers that have not yet acted on this object. If nil or empty, this object has been completely initialized. Otherwise, the object is considered uninitialized and is hidden (in list/watch and get calls) from clients that haven't explicitly asked to observe uninitialized objects.  When an object is created, the system will populate this list with the current set of initializers. Only privileged users may set or modify this list. Once it is empty, it may not be modified further by any user.")
  @JsonProperty("initializers")
  public IoK8sApimachineryPkgApisMetaV1Initializers getInitializers() {
    return initializers;
  }
  public void setInitializers(IoK8sApimachineryPkgApisMetaV1Initializers initializers) {
    this.initializers = initializers;
  }

  /**
   * Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  
  @ApiModelProperty(value = "Map of string keys and values that can be used to organize and categorize (scope and select) objects. May match selectors of replication controllers and services. More info: http://kubernetes.io/docs/user-guide/labels")
  @JsonProperty("labels")
  public Map<String, String> getLabels() {
    return labels;
  }
  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  /**
   * Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Namespace defines the space within each name must be unique. An empty namespace is equivalent to the \&quot;default\&quot; namespace, but \&quot;default\&quot; is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.  Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  
  @ApiModelProperty(value = "Namespace defines the space within each name must be unique. An empty namespace is equivalent to the \"default\" namespace, but \"default\" is the canonical representation. Not all objects are required to be scoped to a namespace - the value of this field for those objects will be empty.  Must be a DNS_LABEL. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/namespaces")
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta ownerReferences(List<IoK8sApimachineryPkgApisMetaV1OwnerReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
    return this;
  }

  
  @ApiModelProperty(value = "List of objects depended by this object. If ALL objects in the list have been deleted, this object will be garbage collected. If this object is managed by a controller, then an entry in this list will point to this controller, with the controller field set to true. There cannot be more than one managing controller.")
  @JsonProperty("ownerReferences")
  public List<IoK8sApimachineryPkgApisMetaV1OwnerReference> getOwnerReferences() {
    return ownerReferences;
  }
  public void setOwnerReferences(List<IoK8sApimachineryPkgApisMetaV1OwnerReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
  }

  /**
   * An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta resourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
    return this;
  }

  
  @ApiModelProperty(value = "An opaque value that represents the internal version of this object that can be used by clients to determine when objects have changed. May be used for optimistic concurrency, change detection, and the watch operation on a resource or set of resources. Clients must treat these values as opaque and passed unmodified back to the server. They may only be valid for a particular resource or set of resources.  Populated by the system. Read-only. Value must be treated as opaque by clients and . More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#concurrency-control-and-consistency")
  @JsonProperty("resourceVersion")
  public String getResourceVersion() {
    return resourceVersion;
  }
  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }

  /**
   * SelfLink is a URL representing this object. Populated by the system. Read-only.
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  
  @ApiModelProperty(value = "SelfLink is a URL representing this object. Populated by the system. Read-only.")
  @JsonProperty("selfLink")
  public String getSelfLink() {
    return selfLink;
  }
  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }

  /**
   * UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
   **/
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta uid(String uid) {
    this.uid = uid;
    return this;
  }

  
  @ApiModelProperty(value = "UID is the unique in time and space value for this object. It is typically generated by the server on successful creation of a resource and is not allowed to change on PUT operations.  Populated by the system. Read-only. More info: http://kubernetes.io/docs/user-guide/identifiers#uids")
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApimachineryPkgApisMetaV1ObjectMeta ioK8sApimachineryPkgApisMetaV1ObjectMeta = (IoK8sApimachineryPkgApisMetaV1ObjectMeta) o;
    return Objects.equals(annotations, ioK8sApimachineryPkgApisMetaV1ObjectMeta.annotations) &&
        Objects.equals(clusterName, ioK8sApimachineryPkgApisMetaV1ObjectMeta.clusterName) &&
        Objects.equals(creationTimestamp, ioK8sApimachineryPkgApisMetaV1ObjectMeta.creationTimestamp) &&
        Objects.equals(deletionGracePeriodSeconds, ioK8sApimachineryPkgApisMetaV1ObjectMeta.deletionGracePeriodSeconds) &&
        Objects.equals(deletionTimestamp, ioK8sApimachineryPkgApisMetaV1ObjectMeta.deletionTimestamp) &&
        Objects.equals(finalizers, ioK8sApimachineryPkgApisMetaV1ObjectMeta.finalizers) &&
        Objects.equals(generateName, ioK8sApimachineryPkgApisMetaV1ObjectMeta.generateName) &&
        Objects.equals(generation, ioK8sApimachineryPkgApisMetaV1ObjectMeta.generation) &&
        Objects.equals(initializers, ioK8sApimachineryPkgApisMetaV1ObjectMeta.initializers) &&
        Objects.equals(labels, ioK8sApimachineryPkgApisMetaV1ObjectMeta.labels) &&
        Objects.equals(name, ioK8sApimachineryPkgApisMetaV1ObjectMeta.name) &&
        Objects.equals(namespace, ioK8sApimachineryPkgApisMetaV1ObjectMeta.namespace) &&
        Objects.equals(ownerReferences, ioK8sApimachineryPkgApisMetaV1ObjectMeta.ownerReferences) &&
        Objects.equals(resourceVersion, ioK8sApimachineryPkgApisMetaV1ObjectMeta.resourceVersion) &&
        Objects.equals(selfLink, ioK8sApimachineryPkgApisMetaV1ObjectMeta.selfLink) &&
        Objects.equals(uid, ioK8sApimachineryPkgApisMetaV1ObjectMeta.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, clusterName, creationTimestamp, deletionGracePeriodSeconds, deletionTimestamp, finalizers, generateName, generation, initializers, labels, name, namespace, ownerReferences, resourceVersion, selfLink, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApimachineryPkgApisMetaV1ObjectMeta {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
    sb.append("    deletionGracePeriodSeconds: ").append(toIndentedString(deletionGracePeriodSeconds)).append("\n");
    sb.append("    deletionTimestamp: ").append(toIndentedString(deletionTimestamp)).append("\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
    sb.append("    generateName: ").append(toIndentedString(generateName)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
    sb.append("    initializers: ").append(toIndentedString(initializers)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    ownerReferences: ").append(toIndentedString(ownerReferences)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

