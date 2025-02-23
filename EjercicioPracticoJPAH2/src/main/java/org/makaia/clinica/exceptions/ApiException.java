package org.makaia.clinica.exceptions;

public class ApiException extends RuntimeException{

    private int statusCode;

    public ApiException(String mensaje){
        super(mensaje);
    }

    public ApiException(int statusCode, String mensaje){
        super(mensaje);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}