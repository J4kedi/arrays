public class LinkedList<T> {
    private Node<T> base;
    private Node<T> topo;
    private int tamanho;

    public void add(T v) {

    }

    @SuppressWarnings({ "unchecked", "null" })
    public void clear() {
        base = null;
        topo = null;
    }

    private Node<T> getNode(int pos) {
        if(pos > tamanho) {
            throw new IllegalStateException("Length out of index.");
        }

        return Node<T>;
    }

    public int find(T data) {
        
    }

    private static class Node<T> {
        Node<T> anterior;
        T valor;
        Node<T> proximo;
    
        public Node(T valor) {
            this.valor = valor;
        }
    }
}
