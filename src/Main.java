import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(4);
        myArrayList.add(5);

        System.out.println("Original ArrayList: " + myArrayList);

        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueElements = new HashSet<Integer>();

        // Loop through the ArrayList and add each element to the HashSet
        for (Integer element : myArrayList) {
            uniqueElements.add(element);
        }

        // Clear the original ArrayList
        myArrayList.clear();

        // Add the unique elements back to the ArrayList
        for (Integer element : uniqueElements) {
            myArrayList.add(element);
        }

        System.out.println("ArrayList after removing duplicates: " + myArrayList);






    }
}

        //arrLis.remove(5);
        //System.out.println(arrLis.size());
        //System.out.println(arrLis.indexOf(1));
        //System.out.println(arrLis.lastIndexOf(1));
        //System.out.println("End of checking MyArrayList class");

        // next all items are about MyLinkedList class only

        //MyLinkedList<String> string = new MyLinkedList<>();
        //string.add("SE");
        //string.add("MT");
        //string.add("BDA");
        //string.add("DJ");
        //string.add("IT");
        //System.out.println("First faculty: "+string.get(1));
        //System.out.println("Faculties:" + string.size());










