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

import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Release represents a repository release
 */
@ApiModel(description = "Release represents a repository release")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Release {
    @JSONField(name = "assets")
    private List<Attachment> assets;

    @JSONField(name = "author")
    private User author;

    @JSONField(name = "body")
    private String body;

    @JSONField(name = "created_at")
    private Date createdAt;

    @JSONField(name = "draft")
    private Boolean draft;

    @JSONField(name = "id")
    private Long id;

    @JSONField(name = "name")
    private String name;

    @JSONField(name = "prerelease")
    private Boolean prerelease;

    @JSONField(name = "published_at")
    private OffsetDateTime publishedAt;

    @JSONField(name = "tag_name")
    private String tagName;

    @JSONField(name = "tarball_url")
    private String tarballUrl;

    @JSONField(name = "target_commitish")
    private String targetCommitish;

    @JSONField(name = "url")
    private String url;

    @JSONField(name = "zipball_url")
    private String zipballUrl;

}
