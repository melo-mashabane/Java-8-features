package com.iwalksoftware.demo.excercise;

public class Employee {

    private String name;
    private String dpt;
    private int id;

    public Employee(String name, String dpt, int id) {
        this.name = name;
        this.dpt = dpt;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
