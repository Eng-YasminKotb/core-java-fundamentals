import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListSortAndIterate {
    public static void main(String[] args) {
        //task 5

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

        //task6
        //Iterate the list and remove every name that starts with the letter "A" — do this safely (hint: naive for-each will throw an exception)
        names.add("Asia");

        System.out.println("-----Before remove names start with 'A'-----");

        for (String name : names)
            System.out.println(name);

        //❌This will through an exception -IndexOutOfBoundsException-
        /*for (int i=0;i<=names.size();i++){
            String name = names.get(i);
            if (name.charAt(0) == 'A'){
                names.remove(name);
            }
        }*/

        System.out.println("-----remove names start with 'A'-----");

        //💡 suggested solution1
        Iterator<String> it=names.iterator();
        while (it.hasNext()){
            String name = it.next();
            if (name.charAt(0) == 'A'){
                it.remove();
            }
        }
        for (String name : names)
            System.out.println(name);

    }
}
