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

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Comment represents a comment on a commit or issue
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @JSONField(name = "body")
    private String body;

    @JSONField(name = "created_at")
    private Date createdAt;

    @JSONField(name = "html_url")
    private String htmlUrl;

    @JSONField(name = "id")
    private Long id;

    @JSONField(name = "issue_url")
    private String issueUrl;

    @JSONField(name = "original_author")
    private String originalAuthor;

    @JSONField(name = "original_author_id")
    private Long originalAuthorId;

    @JSONField(name = "pull_request_url")
    private String pullRequestUrl;

    @JSONField(name = "updated_at")
    private OffsetDateTime updatedAt;

    @JSONField(name = "user")
    private User user;

}
