public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }

    public void withdraw(double amount) {

        try{
            if(amount > balance ){
                throw new InsufficientFundsException(
                        "Can't withdraw " + amount + ", balance is only " + balance
                );
            }
            balance-=amount;
            System.out.println("Withdrawal Successfully! New balance: "+balance);
        }catch (InsufficientFundsException e){
            System.out.println("CUSTOM Exception caught:" + e.getMessage());
        }

    }

    public static void main(String[] args){
        BankAccount account = new BankAccount("Yasmin",1000);

        account.withdraw(500);
        account.withdraw(1100);
    }
}
