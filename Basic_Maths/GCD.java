package Basic_Maths;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        sc.close();
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
