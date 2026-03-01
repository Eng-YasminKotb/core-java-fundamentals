import javax.jws.soap.SOAPBinding;
import java.io.FileWriter;
import java.io.IOException;

public class TransactionalLogger {
    public static void logTransaction(String message){
        try(FileWriter fileWriter= new FileWriter("resources/transaction-log")) {
            fileWriter.write(message);
            System.out.println("Transaction logged successfully!");
        }catch (IOException e){
            System.out.println("Failed to log transaction: " + e.getMessage());
        }
    }


    public static void main(String[] args){
       logTransaction("Withdrawal: 500$ from Yasmin's account");
    }
}
