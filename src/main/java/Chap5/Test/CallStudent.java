package Chap5.Test;

public class CallStudent {
    public static void main(String[] args) {
        Student st = new Student("614234001", "Nattapong Chang-ae");
        st.setCounsellor(new Counsellor("191", "Community MC", "0901234567"));
        st.setParent(new Parent("Facebook Gaming", "Natkung Community 90000", "0801234567"));
        st.printDetails();
    }

}
