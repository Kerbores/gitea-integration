package com.kerbores.gitea.client.request;

import java.util.HashMap;

/**
 * @author kerbores(kerbores@gmail.com)
 */
public class Header extends HashMap<String, String> {

    private static final long serialVersionUID = 1L;

    public static Header NEW() {
        return new Header();
    }

    public Header add(String key, String value) {
        put(key, value);
        return this;
    }

}
