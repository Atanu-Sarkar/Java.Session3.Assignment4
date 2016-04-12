package com.acadgild.session.three;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Maths calc = new Maths();
		double result = 0;
		double input1, input2;
		char operator;
		boolean done = false;

		while (done == false) {
			System.out.print("Please enter your sum: ");

			input1 = input.nextDouble();
			operator = input.next().charAt(0);
			input2 = input.nextDouble();

			switch (operator) {
			case '+':
				result = calc.add(input1, input2);
				break;
			case '-':
				result = calc.subtract(input1, input2);
				break;
			case '*':
				result = calc.multiply(input1, input2);
				break;
			case '/':
				result = calc.divide(input1, input2);
				break;
			}

			System.out.println(result);
		}

		input.close();

	}

	public static class Maths {

		double add(double a, double b) {
			double answer = a + b;
			return answer;
		}

		double subtract(double a, double b) {
			double answer = a - b;
			return answer;
		}

		double multiply(double a, double b) {
			double answer = a * b;
			return answer;
		}

		double divide(double a, double b) {
			double answer = a / b;
			return answer;
		}

	}

}
