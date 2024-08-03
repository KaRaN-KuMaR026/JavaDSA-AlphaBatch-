package _7ArraysQuestions;

public class PairsInArray {
    public static void main(String[] args) {
        int[] num = {2,4,6,8,10};
        pairsInArray(num);
    }

    public static void pairsInArray(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                count++;
            }
            System.out.println();
        }
        System.out.println("Count : " + count);
    }
}
