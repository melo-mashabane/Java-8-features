package com.iwalksoftware.demo;

public interface InterfaceTwo {
    void methodOne();

    default void log(String str) {
        System.out.println(str + " Interface Two logging");
    }
}