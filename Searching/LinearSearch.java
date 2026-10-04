package Searching;
public class LinearSearch {

     public static void main(String[] args) {
        int arr[]={1,5,6,9,8,7};
        int target=7;
        int position=Search(arr, target);
        System.out.println("Index Position is " + position);
    }

    public static int Search(int arr[], int target){

        if(arr.length==0)
        return -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            return i;
        }

        return -1;

    }
    
}
