package Structures.Stack;

public class Stack<E> implements IStack<E> {
    // holds size of stack
    private int size;
    // holds data for the stack
    private Object[] arr;
    // holds position of top item
    private int top;

    /**
     * Constructor method for the stack. 
     *
     * @param s   the input array to sort
     */
    public Stack(int s) {
        // sets top to -1 & creates an array of size given by user
        this.size = s;
        this.arr = new Object[s];
        this.top = -1;
    }

    /**
     * Method to check if the stack is full. 
     *
     * @return      whether the stack is full
     */
    public boolean isFull() {
        return top == size - 1;
    }

    /**
     * Method to check if the stack is empty. 
     *
     * @return      whether the stack is empty
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Method to add an item to the stack. 
     *
     * @param   e   element to add to the stack 
     * @return      whether the item could be added or not
     */
    public boolean push(E e) {
        // checks if the stack is not full; if there is space for an item
        if (!isFull()) {
            // increments top
            this.top ++;
            // adds item at top
            this.arr[this.top] = e;
            // returns true
            return true;
        }
        // returns false if there is no space in the stack
        return false;
    }

    /**
     * Method to remove an item from the top of the stack. 
     *
     * @return      whether the item could be removed or not
     */
    public E pop() {
        // checks if there is an item to pop
        if (!isEmpty()) {
            // gets the top item
            E item = (E) this.arr[this.top];
            // decrements the top pointer
            this.top --;
            // returns true
            return item;
        }
        // returns null if an item couldn't be removed
        return null;
    }

    /**
     * Method to return the item at the top of the stack. 
     *
     * @return      the top item
     */
    public E top() {
        // checks if there are any items in the stack
        if (!isEmpty()) {
            // returns the top item
            return (E) this.arr[this.top];
        }
        // returns null if no item was found
        return null;
    }

    // tests
    public static void main(String[] args) {
        Stack s = new Stack<>(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
