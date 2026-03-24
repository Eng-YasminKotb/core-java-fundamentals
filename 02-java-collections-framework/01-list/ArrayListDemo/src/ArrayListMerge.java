import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListMerge {
    public static void main(String[] args) {
        //Merge two ArrayLists without duplicates
        ArrayList<Integer> num1=new ArrayList<Integer>();
        num1.add(1); num1.add(25121243); num1.add(37);

        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(37); num2.add(9999); num2.add(812);


        // HashSet gives no order guarantee — consistent output here
        // is an implementation detail of how Java hashes integers, not a language guarantee
        HashSet<Integer> num3 = new HashSet<Integer>();
        for (int i : num1){
            if (!num3.contains(i)){
                num3.add(i);
            }
        }
        for (int i : num2){
            num3.add(i);
        }
        for (int i : num3){
            System.out.println(i);
        }

    }

}
