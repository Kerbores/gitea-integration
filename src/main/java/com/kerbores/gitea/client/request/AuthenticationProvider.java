package com.kerbores.gitea.client.request;

import com.kerbores.gitea.client.auth.Authentication;

/**
 * @author kerbores(wangguiyuan@chinarecrm.com.cn)
 *
 */
public interface AuthenticationProvider {

    Authentication provide();
}
