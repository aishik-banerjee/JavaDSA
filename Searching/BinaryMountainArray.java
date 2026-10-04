package Searching;
public class BinaryMountainArray {

    public static void main(String[] args) {
        int arr[] = {0,10,2,0};
        System.out.println("Peak Index ==> " + indexMountain(arr));
    }

    public static int indexMountain(int arr[]){

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
    
}
