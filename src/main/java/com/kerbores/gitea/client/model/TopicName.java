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

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TopicName a list of repo topic names
 */
@ApiModel(description = "TopicName a list of repo topic names")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TopicName {
    @JsonField("topics")
    private List<String> topics;

}
