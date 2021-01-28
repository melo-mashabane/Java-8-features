package com.iwalksoftware.demo;

public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();

        myLambda someVariable = () -> System.out.println("Hello I am an iWalk lambda!");
        Greeting interfaceVariable = () -> System.out.println("Hello I am an iWalk Interface lambda!");
        anotherLambda anotherVariable = (String str) -> System.out.println("Hello " + str +", I am an iWalk lambda!");

        greeter.greet(helloWorldGreeting);
        helloWorldGreeting.perform();

        someVariable.method();
        interfaceVariable.perform();
        anotherVariable.method("Melo");




    }

    interface myLambda {
       void method();
    }

    interface anotherLambda {
        void method(String str);
    }
}
