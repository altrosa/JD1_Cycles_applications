package by.htp.luchko.cycles;

import java.util.Scanner;

public class Task06 {
	/*
	 * Напишите программу, где пользователь вводит любое целое положительное число.
	 * А программа суммирует все числа от 1 до введенного пользователем числа.
	 */

	public static void main(String[] args) {
		int n = Enter("Enter n ");

		Summa(n);

	}

	public static void Summa(int n) {
		int j = 0;
		for (int i = 1; i < n; i++) {
			j = j + i;
		}

		System.out.println(j);
	}

	public static int Enter(String message) {

		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			System.out.print(message);
			sc.nextInt();
		}
		value = sc.nextInt();
		return value;

	}
}
