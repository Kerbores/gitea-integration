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

import java.util.List;

import org.nutz.json.JsonField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FileCommitResponse
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileCommitResponse {
    @JsonField("author")
    private CommitUser author;

    @JsonField("committer")
    private CommitUser committer;

    @JsonField("html_url")
    private String htmlUrl;

    @JsonField("message")
    private String message;

    @JsonField("parents")
    private List<CommitMeta> parents;

    @JsonField("sha")
    private String sha;

    @JsonField("tree")
    private CommitMeta tree;

    @JsonField("url")
    private String url;

}
