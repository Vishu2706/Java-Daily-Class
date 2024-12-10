class Student{
    int rno;
    String sname;

    public Student() {
        System.out.println("Student Default constructor");
    }
    Student(int no, String name){
        this.rno = no;
        this.sname = name;
    }
    void show(){
        System.out.println("Student Roll No : "+this.rno);
        System.out.println("Student name : " +this.sname);
    }
}

public class This{
    public static void main(String[] args) {
        Student s1 = new Student(139,"Eren");
        s1.show();    
    }
}