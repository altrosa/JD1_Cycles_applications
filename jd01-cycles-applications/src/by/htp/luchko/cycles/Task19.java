package by.htp.luchko.cycles;

import java.util.Scanner;

public class Task19 {

	/*
	 * ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������
	 * ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���:
	 */

	public static void main(String[] args) {

		double e = Enter("Enter e ");
		double x = 0;
		for (double i = 1; i <= 8; i++) {
			double a = 1 / (Math.pow((2), (i))) + 1 / (Math.pow((3), (i)));
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