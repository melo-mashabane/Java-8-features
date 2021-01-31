package com.iwalksoftware.demo;

public class TypeInferenceDemo {

    public static void main(String[] args) {
        StringLenghthLambda myLambda = String::length;
        System.out.println(myLambda.methodOne("Welcome to iWalk"));
    }

    interface StringLenghthLambda {
        int methodOne(String str);

    }
}
