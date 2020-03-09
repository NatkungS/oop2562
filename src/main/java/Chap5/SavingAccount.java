package Chap5;

public class SavingAccount extends BankAccount {

    private SavingAccount(int accountNO, String accountName, double balance) {
        super(accountNO, accountName, balance);
    }

    public static SavingAccount createSA(int accountNO, String accountName, double balance) {
        if (balance >= 100) {
            return new SavingAccount(accountNO, accountName, balance);
        } else {
            return null;
        }
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(" SA Withdraw Amount : " + amount);
        double b = getBalance() - amount;
        if (b >= 50) {
            System.out.println("Balance After Withdraw : " + b);
            setBalance(b);

        } else {
            System.out.println("Can't Withdraw "+b+" it's below 50 Bath");
        }

    }

}
