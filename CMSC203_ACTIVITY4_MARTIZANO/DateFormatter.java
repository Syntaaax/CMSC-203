package CMSC203_ACTIVITY4_MARTIZANO;

import java.util.Scanner;

public class DateFormatter {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Month : ");
            int month = input.nextInt();
            input.nextLine();

            System.out.print("Date  : ");
            int date = input.nextInt();
            input.nextLine();

            System.out.print("Year  : ");
            int year = input.nextInt();
            input.nextLine();

            System.out.print("\n");

            switch (month) {
                case 1:
                    System.out.println("January " + date + "," + " " + year);
                    break;
                case 2:
                    System.out.println("February " + date + "," + " " + year);
                    break;
                case 3:
                    System.out.println("March " + date + "," + " " + year);
                    break;
                case 4:
                    System.out.println("April " + date + "," + " " + year);
                    break;
                case 5:
                    System.out.println("May " + date + "," + " " + year);
                    break;
                case 6:
                    System.out.println("June " + date + "," + " " + year);
                    break;
                case 7:
                    System.out.println("July " + date + "," + " " + year);
                    break;
                case 8:
                    System.out.println("August " + date + "," + " " + year);
                    break;
                case 9:
                    System.out.println("September " + date + "," + " " + year);
                    break;
                case 10:
                    System.out.println("October " + date + "," + " " + year);
                    break;
                case 11:
                    System.out.println("November " + date + "," + " " + year);
                    break;
                case 12:
                    System.out.println("December " + date + "," + " " + year);
                    break;
                default:
                    System.err.println("Invalid input");
            }
        }
    }
}