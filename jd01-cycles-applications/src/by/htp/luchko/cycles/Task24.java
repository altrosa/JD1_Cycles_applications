package by.htp.luchko.cycles;

import java.util.Scanner;

public class Task24 {

	/*
	 * Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
	 * Преобразовать его в другое число, цифры которого будут следовать в обратном
	 * порядке по сравнению с введенным числом.
	 */

	public static void main(String[] args) {
		int a = Enter("Enter a: ");
		code(a);
	}

	public static void code(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i = i * 10) {
			int b = a / i % 10;
			if (b % 2 == 0) {
				sum = sum + b;
			}

		}
		System.out.println("Сумма четных цифр числа а: " + sum);
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
