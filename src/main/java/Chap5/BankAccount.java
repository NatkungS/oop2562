package Chap5;

public class BankAccount {
    private int accountNO;
    private String accountName;
    private double balance;

    public BankAccount(int accountNO, String accountName, double balance) {
        this.accountNO = accountNO;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNO() {
        return accountNO;
    }

    public void setAccountNO(int accountNO) {
        this.accountNO = accountNO;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount){
        
    }   
    
    public void withdraw(double amount){
        
    }
    
    public void printDetails(){
        
    }
    
   
    
}
