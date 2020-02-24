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
 * FileResponse contains information about a repo&#39;s file
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileResponse {
    @JSONField(name = "commit")
    private FileCommitResponse commit;

    @JSONField(name = "content")
    private ContentsResponse content;

    @JSONField(name = "verification")
    private PayloadCommitVerification verification;

}
