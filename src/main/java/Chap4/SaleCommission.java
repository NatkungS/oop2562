package Chap4;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleCommission{

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
                    String id = enter.nextLine();
                    System.out.print("Enter Name : ");
                    String name = enter.nextLine();
                    System.out.print("Enter Surname : ");
                    String surname = enter.nextLine();
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
                    //saleArr[0] = saleObject;
                    saleArr.add(saleObject);
                    break;
                case 2:
                    for (int i = 0; i < saleArr.size(); i++) {
                        SaleMan arg = saleArr.get(i);
                        System.out.print("ID : "+arg.getId()+"\t");
                        System.out.print("Name : "+arg.getName()+"\t");
                        System.out.print("Surname : "+arg.getSurname()+"\t");
                        System.out.print("SaleClass : "+arg.getSaleClass()+"\t");
                        System.out.print("SaleTotal : "+arg.getSaleTotal()+"\t");
                    }
                    break;
            }

        } while (menu != 0);
    }

}
