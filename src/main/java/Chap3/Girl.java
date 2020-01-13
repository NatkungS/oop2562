package Chap3;

public class Girl {

    String name;
    String phoneNo;

    public Girl(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    void print() {
        System.out.println("Name : " + name + "\nPhone no. : " + phoneNo);
    }
}
