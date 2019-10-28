package by.htp.luchko.cycles;

public class Task04 {

	/*
	 * С помощью оператора while напишите программу вывода всех четных чисел в
	 * диапазоне от 2 до 100 включительно.
	 */

	public static void main(String[] args) {

		for (int i = 1; i < 101; i++) {
			while (i % 2 != 0) {

				i++;
				System.out.printf(" " + i);
			}
		}
	}

}
