package Banking;

/**
 * Created by shsoni on 9/13/2016.
 */
public class MortgageAccount extends Account {

    public MortgageAccount()
    {

    }

    public MortgageAccount(String holderName, long amountBorrowed)
    {   setHolderName(holderName);
        System.out.println(" Initial Borrowed Amount ");
    }

    @Override
    public boolean deposit(long amount) {
        finalTransaction("Mortgage Payment", amount);
        return true;
    }

    @Override
    public boolean withdraw(long amount) {
        return false;
    }

}
