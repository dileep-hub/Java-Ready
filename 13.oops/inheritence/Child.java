package com.dileep.inheritence;

public class Child extends Parent {

    String gender;

    Child () {
        super(40, 90);
        this.gender = "male";

    }

    public static void main(String[] args) {


        // parent class
        Parent p1 = new Parent();
        System.out.println(p1.name);
        System.out.println(p1.age);

        System.out.println("---------------------");

        // child class
        Child c1 = new Child();
        System.out.println(c1.age);
        System.out.println(c1.gender);

        System.out.println("----------------------");

        Parent p2 = new Child();
        System.out.println(p2.weight);
        // here p2 cannot access gender even though it created
        // a object of child class, here refernce type is parent hence
        // ref type has the power to access what
        // object type has the power to wt to create

//        Child c2 = new Parent();
        // this gives error bcoz parent object dont has child's
        // constructor to run, but child can run parent's constructor


    }

}
