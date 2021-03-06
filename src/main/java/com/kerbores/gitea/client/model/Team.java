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

import com.alibaba.fastjson.annotation.JSONField;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Team represents a team in an organization
 */
@ApiModel(description = "Team represents a team in an organization")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @JSONField(name = "can_create_org_repo")
    private Boolean canCreateOrgRepo;

    @JSONField(name = "description")
    private String description;

    @JSONField(name = "id")
    private Long id;

    @JSONField(name = "includes_all_repositories")
    private Boolean includesAllRepositories;

    @JSONField(name = "name")
    private String name;

    @JSONField(name = "organization")
    private Organization organization;

    /**
     * Gets or Sets permission
     */
    public enum PermissionEnum {
        NONE("none"),

        READ("read"),

        WRITE("write"),

        ADMIN("admin"),

        OWNER("owner");

        private String value;

        PermissionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PermissionEnum fromValue(String text) {
            for (PermissionEnum b : PermissionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

    }

    @JSONField(name = "permission")
    private PermissionEnum permission;

    @JSONField(name = "units")
    private List<String> units;

}
