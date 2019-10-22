package com.piyush.programs.linkedlist;


public class CheckForLoopInLinkedList {
    public static void main(String[] args){
        MyLinkedList list=new MyLinkedList();
        list.head=new MyLinkedList.Node(1);
        list.head.next=new MyLinkedList.Node(2);
        list.head.next.next=new MyLinkedList.Node(3);
        list.head.next.next=list.head;
        System.out.println(checkForLoopInLinkedList(list.head));
    }
    static boolean checkForLoopInLinkedList(MyLinkedList.Node head){
        MyLinkedList.Node slow=head;
        MyLinkedList.Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
                return true;

        }
        return false;
    }
}
