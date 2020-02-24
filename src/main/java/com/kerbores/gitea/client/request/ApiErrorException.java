package com.kerbores.gitea.client.request;

import com.kerbores.gitea.client.model.APIError;

/**
 * 
 * @author kerbores(kerbores@gmail.com)
 *
 */
public class ApiErrorException extends RuntimeException {

    APIError error;

    /**
     * 
     */
    public ApiErrorException() {}

    public ApiErrorException(APIError error) {
        this.error = error;
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public APIError getError() {
        return error;
    }

}
