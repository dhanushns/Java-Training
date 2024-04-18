package DAY4;

public class ParseIntArray {

    public static int[] ParseIntArray(String str){
        int n = str.split(" ").length;
        int[] parsedIntArray = new int[n];
        int i = 0;
        for(String StringElement : str.split(" ")){
            parsedIntArray[i] = Integer.parseInt(StringElement);
            i++;
        }
        return parsedIntArray;
    }

    public static void main(String args[]){

        int[] intArray =  ParseIntArray("1 2 3 4 5 6 7");
        for(int intElement : intArray){
            System.out.println(intElement);
        }
    }
}
