
public class MyArrayLis<T> implements MyList<T>{
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public void add(T) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * elements.length);
        }
        elements[size] = element;
        size++;
    }

    public T get(int index) {
        return (T) elements[index];
    }
}
