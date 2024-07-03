package Problems;
import java.util.*;
public class HappyNumber {
    static ArrayList<Integer> arr = new ArrayList<>();
    static boolean flag = true;
    public static boolean isHappy(int num){

        while (true) {
            int digits = 0;
            while (num != 0) {
                int rem = num % 10;
                digits += (rem * rem);
                num /= 10;
            }
            num = digits;
            if (arr.size() > 1) {
                for (int n : arr) {
                    if (n == num) {
                        return false;
                    }
                }
            }
            if (digits == 1) {
                return true;
            }
            arr.add(digits);
        }
    }

    public static boolean hasMap_fun(int num){
        HashSet<Integer> map = new HashSet<>();
        while (true) {
            int digits = 0;
            while (num != 0) {
                int rem = num % 10;
                digits += (rem * rem);
                num /= 10;
            }
            num = digits;
            if(map.contains(num)){
                return false;
            }
            if (digits == 1) {
                return true;
            }
            map.add(digits);
        }
    }

    public static void main(String[] args) {
        int num = 61;
        System.out.println(isHappy(num));
        System.out.println(hasMap_fun(num));
    }
}
