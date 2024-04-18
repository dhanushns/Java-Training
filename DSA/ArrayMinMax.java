package DSA;
public class ArrayMinMax{
    public static int getMax(int[] array){
        int maxValue = 0;
        for(int i = 0; i < array.length ; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public static int getMin(int[] array){
        int minValue = array[0];
        for(int i = 0; i < array.length ; i++){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}