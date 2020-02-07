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
 * Commit
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Commit {
    @JsonField("author")
    private User author;

    @JsonField("commit")
    private RepoCommit commit;

    @JsonField("committer")
    private User committer;

    @JsonField("html_url")
    private String htmlUrl;

    @JsonField("parents")
    private List<CommitMeta> parents;

    @JsonField("sha")
    private String sha;

    @JsonField("url")
    private String url;

}
