/*
 * Gitea API. This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git Do not edit the class
 * manually.
 */

package com.kerbores.gitea.client.model;

import org.nutz.json.JsonField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GitObject
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GitObject {
    @JsonField("sha")
    private String sha;

    @JsonField("type")
    private String type;

    @JsonField("url")
    private String url;

}
