package by.htp.luchko.cycles;

import java.util.Scanner;

public class Task27 {

	/*
	 * Для каждого натурального числа в промежутке от m до n вывести все делители,
	 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
	 */

	public static void main(String[] args) {

		int m = Enter("Enter m: ");
		int n = Enter("Enter n ");
		code(m, n);

	}

	public static void code(int m, int n) {

			for (int i = m; i <= n; i++) {
					for (int j = 2; j<=i; j++) {
					int del = i%j;
					if (del == 0) {
						del = j;
						System.out.println(del + " ");
				}

			}
		}

	}

	public static int Enter(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}

		int a = Math.abs(sc.nextInt());
		return a;
	}
}