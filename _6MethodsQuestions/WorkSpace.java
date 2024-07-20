package _06MethodsQuestions;

import java.util.Scanner;

public class WorkSpace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int binNum = in.nextInt();
        int decNum = in.nextInt();
//        System.out.println("decimal of " + binNum + " = " + binToDec(binNum));
        System.out.println("Binary of " + decNum + " = " + decToBin(decNum));
    }

    public static int decToBin(int decNum){
        int pow = 0;
        int binNum = 0;
        while(decNum > 0){
            int digit = decNum%2;
            binNum = binNum + (digit * (int)Math.pow(10,pow));
            decNum = decNum/2;
            pow++;
        }
        return binNum;
    }


    public static int binToDec(int binNum){
        int decNum = 0;
        int pow = 0;
        while(binNum > 0){
            int digit = binNum%10;
            decNum = (decNum + digit * (int)(Math.pow(2,pow)));
            binNum = binNum/10;
            pow++;
        }
        return decNum;
    }
    public static void primesInRange(int range){
        for (int i = 2; i <= range; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    private static boolean isPrime(int n) {
        if(n == 2)
            return true;
        else {
            for(int i = 2;i <= Math.sqrt(n);i++){
                if(n%i == 0)
                    return false;
            }
        }
        return true;
    }

    public static float sum(int a,float b){
        System.out.println("Method 1st called");
        return (a+b);
    }

    public static float sum(float a,int b){
        System.out.println("Method 2nd called");
        return a+b;
    }
}
