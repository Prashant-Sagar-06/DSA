package Patterns;

import java.util.Scanner;

public class Pattern_2 {
    public static void patterntri(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        patterntri(n);
        sc.close();
    }
}