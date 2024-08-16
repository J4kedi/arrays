public class Fila {
    private int top = 0;
    private int base = 0;
    private int[] data;

    public Fila(int size) {
        this.data = new int[size];
    }

    public void add(int n) {
        data[top] = n;
        top = move(top);
    }

    public int rm () {
        int v = data[base];
        data[base] = -1;
        base++;
        return v;
    }

    public int move(int pos) {
        if (pos + 1 == data.length) {
            return 0;
        } 
        return pos + 1;
    }

    public boolean isFull() {
        if (top == base && base != 0) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return !isFull();
    }

    @Override
    public String toString() {
        String stringData = "[ ";

        for (int i : data) {
            stringData += Integer.toString(data[i]) + " ";
        }

        return stringData + "]";
    }
}