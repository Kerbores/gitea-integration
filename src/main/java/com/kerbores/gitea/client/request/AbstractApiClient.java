package com.kerbores.gitea.client.request;

import java.util.HashMap;
import java.util.Map;

import com.kerbores.gitea.client.auth.Authentication;

/**
 * @author kerbores(kerbores@gmail.com)
 */
public abstract class AbstractApiClient implements ApiClient {

    @Override
    public Response send(String path, String method, Object body, Map<String, Object> params, Map<String, String> header) {
        header = header == null ? new HashMap<>() : header;
        authentication().applyToHeader(header);
        return _send(String.format("%s/%s", basePath(), path), method, body, params, header);
    }

    @Override
    public Response send(String path,
                         String method,
                         Object body,
                         Map<String, Object> params,
                         Map<String, String> header,
                         Authentication authentication) {
        header = header == null ? new HashMap<>() : header;
        authentication.applyToHeader(header);
        return _send(String.format("%s/%s", basePath(), path), method, body, params, header);
    }

    public abstract Response _send(String path, String method, Object body, Map<String, Object> params, Map<String, String> header);

}
