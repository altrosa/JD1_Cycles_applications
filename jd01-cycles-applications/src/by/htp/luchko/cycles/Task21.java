package by.htp.luchko.cycles;

import java.util.Scanner;

/*
 *  —оставить программу дл€ вычислени€ значений функции F(x) на отрезке [а, b] с шагом
h. –езультат представить в виде таблицы, первый столбец которой Ц значени€ аргумента,
второй - соответствующие значени€ функции:

 * 
 */
public class Task21 {

	public static void main(String[] args) {

		double a = Enter("Enter a: ");
		double b = Enter("Enter b: ");
		double h = Enter("Enter h: ");

		for (double x = a; x <= b - h; x++) {
			System.out.println("Arg   " + "     Fun");
			x = x - h;
			while (x <= b - h) {
				x = x + h;
				double y = Math.sin(x);

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
