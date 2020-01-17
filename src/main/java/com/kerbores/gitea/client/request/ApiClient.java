package com.kerbores.gitea.client.request;

import java.util.Map;

import com.kerbores.gitea.client.auth.Authentication;

/**
 * 
 * @author kerbores(kerbores@gmail.com)
 */
public interface ApiClient {

    String basePath();

    Authentication authentication();

    Response send(String path, String method, Object body, Map<String, Object> params, Map<String, String> header);

}
