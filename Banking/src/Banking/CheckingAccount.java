package Banking;

/**
 * Created by shsoni on 9/13/2016.
 */
//Class CheckingAccount - subclassed from Class Account
public class CheckingAccount extends Account {
    long overDraftAmount;

    public CheckingAccount() {

    }

    public CheckingAccount(String holderName, long overDraftAmount) {
        setHolderName(holderName);
        this.overDraftAmount = overDraftAmount;
    }


    @Override
    public boolean deposit(long amount) {
        finalTransaction("Checking deposit", amount);
        return true;
    }

    @Override
    public boolean withdraw(long amount) {

        if ((getBalance() < amount) && overDraftAmount >= amount - getBalance())
            {
                finalTransaction("Checking withdrawal", amount);
                return true;
            }

        else if (getBalance() > amount)
        {
            finalTransaction("Checking withdrawal", amount);
            return true;
        }

        else
            {
            System.out.println("Invalid transaction");
                System.out.println("------------------");
            return false;
            }

    }
}

