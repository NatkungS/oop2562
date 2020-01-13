package Chap3;

public class PassByReferenceExample {

    static void changeGirlReference(Girl girl) {
        girl.phoneNo = "0975488872";
    }

    public static void main(String[] args) {
        System.out.println("Before");
        Girl gl = new Girl("Supa", "0857646592");
        gl.print();
        System.out.println("After");
        changeGirlReference(gl);
        gl.print();
    }
}
