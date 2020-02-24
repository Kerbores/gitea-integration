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

import org.apache.commons.lang3.StringUtils;

import com.kerbores.gitea.client.Maps;
import com.kerbores.gitea.client.auth.HttpBasicAuth;
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
import com.kerbores.gitea.client.model.StopWatch;
import com.kerbores.gitea.client.model.Team;
import com.kerbores.gitea.client.model.TrackedTime;
import com.kerbores.gitea.client.model.User;
import com.kerbores.gitea.client.model.UserHeatmapData;
import com.kerbores.gitea.client.request.ApiClient;
import com.kerbores.gitea.client.request.Response;

import lombok.Data;

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
        return apiClient.deserializeAsList(response, TrackedTime.class);
    }

    /**
     * 当前用户
     * 
     * @return 当前用户
     */
    public User current() {
        Response response = apiClient.get("/user");
        return apiClient.deserialize(response, User.class);
    }

    /**
     * List the authenticated user's email addresses
     * 
     * @return EmailList
     */
    public List<Email> emails() {
        Response response = apiClient.get("/user/emails");
        return apiClient.deserializeAsList(response, Email.class);
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
        return apiClient.deserializeAsList(response, Email.class);
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
        return apiClient.deserializeAsList(response, User.class);
    }

    /**
     * List the users that the authenticated user is following
     * 
     * @return UserList
     */
    public List<User> following() {
        Response response = apiClient.get("/user/following");
        return apiClient.deserializeAsList(response, User.class);
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
        return apiClient.deserializeAsList(response, GPGKey.class);
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
        return apiClient.deserialize(response, GPGKey.class);
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
        return apiClient.deserialize(response, GPGKey.class);
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
                                          StringUtils.isBlank(fingerprint) ? null : Maps.NEW("fingerprint", fingerprint),
                                          null);
        return apiClient.deserializeAsList(response, PublicKey.class);
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
        return apiClient.deserialize(response, PublicKey.class);
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
        return apiClient.deserialize(response, PublicKey.class);
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
        return apiClient.deserializeAsList(response, Repository.class);
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
        return apiClient.deserialize(response, Repository.class);
    }

    /**
     * The repos that the authenticated user has starred
     * 
     * @return RepositoryList
     */
    public List<Repository> starred() {
        return apiClient.deserializeAsList(apiClient.get("/user/starred"), Repository.class);
    }

    /**
     * Whether the authenticated is starring the repo
     * 
     * @param owner
     *            owner of the repo
     * @param repo
     *            name of the repo
     * @return true if the authenticated is starring the repo
     */
    public boolean starred(String owner, String repo) {
        return apiClient.get(String.format("/user/starred/%s/%s", owner, repo)).isOk();
    }

    /**
     * Star the given repo
     * 
     * @param owner
     *            owner of the repo to star
     * @param repo
     *            name of the repo to star
     * @return success true else false
     */
    public boolean star(String owner, String repo) {
        return apiClient.put(String.format("/user/starred/%s/%s", owner, repo)).isOk();
    }

    /**
     * Unstar the given repo
     * 
     * @param owner
     *            owner of the repo to unstar
     * @param repo
     *            name of the repo to unstar
     * @return success true else false
     */
    public boolean unstar(String owner, String repo) {
        return apiClient.delete(String.format("/user/starred/%s/%s", owner, repo)).isOk();
    }

    /**
     * Get list of all existing stopwatches
     * 
     * @return StopWatchList
     */
    public List<StopWatch> stopWatchs() {
        return apiClient.deserializeAsList(apiClient.get("/user/stopwatches"), StopWatch.class);
    }

    /**
     * List repositories watched by the authenticated user
     * 
     * @return RepositoryList
     */
    public List<Repository> watched() {
        return apiClient.deserializeAsList(apiClient.get("/user/subscriptions"), Repository.class);
    }

    /**
     * List all the teams a user belongs to
     * 
     * @return TeamList
     */
    public List<Team> teams() {
        return apiClient.deserializeAsList(apiClient.get("/user/teams"), Team.class);
    }

    /**
     * List the current user's tracked times
     * 
     * @return TrackedTimeList
     */
    public List<TrackedTime> trackedTimes() {
        return apiClient.deserializeAsList(apiClient.get("/user/times"), TrackedTime.class);
    }

    /**
     * Search for users
     * 
     * @param key
     *            keyword
     * @param uid
     *            ID of the user to search for
     * @param limit
     *            maximum number of users to return
     * @return UserList
     */
    public List<User> search(String key, long uid, long limit) {
        return apiClient.deserialize(apiClient.get("/user/search",
                                                   Maps.NEW("q", key)
                                                       .add("uid", uid)
                                                       .add("limit", limit),
                                                   null),
                                     SearchUserResult.class)
                        .getData();
    }

    @Data
    public static class SearchUserResult {
        List<User> data;
    }

    /**
     * Check if one user is following another user
     * 
     * @param follower
     *            username of following user
     * @param followee
     *            username of followed user
     * @return following true else false
     */
    public boolean following(String follower, String followee) {
        return apiClient.get(String.format("/users/%s/following/%s", follower, followee)).isOk();
    }

    /**
     * Get a user
     * 
     * @param username
     *            username of user to get
     * @return User
     */
    public User user(String username) {
        return apiClient.deserialize(apiClient.get(String.format("/users/%s", username)), User.class);
    }

    /**
     * List the given user's followers
     * 
     * @param username
     *            username of user
     * @return UserList
     */
    public List<User> followers(String username) {
        return apiClient.deserializeAsList(apiClient.get(String.format("/users/%s/followers", username)), User.class);
    }

    /**
     * List the users that the given user is following
     * 
     * @param username
     *            username of user
     * @return UserList
     */
    public List<User> followed(String username) {
        return apiClient.deserializeAsList(apiClient.get(String.format("/users/%s/following", username)), User.class);
    }

    /**
     * List the given user's GPG keys
     * 
     * @param username
     *            username of user
     * @return GPGKeyList
     */
    public List<GPGKey> gpgKeys(String username) {
        return apiClient.deserializeAsList(apiClient.get(String.format("/users/%s/gpg_keys", username)), GPGKey.class);
    }

    /**
     * Get a user's heatmap
     * 
     * @param username
     *            username of user to get
     * @return UserHeatmapData
     */
    public List<UserHeatmapData> heatmap(String username) {
        return apiClient.deserializeAsList(apiClient.get(String.format("/users/%s/heatmap", username)), UserHeatmapData.class);
    }

    /**
     * List the given user's public keys
     * 
     * @param username
     *            username of user
     * @param fingerprint
     *            fingerprint of the key
     * @return PublicKeyList
     */
    public List<PublicKey> publicKeys(String username, String fingerprint) {
        return apiClient.deserializeAsList(apiClient.get(String.format("/users/%s/keys", username),
                                                         Maps.NEW("fingerprint", fingerprint),
                                                         null),
                                           PublicKey.class);
    }

    /**
     * List the repos owned by the given user
     * 
     * @param username
     *            username of user
     * @return RepositoryList
     */
    public List<Repository> repositories(String username) {
        return apiClient.deserializeAsList(apiClient.get(String.format("/users/%s/repos", username)), Repository.class);
    }

    /**
     * The repos that the given user has starred
     * 
     * @param username
     *            username of user
     * @return RepositoryList
     */
    public List<Repository> starred(String username) {
        return apiClient.deserializeAsList(apiClient.get(String.format("/users/%s/starred", username)), Repository.class);
    }

    /**
     * List the repositories watched by a user
     * 
     * @param username
     *            username of the user
     * @return RepositoryList
     */
    public List<Repository> watched(String username) {
        return apiClient.deserializeAsList(apiClient.get(String.format("/users/%s/subscriptions", username)), Repository.class);
    }

    /**
     * List the authenticated user's access tokens
     * 
     * @param username
     *            username of user
     * @return AccessTokenList represents a list of API access token.
     */
    public List<AccessToken> tokens(String username) {
        return apiClient.deserializeAsList(apiClient.get(String.format("/users/%s/tokens", username)), AccessToken.class);
    }

    /**
     * Create an access token
     * 
     * @param username
     *            username of user
     * @param name
     *            name of the accessToken
     * @return AccessToken represents an API access token.
     */
    public AccessToken token(String username, String name) {
        return apiClient.deserialize(apiClient.postBody(String.format("/users/%s/tokens", username), Maps.NEW("name", name)),
                                     AccessToken.class);
    }

    /**
     * delete an access token
     * 
     * @param username
     *            username of user
     * @param id
     *            token to be deleted
     * @return success true else false
     */
    public boolean token(String username, long id) {
        return apiClient.delete(String.format("/users/%s/tokens/%d", username, id)).isOk();
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
        return apiClient.deleteWithAuth(String.format("/users/%s/tokens/%d",
                                                      user,
                                                      id),
                                        new HttpBasicAuth(user, password))
                        .isOk();
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
    public AccessToken accessToken(String user, String password) {
        return apiClient.deserialize(apiClient.send(String.format("/users/%s/tokens", user),
                                                    "POST",
                                                    null,
                                                    Maps.NEW("name", ACCESS_TOKEN_NAME),
                                                    null,
                                                    new HttpBasicAuth(user, password))
                                              .getContent(),
                                     AccessToken.class);
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
    public List<AccessToken> tokens(String user, String password) {
        return apiClient.deserializeAsList(apiClient.send(String.format("/users/%s/tokens", user),
                                                          "GET",
                                                          null,
                                                          null,
                                                          null,
                                                          new HttpBasicAuth(user, password))
                                                    .getContent(),
                                           AccessToken.class);
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
        return apiClient.deserialize(apiClient.send("/user", "GET", null, null, null, new HttpBasicAuth(user, password)).getContent(),
                                     User.class);
    }

}
