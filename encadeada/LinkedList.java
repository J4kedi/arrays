public class LinkedList<T> {
    private int tamanho;
    private int base = 0;
    private int topo = 0;

    public LinkedList(int tamanho) {
        this.tamanho = tamanho;
    }

    private static class Node<T> {
        Node<T> anterior;
        T data;
        Node<T> proximo;
    
        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> getNode(int pos) {
        if(pos > tamanho) {
            throw new IllegalStateException("Length out of index.");
        }


    }

    public int getBase() {
        return base;
    }

    public int getTopo() {
        return topo;
    }
}
