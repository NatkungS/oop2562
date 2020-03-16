package Chap6;

public class PolymorphismExample {

    public static void main(String[] args) {
        Personnel ps = new Manager();
        ps.getAddress();
        Manager man = (Manager) ps;
        man.getDepartment();

        ((Manager) ps).getDepartment();
    }

}
