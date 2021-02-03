package com.iwalksoftware.demo.excercise;

import java.util.Arrays;
import java.util.List;

public class Exercise {

    public static void main(String[] args) {

        /*

            1. Sort list by dept name.
            2. Create a method that prints all elements in a list
            3. Create a method that prints all the people that work in a dept that begins with a 'C'
         */

        List<Employee> aList = Arrays.asList(
                new Employee("Me", "IT", 1),
                new Employee("You", "HR", 2),
                new Employee("Them", "Accounts", 3),
                new Employee("Them", "TopFloor", 3),
                new Employee("Them", "MiddleFloor", 3),
                new Employee("Them", "BottomFloor", 3),
                new Employee("Them", "Kitchen", 3),
                new Employee("Us", "Cleaning", 3)
        );
    }
}
