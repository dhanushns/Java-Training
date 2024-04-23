package DAY6.Main;

import DAY6.Rectangle.Rectangle;

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
        System.out.print("Enter the length of Rectangle : ");
        double length = input.nextDouble();
        System.out.print("Enter the width of Rectangle : ");
        double width = input.nextDouble();
        double area = Rectangle.getArea(length,width);
        System.out.println("The area of Rectangle : " + area);

        input.close();
    }
}
