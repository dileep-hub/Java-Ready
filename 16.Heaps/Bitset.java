package com.dileep;

public class Bitset {

    String str = "";

    public Bitset(int size) {

//        String str = "";
        for(int i=0; i<size; i++) {
            this.str = this.str + "0";
        }

    }

    public void fix(int idx) {

        this.str = this.str.substring(0, idx) + "1" + this.str.substring(idx+1);

    }

    public void unfix(int idx) {

        this.str = "0" + this.str.substring(1);

    }

    public void flip() {
        String s = "";

        for(int i=0; i<this.str.length(); i++) {
            if(this.str.charAt(i) == 0) {
                s = s+"1";
            } else {
                s = s+"0";
            }
        }

        this.str = s;

    }

    public boolean all() {

        for(int i=0; i<this.str.length(); i++) {
            if(this.str.charAt(i) == 0) {
                return false;
            }
        }

        return true;

    }

    public boolean one() {

        for(int i=0; i<this.str.length(); i++) {
            if(this.str.charAt(i) == 1) {
                return true;
            }
        }

        return false;

    }

    public int count() {

        int count = 0;
        for(int i=0; i<this.str.length(); i++) {
            if(this.str.charAt(i) == 1) {
                count++;
            }
        }

        return count;

    }


    public String toString() {

        return this.str;

    }
}
