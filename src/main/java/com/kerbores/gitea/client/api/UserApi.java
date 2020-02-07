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

package com.kerbores.gitea.client.api;

import java.util.List;

import org.nutz.http.Header;
import org.nutz.http.Request;
import org.nutz.http.Request.METHOD;
import org.nutz.http.Sender;
import org.nutz.json.Json;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;

import com.kerbores.gitea.client.model.AccessToken;
import com.kerbores.gitea.client.model.CreateEmailOption;
import com.kerbores.gitea.client.model.CreateGPGKeyOption;
import com.kerbores.gitea.client.model.CreateKeyOption;
import com.kerbores.gitea.client.model.CreateRepoOption;
import com.kerbores.gitea.client.model.DeleteEmailOption;
import com.kerbores.gitea.client.model.Email;
import com.kerbores.gitea.client.model.GPGKey;
import com.kerbores.gitea.client.model.PublicKey;
import com.kerbores.gitea.client.model.Repository;
import com.kerbores.gitea.client.model.TrackedTime;
import com.kerbores.gitea.client.model.User;
import com.kerbores.gitea.client.request.ApiClient;
import com.kerbores.gitea.client.request.Response;

public class UserApi {

    public static final String ACCESS_TOKEN_NAME = "APMP";

    ApiClient apiClient;

    /**
     * 
     */
    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List a user's tracked times in a repo
     * 
     * @param owner
     *            owner
     * @param repo
     *            repo
     * @param user
     *            user
     * @return TrackedTimeList
     */
    public List<TrackedTime> trackedTimes(String owner, String repo, String user) {
        Response response = apiClient.get(String.format("/repos/%s/%s/times/%s", owner, repo, user));
        return apiClient.deserializeAsList(apiClient.content(response), TrackedTime.class);
    }

    /**
     * 当前用户
     * 
     * @return 当前用户
     */
    public User current() {
        Response response = apiClient.get("/user");
        return apiClient.deserialize(apiClient.content(response), User.class);
    }

    /**
     * List the authenticated user's email addresses
     * 
     * @return EmailList
     */
    public List<Email> emails() {
        Response response = apiClient.get("/user/emails");
        return apiClient.deserializeAsList(apiClient.content(response), Email.class);
    }

    /**
     * Add email addresses
     * 
     * @param email
     *            CreateEmailOption
     * @return EmailList
     */
    public List<Email> emails(CreateEmailOption email) {
        Response response = apiClient.postBody("/user/emails", email);
        return apiClient.deserializeAsList(apiClient.content(response), Email.class);
    }

    /**
     * Delete email addresses
     * 
     * @param email
     *            DeleteEmailOption
     * @return 是否删除成功
     */
    public boolean deleteEmails(DeleteEmailOption email) {
        Response response = apiClient.delete("/user/emails", email);
        return response.isOk();
    }

    /**
     * List the authenticated user's followers
     * 
     * @return UserList
     */
    public List<User> followers() {
        Response response = apiClient.get("/user/followers");
        return apiClient.deserializeAsList(apiClient.content(response), User.class);
    }

    /**
     * List the users that the authenticated user is following
     * 
     * @return UserList
     */
    public List<User> following() {
        Response response = apiClient.get("/user/following");
        return apiClient.deserializeAsList(apiClient.content(response), User.class);
    }

    /**
     * Check whether a user is followed by the authenticated user
     * 
     * @param user
     *            username of followed user
     * @return followed true else false
     */
    public boolean following(String user) {
        Response response = apiClient.get(String.format("/user/following/%s", user));
        return response.isOk();
    }

    /**
     * Follow a user
     * 
     * @param user
     *            username of user to follow
     * @return success true else false
     */
    public boolean follow(String user) {
        Response response = apiClient.put(String.format("/user/following/%s", user));
        return response.isOk();
    }

    /**
     * Unfollow a user
     * 
     * @param user
     *            username of user to unfollow
     * @return success true else false
     */
    public boolean unFollow(String user) {
        Response response = apiClient.delete(String.format("/user/following/%s", user));
        return response.isOk();
    }

    /**
     * List the authenticated user's GPG keys
     * 
     * @return GPGKeyList
     */
    public List<GPGKey> gpgKeys() {
        Response response = apiClient.get("/user/gpg_keys");
        return apiClient.deserializeAsList(apiClient.content(response), GPGKey.class);
    }

    /**
     * Create a GPG key
     * 
     * @param gpgKey
     *            CreateGPGKeyOption
     * @return GPGKey
     */
    public GPGKey gpgKey(CreateGPGKeyOption gpgKey) {
        Response response = apiClient.postBody("/user/gpg_keys", gpgKey);
        return apiClient.deserialize(apiClient.content(response), GPGKey.class);
    }

