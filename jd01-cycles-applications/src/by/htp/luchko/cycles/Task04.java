package by.htp.luchko.cycles;

public class Task04 {

	/*
	 * � ������� ��������� while �������� ��������� ������ ���� ������ ����� �
	 * ��������� �� 2 �� 100 ������������.
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
