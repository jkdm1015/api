package api.util.calender;

import java.util.Calendar;

/*
 java.util.Calender
 */
public class CalenderDemo {
	public static void main(String[] args) {
		String[] months = { "1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��",
				"9��", "10��", "11��", "12��" };
		// Calendar.getInstance(); �� ����������
		// ����ƽ�� �̱��� �������� ��ü�� �����ϴ� ����̴�.
		// �������� �ν��Ͻ��� �������� �ʵ��� �����Ϸ���
		// �������� �ڵ��Ǿ���.
		Calendar date = Calendar.getInstance();
		
		System.out.print("��¥ : ");
		System.out.print(date.get(Calendar.YEAR)+"�� ");
		// ���� 0 ���� �����̶� +1�� ����� �Ѵ�.
		// calendars is JANUARY which is 0 <= API�� �̷��� �Ǿ�����
		// ���� 1�� ������ ������ ���� ���� 5���̸� 4���� ��µȴ�.
		System.out.print((date.get(Calendar.MONTH)+1)+"�� ");
		System.out.print(date.get(Calendar.DATE)+"�� \n");
		
		System.out.print("�ð� : ");
		System.out.print(date.get(Calendar.HOUR)+"�� ");
		System.out.print(date.get(Calendar.MINUTE)+"�� ");
		System.out.print(date.get(Calendar.SECOND)+"�� \n");
		
		System.out.println("===== 1�� �� =====");
		date.add(Calendar.MONTH,1);  // ���� ��¥�� 1���� ���� ���
		System.out.println(toString(date));
		/*
		 ��µ� ����� : java.util.GregorianCalendar �� ��µǹǷ�
		 �������̵��� �ʿ��ϴ�. 
		 */
		System.out.println("===== 7�� �� =====");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));
		/*
		 ��µ� ����� : java.util.GregorianCalendar �� ��µǹǷ�
		 �������̵��� �ʿ��ϴ�. 
		 */
		System.out.println("Ư�� ��¥�� ����");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 46);
		
		System.out.println("������ �ð� ���");
		System.out.print(Calendar.HOUR+"�� ");
		System.out.print(Calendar.MINUTE+"�� ");
		System.out.print(Calendar.SECOND+"�� \n");
		/*
		 ������ �ð� ��°������ 10�� 12�� 13�� ó�� �Ǿ� �������̵��� �ʿ� 
		 */
		
	}
	// ���� 0 ���� �����̶� +1�� ����� �Ѵ�.
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR)+"�� "
				+ (date.get(Calendar.MONTH)+1)+"�� "
				+ date.get(Calendar.DATE)+"��";
	}
	// date.add(Calendar.MONTH, 1)
	
}
