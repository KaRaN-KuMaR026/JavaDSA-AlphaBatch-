package _5PatternsQuestions;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        hollowRect(10,7);
//        inverted_rotated_pyramid(4);
//        inverted_half_pyramid(5);
//        floyd_triangle(5);
//        _01_triangle(5);
//        butterfly_pattern(4);
//        solid_rhombus(5);
//        hollow_rhombus(5);
//        diamond(10);
        number_pyramid(5);
//        palindromicNumPyramid(5);
    }

    private static void palindromicNumPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //descending part
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            //ascending part
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void number_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //elements
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void diamond(int n) {
        //Upper-Half
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Bottom-Half
        for (int i = n; i >= 1; i--) {
            //spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            //hollow rectangle-stars
            for (int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void solid_rhombus(int n){
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void butterfly_pattern(int n){

        //upper-half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1;j <= (2* (n - i));j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //bottom-half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1;j <= (2* (n - i));j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void _01_triangle(int n){
        for (int i = 1; i <= n; i++) {
            for(int j = 1;j <= i;j++){
                if((i + j)%2 == 0){
                    System.out.print("1");
                }
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }

    private static void hollow_Rectangle(int rows, int columns) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if(i == 1 || j == 1 || i == rows || j == columns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void inverted_rotated_pyramid(int n){
        for (int i = 1; i <= n; i++) {
            //Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //Stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void inverted_half_pyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void floyds_triangle(int n){
        int count = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