    /**
     * Get a GPG key
     * 
     * @param id
     *            id of key to get
     * @return GPGKey
     */
    public GPGKey gpgKey(long id) {
        Response response = apiClient.get(String.format("/user/gpg_keys/%d", id));
        return apiClient.deserialize(apiClient.content(response), GPGKey.class);
    }

    /**
     * Remove a GPG key
     * 
     * @param id
     *            id of key to delete
     * @return success true else false
     */
    public boolean deleteGpgKey(long id) {
        Response response = apiClient.delete(String.format("/user/gpg_keys/%d", id));
        return response.isOk();
    }

    /**
     * List the authenticated user's public keys
     * 
     * @param fingerprint
     *            fingerprint of the key
     * @return PublicKeyList
     */
    public List<PublicKey> publicKeys(String fingerprint) {
        Response response = apiClient.get("/user/keys",
                                          Strings.isBlank(fingerprint) ? null : NutMap.NEW().addv("fingerprint", fingerprint),
                                          null);
        return apiClient.deserializeAsList(apiClient.content(response), PublicKey.class);
    }

    /**
     * Create a public key
     * 
     * @param publicKey
     *            CreateKeyOption
     * @return PublicKey
     */
    public PublicKey publicKey(CreateKeyOption publicKey) {
        Response response = apiClient.postBody("/user/keys", publicKey);
        return apiClient.deserialize(apiClient.content(response), PublicKey.class);
    }

    /**
     * Get a public key
     * 
     * @param id
     *            id of key to get
     * @return PublicKey
     */
    public PublicKey publicKey(long id) {
        Response response = apiClient.get(String.format("/user/keys/%d", id));
        return apiClient.deserialize(apiClient.content(response), PublicKey.class);
    }

    /**
     * Delete a public key
     * 
     * @param id
     *            id of key to delete
     * @return success true else false
     */
    public boolean deletePublicKey(long id) {
        Response response = apiClient.delete(String.format("/user/keys/%d", id));
        return response.isOk();
    }

    /**
     * List the current user's organizations
     * 
     * @return RepositoryList
     */
    public List<Repository> repositories() {
        Response response = apiClient.get("/user/repos");
        return apiClient.deserializeAsList(apiClient.content(response), Repository.class);
    }

    /**
     * Create a repository
     * 
     * @param repository
     *            repository
     * @return Repository
     */
    public Repository repository(CreateRepoOption repository) {
        Response response = apiClient.postBody("/user/repos", repository);
        return apiClient.deserialize(apiClient.content(response), Repository.class);
    }

    /**
     * base auth 方式删除access token
     * 
     * @param user
     *            用户名
     * 
     * @param password
     *            密码
     * 
     * @param id
     *            access token id
     * 
     * @return 是否删除成功
     */
    public boolean deleteAccessToken(String user, String password, long id) {
        org.nutz.http.Response response = Sender.create(Request.create(String.format("%s/users/%s/tokens/%d",
                                                                                     apiClient.basePath(),
                                                                                     user,
                                                                                     id),
                                                                       METHOD.DELETE)
                                                               .basicAuth(user, password))
                                                .send();
        return response.isOK();
    }

    /**
     * base auth 方式 创建access token
     * 
     * @param user
     *            用户名
     * @param password
     *            密码
     * @return access token
     */
    public AccessToken createAccessToken(String user, String password) {
        org.nutz.http.Response response = Sender.create(Request.post(String.format("%s/users/%s/tokens", apiClient.basePath(), user))
                                                               .setData(Json.toJson(NutMap.NEW().addv("name", ACCESS_TOKEN_NAME)))
                                                               .setHeader(Header.create().asJsonContentType())
                                                               .basicAuth(user, password))
                                                .send();
        return apiClient.deserialize(response.getContent(), AccessToken.class);
    }

    /**
     * base auth 方式获取access token 列表
     * 
     * @param user
     *            用户名
     * @param password
     *            密码
     * @return access token 类别
     */
    public List<AccessToken> accessToken(String user, String password) {
        org.nutz.http.Response response = Sender.create(Request.get(String.format("%s/users/%s/tokens", apiClient.basePath(), user))
                                                               .basicAuth(user, password))
                                                .send();
        return apiClient.deserializeAsList(response.getContent(), AccessToken.class);
    }

    /**
     * base auth 方式进行用户登录
     * 
     * @param user
     *            用户名
     * @param password
     *            密码
     * @return 用户
     */
    public User baseOauth(String user, String password) {
        org.nutz.http.Response response = Sender.create(Request.get(String.format("%s/user", apiClient.basePath()))
                                                               .basicAuth(user, password))
                                                .send();
        return apiClient.deserialize(response.getContent(), User.class);
    }

}
