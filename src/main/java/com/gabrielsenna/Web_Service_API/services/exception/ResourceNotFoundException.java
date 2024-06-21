package com.gabrielsenna.Web_Service_API.services.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resource not found: " + id);
    }
}
