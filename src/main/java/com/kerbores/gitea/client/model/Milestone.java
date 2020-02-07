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

import org.nutz.json.JsonField;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Milestone milestone is a collection of issues on one repository
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Milestone {
    @JsonField("closed_at")
    private Date closedAt;

    @JsonField("closed_issues")
    private Long closedIssues;

    @JsonField("description")
    private String description;

    @JsonField("due_on")
    private Date dueOn;

    @JsonField("id")
    private Long id;

    @JsonField("open_issues")
    private Long openIssues;

    @JsonField("state")
    private String state;

    @JsonField("title")
    private String title;

}
