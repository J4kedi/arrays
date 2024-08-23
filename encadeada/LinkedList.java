public class LinkedList<T> {
    private int tamanho;
    private Node<T> base;
    private Node<T> topo;

    public LinkedList(int tamanho) {
        this.tamanho = tamanho;
    }

    @SuppressWarnings({ "unchecked", "null" })
    public void clear() {
        base = null;
        topo = null;
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

    public int find(T data) {
        
    }
}
