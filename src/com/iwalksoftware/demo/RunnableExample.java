package com.iwalksoftware.demo;

public class RunnableExample {

    public static void main(String[] args) {

        Thread aThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Helloooow iWalk from Runnable");
            }
        });

        aThread.start();

        // Using lambda
        Thread lambdaThread = new Thread(() -> System.out.println("Helloooow iWalk from Lambda"));
        lambdaThread.start();

    }
}
