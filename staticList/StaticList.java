import java.util.Arrays;

public class StaticList<T> {
    private T[] data;
    private int size;
    private int base = 0;

    @SuppressWarnings("unchecked")
    public StaticList(int size) {
        this.size = size;
        this.data = (T[]) new Object[size];
    }

    public void clear() {
        for(int i = 0; i < size; i++) {
            data[i] = null;
        }
        base = 0;
    }

    public void add(T n) {
        if(isFull()) 
            throw new IllegalStateException("\nTentado adicionar: " + n + ", mas está chein");
        data[base++] = n;
        System.out.println("Adicionado: " + data[base - 1]);
    }
    
    public void add(T n, int pos) {
        if(isFull()) 
            throw new IllegalStateException("\nTentado adicionar: " + n + " na posição " + pos + ", mas está chein");            
        if(data[pos] != null) {
            int indexOfNull = find(null);
            data[indexOfNull] = data[pos];
            data[pos] = n;
            System.out.println("Adicionado: " + data[pos]);
            base++;
            return;
        }        
        data[pos] = n;
        System.out.println("Adicionado: " + data[base]);
        base++;
    }

    public T remove(int pos) {
        if(data[pos] == null) 
            throw new IllegalStateException("\nTentado remover o elemento na posição: " + pos + ", mas já está vazia");    
        T v = data[pos];
        data[pos] = null;
        System.out.println("Removido: " + v);
        base--;
        return v;
    }

    public void setData(T n, int pos) {
        System.out.println("Substituído: " + data[pos] + " , Por: " + n);
        data[pos] = n;
    }

    public boolean isFull() {
        return base == size;
    }

    public boolean isEmpty() {
        return base == 0;
    }
   
    public int find(T n) {
        for(int i = 0; i < size; i++) {
            if (data[i] == n) {
                System.out.println("Encontrado: " + n + " Na posição: " + i);
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

    public T[] getData() {
        return data;
    }

    public int getBase() {
        return base;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}