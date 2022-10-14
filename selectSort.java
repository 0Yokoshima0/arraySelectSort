import java.util.Scanner;

public class selectSort {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Please input the length of an array.");
        int total = Integer.parseInt(input.nextLine());
        int[] arr = new int[total];
        System.out.println("please input the values of each keys");
        for(int i = 0; i < arr.length;i++ ){
            int num = input.nextInt();
            arr[i] = num;
        }
        System.out.println("The array is: ");
        printArrays(arr);
        System.out.println("The sort of the array is: ");
        selectSort(arr);
        printArrays(arr);
    }
    
    //define a method to swap two value in the array.
    public static void swap(int[] arr, int i , int j ){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    
    //define a method to print the array.
    public static void printArrays(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    //define a method to sort the array.
    public static void selectSort(int[] arr){
        if(arr == null || arr.length < 2) {
            return;
        }
        for(int i = 0; i < arr.length; i++){
            int minValueIndex = i;
            for(int j = i + 1; j < arr.length; j++ ){
                minValueIndex = arr[minValueIndex] < arr[j] ? minValueIndex : j;
            }
            swap(arr,minValueIndex, i);
        }
    }
}
