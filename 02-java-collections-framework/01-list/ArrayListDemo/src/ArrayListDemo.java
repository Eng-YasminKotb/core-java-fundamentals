import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> languages= new ArrayList<String>();

        //Add 5 languages to ArrayList
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        languages.add("C#");
        languages.add("Go");

        for(String language : languages){
            System.out.println(language);
        }

        //Add a language at index 2
        languages.add(2,"JavaScript");
        System.out.println("ArrayList size: "+languages.size());
        // 0    1    2          3     4 5
        //Java C++ JavaScript Python C# Go

        //Remove one language by index
        languages.remove(5);
        System.out.println("ArrayList size after removing one element by index: "+ languages.size());

        //Remove one language by value
        languages.remove("C#");
        System.out.println("ArrayList size after removing one element by value: "+ languages.size());


        //Check if the list contains a language, then find its index
        int idx = languages.indexOf("Python");
        if (idx != -1) {
            languages.remove(idx);
            System.out.println("Language is removed");
        } else {
            System.out.println("Language does not exist!");
        }



    }
}