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
 * CreateEmailOption options when creating email addresses
 */
@ApiModel(description = "CreateEmailOption options when creating email addresses")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-17T06:59:13.679Z")
public class CreateEmailOption {
  @SerializedName("emails")
  private List<String> emails = null;

  public CreateEmailOption emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public CreateEmailOption addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<String>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * email addresses to add
   * @return emails
  **/
  @ApiModelProperty(value = "email addresses to add")
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmailOption createEmailOption = (CreateEmailOption) o;
    return Objects.equals(this.emails, createEmailOption.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmailOption {\n");
    
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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

