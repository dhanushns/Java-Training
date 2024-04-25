package DAY8;

import java.util.Scanner;
public class Recursion {

    public static int computeSumOfNumbers(int n){

        if(n == 1)
            return 1;

        return n + computeSumOfNumbers(n-1);

    }

    public static int computeFactorialOfNumbers(int n){
        if(n == 1)
            return 1;

        return n * computeFactorialOfNumbers(n-1);
    }

    public static int computeFibonacciOfNumbers(int n){
        if(n == 0)
            return 0;
        else if(n == 1 || n == 2)
            return 1;
        return computeFibonacciOfNumbers(n-1) + computeFibonacciOfNumbers(n-2);
    }


    public static  void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = input.nextInt();
        System.out.println("Sum of Numbers : " + computeSumOfNumbers(n));
        System.out.println("Factorial of Numbers :" + computeFactorialOfNumbers(n));
        System.out.println("Fibonacci of Numbers : " + computeFibonacciOfNumbers(n));

    }

}
