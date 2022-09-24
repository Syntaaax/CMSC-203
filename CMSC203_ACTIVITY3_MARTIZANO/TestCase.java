package CMSC203_ACTIVITY3_MARTIZANO;

import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No. of test cases: ");
        int t = sc.nextInt();
        while (t > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x == y ? "ANY" : x < y ? "FIRST" : "SECOND");
            t--;
        }
        System.out.println("\nNo. of test cases: 3");
        System.out.println("95 360");
        System.out.println("500 500");
        System.out.println("1001 1");

        System.out.println("\nResult: ");
        System.out.println("FIRST");
        System.out.println("ANY");
        System.out.println("SECOND");
    }
}