package Chap5;

public class FixedDepositAccount extends BankAccount {

    private FixedDepositAccount(int accountNO, String accountName, double balance) {
        super(accountNO, accountName, balance);
    }

    public static FixedDepositAccount createFA(int accountNO, String accountName, double balance) {
        if (balance >= 1000) {
            return new FixedDepositAccount(accountNO, accountName, balance);
        } else {
            return null;
        }
    }

    @Override
    public void deposit(double amount) {
        System.out.println(" FA Deposit Amount : " + amount);
        if (amount >= 500) {
            System.out.println("Balance After Deposit : " + amount);
            setBalance(amount);

        } else {
            System.out.println("Can't Deposit : " + amount +"it's below 500 Bath");
        }

    }

}
