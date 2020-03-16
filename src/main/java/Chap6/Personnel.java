package Chap6;

public class Personnel {

    String name = "Personnel";

    void printName() {
        System.out.println("I'm " + name + ".");
    }

    void getAddress() {
        System.out.println("I live in Bangkok.");
    }

}

class Manager extends Personnel {

    String name = "Manager";

    @Override
    void printName() {
        System.out.println("I'm " + name + ".");
    }

    void getDepartment() {
        System.out.println("I work in the accounting department.");
    }

}

class Staff extends Personnel {

    String name = "Staff";

    @Override
    void printName() {
        System.out.println("I'm " + name + ".");
    }

}
