package Chap5.Test;

public class Student {

    private String studentId;
    private String studentname;
    private Counsellor counsellor;
    private Parent parent;

    public void printDetails() {
        System.out.println("StudentId : " + studentId);
        System.out.println("StudentName : " + studentname);
        System.out.println("Consellor Id : " + getCounsellor().getConsellorId());
        System.out.println("Consellor name : " + getCounsellor().getConsellorName());
        System.out.println("Telephone : " + getCounsellor().getTelephoneNo());
        System.out.println("Parent name : " + getParent().getParentName());
        System.out.println("Address : " + getParent().getAddress());
        System.out.println("Telephone : " + getParent().getTelephoneNo());
    }

    public Student(String studentId, String studentname) {
        this.studentId = studentId;
        this.studentname = studentname;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public Counsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counsellor counsellor) {
        this.counsellor = counsellor;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

}
