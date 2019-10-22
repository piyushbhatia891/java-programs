package com.piyush.programs.linkedlist;
import com.piyush.programs.linkedlist.MyLinkedList.Node;
public class AddTwoNumbers {
    public static void main(String[] args){
        MyLinkedList list=new MyLinkedList();
        list.head=new Node(1);
        list.head.next=new MyLinkedList.Node(2);
        list.head.next.next=new MyLinkedList.Node(3);
        MyLinkedList list2=new MyLinkedList();
        list2.head=new MyLinkedList.Node(1);
        list2.head.next=new MyLinkedList.Node(2);
        list2.head.next.next=new MyLinkedList.Node(3);
        Node head1=reverseList(list);
        Node head2=reverseList(list2);
        Node result=addTwoLinkedLists(head1,head2);
        result=reverseList(result);

    }

    static Node reverseList(Node head){
        MyLinkedList.Node previous = null;
        MyLinkedList.Node current = head;
        MyLinkedList.Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }

    static Node reverseList(MyLinkedList linkedList){
        MyLinkedList.Node previous = null;
        MyLinkedList.Node current = linkedList.head;
        MyLinkedList.Node next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        linkedList.head = previous;
        return linkedList.head;
    }

    static Node addTwoLinkedLists(Node head1,Node head2){
        int sum=0;
        int carry=0;
        Node rowHead=null;
        Node temp=null;
        int firstIter=0;
        while(head1!=null || head2!=null){
            sum=carry;
            firstIter++;
            if(head1!=null){
                sum=sum+ Integer.parseInt(head1.data.toString());
                head1=head1.next;
            }
            if(head2!=null){
                sum=sum+ Integer.parseInt(head2.data.toString());
                head2=head2.next;
            }
            carry=sum/10;
            sum=sum%10;
            if(firstIter==1)
            {
                temp = new Node(sum);
                rowHead=temp;
            }
            else
            {
                Node tempSumNode=new Node(sum);
                temp.next=tempSumNode;
                temp=temp.next;
            }
        }
        if(carry!=0)
        {
            Node tempNode=new Node(carry);
            temp.next=tempNode;
        }
        return rowHead;
    }
}
