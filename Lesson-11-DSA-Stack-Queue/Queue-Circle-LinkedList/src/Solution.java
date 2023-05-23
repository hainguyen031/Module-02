public class Solution {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = queue.rear = null;
        enQueue(queue, 2);
        enQueue(queue, 4);
        enQueue(queue, 8);
        enQueue(queue, 10);
        displayQueue(queue);
        deQueue(queue);
        deQueue(queue);
        displayQueue(queue);
    }
    static class Node {
        public int data;
        public Node link;
    }
    static class Queue {
        public Node front, rear;
    }
    public static void enQueue(Queue queue, int value) {
        Node temp = new Node();
        temp.data = value;
        if (queue.front == null) {
            queue.front = temp;
        } else {
            queue.rear.link = temp;
        }
        queue.rear = temp;
        queue.rear.link = queue.front;
    }
    public static void deQueue(Queue queue) {
        if (queue.front == null) {
            System.out.println("Empty");
        }
        int value;
        if (queue.front == queue.rear) {
            value = queue.front.data;
            queue.front = null;
            queue.rear = null;
        } else {
            Node temp = queue.front;
            value = temp.data;
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }

    }
    public static void displayQueue(Queue queue) {
        Node temp = queue.front;
        System.out.print(" Elements in Circular Queue are: ");
        while (temp.link != queue.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
        System.out.println();
    }

}
