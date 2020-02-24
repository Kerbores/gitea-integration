package com.kerbores.gitea.client;

import java.util.HashMap;

/**
 * @author kerbores
 *
 */
public class Maps {

    public static class MyMap extends HashMap<String, Object> {

        /**
         * 
         */
        private static final long serialVersionUID = 1L;

        /**
         * 
         */
        public MyMap(String key, Object value) {
            super();
            put(key, value);
        }

        public MyMap add(String key, Object value) {
            put(key, value);
            return this;
        }

    }

    public static MyMap NEW(String key, Object value) {
        return new MyMap(key, value);
    }

}
