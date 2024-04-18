package DSA;
public class LinearSearch {
    public static int linearSearch(int[] array, int targetValue){
        int n = array.length;
        for(int i = 0 ; i < n; i++){
            if(array[i] == targetValue){
                return i;
            }
        }
        return -1;
    }
}
