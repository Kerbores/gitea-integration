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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ExternalWiki represents setting for external wiki
 */
@ApiModel(description = "ExternalWiki represents setting for external wiki")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-17T06:59:13.679Z")
public class ExternalWiki {
  @SerializedName("external_wiki_url")
  private String externalWikiUrl = null;

  public ExternalWiki externalWikiUrl(String externalWikiUrl) {
    this.externalWikiUrl = externalWikiUrl;
    return this;
  }

   /**
   * URL of external wiki.
   * @return externalWikiUrl
  **/
  @ApiModelProperty(value = "URL of external wiki.")
  public String getExternalWikiUrl() {
    return externalWikiUrl;
  }

  public void setExternalWikiUrl(String externalWikiUrl) {
    this.externalWikiUrl = externalWikiUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalWiki externalWiki = (ExternalWiki) o;
    return Objects.equals(this.externalWikiUrl, externalWiki.externalWikiUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalWikiUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalWiki {\n");
    
    sb.append("    externalWikiUrl: ").append(toIndentedString(externalWikiUrl)).append("\n");
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

