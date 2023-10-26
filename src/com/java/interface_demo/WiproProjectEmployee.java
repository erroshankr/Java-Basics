package com.java.interface_demo;

public class WiproProjectEmployee extends WiproProjectManager{
    @Override
    public void displayName() {   // from Manager interface
        System.out.println("I am Project manager");
    }
}
