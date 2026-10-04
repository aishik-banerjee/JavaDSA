package Searching;
import java.util.*;
public class AggresiveCows {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9};
        int k = 3;

        System.out.println(aggressiveCows(arr, k));
    }

    public static int aggressiveCows(int[] arr, int k) {

        Arrays.sort(arr);

        int low = 1;
        int high = arr[arr.length - 1] - arr[0];
        int ans = 0;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(checkIfPossible(arr,k,mid)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static boolean checkIfPossible(int nums[], int target, int distance){

        int cowsPlaced = 1;
        int lastPosition = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] - lastPosition >= distance){
                cowsPlaced = cowsPlaced + 1;
                lastPosition = nums[i];

                if(cowsPlaced == target){
                    return true;
                }
            }
        }
        return false;
    }
    
}
