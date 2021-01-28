package com.iwalksoftware.demo;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting lambdaGreeting = () -> System.out.println("Hello I am an iWalk Interface lambda!" + "\n");

        Greeting InnerClass = new Greeting(){

            @Override
            public void perform() {
                System.out.println("Welcome to iWalk. From Inner class" + "\n" +
                        " Both look similar but are not the same!" + "\n" +
                        " They are just different ways of implementing an interface." + "\n" +
                        " Lambda is not a way of creating an Inner Class. They have their own function!");
            }
        };


        greeter.greet(lambdaGreeting);
        greeter.greet(InnerClass);
    }
}
