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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Issue represents an issue in a repository
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Issue {
    @JSONField(name = "assignee")
    private User assignee;

    @JSONField(name = "assignees")
    private List<User> assignees;

    @JSONField(name = "body")
    private String body;

    @JSONField(name = "closed_at")
    private Date closedAt;

    @JSONField(name = "comments")
    private Long comments;

    @JSONField(name = "created_at")
    private Date createdAt;

    @JSONField(name = "due_date")
    private Date dueDate;

    @JSONField(name = "html_url")
    private String htmlUrl;

    @JSONField(name = "id")
    private Long id;

    @JSONField(name = "labels")
    private List<Label> labels;

    @JSONField(name = "milestone")
    private Milestone milestone;

    @JSONField(name = "number")
    private Long number;

    @JSONField(name = "original_author")
    private String originalAuthor;

    @JSONField(name = "original_author_id")
    private Long originalAuthorId;

    @JSONField(name = "pull_request")
    private PullRequestMeta pullRequest;

    @JSONField(name = "repository")
    private RepositoryMeta repository;

    @JSONField(name = "state")
    private String state;

    @JSONField(name = "title")
    private String title;

    @JSONField(name = "updated_at")
    private OffsetDateTime updatedAt;

    @JSONField(name = "url")
    private String url;

    @JSONField(name = "user")
    private User user;

}
