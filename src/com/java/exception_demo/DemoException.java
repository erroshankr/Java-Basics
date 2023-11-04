package com.java.exception_demo;

public class DemoException extends Exception{

    public DemoException() {
        super();
        System.out.println("Inside custom exception, incorrect details provided");
    }

    public DemoException(String msg){
        super(msg);
        System.out.println(getMessage());
    }


    // private public default protected
}
