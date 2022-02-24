package com.dileep;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomLL ll = new CustomLL();
        ll.insertFirst(12);
        ll.insertFirst(13);
        ll.insertFirst(23);
        ll.insertFirst(10);
        ll.insertLast(34);
        ll.insertBet(2, 99);
        ll.insertBet(1, 11);
        ll.display();
        System.out.println(ll.deleteFirst());
        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();
        System.out.println(ll.delete(2));
        ll.display();


    }
}
