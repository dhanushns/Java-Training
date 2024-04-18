package DAY4;
import java.util.Scanner;
import java.util.Arrays;

public class CheckPalindrome {

    public static boolean isPalindrome(String str){
        str = str.toLowerCase();

        //Method 1
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;

        //Method2
        // String reversedString = "";
        // for(int i = str.length() - 1 ; i >= 0; i--){
        //     reversedString += str.charAt(i);
        // }
        // if (str.equals(reversedString)) {
        //     return true;
        // }
        // else {
        //     return false;
        // }

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String originalString = input.next();
       
        if(isPalindrome(originalString)){
            System.out.println("It a palindrome string");
        }
        else
            System.out.println("It is not a palindrome string");
        
        input.close();
    }
}
