package com.iwalksoftware.demo.excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise {

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


//      1. Sort list by dept name.
        Collections.sort(staffList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getDpt().compareTo(o2.getDpt());
            }
        });


//      2. Create a method that prints all elements in a list
        System.out.println("Prints all elements in a list");
        printAllStaff(staffList);
        System.out.println("\n");

//      3. Create a method that prints all the people that belong to a group name that begins with a 'T'
        System.out.println("Prints all the people that belong to a group name that begins with a 'T'");
        printStaffInGroupThatStartWithT(staffList);
        System.out.println("\n");
        System.out.println("Very inflexible solution. Suppose you wish to search with a different letter 'D' " +
                "you will need to add another method." +
                " What would be better would be to pass in a behaviour.");
    }

    private static void printStaffInGroupThatStartWithT(List<Employee> staff) {
        for(Employee empl : staff){
            if(empl.getGroup().startsWith("T"))
            System.out.println(empl);
        }
    }

    private static void printAllStaff(List<Employee> staff) {
        for(Employee empl : staff){
            System.out.println(empl);
        }
    }
}
