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

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UpdateFileOptions options for updating files Note: &#x60;author&#x60; and
 * &#x60;committer&#x60; are optional (if only one is given, it will be used for
 * the other, otherwise the authenticated user will be used)
 */
@ApiModel(
        description = "UpdateFileOptions options for updating files Note: `author` and `committer` are optional (if only one is given, it will be used for the other, otherwise the authenticated user will be used)")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateFileOptions {
    @JSONField(name = "author")
    private Identity author;

    @JSONField(name = "branch")
    private String branch;

    @JSONField(name = "committer")
    private Identity committer;

    @JSONField(name = "content")
    private String content;

    @JSONField(name = "dates")
    private CommitDateOptions dates;

    @JSONField(name = "from_path")
    private String fromPath;

    @JSONField(name = "message")
    private String message;

    @JSONField(name = "new_branch")
    private String newBranch;

    @JSONField(name = "sha")
    private String sha;

}
