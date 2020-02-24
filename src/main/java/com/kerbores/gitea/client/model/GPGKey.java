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
 * GPGKey a user GPG key to sign commit and tag in repository
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GPGKey {
    @JSONField(name = "can_certify")
    private Boolean canCertify;

    @JSONField(name = "can_encrypt_comms")
    private Boolean canEncryptComms;

    @JSONField(name = "can_encrypt_storage")
    private Boolean canEncryptStorage;

    @JSONField(name = "can_sign")
    private Boolean canSign;

    @JSONField(name = "created_at")
    private Date createdAt;

    @JSONField(name = "emails")
    private List<GPGKeyEmail> emails;

    @JSONField(name = "expires_at")
    private Date expiresAt;

    @JSONField(name = "id")
    private Long id;

    @JSONField(name = "key_id")
    private String keyId;

    @JSONField(name = "primary_key_id")
    private String primaryKeyId;

    @JSONField(name = "public_key")
    private String publicKey;

    @JSONField(name = "subkeys")
    private List<GPGKey> subkeys;

}
