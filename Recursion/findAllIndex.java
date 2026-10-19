package Recursion;

import java.util.ArrayList;

public class findAllIndex {
    public static void main(String[] args) {
        int arr[]= {6,2,6,4,5,6,7,6,9};
        int target = 6;
        System.out.println(findindexes(arr,target, 0));
    }

    //Option 1 ==> Take list as Global Variable
    //Option 2 ==> Pass list as an Argument

    public static ArrayList<Integer> findindexes(int arr[], int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> answerBelow = findindexes(arr, target, index + 1);
        list.addAll(answerBelow);
        return list;
    }
}
