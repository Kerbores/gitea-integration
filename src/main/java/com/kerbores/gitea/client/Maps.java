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
         * @param key
         *            key
         * @param value
         *            value
         */
        public MyMap(String key, Object value) {
            super();
            put(key, value);
        }

        /**
         * 添加key - value
         * 
         * @param key
         *            key
         * @param value
         *            value
         * @return MyMap
         */
        public MyMap add(String key, Object value) {
            put(key, value);
            return this;
        }

    }

    /**
     * 创建一个MyMap
     * 
     * @param key
     *            key
     * @param value
     *            value
     * @return MyMap
     */
    public static MyMap NEW(String key, Object value) {
        return new MyMap(key, value);
    }

}
