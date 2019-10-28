package by.htp.luchko.cycles;

import java.util.Scanner;
import java.math.BigInteger;

public class Task25 {

	public static void main(String[] args) {

		int a = Enter("Enter a ");
		code(a);

	}

	public static void code(int a) {
		BigInteger p= new BigInteger("1");
		BigInteger v = new BigInteger("1");
		for (int i = 1; i <= a; i++) {
			v = BigInteger.valueOf(i);
			p = p.multiply(v);
			
		}
		System.out.println("n!= "  + p);
	}

	public static int Enter(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		
		int a = Math.abs(sc.nextInt());
		return a;

	}

}
