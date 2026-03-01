public class UncheckedException {


    public static double calculate(int balance, int months){

        return balance/months;
    }

    public static void processAccount(String accountName){
        System.out.println(accountName.toUpperCase());
    }

    public static void main(String[] args){
        // ArithmeticException
        try {
            double rate=calculate(5000,0);
            System.out.println(rate);
        } catch (ArithmeticException e) {
            System.out.println("UNCHECKED Exception caught: " + e.getMessage());
        }
        // NullPointerException
        try {
            processAccount(null);
        } catch (NullPointerException e) {
            System.out.println("UNCHECKED Exception caught: " + e.getMessage());
        }

    }
}
