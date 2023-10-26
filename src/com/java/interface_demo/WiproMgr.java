package com.java.interface_demo;

// multiple inheritance is not allowed but multiple interface implementation is allowed.
// we can extend only 1 class at a time but can implement more than one interface
// inheritance: to change the basic behaviour of parent class
// interface
public abstract class WiproMgr implements Director{
    @Override
    public void displayName() {
        System.out.println("Inside WiproMgr");
    }
}
