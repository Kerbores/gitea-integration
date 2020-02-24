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

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * WatchInfo represents an API watch status of one repository
 */
@ApiModel(description = "WatchInfo represents an API watch status of one repository")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WatchInfo {
    @JSONField(name = "created_at")
    private Date createdAt;

    @JSONField(name = "ignored")
    private Boolean ignored;

    @JSONField(name = "reason")
    private Object reason;

    @JSONField(name = "repository_url")
    private String repositoryUrl;

    @JSONField(name = "subscribed")
    private Boolean subscribed;

    @JSONField(name = "url")
    private String url;

}
