package io.swagger.client.api;

import org.nutz.json.Json;

import com.kerbores.gitea.client.api.UserApi;

import io.swagger.client.api.AdminApiTest.NutzClient;

/**
 * @author kerbores
 *
 */
public class UserApiTest {

    public static void main(String[] args) {
        UserApi api = new UserApi(new NutzClient("https://gitea.kerbores.com/api/v1", "49c50cf2f5ec92b246c2f08b1bedf0a2b20d81ee"));
        System.err.println(Json.toJson(api.baseOauth("kerbores", "742425")));

    }
}
