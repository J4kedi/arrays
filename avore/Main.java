package avore;

public class Main {
    public static void main(String[] args) {
        // Avore arvoreBinaria = new Avore();

        // arvoreBinaria.adicionar(10);
        // arvoreBinaria.adicionar(5);
        // arvoreBinaria.adicionar(8);
        // arvoreBinaria.adicionar(4);
        // arvoreBinaria.adicionar(13);
        // arvoreBinaria.adicionar(20);
        // arvoreBinaria.adicionar(17);
        // arvoreBinaria.adicionar(1);

        // System.out.println(arvoreBinaria.remover(1));
        // System.out.println(arvoreBinaria.find(1));

        // System.out.println(arvoreBinaria.getTamanho());

        Arvore arvore = new Arvore();

        arvore.adicionar(1);
        arvore.adicionar(2);
        arvore.adicionar(3);
        arvore.adicionar(4);
        arvore.adicionar(5);

        System.out.println(arvore.procurar(4));

        System.out.println(arvore.remover(4));

        System.out.println(arvore.procurar(4));
    }
}