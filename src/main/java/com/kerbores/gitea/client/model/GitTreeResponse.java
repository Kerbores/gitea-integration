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
 * GitTreeResponse returns a git tree
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GitTreeResponse {
    @JSONField(name = "page")
    private Long page;

    @JSONField(name = "sha")
    private String sha;

    @JSONField(name = "total_count")
    private Long totalCount;

    @JSONField(name = "tree")
    private List<GitEntry> tree;

    @JSONField(name = "truncated")
    private Boolean truncated;

    @JSONField(name = "url")
    private String url;

}
