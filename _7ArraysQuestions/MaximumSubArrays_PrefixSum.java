package _7ArraysQuestions;

public class MaximumSubArrays_PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        System.out.println("Maximum Sum : " + prefixSum(arr));
    }

    private static int prefixSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
//        calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int currSum;
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
}
