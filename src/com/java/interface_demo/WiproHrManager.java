package com.java.interface_demo;

public class WiproHrManager extends WiproMgr{
    @Override
    public void displayRole() {
        System.out.println("I am HR manager");
    }

    @Override
    public void displayName() {
        System.out.println("I am managing human resources");
    }
}
