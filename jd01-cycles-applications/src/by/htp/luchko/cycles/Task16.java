package by.htp.luchko.cycles;

public class Task16 {

	// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

	public static void main(String[] args) {
		long x = 3;
		long y = 3;
		for (long i = 2; i <= 9; i++) {
			x = x + i + 1 ;
			y = x * y;
			
		}

		System.out.println("x = " + y);

	}

}
