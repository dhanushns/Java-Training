package DAY2;

import java.util.Arrays;
import java.util.Scanner;
import DSA.*;

public class Main {

    static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    static int[] mergeSortedArray(int[] array_1, int[] array_2) {
        int i = 0, j = 0, k = 0;
        int n1 = array_1.length;
        int n2 = array_2.length;
        int[] mergedArray = new int[array_1.length + array_2.length];
        while (i < n1 && j < n2) {
            if (array_1[i] < array_2[j]) {
                mergedArray[k] = array_1[i];
                k++;
                i++;
            } else {
                mergedArray[k] = array_2[j];
                k++;
                j++;
            }
        }

        while (i < n1) {
            mergedArray[k] = array_1[i];
            k++;
            i++;
        }

        while (j < n2) {
            mergedArray[k] = array_2[j];
            k++;
            j++;
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter no.of rows : ");
        // int n = input.nextInt();
        // int num = 1;
        // for (int i = 1; i <= n; i++) {
        // for (int space = n; space > i; space--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(num + " ");
        // // if(num < 10){
        // // System.out.print(" ");
        // // }
        // }
        // System.out.println();
        // num += 1;
        // }

        // System.out.println();
        // for (int i = n; i > 0; i--) {
        // for (int space = n; space > i; space--) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // System.out.println();
        // int space = 0;
        // for (int i = 1; i <= n; i++) {
        // num = i;
        // for (int k = 0; k < space; k++) {
        // System.out.print(" ");
        // }
        // for (int j = num; j <= n; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // space += 2;
        // }

        // System.out.println();
        // System.out.print("Enter value for length : ");
        // int lenght = input.nextInt();
        // System.out.print("Enter value for breadth : ");
        // int breadth = input.nextInt();
        // space = breadth - 2;
        // for (int i = 1; i <= lenght; i++) {
        // if (i == 1) {
        // for (int j = 1; j <= breadth; j++) {
        // System.out.print("_ ");
        // }
        // } else if (i == lenght) {
        // System.out.println();
        // for (int j = 1; j <= breadth; j++) {
        // System.out.print("- ");
        // }
        // } else {
        // System.out.println();
        // System.out.print("| ");
        // for (int k = 1; k <= space; k++) {
        // System.out.print(" ");
        // }
        // System.out.print("|");
        // }
        // }

        // System.out.println("\n");
        // int centerSapce = 0;
        // for (int i = 1; i <= n; i++) {
        // if (i == 1) {
        // for (space = n; space > i; space--) {
        // System.out.print(" ");
        // }
        // System.out.print(" *");
        // System.out.println();
        // } else if (i == n) {
        // for (int j = 1; j <= i + 1; j++) {
        // System.out.print("* ");
        // }
        // } else {
        // for (space = n; space > i; space--) {
        // System.out.print(" ");
        // }
        // System.out.print("* ");
        // for (int k = 1; k <= centerSapce; k++) {
        // System.out.print(" ");
        // }
        // System.out.print('*');
        // System.out.println();
        // }
        // centerSapce += 2;
        // }

        // System.out.println("\n");
        // num = 0;
        // for (int i = 1; i <= n; i++) {
        // num += 1;
        // for (int j = 1; j <= n; j++) {
        // if (j >= i) {
        // System.out.print(j + " ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // num = n;
        // for (int i = n - 1; i >= 1; i--) {
        // num -= 1;
        // for (int j = 1; j <= n; j++) {
        // if (j >= i) {
        // System.out.print(j + " ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // // Linear Search
        // System.out.print("Enter no.of.Elements : ");
        // int N = input.nextInt();
        // int[] arrayElements = new int[N];
        // for(int i = 0 ; i < N; i++){
        // System.out.print("Enter value for " + (i+1) + " Element : ");
        // arrayElements[i] = input.nextInt();
        // }
        // System.out.print("\nEnter the target value : ");
        // int targetValue = input.nextInt();
        // int result = LinearSearch.linearSearch(arrayElements, targetValue);
        // if(result != -1){
        // System.out.println("The element " + targetValue + " is found at " + result +
        // " position");
        // }
        // else{
        // System.out.println("The target element is not found");
        // }

        // // Find Maximum and Minimum value in array
        // int maxValue = ArrayMinMax.getMax(arrayElements);
        // int minValue = ArrayMinMax.getMin(arrayElements);
        // System.out.println("\nMaximum Value : " + maxValue);
        // System.out.println("Minimum Value : " + minValue);

        // //Count Duplicate Values
        // System.out.print("\nEnter the value to count : ");
        // int value = input.nextInt();
        // int countedValue = CountDuplicates.count(arrayElements, value);
        // if(countedValue != 0){
        // System.out.println("The Element " + value + " is present " + countedValue + "
        // times");
        // }
        // else{
        // System.out.println("The element is not found");
        // }

        // //Print Even Numbers from array
        // int[] evenNumbers = new int[N];
        // int[] oddNumbers = new int[N];
        // int j = 0 ,k =0;
        // for(int i = 0 ; i < N; i++){
        // if(arrayElements[i] % 2 == 0){
        // evenNumbers[j] = arrayElements[i];
        // j++;
        // }
        // else{
        // oddNumbers[k] = arrayElements[i];
        // k++;
        // }
        // }
        // System.out.print("\nEven Numbers : " + Arrays.toString(evenNumbers));
        // System.out.println("\nOdd Numbers : " + Arrays.toString(oddNumbers));

        // // Reverse the array
        // int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        // int n = 7;
        // int k = 3;
        // reverseArray(array, 0, array.length - 1);
        // reverseArray(array, 0, k - 1);
        // reverseArray(array, k, array.length - 1);
        // for (int element : array) {
        // System.out.print(element + " ");
        // }

        // Merge Sorted Array
        int[] array_1 = { 1, 2, 3, 4, 5 };
        int[] array_2 = { 7, 9, 10 };
        int[] result = mergeSortedArray(array_1, array_2);
        System.out.print(Arrays.toString(result));

        input.close();
    }
}