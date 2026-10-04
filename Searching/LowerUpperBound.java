package Searching;
public class LowerUpperBound {

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 6;
        System.out.println("Lower Bound " + target + " is " + arr[lower(arr, target)]+" at index : " + lower(arr, target));
        System.out.println("Upper Bound of " + target + " is " + arr[upper(arr, target)]+" at index : " + upper(arr, target));
    }

    public static int lower(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] >= target){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int upper(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    
}
