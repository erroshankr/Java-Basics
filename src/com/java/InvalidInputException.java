package com.java;

public class InvalidInputException extends Throwable {

    public InvalidInputException(String msg){
        super(msg);
        printStackTrace();
    }
}
