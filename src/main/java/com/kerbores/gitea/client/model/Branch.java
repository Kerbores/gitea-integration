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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Branch represents a repository branch
 */
@ApiModel(description = "Branch represents a repository branch")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-17T06:59:13.679Z")
public class Branch {
  @SerializedName("commit")
  private PayloadCommit commit = null;

  @SerializedName("enable_status_check")
  private Boolean enableStatusCheck = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("protected")
  private Boolean _protected = null;

  @SerializedName("required_approvals")
  private Long requiredApprovals = null;

  @SerializedName("status_check_contexts")
  private List<String> statusCheckContexts = null;

  @SerializedName("user_can_merge")
  private Boolean userCanMerge = null;

  @SerializedName("user_can_push")
  private Boolean userCanPush = null;

  public Branch commit(PayloadCommit commit) {
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @ApiModelProperty(value = "")
  public PayloadCommit getCommit() {
    return commit;
  }

  public void setCommit(PayloadCommit commit) {
    this.commit = commit;
  }

  public Branch enableStatusCheck(Boolean enableStatusCheck) {
    this.enableStatusCheck = enableStatusCheck;
    return this;
  }

   /**
   * Get enableStatusCheck
   * @return enableStatusCheck
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnableStatusCheck() {
    return enableStatusCheck;
  }

  public void setEnableStatusCheck(Boolean enableStatusCheck) {
    this.enableStatusCheck = enableStatusCheck;
  }

  public Branch name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Branch _protected(Boolean _protected) {
    this._protected = _protected;
    return this;
  }

   /**
   * Get _protected
   * @return _protected
  **/
  @ApiModelProperty(value = "")
  public Boolean isProtected() {
    return _protected;
  }

  public void setProtected(Boolean _protected) {
    this._protected = _protected;
  }

  public Branch requiredApprovals(Long requiredApprovals) {
    this.requiredApprovals = requiredApprovals;
    return this;
  }

   /**
   * Get requiredApprovals
   * @return requiredApprovals
  **/
  @ApiModelProperty(value = "")
  public Long getRequiredApprovals() {
    return requiredApprovals;
  }

  public void setRequiredApprovals(Long requiredApprovals) {
    this.requiredApprovals = requiredApprovals;
  }

  public Branch statusCheckContexts(List<String> statusCheckContexts) {
    this.statusCheckContexts = statusCheckContexts;
    return this;
  }

  public Branch addStatusCheckContextsItem(String statusCheckContextsItem) {
    if (this.statusCheckContexts == null) {
      this.statusCheckContexts = new ArrayList<String>();
    }
    this.statusCheckContexts.add(statusCheckContextsItem);
    return this;
  }

   /**
   * Get statusCheckContexts
   * @return statusCheckContexts
  **/
  @ApiModelProperty(value = "")
  public List<String> getStatusCheckContexts() {
    return statusCheckContexts;
  }

  public void setStatusCheckContexts(List<String> statusCheckContexts) {
    this.statusCheckContexts = statusCheckContexts;
  }

  public Branch userCanMerge(Boolean userCanMerge) {
    this.userCanMerge = userCanMerge;
    return this;
  }

   /**
   * Get userCanMerge
   * @return userCanMerge
  **/
  @ApiModelProperty(value = "")
  public Boolean isUserCanMerge() {
    return userCanMerge;
  }

  public void setUserCanMerge(Boolean userCanMerge) {
    this.userCanMerge = userCanMerge;
  }

  public Branch userCanPush(Boolean userCanPush) {
    this.userCanPush = userCanPush;
    return this;
  }

   /**
   * Get userCanPush
   * @return userCanPush
  **/
  @ApiModelProperty(value = "")
  public Boolean isUserCanPush() {
    return userCanPush;
  }

  public void setUserCanPush(Boolean userCanPush) {
    this.userCanPush = userCanPush;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Branch branch = (Branch) o;
    return Objects.equals(this.commit, branch.commit) &&
        Objects.equals(this.enableStatusCheck, branch.enableStatusCheck) &&
        Objects.equals(this.name, branch.name) &&
        Objects.equals(this._protected, branch._protected) &&
        Objects.equals(this.requiredApprovals, branch.requiredApprovals) &&
        Objects.equals(this.statusCheckContexts, branch.statusCheckContexts) &&
        Objects.equals(this.userCanMerge, branch.userCanMerge) &&
        Objects.equals(this.userCanPush, branch.userCanPush);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commit, enableStatusCheck, name, _protected, requiredApprovals, statusCheckContexts, userCanMerge, userCanPush);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
    sb.append("    enableStatusCheck: ").append(toIndentedString(enableStatusCheck)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
    sb.append("    requiredApprovals: ").append(toIndentedString(requiredApprovals)).append("\n");
    sb.append("    statusCheckContexts: ").append(toIndentedString(statusCheckContexts)).append("\n");
    sb.append("    userCanMerge: ").append(toIndentedString(userCanMerge)).append("\n");
    sb.append("    userCanPush: ").append(toIndentedString(userCanPush)).append("\n");
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
