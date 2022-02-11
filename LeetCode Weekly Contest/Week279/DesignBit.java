package com.dileep.Week279;

import java.util.HashSet;
import java.util.Set;

class Bitset {

    private int size;
    private Set<Integer> one = new HashSet<>();
    private Set<Integer> zero = new HashSet<>();

    public Bitset(int size) {

        this.size = size;
        for (int i = 0; i < size; i++) {
            zero.add(i);
        }

    }

    public void fix(int idx) {

        zero.remove(idx);
        one.add(idx);

    }

    public void unfix(int idx) {

        zero.add(idx);
        one.remove(idx);

    }

    public void flip() {

        Set<Integer> temp = new HashSet<>();
        temp = one;
        one = zero;
        zero = temp;

    }

    public boolean all() {

        return one.size() == size;

    }

    public boolean one() {

        return one.size() > 0;

    }

    public int count() {

        return one.size();

    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if(one.contains(i)) sb.append("1");
            else if(zero.contains(i)) sb.append("0");
        }
        return sb.toString();
    }
}

public class DesignBit {
    public static void main(String[] args) {


//         * Your Bitset object will be instantiated and called as such:
        int size = 5 ;
        Bitset obj = new Bitset(size);
         obj.fix(3);
         obj.unfix(2);
         obj.flip();
         boolean param_4 = obj.all();
         boolean param_5 = obj.one();
         int param_6 = obj.count();
         String param_7 = obj.toString();
//         */

    }




}
