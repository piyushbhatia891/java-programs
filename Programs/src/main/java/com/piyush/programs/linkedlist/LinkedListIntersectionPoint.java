package com.piyush.programs.linkedlist;

public class LinkedListIntersectionPoint {
    public static void main(String[] args){
        MyLinkedList list=new MyLinkedList();
        list.head=new MyLinkedList.Node(1);
        list.head.next=new MyLinkedList.Node(2);
        list.head.next.next=new MyLinkedList.Node(3);
        list.head.next.next.next=new MyLinkedList.Node(4);
        list.head.next.next.next.next=new MyLinkedList.Node(5);
        MyLinkedList list2=new MyLinkedList();
        list2.head=new MyLinkedList.Node(4);
        list2.head.next=list.head.next.next;
        System.out.println(checkForIntersectionPoint(list.head,list2.head).data);
    }

    static MyLinkedList.Node checkForIntersectionPoint(MyLinkedList.Node head1, MyLinkedList.Node head2){
        if(head1==null || head2==null)
            return null;
        int count1=0,count2=0;
        MyLinkedList.Node node1=head1;
        MyLinkedList.Node node2=head2;
        int diff=0;
        while(node1!=null){
            node1=node1.next;
            count1++;
        }
        while(node2!=null){
            node2=node2.next;
            count2++;
        }
        node1=head1;
        node2=head2;
        if(count1>count2){
            diff=count1-count2;
            int i=0;
            while(i<diff) {
                node1 = node1.next;
                i++;
            }
        }
        if(count2>count1){
            diff=count2-count1;
            int i=0;
            while(i<diff) {
                node2 = node2.next;
                i++;
            }
        }
        while(node1!=null && node2!=null){
            if(node1.data.equals(node2.data))
                return node1;
            node1=node1.next;
            node2=node2.next;
        }
        return null;
    }

}
