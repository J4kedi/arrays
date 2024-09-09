package avore;

public class Avore {
    private Node raiz;
    private int tamanho = 0;

    public Avore() {
        raiz = null;
    }

    public void adicionar(int valor) {        
        if(raiz == null) {
            raiz = new Node(valor);            
            tamanho++;
            return;
        }

        Node no = raiz;
        Node galho = null;

        while (no != null) {
            galho = no;

            if (no.getValor() >= valor) {
                no = no.getEsquerda();
                if (no == null) {
                    no = new Node(valor);
                    galho.setEsquerda(no);
                    break;
                }
            } else {
                no = no.getDireita();
                if (no == null) {
                    no = new Node(valor);
                    galho.setDireita(no);
                    break;
                }
            }
        }

        tamanho++;
    }

    private void adicionar(Node no, Node noCerto) {
        Node currentNo = raiz;
        int valor = noCerto.getValor();

        while (currentNo.getDireita() != no && currentNo.getEsquerda() != no) {
            if(currentNo.getValor() >= valor) {
                currentNo = currentNo.getEsquerda();
            } else if (currentNo.getValor() <= valor) {
                currentNo = currentNo.getDireita();
            }
        }

        if(currentNo.getDireita() == no) {
            currentNo.setDireita(noCerto);
        } else {
            currentNo.setEsquerda(noCerto);
        }
    }

    public int remover(int valor) {
        Node no = find(valor);
        Node noDireita = no.getDireita();
        Node noEsquerda = no.getEsquerda();

        if (noDireita != null && noEsquerda != null) {
            if(noDireita.getValor() >= noEsquerda.getValor()) {
                noDireita.setEsquerda(noEsquerda);
                adicionar(no, noDireita);
            } else {
                noEsquerda.setEsquerda(noDireita);
                adicionar(no, noEsquerda);
            }
        }

        if (noDireita == null && noEsquerda == null) {
            no = null;
        } else {
            no.setEsquerda(null);
            no.setDireita(null);
        }

        tamanho--;

        return valor;
    }

    public Node find(int valor) {
        Node no = raiz;

        while (true) {
            if (no.getValor() <= valor) {
                no = no.getDireita();
            } else {
                no = no.getEsquerda();
            }

            if (no == null) {
                throw new IllegalArgumentException("Valor não encontrado na avore");
            } else if (no.getValor() == valor) {
                return no;
            }
        }
    }

    public int getTamanho() {
        return tamanho;
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

        @Override
        public String toString() {
            return "Node: [" + String.valueOf(valor) + "]";
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}