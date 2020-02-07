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

import java.util.Date;
import java.util.List;

import org.nutz.json.JsonField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * PayloadCommit represents a commit
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayloadCommit {
    @JsonField("added")
    private List<String> added;

    @JsonField("author")
    private PayloadUser author;

    @JsonField("committer")
    private PayloadUser committer;

    @JsonField("id")
    private String id;

    @JsonField("message")
    private String message;

    @JsonField("modified")
    private List<String> modified;

    @JsonField("removed")
    private List<String> removed;

    @JsonField("timestamp")
    private Date timestamp;

    @JsonField("url")
    private String url;

    @JsonField("verification")
    private PayloadCommitVerification verification;

    public PayloadCommit added(List<String> added) {
        this.added = added;
        return this;
    }

}
