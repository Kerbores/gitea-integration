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
 * PayloadCommitVerification represents the GPG verification of a commit
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PayloadCommitVerification {
    @JSONField(name = "payload")
    private String payload;

    @JSONField(name = "reason")
    private String reason;

    @JSONField(name = "signature")
    private String signature;

    @JSONField(name = "signer")
    private PayloadUser signer;

    @JSONField(name = "verified")
    private Boolean verified;

}
