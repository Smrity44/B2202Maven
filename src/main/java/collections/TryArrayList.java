package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class TryArrayList {
    public static void main(String[] args) {

        ArrayList<String> element = new ArrayList<>();
        element.add("one");
        element.add("one");
        element.add("three");
        element.add("two");
        System.out.println("This is Arraylist >"+element);

        HashSet<String> hash = new HashSet<>();

        hash.add("one");
        hash.add("one");
        hash.add("three");
        hash.add("two");

        System.out.println("this is Hashset >" +hash);


    }

}
