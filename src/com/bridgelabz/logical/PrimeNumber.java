package com.bridgelabz.logical;

import java.util.Scanner;

class PrimeNumber {

	public static void main(String[] args) {

	int a;
	System.out.print("Enter number:");
	Scanner s = new Scanner(System.in); 
	a = s.nextInt();
	
	
    boolean flag = false;
    for (int i = 2; i <= a / 2; ++i) {
      // condition for nonprime number
      if (a % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(a + " is a prime number.");
    else
      System.out.println(a + " is not a prime number.");
  }

}
