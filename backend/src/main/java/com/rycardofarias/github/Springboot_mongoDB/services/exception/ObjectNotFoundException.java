package com.rycardofarias.github.Springboot_mongoDB.services.exception;

public class ObjectNotFoundException extends RuntimeException {

    private static  final long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
