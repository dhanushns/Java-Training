package DAY1;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// int num = input.nextInt();
        // int temp = num;
		// int count = 0;
        // int rem;
        // int reverseDigit = 0;
		// String str = Integer.toString(num);
		
        // // Method 1
		// while(temp != 0){
        //     rem = temp % 10;
        //     reverseDigit = reverseDigit * 10 + rem;
		//     temp/=10;
		//     count++;
		// }
		// System.out.println("Number of Digits : " + count);
		
		// // Method 2
        // System.out.println("Number of Digits using string : "  + str.length());

        // System.out.println("Reversed Digit : " + reverseDigit);

        // if(num == reverseDigit)
        //     System.out.println("The given number is a palindrome");
        // else
        //     System.out.println("The given number is not a palindrome");

        // // Sum of numbers and Factorial FOR LOOP

        // int num = input.nextInt();
        // int sumNumbers = 0;
        // int factorial = 1;
        // for(int i = 1 ; i <= num ; i++){
        //     sumNumbers += i;
        //     factorial *= i;
        // }
        // System.out.println("The Sum of Numbers is : " + sumNumbers);
        // System.out.println("The Factorial of Numbers is : " + factorial);

        int num = input.nextInt();
        for(int i = 1 ; i <= num ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = num ; i > 0 ; i--){
            for(int j = 1 ; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        //Floyds triangle
        System.out.println();
        int k = 1;
        for(int i = 1; i <= num ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }

        //Pyramid
        System.out.println();
        for(int i = 1 ; i <= num ; i++){
            for(int space = num ; space > i ; space--){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            for(int space = num ; space > i ; space--){
                System.out.print(" ");
            }
            System.out.println();
        }

        //Inverted Pyramid
        System.out.println();
        for(int i = num ; i > 0 ; i--){
            for(int space = num ; space > i ; space--){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            for(int space = num ; space > i ; space--){
                System.out.print(" ");
            }
            System.out.println();
        }

        // 2 Pyramid

        System.out.println();
        for(int i = num ; i > 0 ; i--){
            for(int space = num ; space > i ; space--){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            for(int space = num ; space > i ; space--){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i = 2 ; i <= num ; i++){
            for(int space = num ; space > i ; space--){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            for(int space = num ; space > i ; space--){
                System.out.print(" ");
            }
            System.out.println();
        }

        input.close();
	}
}

