package by.htp.luchko.cycles;

public class Task12 {
	/*
	 * ������������������ �n �������� ���: �1 = 1, an = 6 + �n-1 , ��� ������� n >1
	 * ��������� ��������� ���������� ������������ ������ 10 ������ ����
	 * ������������������
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
