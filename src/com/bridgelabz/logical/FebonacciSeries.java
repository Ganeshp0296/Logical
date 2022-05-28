package com.bridgelabz.logical;

import java.util.Scanner;

	class FebonacciSeries {		
			
		static void Fibonacci(int N) {
			int num1 = 0, num2 = 1;
			int counter = 0;
			while (counter < N) {
				System.out.print(num1 + " ");
				int num3 = num2 + num1;
				num1 = num2;
				num2 = num3;
				counter = counter + 1;
			}
		}
		
		public static void main(String args[]) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter number: ");
			int N = in.nextInt();
			// function call
			Fibonacci(N);
		}
		
			
	}


