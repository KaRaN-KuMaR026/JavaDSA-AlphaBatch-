package _8SortingAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
        return arr;
    }
}
