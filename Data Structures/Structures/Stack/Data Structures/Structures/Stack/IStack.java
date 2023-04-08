package Structures.Stack;

public interface IStack<E> {
    public boolean isFull();
    public boolean isEmpty();
    public boolean push(E element);
    public E pop();    
}
