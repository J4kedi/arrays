package avore;

public class avore {
    private Node raiz;
    private int tamanho = 0;

    public avore() {
        raiz = null;
    }

    public void add(int valor) {        
        if(raiz == null) {
            raiz = new Node(valor);            
            return;
        }

        Node no = raiz;
        Node galho = null;

        while (no != null) {
            if (no != null) {
                Node galho = no;
            }

            if (no.getValor() >= valor) {
                no = no.getEsquerda();
                if (no == null) {
                    no = new Node(valor);
                    galho.setDireita = no;
                }
            } else {
                no = no.getDireita();
            }
        }
    }

    private class Node {
        private Node esquerda;
        private int valor;
        private Node direita;

        public Node(int valor) {
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }

        public Node getEsquerda() {
            return esquerda;
        }

        public Node getDireita() {
            return direita;
        }

        public void setEsquerda(Node esquerda) {
            this.esquerda = esquerda;
        }

        public void setDireita(Node direita) {
            this.direita = direita;
        }
    }
}