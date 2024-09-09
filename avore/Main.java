package avore;

public class Main {
    public static void main(String[] args) {
        Avore arvoreBinaria = new Avore();

        arvoreBinaria.adicionar(10);
        arvoreBinaria.adicionar(5);
        arvoreBinaria.adicionar(8);
        arvoreBinaria.adicionar(4);
        arvoreBinaria.adicionar(13);
        arvoreBinaria.adicionar(20);
        arvoreBinaria.adicionar(17);
        arvoreBinaria.adicionar(1);

        System.out.println(arvoreBinaria.remover(1));
        System.out.println(arvoreBinaria.find(1));

        System.out.println(arvoreBinaria.getTamanho());
    }
}