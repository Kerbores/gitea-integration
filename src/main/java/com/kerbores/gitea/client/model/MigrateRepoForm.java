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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * MigrateRepoForm form for migrating repository
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MigrateRepoForm {
    @JSONField(name = "auth_password")
    private String authPassword;

    @JSONField(name = "auth_username")
    private String authUsername;

    @JSONField(name = "clone_addr")
    private String cloneAddr;

    @JSONField(name = "description")
    private String description;

    @JSONField(name = "issues")
    private Boolean issues;

    @JSONField(name = "labels")
    private Boolean labels;

    @JSONField(name = "milestones")
    private Boolean milestones;

    @JSONField(name = "mirror")
    private Boolean mirror;

    @JSONField(name = "private")
    private Boolean _private;

    @JSONField(name = "pull_requests")
    private Boolean pullRequests;

    @JSONField(name = "releases")
    private Boolean releases;

    @JSONField(name = "repo_name")
    private String repoName;

    @JSONField(name = "uid")
    private Long uid;

    @JSONField(name = "wiki")
    private Boolean wiki;

}
