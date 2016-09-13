package Banking;

public class Main {

    public static void main(String[] args)
    {

        CheckingAccount chkAccount = new CheckingAccount("John", 100);
        chkAccount.setBalance(200);
        chkAccount.deposit(50);
        chkAccount.withdraw(1000);
        chkAccount.withdraw(50);
        chkAccount.deposit(200);

        MortgageAccount mrtAccount = new MortgageAccount("Tim", 100);
        mrtAccount.deposit(100);
        mrtAccount.deposit(200);
        mrtAccount.deposit(5000);



    }
}
