import java.util.*;
/*
example of Int (primitive type) Queue
 */
class FixedQueue {
    private int front;
    private int rear;
    private int size;
    private int capacity;
    private final int []element;
    FixedQueue(int capacity){
        this.element = new int[capacity];
        this.capacity = capacity;
    }
    public void add(int x) {
        if(size == capacity)
            throw new IllegalStateException("Queue is full");
        element[rear] = x;
        rear = (rear + 1)%capacity;
        size++;
    }
    public int poll(){
        if(size == 0)
            throw new NoSuchElementException();
        int ret = element[front];
        front = (front + 1)%capacity;
        size--;
        return ret;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
}
public class Main {
    public static void main(String []args) {
        FixedQueue fq = new FixedQueue(100);
        for(int i=0; i<100; i++)
            fq.add(i);
        while(!fq.isEmpty())
            System.out.println(fq.poll());
        for(int i=101; i<200; i++){
            fq.add(i);
            System.out.println(fq.poll());
        }
    }
}
