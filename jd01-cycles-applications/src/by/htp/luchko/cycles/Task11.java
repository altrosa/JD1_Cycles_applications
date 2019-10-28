package by.htp.luchko.cycles;

public class Task11 {
	
	//Составить программу нахождения разности кубов первых двухсот чисел.

		public static void main(String[] args) {
			int j = 1;
			for (int i = 1; i < 201; i++) {
				
				j = (int) (j - Math.pow(i, 3));
				{

					System.out.println("S = " + j);
				}
			}

	}

}
