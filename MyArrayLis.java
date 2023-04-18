
public class MyArrayLis<T> implements MyList<T>{
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }
}
