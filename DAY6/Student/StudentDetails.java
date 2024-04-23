package DAY6.Student;

import java.util.Scanner;
public class StudentDetails {

    Scanner input = new Scanner(System.in);
    public String name;
    public int reg_no;

    public StudentDetails(String studentnName,int student_reg_no) {
        this.name = studentnName;
        this.reg_no = student_reg_no;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Regester Number : " + this.reg_no);
    }

}
