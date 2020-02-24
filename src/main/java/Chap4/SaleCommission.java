package Chap4;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleCommission {

    private static void printMenu() {
        System.out.println("-----------Menu-----------");
        System.out.println("0 : Exit");
        System.out.println("1 : Sale Information Entry");
        System.out.println("2 : Commission Summary");
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        int menu = 0;
        Scanner enter = new Scanner(System.in);
        ArrayList<SaleMan> saleArr = new ArrayList<>();
        /*SaleMan saleArr[] = new SaleMan[3];*/
        do {
            printMenu();
            System.out.print("Please Enter Menu [0-2] : ");
            menu = enter.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Enter ID : ");
                    String id = enter.next();
                    System.out.print("Enter Name : ");
                    String name = enter.next();
                    System.out.print("Enter Surname : ");
                    String surname = enter.next();
                    System.out.print("Enter Sale Class : ");
                    int saleClass = enter.nextInt();
                    System.out.print("Enter Sale Total : ");
                    double saleTotal = enter.nextDouble();
                    SaleMan saleObject = new SaleMan();
                    saleObject.setId(id);
                    saleObject.setName(name);
                    saleObject.setSurname(surname);
                    saleObject.setSaleClass(saleClass);
                    saleObject.setSaleTotal(saleTotal);
                    double commission = 0;
                    if (saleTotal < 10000) {
                        if (saleClass == 1) {
                            commission = saleTotal * 0.05;
                        } else if (saleClass == 2) {
                            commission = saleTotal * 0.15;
                        } else if (saleClass == 3) {
                            commission = saleTotal * 0.25;
                        }
                    } else {
                        if (saleClass == 1) {
                            commission = saleTotal * 0.10;
                        } else if (saleClass == 2) {
                            commission = saleTotal * 0.20;
                        } else if (saleClass == 3) {
                            commission = saleTotal * 0.30;
                        }
                    }
                    saleObject.setCommission(commission);
                    //saleArr[0] = saleObject;
                    saleArr.add(saleObject);
                    break;
                case 2:
                    System.out.println("Show data :");
                    int a = 0,
                     b = 0,
                     c = 0;
                    for (int i = 0; i < saleArr.size(); i++) {
                        SaleMan arg = saleArr.get(i);
                        System.out.print("ID : " + arg.getId() + "\t");
                        System.out.print("Name : " + arg.getName() + "\t\t");
                        System.out.print("Surname : " + arg.getSurname() + " \t\t");
                        System.out.print("SaleClass : " + arg.getSaleClass() + "\t");
                        System.out.print("SaleTotal : " + (int) arg.getSaleTotal() + " bath\t");
                        System.out.print("Commission : " + (int) arg.getCommission() + " bath\n");
                        a++;
                        b = (int) (b + arg.getSaleTotal());
                        c = (int) (c + arg.getCommission());

                    }
                    System.out.println("Summary");
                    System.out.println("Sale Count : " + a);
                    System.out.println("Sale Total : " + b + " bath");
                    System.out.println("Commission Total : " + c + " bath");

                    break;
            }

        } while (menu != 0);
    }

}
