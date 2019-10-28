package by.htp.luchko.cycles;

import java.util.Scanner;

public class Task17 {

	/*
	 * ƒаны действительное (а) и натуральное (n). вычислить: a( a+1 )...(a+n-1)
	 */

	public static void main(String[] args) {

		double a = Enter("Enter a: ");
		double n = Enter("Enter n: ");

		for (double i = 1; i <= n - 1; i++) {
			a = a * (a + i);
			
			
		}
		
		System.out.println("x = " + a);
	}

	public static double Enter(String message) {

		double value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			System.out.print(message);
			sc.nextDouble();

		}
		value = sc.nextDouble();
		return value;
	}
}
