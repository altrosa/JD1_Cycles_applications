package by.htp.luchko.cycles;

public class Task13 {
	/*
	 * ��������� ������� �������� ������� y = 5 - x 2 /2 �� ������� [-5; 5] � �����
	 * 0.5
	 */

	public static void main(String[] args) {

		for (double x = -5.5; x <= 5; x++) {
			System.out.println("x   " + "     y");
			while (x <= 5) {
				x = x + 0.5;
				double y = 5 - (x * x) / 2;
				
				System.out.println(x + " | " + y);

			}

		}
	}
}