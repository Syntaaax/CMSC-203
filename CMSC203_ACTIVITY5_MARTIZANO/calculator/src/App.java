import java.util.Scanner;

import calc.Calculator;

public class App {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int y;
        boolean quit = false;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("\nSelect operation:");
                System.out.println("[1] Addition");
                System.out.println("[2] Subtraction");
                System.out.println("[3] Multiplication");
                System.out.println("[4] Division");
                System.out.println("[5] Modulo");
                System.out.println("[6] Exponent");
                System.out.println("[7] Quit");
                System.out.print("Enter Operation: ");
                y = sc.nextInt();

                if (y == 1) {
                    float number1;
                    float number2;
                    float sum;
                    System.out.println("\nEnter first number");
                    number1 = sc.nextFloat();
                    System.out.println("Enter second number");
                    number2 = sc.nextFloat();
                    // Addition
                    sum = calculator.addition(number1, number2);
                    System.out.println(number1 + " + " + number2 + " = " + sum);
                } else if (y == 2) {
                    float number1;
                    float number2;
                    float sum;
                    System.out.println("\nEnter first number");
                    number1 = sc.nextFloat();
                    System.out.println("Enter second number");
                    number2 = sc.nextFloat();
                    sum = calculator.subtraction(number1, number2);
                    System.out.println(number1 + " - " + number2 + " = " + sum);
                } else if (y == 3) {
                    float number1;
                    float number2;
                    float sum;
                    System.out.println("\nEnter first number");
                    number1 = sc.nextFloat();
                    System.out.println("Enter second number");
                    number2 = sc.nextFloat();
                    sum = calculator.multiplication(number1, number2);
                    System.out.println(number1 + " * " + number2 + " = " + sum);
                } else if (y == 4) {
                    float number1;
                    float number2;
                    float sum;
                    System.out.println("\nEnter first number");
                    number1 = sc.nextFloat();
                    System.out.println("Enter second number");
                    number2 = sc.nextFloat();
                    sum = calculator.division(number1, number2);
                    System.out.println(number1 + " / " + number2 + " = " + sum);
                } else if (y == 5) {
                    float number1;
                    float number2;
                    float sum;
                    System.out.println("\nEnter first number");
                    number1 = sc.nextFloat();
                    System.out.println("Enter second number");
                    number2 = sc.nextFloat();
                    sum = calculator.modulo(number1, number2);
                    System.out.println(number1 + " % " + number2 + " = " + sum);
                } else if (y == 6) {
                    int result = 1;
                    System.out.println("\nEnter base number");
                    int base = sc.nextInt();
                    System.out.println("Enter exponent number");
                    int exponent = sc.nextInt();
                    for (int i = 1; i <= exponent; i++) {
                        result = result * base;
                    }
                    System.out.println(base + " ^ " + exponent + " = " + result);
                } else if (y == 7) {
                    quit = true;
                    System.out.println("Thank you!");
                } else {
                    System.out.println("Invalid option\n");
                }
            } while (!quit);
        }
    }
}