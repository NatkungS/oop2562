public class CalllEmplayee {
    public static void main(String[] args) {
        
        System.out.println("ID : "+Employee1.id);
        Employee1.work();
        
        Employee1 B = new Employee1();
        System.out.println("Name : "+B.name);
        System.out.println("Age : "+B.age);
        B.getSalary();
        
    }
}
