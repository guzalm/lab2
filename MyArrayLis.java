
public class MyArrayLis<T> implements MyList<T>{
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    public void add(Object element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, 2 * elements.length);
        }

    }
}
