package Chap3;

class OuterB {

    int outerAttr1 = 5;
    static int outerAttr2 = 10;

    void outerMethod1() {
        System.out.println("OuterA : outerMethod1()");
    }

    static void outerMethod2() {
        System.out.println("OuterA : outerMethod2()");
    }

    class MemberInner {

        int memberAttr = 15;

        void MemberInnerMethod() {
            System.out.println(memberAttr);
            System.out.println(outerAttr1 + "," + outerAttr2);
            outerMethod1();
            outerMethod2();
        }

    }
}

public class TestOuterB {

    public static void main(String[] args) {
        OuterB outObj = new OuterB();
        OuterB.MemberInner innerObj = outObj.new MemberInner();
        innerObj.MemberInnerMethod();
    }
}
