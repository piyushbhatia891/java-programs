package com.piyush.programs.linkedlist;
import com.piyush.programs.linkedlist.MyLinkedList.Node;

public class OddEvenLinkedList {
    public static void main(String[] args){
        MyLinkedList list=new MyLinkedList();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(3);
        list.head.next.next.next=new Node(4);
        getOddEvenLinkedList(list.head);
    }
    static void getOddEvenLinkedList(Node head){
        Node result=head;
        Node p1=head;
        Node p2=head.next;
        Node connected=head.next;
        while (p1!=null && p2!=null){
            Node t=p2.next;
            if(t == null)
                break;
            p1.next=p2.next;
            p1=p1.next;
            p2.next=p1.next;
            p2=p2.next;
        }
        p1.next=connected;
        System.out.println(result);
    }
}
