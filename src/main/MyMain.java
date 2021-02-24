package main;

import implementation.MyQueue;
import implementation.Node;

public class MyMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(45);
        queue.enqueue(37);
        queue.traverse();
        System.out.println("no of element = " + queue.size());
        Node deleted = queue.dequeue();
        if (deleted != null)
            System.out.println("deleted element = " + deleted.getData());
        queue.traverse();
        queue.enqueue(64);
        queue.enqueue(47);
        queue.enqueue(56);
        queue.enqueue(83);
        queue.enqueue(44);
        queue.enqueue(35);
        queue.enqueue(20);
        queue.enqueue(45);
        queue.enqueue(51);
        queue.traverse();
        System.out.println("no of element = " + queue.size());
    }
}
