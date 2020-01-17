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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * RepoCommit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-17T06:59:13.679Z")
public class RepoCommit {
  @SerializedName("author")
  private CommitUser author = null;

  @SerializedName("committer")
  private CommitUser committer = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("tree")
  private CommitMeta tree = null;

  @SerializedName("url")
  private String url = null;

  public RepoCommit author(CommitUser author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public CommitUser getAuthor() {
    return author;
  }

  public void setAuthor(CommitUser author) {
    this.author = author;
  }

  public RepoCommit committer(CommitUser committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @ApiModelProperty(value = "")
  public CommitUser getCommitter() {
    return committer;
  }

  public void setCommitter(CommitUser committer) {
    this.committer = committer;
  }

  public RepoCommit message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RepoCommit tree(CommitMeta tree) {
    this.tree = tree;
    return this;
  }

   /**
   * Get tree
   * @return tree
  **/
  @ApiModelProperty(value = "")
  public CommitMeta getTree() {
    return tree;
  }

  public void setTree(CommitMeta tree) {
    this.tree = tree;
  }

  public RepoCommit url(String url) {
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
    RepoCommit repoCommit = (RepoCommit) o;
    return Objects.equals(this.author, repoCommit.author) &&
        Objects.equals(this.committer, repoCommit.committer) &&
        Objects.equals(this.message, repoCommit.message) &&
        Objects.equals(this.tree, repoCommit.tree) &&
        Objects.equals(this.url, repoCommit.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, committer, message, tree, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoCommit {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
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

