package Calculator;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("""
                --- Java 21 Advanced Calculator ---
                Available Operations: +, -, *, /
                Enter format: [Number] [Operator] [Number]
                (Example: 10 + 5)
                -----------------------------------
                """);

        System.out.println("Enter the value of first : ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /)");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the value of second : ");
        double secondNumber = scanner.nextDouble();

        double result;

        while (true) {

            try {
                switch (operator) {

                    case '+':
                        result = firstNumber + secondNumber;
                        System.out.println("\n1. Addition");
                        System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                        break;

                    case '-':
                        result = firstNumber - secondNumber;
                        System.out.println("\n2. Subtraction");
                        System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                        break;

                    case '*':
                        result = firstNumber * secondNumber;
                        System.out.println("\n3. Multiplication");
                        System.out.println(firstNumber + " * " + secondNumber + " = " + result);
                        break;

                    case '/':
                        if (secondNumber == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = firstNumber / secondNumber;
                            System.out.println("\n4. Division");
                            System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                            break;
                        }
                    default:
                        System.out.println("Enter a valid Number and operands. Please try again..!");
                        break;
                }
//            Adding a while loop makes the application much more usable since
//            you don't have to restart the program for every single calculation.

                System.out.print("\nPress the 'x' you want to exit): ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("x")) {
                    System.out.println("Exiting... Happy coding!");
                    break;
                }
            } catch (Exception exception) {
                System.out.println("Error: Invalid input or calculation error. \n" + exception.getMessage());
            }
        }
    }
}
