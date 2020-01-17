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
 * CreateGPGKeyOption options create user GPG key
 */
@ApiModel(description = "CreateGPGKeyOption options create user GPG key")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-17T06:59:13.679Z")
public class CreateGPGKeyOption {
  @SerializedName("armored_public_key")
  private String armoredPublicKey = null;

  public CreateGPGKeyOption armoredPublicKey(String armoredPublicKey) {
    this.armoredPublicKey = armoredPublicKey;
    return this;
  }

   /**
   * An armored GPG key to add
   * @return armoredPublicKey
  **/
  @ApiModelProperty(required = true, value = "An armored GPG key to add")
  public String getArmoredPublicKey() {
    return armoredPublicKey;
  }

  public void setArmoredPublicKey(String armoredPublicKey) {
    this.armoredPublicKey = armoredPublicKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGPGKeyOption createGPGKeyOption = (CreateGPGKeyOption) o;
    return Objects.equals(this.armoredPublicKey, createGPGKeyOption.armoredPublicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(armoredPublicKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGPGKeyOption {\n");
    
    sb.append("    armoredPublicKey: ").append(toIndentedString(armoredPublicKey)).append("\n");
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

