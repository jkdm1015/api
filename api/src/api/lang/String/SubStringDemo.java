package api.lang.String;

/*
 java.lang.String 
 substring() �޼ҵ�� ������ġ (begin) ���� ����ġ (end) ���� ���ڿ� ����
 begin <= x < end
 */
public class SubStringDemo {
	public static void main(String[] args) {
		/*
		 �ε����� 0���� �����ؼ� ���鵵 1�� ó���Ѵ�.
		 */
		System.out.println("�Ķ���Ͱ� �Ѱ��϶� : " + "Hello Java".substring(6));
		System.out.println("�Ķ���Ͱ� �ΰ��϶� : " + "Hello Java".substring(6, 8));
		/*
		 6������ 7��° ������ J ���� 9��° �̸� ������ a���� ��� 
		 �׷��� Ja ����!
		 */
	}
}
