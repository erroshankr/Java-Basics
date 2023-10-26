package com.java.interface_demo;

public class WiproProjectManager extends WiproMgr{
    @Override
    public void displayName() {   // from Manager interface
        System.out.println("I am Project manager");
    }

    @Override
    public void displayRole() {  // from Director interface
        System.out.println("I am managing Project");
    }
}
