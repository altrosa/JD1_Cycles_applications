package by.htp.luchko.cycles;

public class Task05 {

	/*
	 * � ������� ��������� while �������� ��������� ����������� ����� ���� ��������
	 * ����� � ��������� �� 1 �� 99 ������������.
	 */

	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++) {
			while (i % 2 == 0) {

				i++;
				
				j = j + i;
				
				System.out.println(j);
			}
		}

	}

}
