package Structures.Graph;

public class node<E> {
    private final E value;
    private Object[] adjacent;
    private int size;
    
    public node(E value) {
        this.value = value;
        this.adjacent = new Object[1];
        this.size = 0;
    }
    
    public E getValue() {
        return this.value;
    }

    private void resize() {
        Object[] temp = this.adjacent;
        this.adjacent = new Object[this.size + 1];
        for (int i=0; i < temp.length; i++) {
            this.adjacent[i] = temp[i];
        }
    }
    
    public boolean add(Object v) {
        if (this.size == this.adjacent.length) {
            resize();
        }
        this.adjacent[this.size] = v;
        this.size ++;
        return true;
    }

    public Object[] getAdjacent(){
        return this.adjacent;
    }

    public void removeEdge(Object v) {
        for (int i=0; i < this.adjacent.length; i++) {
            if (this.adjacent[i] == v) {
                Object[] temp = this.adjacent;
                this.adjacent = new Object[this.size];
                this.size --;
                int count = 0;
                for (int j=0; j < temp.length; j++) {
                    if (temp[j] == v) {
                        continue;
                    } else {
                        this.adjacent[count] = temp[j];
                        count ++;
                    }
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        node n = new node("car");
        n.add(1);
        n.add(2);
        System.out.println(n.getValue());
        for (Object x: n.getAdjacent()) {
            System.out.println(x);
        }
    }
}
