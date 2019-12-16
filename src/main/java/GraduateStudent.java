public class GraduateStudent extends Student{
    public String studyLevel,thesisAdviser;
    
    public void oralExamination(){
        System.out.println("oralExamination");
    }
    public void thesisExamination(){
        System.out.println("thesisExamination");
    }
    public void showDataGraduate(){
        System.out.println("Study Level = "+studyLevel);
        System.out.println("Thesis Adviser = "+thesisAdviser);
    }
}
