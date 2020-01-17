/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kerbores.gitea.client.model;

import java.util.Objects;

import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WatchInfo represents an API watch status of one repository
 */
@ApiModel(description = "WatchInfo represents an API watch status of one repository")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-17T06:59:13.679Z")
public class WatchInfo {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("ignored")
  private Boolean ignored = null;

  @SerializedName("reason")
  private Object reason = null;

  @SerializedName("repository_url")
  private String repositoryUrl = null;

  @SerializedName("subscribed")
  private Boolean subscribed = null;

  @SerializedName("url")
  private String url = null;

  public WatchInfo createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public WatchInfo ignored(Boolean ignored) {
    this.ignored = ignored;
    return this;
  }

   /**
   * Get ignored
   * @return ignored
  **/
  @ApiModelProperty(value = "")
  public Boolean isIgnored() {
    return ignored;
  }

  public void setIgnored(Boolean ignored) {
    this.ignored = ignored;
  }

  public WatchInfo reason(Object reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public Object getReason() {
    return reason;
  }

  public void setReason(Object reason) {
    this.reason = reason;
  }

  public WatchInfo repositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
    return this;
  }

   /**
   * Get repositoryUrl
   * @return repositoryUrl
  **/
  @ApiModelProperty(value = "")
  public String getRepositoryUrl() {
    return repositoryUrl;
  }

  public void setRepositoryUrl(String repositoryUrl) {
    this.repositoryUrl = repositoryUrl;
  }

  public WatchInfo subscribed(Boolean subscribed) {
    this.subscribed = subscribed;
    return this;
  }

   /**
   * Get subscribed
   * @return subscribed
  **/
  @ApiModelProperty(value = "")
  public Boolean isSubscribed() {
    return subscribed;
  }

  public void setSubscribed(Boolean subscribed) {
    this.subscribed = subscribed;
  }

  public WatchInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchInfo watchInfo = (WatchInfo) o;
    return Objects.equals(this.createdAt, watchInfo.createdAt) &&
        Objects.equals(this.ignored, watchInfo.ignored) &&
        Objects.equals(this.reason, watchInfo.reason) &&
        Objects.equals(this.repositoryUrl, watchInfo.repositoryUrl) &&
        Objects.equals(this.subscribed, watchInfo.subscribed) &&
        Objects.equals(this.url, watchInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, ignored, reason, repositoryUrl, subscribed, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchInfo {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    ignored: ").append(toIndentedString(ignored)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
    sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

