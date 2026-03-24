import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortAndIterate {
    public static void main(String[] args) {

        //Sort a list of names alphabetically, then reverse it — without writing your own sorting/reversing logic
        ArrayList<String> names= new ArrayList<String>();
        names.add("Yasmin");
        names.add("Shahd");
        names.add("Aya");
        names.add("Esraa");

        //sort
        Collections.sort(names);
        for (String name : names)
            System.out.println(name);

        //reverse in place — no new list needed
        Collections.reverse(names);

        System.out.println("-----revesesd!-----");
        for (String name : names)
            System.out.println(name);

    }
}
