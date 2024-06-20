package Recursion;
import java.util.Scanner;
public class basic{

    /*................Print n in Increment Order............*/
    public static void printN(int n){// Assume initially n = 5
        if(n == 1){ // condition passes only when n = 1
            System.out.println(n);
            return;
        }
        printN(n-1); //Decrement the n value each time until n = 1
        System.out.println(n);
        return;
    }

    /*................Print n in Decrement Order............*/
    public static void reversePrintN(int n){
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        reversePrintN(n-1);
    }

    /*................Print Sum of N............*/
    public static int sumOfN(int n,int sum){
        if(n == 1){
            return 1;
        }
        return sumOfN(n-1,sum) + n;
    }

    /*................Print Factorial of N............*/
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return factorial(n-1) * n;
    }



    /*.............Main Function..............*/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        printN(n);
//        System.out.println("Reverse Print");
//        reversePrintN(n);
//        System.out.println("Sum of N : " + sumOfN(n,0));
//        System.out.println("Factorial of N : " + factorial(n));
//        System.out.println("Fibonnaci sum : " + fibonacci.computeSum(n));


//        Arrays Concept in Recursion
//        System.out.print("\nEnter size of Array : ");
//        int size = input.nextInt();
//        int[] arr = new int[size];
//        arr = arrays.getArrayElements(arr);
//        System.out.println("Array Elements are : ");
//        arrays.printArray(arr);
//        System.out.print("Enter Target Element : ");
//        int targetElement = input.nextInt();
//        int elementPosition = arrays.getElementPosition(arr,targetElement);
//        if(elementPosition != -1){
//            System.out.println("The target element (" + targetElement + ") position : " + elementPosition);
//        }
//        else{
//            System.out.println("The target element not found the in the array");
//        }
//        int maxElement = arrays.max(arr);
//        System.out.println("The Maximum Element in the Array : " + maxElement);
//        if(arrays.isSort(arr)){
//            System.out.println("It is a sorted array");
//        }
//        else{
//            System.out.println("It is not a sorted array");
//        }
        System.out.println("Enter a String : ");
        String str = input.next();
        char[] arr =string_op.convertCharArray(str);
        System.out.println("String Palindrome : " + string_op.isPalindrome(arr));
        input.close();
    }
}

/*..........Fibonnaci sum........*/
/*  Formula : F(n) = F(n-1) + F(n-2)  */
class fibonacci{
    public static int computeSum(int n){

        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;

        return computeSum(n-1) + computeSum(n-2);

    }
}

/*............Arrays class with all arrays methods...........*/
class arrays{

    static int maxArrayElement = 0;
    static int arrayIndexPosition = 0;
    static int tempPos = 1;
    static boolean isSortedArray = false;

    /*................Get Array Elements............*/
    public static int[] getArrayElements( int[] arr){
        Scanner input = new Scanner(System.in);
        if(arrayIndexPosition != arr.length){
            arr[arrayIndexPosition] = input.nextInt();
        }
        else{
            arrayIndexPosition = 0;
            return arr;
        }
        arrayIndexPosition += 1;
        return getArrayElements(arr);
    }


    /*................Print Array Elements............*/
    public static void printArray(int[] arr){
        if(arrayIndexPosition != arr.length){
            System.out.println(arr[arrayIndexPosition]);
        }
        else{
            arrayIndexPosition = 0;
            return;
        }
        arrayIndexPosition += 1;
        printArray(arr);
    }

    /*................Get Array Element index position............*/
    public static int getElementPosition(int[] arr,int targetElement){
        if(arrayIndexPosition != arr.length){
            if(arr[arrayIndexPosition] == targetElement) {
                return arrayIndexPosition;
            }
        }
        else {
            arrayIndexPosition = 0;
            return -1;
        }
        arrayIndexPosition += 1;
        return getElementPosition(arr,targetElement);
    }

    /*................Get maximum Array Element............*/
    public  static int max(int[] arr){
        if(arrayIndexPosition != arr.length) {
            if (arr[arrayIndexPosition] > maxArrayElement)
                maxArrayElement = arr[arrayIndexPosition];
        }else {
            arrayIndexPosition = 0;
            return maxArrayElement;
        }
        arrayIndexPosition += 1;
        return  max(arr);
    }

    /*................Find the array elements are in sorted............*/
    public static boolean isSort(int[] arr){
        if(arrayIndexPosition != arr.length){
            if(tempPos != arr.length){
                if(arr[arrayIndexPosition] < arr[tempPos]){
                    isSortedArray = true;
                    tempPos += 1;
                    return isSort(arr); // Recursive Calling
                }
                else{
                    tempPos = 1;
                    arrayIndexPosition = 0;
                    isSortedArray = false;
                    return false;
                }
            }
            else{
                arrayIndexPosition += 1;
                tempPos = arrayIndexPosition + 1;
                return isSort(arr); // Recursive Calling
            }
        }
        else{
            //re-initialising the static variables
            arrayIndexPosition = 0;
            tempPos = 1;
        }
        if(isSortedArray)
            return true;
        else
            return false;
    }
}

class string_op extends arrays {

    public static char[] char_array;
    private static int left_idx,right_idx;
    private static  boolean isPalindromeString = false;

    public static char[] convertCharArray(String str){
        if(arrayIndexPosition != str.length()){
            if(arrayIndexPosition == 0)
                char_array = new char[str.length()];
            char_array[arrayIndexPosition] = str.charAt(arrayIndexPosition);
            arrayIndexPosition += 1;
            convertCharArray(str);
        }
        else{
            arrayIndexPosition = 0;
        }
        return char_array;
    }

    public static boolean isPalindrome(char[] arr){
        if(left_idx == 0)
            right_idx = arr.length-1;
        if(arr[left_idx] == arr[right_idx]){
            isPalindromeString = true;
            left_idx++;
            right_idx--;
            if(left_idx > right_idx)
                return isPalindromeString;
            return isPalindrome(arr); //recursive call
        }
        else{
            isPalindromeString = false;
            left_idx = 0;
            return false;
        }
    }

}

class PossiblePath {


    public static void findPath(int v, int h,String path) {
        if (h == 2 && v == 2) {
            System.out.println(path);
            return;
        }
        if(h > 2 || v > 2){
            return;
        }
        findPath(v,h+1,path+"H");
        findPath(v+1,h,path+"V");
    }

}