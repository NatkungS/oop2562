package Chap3;

class OuterA {

    int outerAttr1 = 5;
    static int outerAttr2 = 10;

    void outerMethod1() {
        System.out.println("OuterA : outerMethod1()");
    }

    static void outerMethod2() {
        System.out.println("OuterA : outerMethod2()");
    }

    static class StaticInner {

        int staticInnerAttr1 = 15;
        static int staticInnerAttr2 = 20;

        void staticInnerMethod1() {
            System.out.println(staticInnerAttr1 + "," + staticInnerAttr2);
            System.out.println(outerAttr2);
        }

        static void staticInnerMethod2() {
            outerMethod2();
        }
    }
}

public class TestOuterA {

    public static void main(String[] args) {
        OuterA.StaticInner innerObj = new OuterA.StaticInner();
        innerObj.staticInnerMethod1();
        OuterA.StaticInner.staticInnerMethod2();
    }
}
