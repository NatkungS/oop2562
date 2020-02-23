package Chap4;

import java.util.Scanner;

public class PostOfficeHomeWork {

    public static void main(String[] args) {
        int i = 1;
        int price = 0;

        System.out.println("Songkhla Post Office");
        System.out.println("Program is created by NatkungS");
        System.out.println("------------------Menu------------------");
        System.out.print("0 : Exit\n1 : Normal Letter\n2 : Register Letter\n3 : EMS Letter\n");
        System.out.println("----------------------------------------");
        while (i == 1) {
            System.out.print("Please Enter Menu [0-3] : ");
            Scanner sc1 = new Scanner(System.in);
            int choice = sc1.nextInt();
            int weight = 0;

            if (choice == 0) {
                i = 0;
            } else if (choice == 1) {
                System.out.println("1. Normal Letter");
                PostOfficeHomeWork.EnterWeight(weight, choice, price);
            } else if (choice == 2) {
                System.out.println("2. Register Letter");
                PostOfficeHomeWork.EnterWeight(weight, choice, price);
            } else if (choice == 3) {
                System.out.println("1. EMS Letter");
                PostOfficeHomeWork.EnterWeight(weight, choice, price);
            }
        }

    }

    private static void EnterWeight(int weight, int choice, int price) {
        System.out.print("     Enter weight (g) : ");
        Scanner sc2 = new Scanner(System.in);
        weight = sc2.nextInt();
        price = 0;
        if (weight <= 20) {
            if (choice == 1) {
                price = 3;
            } else if (choice == 2) {
                price = 3 + 13;
            } else if (choice == 3) {
                price = 27;
            }
        } else if (weight > 20 && weight <= 100) {
            if (choice == 1) {
                price = 5;
            } else if (choice == 2) {
                price = 5 + 13;
            } else if (choice == 3) {
                price = 32;
            }
        } else if (weight > 100 && weight <= 250) {
            if (choice == 1) {
                price = 9;
            } else if (choice == 2) {
                price = 9 + 13;
            } else if (choice == 3) {
                price = 37;
            }
        } else if (weight > 250 && weight <= 500) {
            if (choice == 1) {
                price = 15;
            } else if (choice == 2) {
                price = 15 + 13;
            } else if (choice == 3) {
                price = 47;
            }
        } else if (weight > 500 && weight <= 1000) {
            if (choice == 1) {
                price = 25;
            } else if (choice == 2) {
                price = 25 + 13;
            } else if (choice == 3) {
                price = 62;
            }
        } else if (weight > 1000 && weight <= 2000) {
            if (choice == 1) {
                price = 45;
            } else if (choice == 2) {
                price = 45 + 13;
            } else if (choice == 3) {
                price = 77;
            }
        }
        if (choice == 1) {
            System.out.println("     Normal Letter Service Price : " + price + " bath\n");
        } else if (choice == 2) {
            System.out.println("     Register Letter Service Price : " + price + " bath\n");
        } else if (choice == 3) {
            System.out.println("     EMS Letter Service Price : " + price + " bath\n");
        }
    }
}
