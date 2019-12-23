
public class Employee {
    protected String prefix,name,sex;
    protected int age;
    
    public void checkStock(){
        System.out.println("Duty : CheckStock");
    }
    public void sell(){
        System.out.println("Duty : Sell");
    }
    public void buy(){
        System.out.println("Duty : Buy");
    }
    public void showData(){
        System.out.print("Prefix = "+prefix);
        System.out.println("."+name);
        System.out.println("Sex = "+sex);
        System.out.println("Age = "+age);
    }
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        e1.prefix = "Mr.";
        e1.name = "Suesath Khyanying";
        e1.sex = "male";           
        e1.age = 27;
        e1.showData();
        e1.checkStock();
        
        
        Employee e2 = new Employee();
        e2.prefix = "Miss";
        e2.name = "Sodsai Ngandee";
        e2.sex = "Female";           
        e2.age = 25;
        e2.showData();
        e2.sell();
        
        Employee e3 = new Employee();
        e3.prefix = "Mrs";
        e3.name = "Meena Sueting";
        e3.sex = "Female";           
        e3.age = 37;
        e3.showData();
        e3.buy();
    }
    
}
