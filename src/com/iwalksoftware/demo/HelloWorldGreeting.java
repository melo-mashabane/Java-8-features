package com.iwalksoftware.demo;

public class HelloWorldGreeting implements Greeting{
    @Override
    public void perform() {
        System.out.println("Welcome to iWalk. From HelloWorldGreeting class");
    }
}
