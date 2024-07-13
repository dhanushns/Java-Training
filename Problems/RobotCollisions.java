package Problems;

import java.lang.reflect.Array;
import java.util.*;
public class RobotCollisions {

    public static void sort(int[] arr,char[] d,int[] h,int n){
        int i, j, temp,h_temp;
        char t;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    t = d[j];
                    d[j] = d[j+1];
                    d[j+1] = t;

                    h_temp = h[i];
                    h[i] = h[i+1];
                    h[i+1] = h_temp;

                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        int[] p = new int[] {3,5,2,6};
        int[] h = new int[] {10,10,15,12};
        String s = "RLRL";
        char[] d = s.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        sort(p,d,h,p.length);
        for (int i = p.length-1,j = p.length-2; i >= 0; i--,j--) {
            if(j >= 0){
                if(d[i] == 'L' && d[j] == 'R'){
                    if(h[i] != h[j]){
                        int maxHealth = Math.max(h[i],h[j]);
                        arr.add(maxHealth-1);
                        --i;
                        --j;
                    }
                    else {
                        --i;
                        --j;
                    }
                }
                else {
                    arr.add(h[i]);
                }
            }
            else {
                arr.add(h[i]);
            }
        }
        System.out.println(arr);
    }

}
