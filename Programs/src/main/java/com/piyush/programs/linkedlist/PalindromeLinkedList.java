package com.piyush.programs.linkedlist;
import com.piyush.programs.linkedlist.MyLinkedList.Node;
public class PalindromeLinkedList {
    public static void main(String[] args){
        MyLinkedList list=new MyLinkedList();
        list.head=new Node(1);
        list.head.next=new Node(2);
        list.head.next.next=new Node(2);
        list.head.next.next.next=new Node(1);
        System.out.println(checkForPalindromeLinkedList(list.head));
    }
    static boolean checkForPalindromeLinkedList(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        Node secondHead=slow.next;
        slow.next=null;
        /*Node p1 = secondHead;
        Node p2 = p1.next;

        while(p1!=null && p2!=null){
            Node temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }

        secondHead.next = null;*/

        Node previous = null;
        Node current = secondHead;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        current=previous;

        //compare two sublists now
        Node q = head;
        while(current!=null){
            if(current.data != q.data)
                return false;

            current = current.next;
            q = q.next;

        }

        return true;
    }
}
