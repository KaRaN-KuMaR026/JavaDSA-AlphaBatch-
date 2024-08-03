package _7ArraysQuestions;

public class TrappedRainWaterProblem {
    public static void main(String[] args) {
        int[] barsHeight = {4, 2, 0, 3, 2, 5};
        System.out.println("Total Trapped Rain Water : " + trappedRainWater(barsHeight));
    }

    public static int trappedRainWater(int[] barHeights){
        int[] maxLeftBoundary = maxLeftBoundary(barHeights);
        int[] maxRightBoundary = maxRightBoundary(barHeights);
        int trappedWater=0;
        for (int i = 0; i < barHeights.length; i++) {
            int waterLevel = (Math.min(maxLeftBoundary[i],maxRightBoundary[i]) - barHeights[i]);
            trappedWater = trappedWater + waterLevel;
        }
        return trappedWater;
    }

    private static int[] maxRightBoundary(int[] arr) {
        int[] maxRightBoundary = new int[arr.length];
        maxRightBoundary[arr.length - 1] = arr[arr.length -1];
        for (int i = arr.length - 2; i >=0 ; i--) {
            maxRightBoundary[i] = Math.max(arr[i],maxRightBoundary[i+1]);
        }
        return maxRightBoundary;
    }

    public static int[] maxLeftBoundary(int[] arr){
        int[] maxLeftBoundary = new int[arr.length];
        maxLeftBoundary[0] = arr[0];
        //for maxLeftBoundary array
        for (int i = 1; i < arr.length; i++) {
            maxLeftBoundary[i] = Math.max(maxLeftBoundary[i-1],arr[i]);
        }
        return maxLeftBoundary;
    }
}
