package com.day08.homework1;

public class NoScoreException extends RuntimeException{
    public NoScoreException() {
    }

    public NoScoreException(String message) {
        super(message);
    }

}
