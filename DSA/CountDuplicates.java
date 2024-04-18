package DSA;

public class CountDuplicates {
    public static int count(int[] array,int value){
        int count = 0;
        for(int i = 0 ; i < array.length; i++){
            if(array[i] == value){
                count++;
            }
        }
        return count;
    }
}
