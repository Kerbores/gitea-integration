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
 * PRBranchInfo information about a branch
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PRBranchInfo {
    @JSONField(name = "label")
    private String label;

    @JSONField(name = "ref")
    private String ref;

    @JSONField(name = "repo")
    private Repository repo;

    @JSONField(name = "repo_id")
    private Long repoId;

    @JSONField(name = "sha")
    private String sha;

}
