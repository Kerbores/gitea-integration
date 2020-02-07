package com.kerbores.gitea.client.request;

import java.io.InputStream;
import java.util.Map;

/**
 * @author kerbores(kerbores@gmail.com)
 */
public interface Response {

    public Map<String, String> getCookie();

    public Map<String, String> getHeader();

    public InputStream getInputStream();

    public int getStatus();

    public String getContent();

    public String getContent(String charsetName);

    public String getDetail();

    public String getEncode();

    public boolean isOk();

}
