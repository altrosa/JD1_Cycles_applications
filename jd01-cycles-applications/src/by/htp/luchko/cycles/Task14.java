package by.htp.luchko.cycles;

import java.util.Scanner;

public class Task14 {

	// Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

	public static void main(String[] args) {

		double n = Enter("enter n ");

		for (double i = 1; i <= n; i++) {

			double y = 1 / i;
			System.out.println(y);
		}

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
