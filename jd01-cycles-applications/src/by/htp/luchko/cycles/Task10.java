package by.htp.luchko.cycles;
import java.math.*;

public class Task10 {

//��������� ��������� ���������� ������������ ��������� ������ ������� �����.

	public static void main(String[] args) {
		
		
		BigInteger a = BigInteger.valueOf(2147483647);
		BigInteger b = new BigInteger("1");
		
		 for (a = b; !a.equals(new BigInteger("10")) ; a = a.add(b)) {
			
			a = a.multiply(a.multiply(b));
			
			{

				System.out.println("S = " + a);
			}
		}

	}

}