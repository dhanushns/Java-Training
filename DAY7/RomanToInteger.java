package DAY7;

import java.util.Scanner;
public class RomanToInteger {

    public static int getValue(char c){
        int value = 0;
        switch(c){
            case 'I' : value = 1;
            break;
            case 'V' : value = 5;
            break;
            case 'X' : value = 10;
            break;
            case 'L' : value = 50;
            break;
            case 'C' : value = 100;
            break;
            case 'D' : value = 500;
            break;
            case 'M' : value = 1000;
            break;
            default: value = -1;
        }
        return value;
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
