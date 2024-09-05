package Problems;

public class StringReverse {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("DHANUSH");
        int i = 0, j = str.length()-1;
        while (i != j){

            str.replace(i,i+1,Character.toString(str.charAt(i)+str.charAt(j)));
            str.replace(j,j+1,Character.toString(str.charAt(i)-str.charAt(j)));
            str.replace(i,i+1,Character.toString(str.charAt(i)-str.charAt(j)));
            i++;
            j--;
        }
        System.out.println(str);
    }

}
