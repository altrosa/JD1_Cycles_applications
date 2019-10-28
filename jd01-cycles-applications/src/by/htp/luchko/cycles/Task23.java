package by.htp.luchko.cycles;

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {

		double a = Enter("Enter a: ");
		double b = Enter("Enter b: ");
		double h = Enter("Enter h: ");

		for (double x = a; x <= b - h; x++) {
			System.out.println("Arg   " + "     Fun");
			x = x - h;
			while (x <= b - h) {
				x = x + h;
				double y = (1 / Math.tan(x / 3)) + (Math.sin(x) / 2);

				System.out.println(x + " | " + y);

			}
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
