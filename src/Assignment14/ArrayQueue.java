package Assignment14;

class ArrayQueue {
    int[] queue = new int[100];
    int front = 0, rear = -1;


    public void enqueue(int value) {
        if (rear == 99) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = value;
    }


    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        front++;
    }


    public void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

