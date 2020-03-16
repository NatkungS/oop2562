package Chap6;

public class AbstractClassExample {
    public static void main(String[] args) {
        Fan2 f2 = new Fan2();
        f2.on();        f2.off();        f2.work();
        //if new ElectricAppliance(); : Override on(); off(); work();
        //if new Fan1(); : Override work;
    }

}
