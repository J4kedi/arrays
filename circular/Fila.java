public class Fila {
    private int top = 0;
    private int base = 0;
    private int[] data;

    public Fila(int size) {
        this.data = new int[size];
    }

    public int getBase() {
        return base;
    }

    public int getTop() {
        return top;
    }

    public void add(int n) {
        data[top] = n;
        if (isFull()) {
            top = move(top);
        } else {
            System.out.println("Tá chein");
        }
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
        String stringData = "[";

        int finalIdx = data.length - 1;

        for (int i = 0; i < finalIdx; i ++) {
            stringData += Integer.toString(data[i]) + ", ";
        }

        return stringData + data[finalIdx] + "]";
    }
}