package _7ArraysQuestions;

public class MaximumSubArrays_KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("our maximum subarray sum : " + kadanesSum(arr));
    }

    private static int kadanesSum(int[] arr) {
        int ms = arr[0];
        int cs = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cs = Math.max(cs + arr[i],arr[i]);
            ms = Math.max(cs,ms);
        }
        return ms;
    }
}
