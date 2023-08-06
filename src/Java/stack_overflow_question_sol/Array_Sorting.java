package Java.stack_overflow_question_sol;

import java.util.Scanner;

public class Array_Sorting {
    public static void main(String[] args) {
        // for taking array size
        System.out.println("How long you want the array to be :");
        Scanner scanner = new Scanner(System.in);
        int size=scanner.nextInt();

        int[] sortedArray=sortIntegers(getArrayValue(size));
        System.out.println("Sorted Array in ascending order : ");
        printArray(sortedArray);
    }
    public static int[] getArrayValue(int size){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        //for taking input
        System.out.println("Please enter " + size + " numbers : ");
        for(int i=0;i<size;i++){
            System.out.println("Number " + (i+1) + " :");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Input Array is : ");
        printArray(arr);
        return arr;

    }
    public static int[] sortIntegers(int[] arr){
        int arrSize= arr.length;
        int temp ;
        for(int i=0;i<arrSize;i++){
            for(int j=0;j<arrSize-1;j++){
                if(arr[j]> arr[j+1]){
                    temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

