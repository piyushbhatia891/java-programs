package com.piyush.programs.linkedlist;
import com.piyush.programs.linkedlist.MyLinkedList.Node;

public class ReverseLinkedList {
    public static void main(String[] args){
        MyLinkedList list=new MyLinkedList();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(3);
        reverseList(list);
        printLinkedList(list);
    }
    static void reverseList(MyLinkedList linkedList){
        Node previous = null;
        Node current = linkedList.head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        linkedList.head = previous;
    }

    static void printLinkedList(MyLinkedList list){
        Node h=list.head;
        while(list.head!=null){
            System.out.println(list.head.data);
            list.head=list.head.next;
        }
        list.head=h;
    }
}
