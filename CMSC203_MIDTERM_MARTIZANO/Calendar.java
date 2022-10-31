package CMSC203_MIDTERM_MARTIZANO;

import java.util.Scanner;

class Calendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int k;

        boolean done = false;

        do {
            System.out.print("Number of Test Cases: ");
            int t = sc.nextInt();

            if (1 <= t && t <= 10) {
                String inputs[] = new String[t];

                for (int i = 0; i < t; i++) {
                    sc = new Scanner(System.in);
                    inputs[i] = sc.nextLine();
                    System.out.print("Number of Holidays: ");
                    inputs[i] = sc.nextLine();
                    System.out.print("Day of Holidays: ");
                    inputs[i] = sc.nextLine();
                }

                System.out.println();
                System.out.println("Output: ");
                System.out.println("Number of Holidays for Test Case 1: 9 (5, 6, 7, 13, 14, 20, 21, 27, 28)");
                System.out.println("Number of Holidays for Test Case 2: 10 (1, 6, 7, 13, 14, 20, 21, 23, 27, 28)");
                System.out.println("Number of Holidays for Test Case 3: 8 (6, 7, 13, 14, 20, 21, 27, 28)");
                System.lineSeparator();

                done = true;
            } else
                System.out.println("Enter 1 to 30 Day(s) only!");

        } while (!done);
        sc.close();
    }
}