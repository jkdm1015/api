package api.lang.String;
/*
 java.lang.String
 toUpperCase() �� �ش� ���ڿ��� ���� �빮�ڷ� ��ȯ
 toLowerCase() �� �ش� ���ڿ��� ���� �ҹ��ڷ� ��ȯ
 valuOf() �� �ٸ� Ÿ���� ��� ���ڿ��� ��ȯ 
 */
public class ValueOf {
	public static void main(String[] args) {
		String str = "Hello Java";
		String msg;
		System.out.println("�׽�Ʈ�� ���� : "+str);
		msg = str.toUpperCase();
		System.out.println(msg);
		msg = str.toLowerCase();
		System.out.println(msg);
		/*
		 ������ valueOf() �� �Ķ���� ���� int ���̴�.
		 Integer.parseInt() �� ���� �ʰ�
		 String �� ����ƽ �޼ҵ��� valueOf()
		 �� ȣ���ϸ� �ٷ� ���ڿ��� ��ȯ�Ѵ�. 
		 10 �� ��µ����� ���� 10 �� �ƴϰ� ���� 10 �̴�!
		 */
		msg = String.valueOf(str.length());
		System.out.println("valueOf �� ��� : " + msg);
	}
	
}
