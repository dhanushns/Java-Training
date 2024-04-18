package DAY4;
import java.util.Arrays;
import java.util.Scanner;

public class PrintEvenWords {

    public static String[] ComputeEvenWords(String str){
        
        String evenStrings = "";
        for(String StringElement : str.split(" ")){
            if(StringElement.length() % 2 == 0)
                evenStrings += StringElement + " ";
        }
        String evenStringArray[] = evenStrings.split(" ");
        return evenStringArray;
    }

    public static void main(String args[]){
        String evenWords[] = ComputeEvenWords("I Love Java");
        System.out.println(Arrays.toString(evenWords));
    }
}
