package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class LetterCombinationsOfPhoneNumber {

    //Only for Combination of Two Strings
    public static void letterCombinations(String s1, String s2, ArrayList<String> listOfCombinations){

        if(s2.isEmpty())
            return;

        if(s2.length() == 1) {
            listOfCombinations.add(s1 + s2);
            return;
        }
        listOfCombinations.add(s1 + s2.charAt(0));
        String substr = s2.substring(1);
        letterCombinations(s1,substr,listOfCombinations);
    }

    //efficient and Dynamic Programming ****Important*****
    public static void DFS(String digits, int pos , StringBuilder sub, ArrayList<String> ans){

        if(pos == digits.length() && !sub.isEmpty()){
            ans.add(sub.toString());
            return;
        }

        for(char ch : getLetters(digits.charAt(pos)).toCharArray()){
            sub.append(ch);
            DFS(digits,pos+1,sub,ans);
            sub.deleteCharAt(sub.length()-1);
        }

    }

    public static String getLetters(char digit){

        return switch (digit) {
            case '2' -> "abc";
            case '3' -> "def";
            case '4' -> "ghi";
            case '5' -> "jkl";
            case '6' -> "mno";
            case '7' -> "pqrs";
            case '8' -> "tuv";
            case '9' -> "wxyz";
            default -> " ";
        };
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Digits : ");
        String digits = input.next();
        ArrayList<String> listOfCombinations = new ArrayList<>();
        DFS(digits,0,new StringBuilder(), listOfCombinations);
        System.out.println(listOfCombinations);
    }

}