import java.util.Scanner;

public class OneFunctionCalculator {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter two numbers: ");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        System.out.println("Num 1: " + firstNum);
        System.out.println("Num 2: " + secondNum);

        int sum = firstNum + secondNum;
        System.out.println("Result: " + firstNum + " + " + secondNum + " = " + sum);
    }
}