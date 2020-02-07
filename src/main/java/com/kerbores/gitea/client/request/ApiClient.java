package com.kerbores.gitea.client.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;

import com.kerbores.gitea.client.auth.Authentication;

/**
 * 
 * @author kerbores(kerbores@gmail.com)
 */
public interface ApiClient {

    String basePath();

    Authentication authentication();

    Response send(String path, String method, Object body, Map<String, Object> params, Map<String, String> header);

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
        return send(path, "PUT", null, null, null);
    }

    public default String serialize(Object obj) {
        return Json.toJson(obj);
    }

    public default <T> T deserialize(String body, Class<T> clazz) {
        Json.setDefaultJsonformat(JsonFormat.full().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z"));
        T t = Json.fromJson(clazz, body);
        Json.setDefaultJsonformat(JsonFormat.full().setDateFormat("yyyy-MM-dd HH:mm:ss"));
        return t;
    }

    public default <T> List<T> deserializeAsList(String body, Class<T> clazz) {
        Json.setDefaultJsonformat(JsonFormat.full().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS Z"));
        List<T> ts = Json.fromJsonAsList(clazz, body);
        Json.setDefaultJsonformat(JsonFormat.full().setDateFormat("yyyy-MM-dd HH:mm:ss"));
        return ts;
    }

}
