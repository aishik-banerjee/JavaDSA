package Searching;
public class CeilFloor {

    //The ceiling of x is the smallest element in an array greater than or equal to x.
    //The floor of x is the largest element in the array smaller than or equal to x.

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;
        System.out.println("Ceil of " + target + " is: " + ceil(arr, target));
        System.out.println("Floor of " + target + " is: " + floor(arr, target));
    }

    public static int ceil(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;
    }

    public static int floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return end;
    }
    
}
