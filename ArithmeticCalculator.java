package Calculator;


	import java.util.Scanner;

	public class ArithmeticCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            // Prompt the user for two numbers and an operator
	            System.out.print("Enter the first number: ");
	            double num1 = scanner.nextDouble();

	            System.out.print("Enter the second number: ");
	            double num2 = scanner.nextDouble();

	            System.out.print("Enter the operator (+, -, *, /): ");
	            char operator = scanner.next().charAt(0);

	            // Perform the corresponding arithmetic operation
	            double result = 0.0;

	            switch (operator) {
	                case '+':
	                    result = num1 + num2;
	                    break;
	                case '-':
	                    result = num1 - num2;
	                    break;
	                case '*':
	                    result = num1 * num2;
	                    break;
	                case '/':
	                    if (num2 != 0) {
	                        result = num1 / num2;
	                    } else {
	                        throw new ArithmeticException("Division by zero is not allowed.");
	                    }
	                    break;
	                default:
	                    throw new IllegalArgumentException("Invalid operator. Please use +, -, *, or /.");
	            }

	            // Display the result
	            System.out.println("Result: " + result);

	        } catch (Exception e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        } finally {
	            // Close the scanner
	            scanner.close();
	        }
	    }
	
}
