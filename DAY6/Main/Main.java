package DAY6.Main;

import DAY6.Rectangle.Rectangle;
import DAY6.Student.StudentDetails;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Student Object1
//        StudentDetails s1 = new StudentDetails("Dhanush",14);
//
//        //Student Object2
//        StudentDetails s2 = new StudentDetails("Ruthra",47);
//
//        //Display Studnet 1 Name and Student 2 Namw
//        System.out.println("Student 1 Name : " + s1.name);
//        System.out.println("Student 2 Name : " + s2.name);
//
//        //Display all details of Srudent 1 and Student 2
//        System.out.println("Student 1 Details");
//        s1.display();
//        System.out.println("Student 2 Details");
//        s2.display();

        //Area of Rectangle
//        System.out.print("Enter the length of Rectangle : ");
//        double length = input.nextDouble();
//        System.out.print("Enter the width of Rectangle : ");
//        double width = input.nextDouble();
//        double area = Rectangle.getArea(length,width);
//        System.out.println("The area of Rectangle : " + area);

        //Creating Array of Objects
        //Data Collection
        System.out.print("Enter number of Students : ");
        int n = input.nextInt();
        StudentDetails[] student = new StudentDetails[n];
        for(int i = 0 ; i < n ; i ++) {
            System.out.println("Enter Student " + (i + 1) + " Details");
            System.out.print("Name : ");
            String name = input.next();
            System.out.println(name);
            System.out.print("Register number : ");
            int reg_no = input.nextInt();
            student[i] = new StudentDetails(name, reg_no);
        }
        System.out.flush();
        System.out.print("Enter Student Regiseter number/Exit : ");
        String cmd = input.next();
        while(!cmd.equals("exit") && !cmd.equals("EXIT") && !cmd.equals("Exit")) {
            int reg_no = Integer.parseInt(cmd);
            for (int i = 0; i < n; i++) {
                if (reg_no == student[i].reg_no) {
                    System.out.println("Name : " + student[i].name);
                }
            }
            System.out.print("Enter Student Regiseter number/Exit : ");
            cmd = input.next();
        }
        input.close();
    }
}
