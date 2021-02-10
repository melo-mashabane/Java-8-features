package com.iwalksoftware.demo.excercise;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseOneSolutionJava8 {

    public static void main(String[] args) {

        List<Employee> staffList = Arrays.asList(
                new Employee("Me", "IT", 1),
                new Employee("You", "HR", 2),
                new Employee("Them", "Accounts", 3),
                new Employee("Them", "TopFloor", 3),
                new Employee("Them", "MiddleFloor", 3),
                new Employee("Them", "BottomFloor", 3),
                new Employee("Them", "Kitchen", 3),
                new Employee("Us", "Cleaning", 3)
        );


//      1. Sort list by group name.
        Collections.sort(staffList, (employee1, employee2) -> employee1.getGroup().compareTo(employee2.getGroup()));


//      2. Create a method that prints all elements in a list
        System.out.println("Prints all elements in a list");
        printStaffConditionally(staffList, employee -> true);
        System.out.println("\n");

//      3. Create a method that prints all the people that belong to a group name that begins with a 'T'
        System.out.println("Prints all the people that belong to a group name that begins with a 'T'");
        printStaffConditionally(staffList, employee -> employee.getGroup().startsWith("T"));
        System.out.println("\n");

        System.out.println("Prints all the people that belong to a dpt name that begins with a 'U'");
        printStaffConditionally(staffList, employee -> employee.getGroup().startsWith("U"));
        System.out.println("\n");
    }

    // Using the inner class from ExerciseOneSolutionJava7.Condition as an argument.
    // Ideally the interface would stand on its own.
    private static void printStaffConditionally(List<Employee> staff, ExerciseOneSolutionJava7.Condition condition) {
        for(Employee employee : staff){
            if(condition.test(employee))
                System.out.println(employee);
        }
    }
}
