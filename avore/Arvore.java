package avore;

public class Arvore {
    private Node raiz;
    private int tamanho;

    public Arvore() {
        raiz = null;
        tamanho = 0;
    }

    public void adicionar(int valor) {
        if (raiz == null) {
            raiz = new Node(valor);
            tamanho++;
            return;
        }

        Node noDireita = raiz.getDireita();
        Node noEsquerda = raiz.getEsquerda();
        Node noAtual = raiz;

        while (noAtual.getValor() != valor) {
            if(noAtual.getValor() <= valor) {
                noAtual = noAtual.getDireita();
            } else {
                noAtual = noAtual.getEsquerda();
            }
        }
    }

    public Node procurar(int valor) {
        Node noAtual = raiz;

        while (noAtual.getValor() != valor) {
            if(noAtual.getValor() <= valor) {
                noAtual = noAtual.getDireita();
            } else {
                noAtual = noAtual.getEsquerda();
            }

            if (noAtual == null)
                throw new IllegalArgumentException("Valor não encontrado na avore");
        }

        return noAtual;
    }

    private class Node {
        private Node esquerda;
        private int valor;
        private Node direita;

        public Node(int valor){
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }

        public Node getEsquerda() {
            return esquerda;
        }

        public void setEsquerda(Node esquerda) {
            this.esquerda = esquerda;
        }

        public Node getDireita() {
            return direita;
        }

        public void setDireita(Node direita) {
            this.direita = direita;
        }

        @Override
        public String toString() {
            return "Node: [" + String.valueOf(valor) + "]";
        }
    }

    @Override
    public String toString() {
        return "Raiz: [" + String.valueOf(raiz.getValor()) + "]";
    }
}
