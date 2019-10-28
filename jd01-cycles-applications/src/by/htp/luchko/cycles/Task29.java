package by.htp.luchko.cycles;

import java.util.Scanner;

public class Task29 {
	/*
	 * Даны два числа. Определить цифры, входящие в запись как первого так и второго
	 * числа.
	 * 
	 */

	public static void main(String[] args) {

		int a = Enter("Enter a: ");
		int b = Enter("Enter b: ");
	}
	
	public static void code(int a, int b) {
		
		
	}
	
	public static int Enter(String message) {
		
		int value;
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
			
		}
		value = sc.nextInt();
		return value;
	}
}
