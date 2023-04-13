package Structures.Queue;

public class Queue<E> implements IQueue<E> {
    // holds size of queue
    private int size;
    // holds data for the queue
    private Object[] arr;
    // front of queue
    private int front;
    // back of queue
    private int rear;
    
    /**
     * Constructor method for the queue. 
     *
     * @param s   the size
     */
    public Queue(int s) {
        // sets top to -1 & creates an array of size given by user
        this.size = s;
        this.arr = new Object[s];
        // init front and rear to -1
        this.rear = -1;
        this.front = -1;
    }

    /**
     * Method to check if the queue is full. 
     *
     * @return      whether the queue is full
     */
    public boolean isFull() {
        // if the next item will be placed at the front
        return front == (rear + 1) % size;
    }

    /**
     * Method to check if the queue is empty. 
     *
     * @return      whether the queue is empty
     */
    public boolean isEmpty() {
        // if the front var has not been initialised
        return front == -1;
    }

    /**
     * Method to add an item to the queue. 
     *
     * @param   e   element to add to the queue 
     * @return      whether the item could be added or not
     */
    public boolean enqueue(E e) {
        // if the queue is not full
        if (!isFull()) {
            // init front to 0 if it is at -1
            if (front == -1) {
                front = 0;
            }
            // increment rear
            rear = (rear + 1) % size;
            // add item in back of queue
            arr[rear] = e;
            // return true
            return true;
        }
        // return false if queue is full
        return false;
    }

    /**
     * Method to remove an item from the front of the queue. 
     *
     * @return      whether the item could be removed or not
     */
    public E dequeue() {
        // if the queue is not empty
        if (!isEmpty()) {
            // get the front item
            E item = (E) arr[front];
            // check if the queue is now empty
            if (front == rear) {
                // reset front and rear to -1
                front = -1;
                rear = -1;
            } else {
                // increment the front pointer
                front = (front + 1) % size;
            }
            // return the item
            return item;
        }
        // return null if an item was not found
        return null;
    }

    public void printq() {
        for (Object i: arr) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.print('\n');
    }

    /**
     * Method to return the item at the front of the queue. 
     *
     * @return      the front item
     */
    public E front() {
        // checks if there are any items in the queue
        if (!isEmpty()) {
            // returns the front item
            return (E) arr[front];
        }
        // returns null if no item was found
        return null;
    }

    // tests
    public static void main(String[] args) {
        Queue s = new Queue<>(5);
        System.out.println(s.enqueue(1));
        System.out.println(s.enqueue(2));
        System.out.println(s.enqueue(3));
        System.out.println(s.enqueue(4));
        System.out.println(s.enqueue(5));
        System.out.println(s.dequeue());
        System.out.println(s.enqueue(6));
        s.printq();
        System.out.println(s.dequeue());
        System.out.println(s.dequeue());
        System.out.println(s.dequeue());
        System.out.println(s.dequeue());
        System.out.println(s.dequeue());

    }
}
