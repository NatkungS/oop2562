public class Student {
    protected String studentId,studentName,faculty,major;
    
    public void enrollment(){
        System.out.println("enrollment");
    }
    public void payment(){
        System.out.println("payment");
    }
    public void addCourse(){
        System.out.println("addCourse");
    }
    public void dropCourse(){
        System.out.println("dropCourse");
    }
    public static void main(String[] args) {
        Student nat = new Student();
        System.out.println("Object = "+nat);
        nat.studentId = "614234001";
        nat.studentName = " Nattapong";
        nat.major = "Comsci";
        nat.faculty = "Science and Technology";
    }
    public void showData(){
        System.out.println("ID : "+studentId);
        System.out.println("Name : "+studentName);
        System.out.println("Major : "+major);
        System.out.println("Faculty : "+faculty);
    }
}
