package Sorting;
import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
    int arr[]={1,3,9,8,5,2,4,6,7};
    cyclic(arr);
    System.out.println(Arrays.toString(arr));
    }
    
    public static void cyclic(int arr[]){

        int i=0;
        int end=arr.length;
        while (i<end) {
            int correctIndex=arr[i]-1;
            /*..................................................................................
            int correctIndex = i;
            for (int j = i + 1; j < end; j++) {
        if (arr[j] < arr[i]) {
            correctIndex++;
        }
    }.............................................................................................. */
            if( correctIndex < end && arr[i] != arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }

    }

    /*
    class GFG {
    
    // Function sort the array using Cycle sort
    public static void cycleSort(int arr[])
    {
        int n = arr.length;
          
        // traverse array elements and put it to on
        // the right place
        for (int cycle_start = 0; cycle_start <= n - 2;
             cycle_start++) {
                 
            // initialize item as starting point
            int item = arr[cycle_start];

            // Find position where we put the item. We
            // basically count all smaller elements on right
            // side of item.
            int pos = cycle_start;
            for (int i = cycle_start + 1; i < n; i++)
                if (arr[i] < item)
                    pos++;

            // If item is already in correct position
            if (pos == cycle_start)
                continue;

            // ignore all duplicate elements
            while (item == arr[pos])
                pos += 1;

            // put the item to it's right position
            if (pos != cycle_start) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }

            // Rotate rest of the cycle
            while (pos != cycle_start) {
                pos = cycle_start;

                // Find position where we put the element
                for (int i = cycle_start + 1; i < n; i++)
                    if (arr[i] < item)
                        pos += 1;

                // ignore all duplicate elements
                while (item == arr[pos])
                    pos += 1;

                // put the item to it's right position
                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {3,5,2,1,4};
        int n = arr.length;
        cycleSort(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
    */
}
