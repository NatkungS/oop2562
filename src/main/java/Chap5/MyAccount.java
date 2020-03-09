package Chap5;

import java.util.Scanner;

public class MyAccount {

    public static void main(String[] args) {
        System.out.println("Choose Account : ");
        System.out.println("1.SavingAccount");
        System.out.println("2.FixedDepositAccount");
        System.out.print(": ");
        Scanner enter = new Scanner(System.in);
        int menu = enter.nextInt();
        switch (menu) {
            case 1:
                SavingAccount s = SavingAccount.createSA(001, "Nat", 1000.00);
                System.out.println("Object = " + s);
                if (s != null) {
                    System.out.println("Balance SavingAccount : " + s.getBalance());
                    s.deposit(1000);
                    s.withdraw(20000);
                } else {
                    System.out.println("Can't create Account");
                }
                break;
            case 2:
                FixedDepositAccount f = FixedDepositAccount.createFA(002, "Nat2", 1000.00);
                System.out.println("Object = " + f);
                if (f != null) {
                    System.out.println("Balance FixedDepositAccount : " + f.getBalance());
                    f.deposit(100);
                    f.withdraw(200);
                } else {
                    System.out.println("Can't create Account");
                }
        }

        

    }

}
