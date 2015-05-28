package api.lang.String;
/*
 java.lang.String
 replace("OLD", "NEW") : String ���ڿ����� OLD ���ڸ� NEW �� �ٲ۴�.
 ���� ��ü�ϴ� ���ڰ� �����̸� replaceAll �� ����Ѵ�.
 */
public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Tom".replace("Tom", "Alex"));
		System.out.println("A B C D : A B C D".replaceAll("C D", "E F"));
		/*
		 �� ������ �ڹ� ���� 5(JDK 1.5) ������ �����Դϴ�.
		 ���� 5 ���� replace() ����� Ȯ��Ǿ� replaceAll() ó��
		 ������ ���ڿ��� �����ϰ� �Ǿ����ϴ�.
		 �׷��ٸ� �������� ����? �ƴմϴ�.
		 ���ԽĿ� ���� ����� �ִ��� ���� ���ο� ���� �������� �ֽ��ϴ�. 
		 */
		System.out.println("[1] A B C D : A B C D".replace("C D", "E F"));
		System.out.println("[2] A B C D : A B C D".replaceAll("C D", "E F"));
		
		System.out.println("Hello Java !!".replace("!", ""));
		System.out.println("Hello Java !!".replaceAll(".!", ""));
		// .�� ������ ���� ���ڸ��� �ǹ�
		// ����ǥ�� ����ǥ ���ڸ��� ����
		// �� ����� replaceAll() ���� �ֽ��ϴ�.
		// ���� replace() ���ٴ� ���Խ� ó������ ������ replaceAll() �� ����
	}
}
