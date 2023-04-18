import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        MyArrayList arrLis=new MyArrayList();
        System.out.println(arrLis.size());
        arrLis.add(1);
        arrLis.add(2);
        arrLis.add(3);
        arrLis.add(4);
        arrLis.add(5);
        arrLis.add(6);
        arrLis.add(7);

        System.out.println(arrLis.size());
        arrLis.remove(5);
        System.out.println(arrLis.size());
        System.out.println(arrLis.indexOf(1));
    }
}