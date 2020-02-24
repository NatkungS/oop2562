package Chap5;

public class CallEmployee {
    public static void main(String[] args) {
        Employee em = new Employee("001","Nattapong Chang-ae");
        em.setSalary(25000);
        em.setAddress(new Address("Somewhere in the world"));
        em.setDepartment(new Department("1", "Natkung Community"));
        System.out.println("Name : "+em.getEmpName());
        System.out.println("Salary : "+em.getSalary());
        System.out.println("Address : "+em.getAddress().getRegisterAddress());
        System.out.println("Department : "+em.getDepartment().getDepName());
        
    }

}
