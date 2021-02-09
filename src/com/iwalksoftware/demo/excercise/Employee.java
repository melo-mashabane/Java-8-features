package com.iwalksoftware.demo.excercise;

public class Employee {

    private String group;
    private String dpt;
    private int id;

    public Employee(String group, String dpt, int id) {
        this.group = group;
        this.dpt = dpt;
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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

    @Override
    public String toString() {
        return "Employee{" +
                "group='" + group + '\'' +
                ", dpt='" + dpt + '\'' +
                ", id=" + id +
                '}';
    }
}
