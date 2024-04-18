package DAY4;
import java.util.Scanner;
import java.util.Arrays;

public class CheckAnagram{
    public static boolean isAnagram(String str1, String str2){
        char[] charArray_1 = str1.toCharArray();
        char[] charArray_2 = str2.toCharArray();
        Arrays.sort(charArray_1);
        Arrays.sort(charArray_2);
        if(Arrays.equals(charArray_1, charArray_2))
            return true;
        else
            return false;
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