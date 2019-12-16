public class TestStudent {
    public static void main(String[] args) {
        Student nat = new Student();
        nat.line();
        System.out.println("Object = "+nat);
        nat.studentId = "614234001";
        nat.studentName = " Nattapong Chang-ae";
        nat.major = "Comsci";
        nat.faculty = "Science and Technology";
        nat.showData();
        nat.enrollment();
        nat.dropCourse();
        nat.line();
        
        Student who = new Student();
        who.studentId = "614234XXX";
        who.studentName = "Someone Likeyou";
        who.major = "IT";
        who.faculty = "Science and Technology";
        System.out.println("Object = "+who);
        who.showData();
        who.line();
        
        //instanciate Object
        GraduateStudent tu = new GraduateStudent();
        tu.studyLevel = "Year 2";
        tu.thesisAdviser = "Dr.Pom";
        tu.thesisExamination();
        tu.oralExamination();
        tu.studentId = "XXXXXXXXX";
        tu.studentName = "Unknow to know";
        tu.faculty = "Unknow";
        tu.major = "Non of Major";
        System.out.println("Object = "+tu);
        tu.showData();
        tu.showDataGraduate();
        tu.addCourse();
        tu.dropCourse();
        tu.enrollment();
        tu.payment();
        tu.line();
    }
}//end class
