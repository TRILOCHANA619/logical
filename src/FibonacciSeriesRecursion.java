import java.util.Scanner;

public class FibonacciSeriesRecursion {
    static int n1 = 0, n2 = 1, n3;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :-");
        int a = scn.nextInt();
        System.out.print(0 + " " + 1);
        printFibonacciSeries(a-2);
    }

    private static void printFibonacciSeries(int a) {
        if(a>0) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            printFibonacciSeries(a-1);
        }
    }
}
