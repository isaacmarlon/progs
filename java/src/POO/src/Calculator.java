/*
 * This program can do something like a Calculator
 * using Oriented-Objectos Programming!
 *
 * @author: isaacmsl;
 *
*/
public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {

		int result = 0;

		try {
			result = a / b;
		} catch (ArithmeticException exception) {
			System.err.println("Error! Dividing by zero is not allowed.");
		} finally {
			return result;
		}

	}

	public int modulo(int a, int b) {

		int result = 0;

		try {
			result = a % b;
		} catch (ArithmeticException exception) {
			System.err.println("Error! Dividing by zero is not allowed.");
		} finally {
			return result;
		}

	}

	public static void main(String[] args) {

		Calculator myCalculator = new Calculator();

		System.out.println(myCalculator.add(5, 7));
		System.out.println(myCalculator.subtract(45, 11));

	}

}