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

import com.alibaba.fastjson.annotation.JSONField;

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
    @JSONField(name = "added")
    private List<String> added;

    @JSONField(name = "author")
    private PayloadUser author;

    @JSONField(name = "committer")
    private PayloadUser committer;

    @JSONField(name = "id")
    private String id;

    @JSONField(name = "message")
    private String message;

    @JSONField(name = "modified")
    private List<String> modified;

    @JSONField(name = "removed")
    private List<String> removed;

    @JSONField(name = "timestamp")
    private Date timestamp;

    @JSONField(name = "url")
    private String url;

    @JSONField(name = "verification")
    private PayloadCommitVerification verification;

    public PayloadCommit added(List<String> added) {
        this.added = added;
        return this;
    }

}
