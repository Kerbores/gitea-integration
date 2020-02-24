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
 * CreateOrgOption options for creating an organization
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrgOption {
    @JSONField(name = "description")
    private String description;

    @JSONField(name = "full_name")
    private String fullName;

    @JSONField(name = "location")
    private String location;

    @JSONField(name = "repo_admin_change_team_access")
    private Boolean repoAdminChangeTeamAccess;

    @JSONField(name = "username")
    private String username;

}
