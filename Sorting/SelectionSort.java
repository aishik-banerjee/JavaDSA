package Sorting;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
    int arr[]={1,5,9,8,7,4,3,6};
    selection(arr);
    System.out.println(Arrays.toString(arr));
    }

 public static void selection(int arr[]){

    for(int i=0;i<arr.length - 1;i++){
        int minIndex = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j] < arr[minIndex]){
                minIndex = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
 }
    
}
