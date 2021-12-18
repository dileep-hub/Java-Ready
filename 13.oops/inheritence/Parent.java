package com.dileep.inheritence;

import sun.java2d.pipe.SpanClipRenderer;

public class Parent {

    private final int salary;
    int age;
    String name;
    int weight;

    static void greet() {
        System.out.println("Hello, parent here ..");
    }

    Parent() {
        this.salary = 12000;
        this.age = 20;
        this.name = "parent1";
        this.weight = 60;
    }

    Parent(int age, int weight) {
        this.salary = 12000;
        this.age = age;
        this.name = "parent1";
        this.weight = weight;
    }

    Parent(int salary, int age, String name, int weight) {
        this.salary = salary;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    Parent(Parent par) {
        this.salary = par.salary;
        this.age = par.age;
        this.name = par.name;
        this.weight = par.weight;
    }



}
