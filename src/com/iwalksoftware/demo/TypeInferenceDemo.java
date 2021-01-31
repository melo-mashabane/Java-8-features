package com.iwalksoftware.demo;

public class TypeInferenceDemo {

    public static void main(String[] args) {
        printLambda(String::length);
//        printLambda(str -> str.length());

    }

    public static void printLambda(StringLenghthLambda sl) {
        System.out.println(sl.methodOne("Welcome to iWalk"));

    }

    interface StringLenghthLambda {
        int methodOne(String str);

    }
}
