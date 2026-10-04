package Searching;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1] */

import java.util.Arrays;

public class FirstLastPosition {

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int ans[]=searchRange(arr, target);
        System.out.println("Answer==> " + Arrays.toString(ans));
        
    }

    public static int[] searchRange(int nums[], int target){
        int ans[]={-1,-1};
        int first = search(nums, target, true);
        int last = search(nums, target, false);
        ans[0] = first;
        ans[1] = last;
        return ans;

    }

    public static int search(int[] nums, int target, boolean findStartIndex){

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    
}
