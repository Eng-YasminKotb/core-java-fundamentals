import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

    public static void readFile(String filePath){
        FileReader fileReader=null;
        try {
             fileReader= new FileReader(filePath);
            System.out.println("File is read successfully!");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args){
        readFile("resources/file.txt");
    }
}
