public class Employee1 {
    static int id = 614234001;
    String name = "Nattapong";
    int age = 20;
    
    public Employee1(){ 
        System.out.println("default contructor");
    }
    
    public Employee1(int id){
        System.out.println("overloaded constructor 1 param");
    }
    
    public Employee1(int id, String name){
        System.out.println("overloaded constructor 2 param");
    }
    
    static void work(){
        System.out.println("work()");
    }
    
    void getSalary(){
        System.out.println("getSalary()");
    }
    
    public static void main(String[] args) {
        /*System.out.println("ID : "+id);
        work();
        Employee1 A = new Employee1();
        System.out.println("Name : "+A.name);
        System.out.println("Age : "+A.age);
        A.getSalary();
        Employee1 X */
        Employee1 x1 = new Employee1();
        Employee1 x2 = new Employee1(144);
        Employee1 x3 = new Employee1(144, "Nat");
    }
    
} 
//The end
