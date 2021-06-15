package com.codegym;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;


        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return (E) this.data;
        }
    }

    private Node head;
    private int numNodes;
    private  Node tail;

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        head = new Node(data);
        tail = new Node(data);
    }

    //Phương thức thêm một phần tử mới vào danh sách: add() tai vi tri bat ki voi int index
    public void add(int index, E data) {

        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    // Phương thức thêm một phần tử mới vào đầu danh sách: addFirst()
    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
        if (tail == null)
            tail = head;
    }

    //Phương thức thêm một phần tử mới vào cuối danh sách: addLast()
    public void lastFirst(E data) {
        Node newNode = new Node(data);
        if (tail==null){
            head=tail=newNode;
        }else {
            tail.next=newNode;
            tail=tail.next;

        }
        numNodes++;
    }

    //Phương thức xóa 1 phần tử tại vị trí index: remove(int index)
    public void remove(int index, E data) {
        Node temp = head;
        Node x;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        x = temp.next;
        temp.next = new Node(data);
        head.next = null;
        numNodes++;
    }


//Phương thức printList() in các phần tử trong danh sách
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
// Phương thức size trả về số lượng các phần tử có trong danh sách
    public int size(){
        return numNodes;
    }
    //Phương thức clear
    public int clear() {
       return numNodes = 0;
    }

//phương thức get
    public Node get(int index){
        Node temp = head;
        for (int i = 0 ; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

}
