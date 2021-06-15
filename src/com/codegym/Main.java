package com.codegym;

public class Main {

    public static void main(String[] args) {
        System.out.println("TEST");
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.addFirst(2);
        ll.lastFirst(5);
        ll.lastFirst(8);
        ll.addFirst(9);
        ll.printList();
        System.out.println("size = "+ll.size());


    }
}
