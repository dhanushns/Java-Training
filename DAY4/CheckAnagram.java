package DAY4;
import java.util.Scanner;
import java.util.Arrays;

public class CheckAnagram{
    public static boolean isAnagram(String str1, String str2){

        str1= str1.toUpperCase();
        str2= str2.toUpperCase();

        // char[] charArray_1 = str1.toCharArray();
        // char[] charArray_2 = str2.toCharArray();

        // //Method 1 *** Not Accurate ***
        // int sumOfArray_1 = 0, sumOfArray_2 = 0;
        // for(int i = 0 ; i < str1.length() ; i++){
        //     sumOfArray_1 += charArray_1[i];
        //     sumOfArray_2 += charArray_2[i];
        // }

        // if(sumOfArray_1 == sumOfArray_2)
        //     return true;
        // else
        //     return false;

        // //Method 2
        /// Arrays.sort(charArray_1);
        // Arrays.sort(charArray_2);
        // if(Arrays.equals(charArray_1, charArray_2))
        //     return true;
        // else
        //     return false;

        //Method 3
        int[] frequency = new int[26];
        for(int i = 0 ; i < str1.length(); i++){
            frequency[str1.charAt(i) - 'A'] ++;
        }
        for(int i = 0 ; i < str2.length() ; i++){
            frequency[str2.charAt(i) - 'A'] --;
        }
        for(int i = 0 ; i < 26; i++){
            if(frequency[i] != 0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String str_1 = "agentelman";
        String str_2 = "elegantman";
        if(isAnagram(str_1,str_2)){
            System.out.println("It is an Anagram string");
        }
        else{
            System.out.println("It is not an Anagram String");
        }
        input.close();
    }
}