package com.kerbores.gitea.client.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.kerbores.gitea.client.auth.Authentication;
import com.kerbores.gitea.client.model.APIError;

/**
 * 
 * @author kerbores(kerbores@gmail.com)
 */
public interface ApiClient {

    String basePath();

    Authentication authentication();

    Response send(String path, String method, Object body, Map<String, Object> params, Map<String, String> header);

    Response send(String path,
                  String method,
                  Object body,
                  Map<String, Object> params,
                  Map<String, String> header,
                  Authentication authentication);

    public default Response get(String path, Map<String, Object> params, Map<String, String> header) {
        return send(path, "GET", null, params, header);
    }

    public default Response get(String path, Map<String, String> header) {
        return send(path, "GET", null, null, header);
    }

    public default Response get(String path) {
        return send(path, "GET", null, null, new HashMap<>());
    }

    public default Response delete(String path, Map<String, Object> params, Map<String, String> header) {
        return send(path, "DELETE", null, params, header);
    }

    public default Response delete(String path, Object body) {
        return send(path, "DELETE", body, null, null);
    }

    public default Response deleteWithAuth(String path, Authentication authentication) {
        return send(path, "DELETE", null, null, null, authentication);
    }

    public default Response delete(String path) {
        return send(path, "DELETE", null, null, new HashMap<>());
    }

    public default Response post(String path, Map<String, Object> params, Map<String, String> header) {
        return send(path, "POST", null, params, header);
    }

    public default Response post(String path, Map<String, Object> params) {
        return send(path, "POST", null, params, new HashMap<>());
    }

    public default Response postBody(String path, Object body, Map<String, String> header) {
        return send(path, "POST", body, null, header);
    }

    public default Response postBody(String path, Object body) {
        return send(path, "POST", body, null, new HashMap<>());
    }

    public default Response patch(String path, Map<String, Object> params, Map<String, String> header) {
        return send(path, "PATCH", null, params, header);
    }

    public default Response patch(String path, Map<String, Object> params) {
        return send(path, "PATCH", null, params, new HashMap<>());
    }

    public default Response patch(String path, Object body, Map<String, String> header) {
        return send(path, "PATCH", body, null, header);
    }

    public default Response patch(String path, Object body) {
        return send(path, "PATCH", body, null, new HashMap<>());
    }

    public default Response put(String path) {
        return put(path, null);
    }

    public default Response put(String path, Object body) {
        return send(path, "PUT", body, null, null);
    }

    public default String serialize(Object obj) {
        return JSON.toJSONString(obj);
    }

    public default String content(Response response) {
        if (response.isOk()) {
            return response.getContent();
        }
        if (response.getStatus() == 409 && response.getStatus() == 422)
            throw new ApiErrorException(deserialize(response, APIError.class));
        else
            throw new ApiErrorException();
    }

    public default <T> T deserialize(String body, Class<T> clazz) {
        return JSON.parseObject(body, clazz);
    }

    public default <T> T deserialize(Response response, Class<T> clazz) {
        return JSON.parseObject(content(response), clazz);
    }

    public default <T> List<T> deserializeAsList(Response response, Class<T> clazz) {
        return JSON.parseArray(content(response), clazz);
    }

    public default <T> List<T> deserializeAsList(String body, Class<T> clazz) {
        return JSON.parseArray(body, clazz);
    }

}
