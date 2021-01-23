package com.iwalksoftware.demo;

public interface InterfaceTwo {
    void methodTwo();

    default void log(String str) {
        System.out.println("Interface Two logging - " + str);
    }
}