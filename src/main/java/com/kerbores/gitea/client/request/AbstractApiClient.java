package com.kerbores.gitea.client.request;

import java.util.HashMap;
import java.util.Map;

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

    public abstract Response _send(String path, String method, Object body, Map<String, Object> params, Map<String, String> header);

    public Response get(String path, Map<String, Object> params, Map<String, String> header) {
        return send(path, "GET", null, params, header);
    }

    public Response get(String path, Map<String, String> header) {
        return send(path, "GET", null, null, header);
    }

    public Response get(String path) {
        return send(path, "GET", null, null, new HashMap<>());
    }

    public Response delete(String path, Map<String, Object> params, Map<String, String> header) {
        return send(path, "DELETE", null, params, header);
    }

    public Response delete(String path, Map<String, String> header) {
        return send(path, "DELETE", null, null, header);
    }

    public Response delete(String path) {
        return send(path, "DELETE", null, null, new HashMap<>());
    }

    public Response post(String path, Map<String, Object> params, Map<String, String> header) {
        return send(path, "POST", null, params, header);
    }

    public Response post(String path, Map<String, Object> params) {
        return send(path, "POST", null, params, new HashMap<>());
    }

    public Response postBody(String path, Object body, Map<String, String> header) {
        return send(path, "POST", body, null, header);
    }

    public Response postBody(String path, Object body) {
        return send(path, "POST", body, null, new HashMap<>());
    }

    public Response patch(String path, Map<String, Object> params, Map<String, String> header) {
        return send(path, "PATCH", null, params, header);
    }

    public Response patch(String path, Map<String, Object> params) {
        return send(path, "PATCH", null, params, new HashMap<>());
    }

    public Response patch(String path, Object body, Map<String, String> header) {
        return send(path, "PATCH", body, null, header);
    }

    public Response patch(String path, Object body) {
        return send(path, "PATCH", body, null, new HashMap<>());
    }

}
