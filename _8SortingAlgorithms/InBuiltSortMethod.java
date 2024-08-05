package _8SortingAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class InBuiltSortMethod {
    public static void main(String[] args) {
        Integer[] arr = {5,4,1,3,2};
        Arrays.sort(arr,0,3);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,0,3, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
