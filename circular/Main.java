public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.add(5);
        fila.add(8);
        fila.add(29);

        int n = fila.rm();
        n = fila.rm();

        fila.add(7);
        fila.add(14);

        fila.add(3);
        fila.add(11);
        
        System.out.println(fila);
    }
}