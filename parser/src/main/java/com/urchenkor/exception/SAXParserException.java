package com.urchenkor.exception;

public class SAXParserException extends RuntimeException {
    public SAXParserException(String message) {
        super(message);
    }

    public SAXParserException(String message, Throwable cause) {
        super(message, cause);
    }
}
