package Chap3;

class Printer {

    void print() {
        System.out.println("Printer : print()");
    }
}

public class OuterD {

    static void printReport(Printer pnt) {
        pnt.print();
    }

    public static void main(String[] args) {
        printReport(new Printer() {
            void print() {
                System.out.println("Annonymous Inner");
            }
        });
    }
}
