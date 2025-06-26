import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}



public class LinkedList {

    public static void addLast(Node head, int data) {
        Node newNode = new Node(data);

        Node tempNode = head;

        while (tempNode.next != null) {
            tempNode=tempNode.next;
        }
        tempNode.next = newNode;
    }
    
    public static void print(Node head) {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Nodes");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Linked List should have at least 1 node");
        }


        System.out.println("Enter the data for node 1 (head)");
        int val = sc.nextInt();
        Node head = new Node(val);

        for (int i = 2; i <=n; i++) {
            System.out.println("Enter the data for node " + i);
            val = sc.nextInt();
            addLast(head, val);
        }

        
        print(head);
        
        sc.close();
    }
}