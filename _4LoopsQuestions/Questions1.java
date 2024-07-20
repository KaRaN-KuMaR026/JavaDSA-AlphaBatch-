package _4LoopsQuestions;

import java.util.Scanner;

public class Questions1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(sum());
    }

    private static String sum() {
        int num;
        char choice;
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter the numbers.");
        do{
            num = in.nextInt();
            if(num%2 == 0)
                evenSum += num;
            else
                oddSum += num;
            System.out.println("Are you finished entering numbers(y/n).");
            choice = in.next().charAt(0);
        }while (choice == 'n');

        return "Sum of Even no.s = " + evenSum + " Sum of Odd no.s = " + oddSum;
    }
}
