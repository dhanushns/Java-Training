package Problems;

import java.util.Scanner;
public class ArithmeticArray {

    public static boolean findSum(int[] arr,int pos, int target,int sum){

        if(pos == arr.length-1){
            sum += arr[pos];
            return sum == target;
        }

        sum += arr[pos];
        if(sum != target)
            return findSum(arr,pos+1,target,sum);
        return true;
    }

    public static boolean checkArithmetic(int[] num,int target){
        for(int i = 0 ; i < num.length; i++){
            if(findSum(num,i,target,0)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = new int[] {3,2,5,0, 1};
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        if(target == 0)
            System.out.println("YES");
        else
            System.out.println(checkArithmetic(num,target));

    }
}
