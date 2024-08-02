package _07ArraysQuestions;

public class MaximumSubArrays_BruteForce {
    public static void main(String[] args) {
        int[] num = {1,-2,6,-1,3};
        subArrays(num);
    }

    public static void subArrays(int[] arr){
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum = currSum + arr[k];
                }
                System.out.println(currSum);
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum : " + maxSum);
    }
}
