package Structures.Graph;

public class graph <E> {
    private node[] nodes;
    private int size;
    
    public graph() {
        this.nodes = new node[1];
        this.size = 0;
    }

    public void addNode(E val) {
        node n = new node<E>(val);
        if (this.size == nodes.length) {
            node[] temp = this.nodes;
            this.nodes = new node[this.size + 1];
            for (int i=0; i < temp.length; i++) {
                this.nodes[i] = temp[i];
            }
        }
        nodes[size] = n;
        size ++;
    }

    public boolean addVertex(E n1, E n2, Object v) {
        int found = 0;
        for (int i=0; i < nodes.length; i++) {
            if (nodes[i].getValue() == n1 | nodes[i].getValue() == n2) {
                found ++;
            }
        }
        if (found != 2) {
            return false;
        }
        for (int i=0; i < nodes.length; i++) {
            if (nodes[i].getValue() == n1 | nodes[i].getValue() == n2) {
                nodes[i].add(v);
            }
        }
        return true;
    }

    public node[] getNodes() {
        return nodes;
    }

    public static void main(String[] args) {
        graph g = new graph<>();
        g.addNode("A");
        g.addNode("B");
        g.addVertex("A", "B", 5);
        node[] n = g.getNodes();
        for (node a: n) {
            System.out.println(a.getValue());
            for (Object b: a.getAdjacent()) {
                System.out.println(b);
            }
        }
    }
}
