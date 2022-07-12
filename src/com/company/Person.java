package com.company;

public class Person {
    private String name;
    private String designation;

    Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn() {
        System.out.println(name + " читает книгу ");
    }

    public void walk() {
        System.out.println(name + " пошел гулять с друзьями ");
    }

    public void eat() {
        System.out.println(name + " со своей семьей кушает в Рестаране ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return name + designation;
    }
}
