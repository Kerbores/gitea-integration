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

import com.alibaba.fastjson.annotation.JSONField;

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
    @JSONField(name = "author")
    private CommitUser author;

    @JSONField(name = "committer")
    private CommitUser committer;

    @JSONField(name = "html_url")
    private String htmlUrl;

    @JSONField(name = "message")
    private String message;

    @JSONField(name = "parents")
    private List<CommitMeta> parents;

    @JSONField(name = "sha")
    private String sha;

    @JSONField(name = "tree")
    private CommitMeta tree;

    @JSONField(name = "url")
    private String url;

}
