package Banking;

/**
 * Created by shsoni on 9/13/2016.
 */
public abstract class Account {

private long balance;
private String holderName;

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance()
    {
        return this.balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Account()
    {

    }

    public Account(String holderName)
    {
      setHolderName(holderName);
    }

    public void finalTransaction( String message, long amount)
    {
        System.out.println("Account Holder's name : " + getHolderName() );
        System.out.println("Transaction : " + message );
        System.out.println("Amount : " + amount);

      if (message == "Checking withdrawal")
      {
          balance = balance - amount;
      }
      else if (message == "Checking deposit" || message == "Mortgage Payment")
      {
          balance = balance + amount;
      }

        System.out.println("balance : " + balance);
        System.out.println("------------------");
    }



    public abstract boolean deposit(long amount);

    public abstract boolean withdraw(long amount);



}
