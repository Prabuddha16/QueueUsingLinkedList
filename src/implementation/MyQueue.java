package implementation;

import myinterface.QueueADT;

public class MyQueue implements QueueADT{
    //head
    private Node front;
    //tail
    private Node rear;

    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void enqueue(int element) {
        Node node = new Node(element);
        if(!isEmpty()){
            rear.setNext(node);
            rear = node;
        }
        else{
            front = node;
            rear = node;
        }
        size++;
    }

    @Override
    public Node dequeue() {
        Node response = null;
        if(!isEmpty()){
            response = new Node(front.getData());
            //single element
            if(size == 1){
                front = null;
                rear = null;
            }
            // multiple elements
            else{
                front = front.getNext();
            }
            size--;
        }

        return response;
    }

    @Override
    public Node peek() {
        Node response = null;
        if(!isEmpty()){
            response = new Node(front.getData());
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
    public void traverse(){
        Node temp = front;
        System.out.print("front <--");
        while (temp != null){
            System.out.print(temp.getData() + "<--");
            temp = temp.getNext();
        }
        System.out.println("rear");
    }
}
