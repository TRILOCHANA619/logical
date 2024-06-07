import java.util.Scanner;

public class FibonacciSeriesWithoutRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int a = scn.nextInt();
        printFibonacciSeries(a);
    }

    private static void printFibonacciSeries(int a) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < a; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
