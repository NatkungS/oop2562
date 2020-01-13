package Chap3;

class OuterC {

    int outerAttr1 = 5;
    static int outerAttr2 = 10;

    void outerMethod1() {
        System.out.println("OuterA : outerMethod1()");
    }

    static void outerMethod2() {
        System.out.println("OuterA : outerMethod2()");
    }

    void outerMethod3(final int x, boolean y, final int z) {
        class LocalInner {

            void showDetails() {
                System.out.println(x + "," + z);
                System.out.println(outerAttr1 + "," + outerAttr2);
                outerMethod1();
                outerMethod2();
            }
        }
        if (y) {
            new LocalInner().showDetails();
        } else {
            outerMethod1();
        }
    }

}

public class TestOuterC {

    public static void main(String[] args) {
        OuterC outObj = new OuterC();
        outObj.outerMethod3(11, true, 33);
    }
}
