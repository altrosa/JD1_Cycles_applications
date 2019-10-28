package by.htp.luchko.cycles;

public class Task12 {
	/*
	 * Последовательность аn строится так: а1 = 1, an = 6 + аn-1 , для каждого n >1
	 * Составьте программу нахождения произведения первых 10 членов этой
	 * последовательности
	 */

	public static void main(String[] args) {
				
		for (int a = 1; a < 10; a++) 	{
			System.out.println(a);
			while (a < 54) {
				a = a + 6;
				System.out.println(a);
				
			}
		}

	}

}
