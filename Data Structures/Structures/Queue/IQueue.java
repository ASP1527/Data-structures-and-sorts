package Structures.Queue;

public interface IQueue<E> {
    public boolean isFull();
    public boolean isEmpty();
    public boolean enqueue(E element);
    public E dequeue();   
    public E front();
}
