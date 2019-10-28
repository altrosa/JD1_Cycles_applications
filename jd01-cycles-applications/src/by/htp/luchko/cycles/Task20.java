package by.htp.luchko.cycles;

import java.util.Scanner;

public class Task20 {
	/*
	 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
	 * которых больше или равен заданному е. Общий член ряда имеет вид:
	 * 
	 */
	public static void main(String[] args) {

		double e = Enter("Enter e ");
		double x = 0;
		for (double i = 1; i <= 10; i++) {
			double a = 1 / (((3 * i) - 2) * ((3 * i)+ 1));
			if (Math.abs(a) >= e) {
				x = x + a;
			}

		}
		System.out.println("x = " + x);
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