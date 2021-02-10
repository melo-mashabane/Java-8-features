package com.iwalksoftware.demo.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseOneSolutionJava7 {

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
        Collections.sort(staffList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getGroup().compareTo(o2.getGroup());
            }
        });


//      2. Create a method that prints all elements in a list
        System.out.println("Prints all elements in a list");
        printAllStaff(staffList);
        System.out.println("\n");

//      3. Create a method that prints all the people that belong to a group name that begins with a 'T'
        System.out.println("Prints all the people that belong to a group name that begins with a 'T'");
        printStaffConditionally(staffList, new Condition() {
            @Override
            public boolean test(Employee employee) {
                return employee.getGroup().startsWith("T");
            }
        });
        System.out.println("\n");
        System.out.println("Very inflexible solution. Suppose you wish to search with a different condition" +
                " you will need to add another method." +
                " What would be better would be to pass in a behaviour.");
        System.out.println("\n");

        System.out.println("Prints all the people that belong to a dpt name that begins with a 'M'");
        printStaffConditionally(staffList, new Condition() {
            @Override
            public boolean test(Employee employee) {
                return employee.getDpt().startsWith("M");
            }
        });
        System.out.println("\n");
    }

    private static void printStaffConditionally(List<Employee> staff, Condition condition) {
        for(Employee employee : staff){
            if(condition.test(employee))
            System.out.println(employee);
        }
    }

    private static void printAllStaff(List<Employee> staff) {
        for(Employee employee : staff){
            System.out.println(employee);
        }
    }

    interface Condition{
        boolean test(Employee employee);
    }
}
