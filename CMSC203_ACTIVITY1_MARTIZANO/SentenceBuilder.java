package CMSC203_ACTIVITY1_MARTIZANO;

import java.util.Scanner;

public class SentenceBuilder {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        System.out.print("Enter your GPA: ");
        String gpa = scanner.nextLine();

        System.out.print("Enter your blood type: ");
        String type = scanner.nextLine();

        System.out.println("\n");
        System.out.println("Hi, my name is " + "\u001B[1m" + name + "\u001B[0m" + ".");
        System.out.println("I am " + "\u001B[1m" + age + "\u001B[0m" + " years old" + ".");
        System.out.println("My GPA is " + "\u001B[1m" + gpa + "\u001B[0m" + ".");
        System.out.println("My blood type is " + "\u001B[1m" + type + "\u001B[0m" + ".");
    }
}