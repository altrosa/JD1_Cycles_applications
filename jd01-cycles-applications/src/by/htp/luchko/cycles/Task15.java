package by.htp.luchko.cycles;

public class Task15 {
	
// Вычислить : 1+2+4+8+...+ 2 в 10 степени.
	public static void main(String[] args) {
		int y = 1;
		int x = 1;
		for (int i = 1; i <= 10; i++) {
			
			y = (int) (y + Math.pow(2, i));
			
			x = 1+ x + y;
						
		}
		
		System.out.println( " x = " + x);
		
	}

}
