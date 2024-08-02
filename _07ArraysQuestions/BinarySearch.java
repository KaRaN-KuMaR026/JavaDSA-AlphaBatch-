package _07ArraysQuestions;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] numbers = {12,10,8,6,4,2,0};
        int[] numbers = {0,2,4,6,8,10,12};
        int key = 2;
        int result = binarySearch(numbers,key);
        if( result != -1)
            System.out.println(key + " found at index " + result);
        else
            System.out.println("Key not found!");
    }

    public static int binarySearch(int[] arr,int key){
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] < arr[end]){
            while(start <= end){
                int mid = (start + end)/2;
                if(arr[mid] == key)
                    return mid;
                if(arr[mid] < key)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        else{
            while(start <= end){
                int mid = (start + end)/2;
                if(arr[mid] == key)
                    return mid;
                if(arr[mid] > key)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
