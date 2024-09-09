package encadeada;

public class LinkedList<T> {
    private Node<T> base;
    private Node<T> topo;
    private int tamanho = 0;

    public LinkedList (int tamanho) {
        this.tamanho = tamanho;

    }

    public void add(T v) {
        Node<T> node = new Node<>(v);

        if (base == null) {
            base = node;
            topo = node;
        }

        node.anterior = topo;
        topo.proximo = node;

        topo = node;

        tamanho++;
    }

    public void add(T v , int pos) {
        Node<T> nodeIndex = getNode(pos);

        Node<T> node = new Node<>(v);
     
        node.proximo = nodeIndex;
        node.anterior = nodeIndex.anterior;

        nodeIndex.anterior = node;

        node.anterior = node;
    }

    public void clear() {
        base = null;
        topo = null;
    }

    public T remove (int pos) {
        Node<T> node = getNode(pos);

        T valor = node.valor;


        return valor;
    }

    private Node<T> getNode(int pos) {
        if (pos > tamanho) {
            throw new IllegalStateException("Length out of index.");
        }

        Node<T> node = new Node<>(null);

        if (tamanho / 2 <= pos) {
            for (int i = 0; i < pos; i++) {
                node = base.proximo;
            }
        } else {
            for (int i = tamanho - 1; i > pos; i--) {
                node = topo.anterior;
            }
        }

        return node;
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
