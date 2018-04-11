package io.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.model.IoK8sApiCoreV1PodDNSConfigOption;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


/**
 * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
 **/
import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
@ApiModel(description = "PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.")

public class IoK8sApiCoreV1PodDNSConfig   {
  
  private @Valid List<String> nameservers = new ArrayList<String>();
  private @Valid List<IoK8sApiCoreV1PodDNSConfigOption> options = new ArrayList<IoK8sApiCoreV1PodDNSConfigOption>();
  private @Valid List<String> searches = new ArrayList<String>();

  /**
   * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
   **/
  public IoK8sApiCoreV1PodDNSConfig nameservers(List<String> nameservers) {
    this.nameservers = nameservers;
    return this;
  }

  
  @ApiModelProperty(value = "A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.")
  @JsonProperty("nameservers")
  public List<String> getNameservers() {
    return nameservers;
  }
  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }

  /**
   * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
   **/
  public IoK8sApiCoreV1PodDNSConfig options(List<IoK8sApiCoreV1PodDNSConfigOption> options) {
    this.options = options;
    return this;
  }

  
  @ApiModelProperty(value = "A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.")
  @JsonProperty("options")
  public List<IoK8sApiCoreV1PodDNSConfigOption> getOptions() {
    return options;
  }
  public void setOptions(List<IoK8sApiCoreV1PodDNSConfigOption> options) {
    this.options = options;
  }

  /**
   * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
   **/
  public IoK8sApiCoreV1PodDNSConfig searches(List<String> searches) {
    this.searches = searches;
    return this;
  }

  
  @ApiModelProperty(value = "A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.")
  @JsonProperty("searches")
  public List<String> getSearches() {
    return searches;
  }
  public void setSearches(List<String> searches) {
    this.searches = searches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1PodDNSConfig ioK8sApiCoreV1PodDNSConfig = (IoK8sApiCoreV1PodDNSConfig) o;
    return Objects.equals(nameservers, ioK8sApiCoreV1PodDNSConfig.nameservers) &&
        Objects.equals(options, ioK8sApiCoreV1PodDNSConfig.options) &&
        Objects.equals(searches, ioK8sApiCoreV1PodDNSConfig.searches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameservers, options, searches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1PodDNSConfig {\n");
    
    sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    searches: ").append(toIndentedString(searches)).append("\n");
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

