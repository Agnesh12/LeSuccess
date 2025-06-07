package Assignment14;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

class LinkedListQueue {
    Node front = null, rear = null;


    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }


    public void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }
        front = front.next;
        if (front == null)
            rear = null;
    }


    public void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

