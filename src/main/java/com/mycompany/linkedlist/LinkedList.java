/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.linkedlist;

/**
 *
 * @author joaqu
 */
public class LinkedList {
    
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node end = new Node(3);
        head.next = second;
        second.next = end;
        Node.traverse_linked_list(head);
        head = Node.addnode_at_head(head, 0);
        Node.traverse_linked_list(head);
        head = Node.addNode_at_last(head, 4);
        Node.traverse_linked_list(head);
        System.out.println(end.next.num);
    }
}

class Node{
    int num;
    Node next;
    public Node(int num){
        this.num = num;
        this.next = null;
    }
    public static void traverse_linked_list(Node head){
        Node current = head;
        while(current!=null){
            System.out.print(current.num+" ");
            current = current.next;
        }
        System.out.println("");
    }   // 0-> 1 -> 2 ->3
    public static Node addnode_at_head(Node head,int valor){
        Node newnode = new Node(valor);
        newnode.next = head;
        head = newnode;
        return head;
    }
    public static Node addNode_at_last(Node head,int valor){
        Node newnode = new Node(valor);
        if(head==null) return newnode;
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newnode;
        return head;
    }
}
