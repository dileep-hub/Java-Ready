package com.dileep;

import java.util.HashMap;
import java.util.HashSet;

public class NumberofEmployeeUnderEmp {

    public static void findCount(HashMap<String, String> map) {
        HashMap<String, HashSet<String>> tree = new HashMap<>();
        String ceo = "";

        for(String emp : map.keySet()) {
            String man = map.get(emp);

            if(man.equals(emp)) {
                ceo = man;
            } else {
                if(tree.containsKey(man)) {
                    HashSet<String> emps = tree.get(man) ;
                    emps.add(emp);
                } else  {
                    HashSet<String> emps = new HashSet<>();
                    emps.add(emp);
                    tree.put(man, emps);
                }
            }
        }

        HashMap<String, Integer> result = new HashMap<>();
        getSize(tree, ceo, result);

        for(String emp : result.keySet()) {
            System.out.println(emp + " " + result.get(emp));
        }



     }


    public static int getSize(HashMap<String, HashSet<String>> tree, String man, HashMap<String, Integer> res)  {

        if(tree.containsKey(man) == false) {
            res.put(man, 0);
            return 1;
        }

        int size = 0;
        for(String emp : tree.get(man)) {
            int cs = getSize(tree, emp, res);
            size += cs;
        }

        res.put(man, size);
        return size+1;

     }

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("A", "C");
        map.put("B", "C");
        map.put("C", "F");
        map.put("D", "E");
        map.put("E", "F");
        map.put("F", "F");

        findCount(map);





    }

}
