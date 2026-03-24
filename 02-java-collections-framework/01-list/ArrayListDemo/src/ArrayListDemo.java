import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList<String> languages= new ArrayList<String>();
//
//        //Add 5 languages to ArrayList
//        languages.add("Java");
//        languages.add("C++");
//        languages.add("Python");
//        languages.add("C#");
//        languages.add("Go");
//
//        for(String language : languages){
//            System.out.println(language);
//        }
//
//        //Add a language at index 2
//        languages.add(2,"JavaScript");
//        System.out.println("ArrayList size: "+languages.size());
//        // 0    1    2          3     4 5
//        //Java C++ JavaScript Python C# Go
//
//        //Remove one language by index
//        languages.remove(5);
//        System.out.println("ArrayList size after removing one element by index: "+ languages.size());
//
//        //Remove one language by value
//        languages.remove("C#");
//        System.out.println("ArrayList size after removing one element by value: "+ languages.size());
//
//
//        //Check if the list contains a language
//        int idx = languages.indexOf("Python");
//        if (idx != -1) {
//            languages.remove(idx);
//            System.out.println("Language is removed");
//        } else {
//            System.out.println("Language does not exist!");
//        }

        //Merge two ArrayLists without duplicates
        ArrayList<Integer> num1=new ArrayList<Integer>();
        num1.add(3); num1.add(2); num1.add(3);

        ArrayList<Integer> num2 = new ArrayList<Integer>();
        num2.add(3); num2.add(5); num2.add(6);

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