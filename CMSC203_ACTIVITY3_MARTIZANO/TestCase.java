package CMSC203_ACTIVITY3_MARTIZANO;

import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean done = false;

        do {
            System.out.print("No. of test cases: ");
            int t = sc.nextInt();

            if (1 <= t && t <= 10) {
                String inputs[] = new String[t];

                for (int i = 0; i < t; i++) {
                    sc = new Scanner(System.in);
                    inputs[i] = sc.nextLine();
                }

                System.out.println("\nResult:");
                System.lineSeparator();

                for (String input : inputs)
                    System.out.println(processInput(input));

                done = true;
            } else
                System.out.println("Enter a number from 1-10");

        } while (!done);
        sc.close();
    }

    private static String processInput(String input) {
        String[] inputs = input.split("\\s+");

        if (inputs.length != 2)
            return "INVALID INPUT";

        try {
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);

            if (x < 1 || x > 1000
                    || y < 1 || y > 1000)
                return "INVALID INPUT";

            if (x < y)
                return "FIRST";

            else if (x > y)
                return "SECOND";

            else
                return "ANY";
        } catch (Exception e) {
            return "INVALID INPUT";
        }
    }
}