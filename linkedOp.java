import java.io.*;
import java.util.Scanner;
public class linkedOp{
    Node head;//head of the linked list
    class Node{
        Node next;
        int data;
        //following is the constructor for Node class
        Node(int d){
            data = d;
            next = null;
        }
    }
    //inserting new node at the start of the list
    public void push(int newData){
        Node newNode = new Node(newData);
        //pointing prev head to next of newNode
        newNode.next = head;
        //making this newNode as new head
        head = newNode;
    }
    //inserting node after a particular node
    public void insertAfter(Node prev, int newData){
        Node newNode = new Node(newData);
        //to check if linked list is empty
        if(prev == null)
        {
            head = newNode;
        }
        newNode.next = prev.next;
        prev.next = newNode;

    }

    public void appendEND(int newData){
        Node newNode = new Node(newData);
        //to check if list is empty
        if(head == null)
        {
            head = newNode;
            return;
        }
        //if not then making it the last node
        newNode.next = null;
        Node travel = head;
        while(travel.next != null)
        {
            travel = travel.next;
        }

        travel.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N,value;
        linkedOp list1 = new linkedOp();
        list1.appendEND(6);
        list1.push(7);
        list1.push(1);
        list1.appendEND(4);
        list1.insertAfter(list1.head.next.next , 4567);

        list1.printList();


    }
}

