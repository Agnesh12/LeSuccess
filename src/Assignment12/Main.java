package Assignment12;

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class Main {
    Node head;


    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }


    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }


    public void insertAtEnd(int data) {
        append(data);
    }


    public void insertAt3rdPosition(int data) {
        if (head == null || head.next == null) {
            System.out.println("List too short.");
            return;
        }
        Node newNode = new Node(data);
        Node temp = head.next; // 2nd node
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
    }


    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
        if (head != null)
            head.prev = null;
    }


    public void deleteLast() {
        if (head == null) return;
        Node temp = head;
        if (temp.next == null) {
            head = null;
            return;
        }
        while (temp.next != null)
            temp = temp.next;
        temp.prev.next = null;
    }


    public void deleteMiddle() {
        if (head == null || head.next == null || head.next.next == null) {
            System.out.println("List too short.");
            return;
        }
        Node temp = head.next.next; // 3rd node
        if (temp.prev != null)
            temp.prev.next = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;
    }


    public void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main dll = new Main();

        System.out.print("Enter number of nodes: ");
        int n = scanner.nextInt();
        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            dll.append(scanner.nextInt());
        }

        System.out.println("Original list:");
        dll.display();


        dll.insertAtBeginning(100);
        dll.display();


        dll.insertAtEnd(200);
        dll.display();

        if (n >= 5) {
            System.out.println("\nInsert at 3rd position (e.g., 300):");
            dll.insertAt3rdPosition(300);
            dll.display();

            System.out.println("\nDelete first node:");
            dll.deleteFirst();
            dll.display();

            System.out.println("\nDelete last node:");
            dll.deleteLast();
            dll.display();

            System.out.println("\nDelete middle node (3rd):");
            dll.deleteMiddle();
            dll.display();
        } else {
            System.out.println("\nNeed at least 5 nodes to perform some operations.");
        }


    }
}

