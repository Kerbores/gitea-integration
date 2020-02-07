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
 * CreateTeamOption options for creating a team
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTeamOption {
    @JsonField("can_create_org_repo")
    private Boolean canCreateOrgRepo;

    @JsonField("description")
    private String description;

    @JsonField("includes_all_repositories")
    private Boolean includesAllRepositories;

    @JsonField("name")
    private String name;

    /**
     * Gets or Sets permission
     */
    public enum PermissionEnum {
        READ("read"),

        WRITE("write"),

        ADMIN("admin");

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

    @JsonField("permission")
    private PermissionEnum permission;

    @JsonField("units")
    private List<String> units;

}
