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
 * CreateKeyOption options when creating a key
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateKeyOption {
    @JSONField(name = "key")
    private String key;

    @JSONField(name = "read_only")
    private Boolean readOnly;

    @JSONField(name = "title")
    private String title;

}
