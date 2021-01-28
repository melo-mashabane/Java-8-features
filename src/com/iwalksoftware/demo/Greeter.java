package com.iwalksoftware.demo;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting interfaceVariable = () -> System.out.println("Hello I am an iWalk Interface lambda!");

        greeter.greet(helloWorldGreeting);
        interfaceVariable.perform();
    }

}
