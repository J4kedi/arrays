public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>(5);

        fila.add(5);
        fila.add(8);
        fila.add(29);

        System.out.println("Fila: ");
        System.out.println("Base(" + fila.getBase() + ")" + " Top(" + fila.getTop() + ")");
        System.out.println(fila);
        
        int n = fila.rm();
        n = fila.rm();
        
        System.out.println("\nFila: ");
        System.out.println("Base(" + fila.getBase() + ")" + " Top(" + fila.getTop() + ")");
        System.out.println(fila);
        
        fila.add(7);
        fila.add(14);
        fila.add(3);
        fila.add(11);
        
        System.out.println("\nFila: ");
        System.out.println("Base(" + fila.getBase() + ")" + " Top(" + fila.getTop() + ")");
        System.out.println(fila);
        
        n = fila.rm();
        
        System.out.println("\nFila: ");
        System.out.println("Base(" + fila.getBase() + ")" + " Top(" + fila.getTop() + ")");
        
        System.out.println(fila);
        
        fila.add(2);
        
        System.out.println("\nFila: ");
        System.out.println("Base(" + fila.getBase() + ")" + " Top(" + fila.getTop() + ")");
        System.out.println(fila);
        
        fila.rm();

        fila.add(5);
        fila.add(30);
        System.out.println(fila);
    }
}
