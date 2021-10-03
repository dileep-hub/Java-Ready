package com.dileep;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5); // ArrayList<>(5) => constructor
        list.add(45);
        list.add(455);

        list.add(4544);
        list.set(1, 67);
        list.add(45);
        list.add(455);

        list.add(4544);
        list.add(45);
        list.add(455);

        list.add(4544);



        for (int i=0; i<list.toArray().length; i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println(list);
        System.out.println(list.toString());

    }
}
