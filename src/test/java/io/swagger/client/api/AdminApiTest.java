package io.swagger.client.api;

import java.io.InputStream;
import java.util.Map;

import org.nutz.http.Header;
import org.nutz.http.Request;
import org.nutz.http.Request.METHOD;
import org.nutz.http.Sender;
import org.nutz.json.Json;

import com.kerbores.gitea.client.api.AdminApi;
import com.kerbores.gitea.client.auth.Authentication;
import com.kerbores.gitea.client.auth.OAuth;
import com.kerbores.gitea.client.request.AbstractApiClient;
import com.kerbores.gitea.client.request.Response;

/**
 * @author kerbores(kerbores@gmail.com)
 */
public class AdminApiTest {

    public static class NutzClient extends AbstractApiClient {

        String basePath;

        String token;

        /**
         * 
         * @param basePath
         * @param token
         */
        public NutzClient(String basePath, String token) {
            this.basePath = basePath;
            this.token = token;
        }

        @Override
        public String basePath() {
            return basePath;
        }

        @Override
        public Authentication authentication() {
            return new OAuth(token);
        }

        Response toResponse(org.nutz.http.Response response) {
            return new Response() {

                @Override
                public int getStatus() {
                    return response.getStatus();
                }

                @Override
                public InputStream getInputStream() {
                    return response.getStream();
                }

                @Override
                public Map<String, String> getHeader() {
                    return null;
                }

                @Override
                public String getEncode() {
                    return response.getEncode();
                }

                @Override
                public String getDetail() {
                    return response.getDetail();
                }

                @Override
                public Map<String, String> getCookie() {
                    return null;
                }

                @Override
                public String getContent(String charsetName) {
                    return response.getContent(charsetName);
                }

                @Override
                public String getContent() {
                    return response.getContent(getEncode());
                }
            };
        }

        @Override
        public Response _send(String path, String method, Object body, Map<String, Object> params, Map<String, String> header) {
            org.nutz.http.Response response = Sender.create(Request.create(path, METHOD.valueOf(method))
                                                                   .setHeader(Header.create(header))
                                                                   .setData(Json.toJson(body))
                                                                   .setParams(params))
                                                    .send();
            return toResponse(response);
        }
    }

    public static void main(String[] args) {
        AdminApi api = new AdminApi(new NutzClient("https://gitea.kerbores.com/api/v1", "49c50cf2f5ec92b246c2f08b1bedf0a2b20d81ee"));
        System.err.println(Json.toJson(api.listAllOrganizations(0, 15)));

    }
}
