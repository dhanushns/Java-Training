package DAY7;

import java.util.Scanner;
public class RomanToInteger {

    public static int getValue(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int num = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(i + 1 == s.length())
                num += getValue(s.charAt(i));
            else{
                int r1 = getValue(s.charAt(i));
                int r2 = getValue(s.charAt(i+1));
                if(r1 >= r2)
                    num += r1;
                else{
                    num = (num - r1);
                }
            }
        }
        System.out.println(num);
        input.close();
    }

}
