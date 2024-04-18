package DAY4;

public class StringReverse {

    static String reverse(String str){
        String reversedString = "";
        String[] splitedArray = str.split(" ");
        for(int i = splitedArray.length - 1; i>=0 ; i--){
            reversedString += splitedArray[i] + " ";
        }

        return reversedString;
    }

    public static void main(String[] args){
        String str = "I LOVE PROGRAMMING";
        str = reverse(str);
        System.out.println(str);
    }

}
