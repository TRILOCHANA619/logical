import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number :-");
        int a = scn.nextInt();
        System.out.println("Enter second number :-");
        int b = scn.nextInt();
        printGreatestCommonDivisor(a, b);
    }

    private static void printGreatestCommonDivisor(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        System.out.println("GreatestCommon Divisor is :- " + gcd);
    }
}