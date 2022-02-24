package com.dileep;

public class CustomLL {

    private Node head;
    private Node tail;
    private int size;


    public CustomLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size++;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> " );
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int val) {

        if(tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insertBet(int ind, int val) {

        if(ind == 0) {
            insertFirst(val);
            return;
        } if(ind == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        Node node = new Node(val);

        for (int i = 1; i < ind; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;

        size++;

    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if (index == size-1) {
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return val;


    }

    public Node get(int index) {
        Node node = head;
        for(int i=0; i<index; i++) {
            node = node.next;
        }
        return node;
    }



    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;


    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }



    }

}

