public class Main {
    public static void main(String[] args) {
        StaticList<Integer> lista = new StaticList<>(4);

        lista.add(1);

        lista.find(1);

        lista.add(2);
        lista.add(2);

        System.out.println(lista);
        
        lista.remove(2);
        System.out.println(lista);
        lista.add(7, 2);
        System.out.println(lista);
        lista.add(11, 2);
        System.out.println(lista);
        
        lista.setData(9, 3);
        System.out.println(lista);
    }
}
