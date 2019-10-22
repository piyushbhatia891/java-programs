package com.piyush.programs.linkedlist;


public class RemoveNthNodeFromEndLinkedList {
    public static void main(String[] args){
        MyLinkedList list=new MyLinkedList();
        list.head=new MyLinkedList.Node(1);
        list.head.next=new MyLinkedList.Node(2);
        list.head.next.next=new MyLinkedList.Node(3);
        list.head.next.next.next=new MyLinkedList.Node(4);
        list.head.next.next.next.next=new MyLinkedList.Node(5);
        System.out.println(removeNthNode(list.head,3));
    }
    static MyLinkedList.Node removeNthNode(MyLinkedList.Node head, int n){
        if(head!=null){
            MyLinkedList.Node fast=head;
            MyLinkedList.Node slow=head;
            for(int i=0;i<n;i++){
                fast=fast.next;
            }
            while (fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
        }
        return head;
    }
}
