import javax.imageio.IIOException;

public class StaticList<T> {
    private T[] data;
    private int size;
    private int base = 0;

    @SuppressWarnings("unchecked")
    StaticList(int size) {
        this.size = size;
        this.data = (T[]) data[size];
    }

    void clear() {
        for(int i = 0; i < size; i++) {
            data[i] = null;
        }
        base = 0;
    }

    void add(T n) {
        if(isFull()) 
            throw new IllegalStateException("\nTentado adicionar: " + n + ", mas está chein");
        data[++base] = n;
        System.out.println("Adicionado: " + data[base - 1]);
    }
    
    void add(T n, int pos) {
        if(isFull()) 
            throw new IllegalStateException("\nTentado adicionar: " + n + " na posição" + pos + ", mas está chein");            
        
    }

    boolean isFull() {
        return base == size;
    }
   
    @SuppressWarnings("unchecked")
    public T find(T n) {
        for(int i = 0; i < size; i++) {
            if (data[i] == n) {
                return (T) Integer.valueOf(i);
            }
        }
        return (T) Integer.valueOf(-1);
    }
}