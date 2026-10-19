package Recursion;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {9,8,7,5,4,2,1};
        selection(arr, arr.length,0, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int arr[], int row, int column, int max){
        if(row == 0){
            return;
        }
        if(column < row){
            if(arr[column] > arr[max]){
                max=column;
            }
            selection(arr, row, column + 1, max);
        }else{
            int temp = arr[row - 1];
            arr[row - 1] = arr[max];
            arr[max] = temp;
            selection(arr, row - 1, 0, 0);
        }
    }
    
}
