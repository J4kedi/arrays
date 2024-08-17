import java.util.Arrays;

public class Fila<T> {
    private int top = 0;
    private int base = 0;
    private T[] data;

    @SuppressWarnings("unchecked")
    public Fila(int size) {
        this.data = (T[]) new Object[size];
    }

    public int getBase() {
        return base;
    }

    public int getTop() {
        return top;
    }

    public void add(T n) {
        if (!isFull()) {
            data[top] = n;
            System.out.println("Adicionado: " + data[top]);
            top = move(top);
        } else {
            System.out.println("\nTentado adicionar: " + n + ", mas está chein");
        }
    }

    public T rm() {
        if (data[base] == null) {
            System.out.println("Fila vazia");
            return null;
        }
        T v = data[base];
        System.out.println("Removido: " + data[base]);
        data[base] = null;
        base = move(base);
        return v;
    }

    public int move(int pos) {
        return (pos + 1) % data.length;
    }

    public boolean isFull() {
        if (top == base && base != 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}