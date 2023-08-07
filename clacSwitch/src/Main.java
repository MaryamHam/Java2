import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //task 5
        Scanner scanner = new Scanner(System.in);
        double result;
        while (true) {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the operation (+, -, *, /) or type 'exit' to quit: ");
            String operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                System.out.println("Thank you, Goodbye!");
                break;
            }

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Please try again");
                    continue;
            }

            System.out.println("Result: " + result);
        }


    }
}