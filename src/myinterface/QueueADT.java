package myinterface;

import implementation.Node;

public interface QueueADT {
    void enqueue(int element);
    Node dequeue();
    Node peek();
    boolean isEmpty();
    int size();
}
