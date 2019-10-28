package by.htp.luchko.cycles;

public class Task26 {

	/*
	 * ������� �� ����� ������������ ����� ��������� � �� ���������� ������������� �
	 * ������ ���������� (������� ASCII).
	 */

	public static void main(String[] args) {
		code();

	}

	public static void code() {
		char a;
		for (int i = 1; i <= 255; i++) {

			a = (char) i;

			System.out.println(i + " " + a);
		}

	}
}