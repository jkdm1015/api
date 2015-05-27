package api.lang.String;

/*
 java.lang.String
 == �� ��ü�� ���۷��� ���(hash code table) �� ���ϴ� ��.
 ���ڿ��� ���� �񱳴� �ݵ�� equals() �޼ҵ带 �̿�.
 new �� �̿��ϸ� heap ������ ���ο� �޸𸮸� �Ҵ��ϰ�
 hashcode �� �����Ѵ�.
 */
public class EqualsDemo {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		// String ���� ���ͷ� ������ ���
		String result1 = (str1 == str2) ? "1-2�� ����" : "1-2���ٸ�";
		String result2 = (str1.equals(str2)) ? "1-2�� ����" : "1-2���ٸ�";
		System.out.println("(str1 == str2)�� ��� : " + result1);
		System.out.println("(str1.equals(str2))�� ��� : " + result2);
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		// String ���� �����ڷ� ������ ���
		String result3 = (str3 == str4) ? "3-4�� ����" : "3-4���ٸ�";
		String result4 = (str3.equals(str4)) ? "3-4�� ����" : "3-4���ٸ�";
		System.out.println("(str3 == str4)�� ��� : " + result3);
		System.out.println("(str3.equals(str4))�� ��� : " + result4);
		
		String result5 = (str3.hashCode() == str4.hashCode()) ? "3-4�� ����" : "3-4���ٸ�";
		System.out.println("(str3.hashCode() == str4.hashCode()) : "+result5);
		
		String str6 = new String("abc");
		String str7 = "abc";
		// String ���� �����ڷ� ������ ���
		String result6 = (str6 == str7) ? "6-7�� ����" : "6-7���ٸ�";
		String result7 = (str6.equals(str7)) ? "6-7�� ����" : "6-7���ٸ�";
		System.out.println("(str6 == str7)�� ��� : " + result6);
		System.out.println("(str6.equals(str7))�� ��� : " + result7);
		/*
		  result3 �� ����� �ٸ����� ���� ����..
		  - String Ŭ������ �����ڸ� �̿��Ͽ� String �ν��Ͻ��� ������ ��쿡��
		  - new �����ڿ� ���� �޸� �Ҵ��� �̷����� ������
		  - �׻� ���ο� String �ν��Ͻ��� �����ȴ�.
		  - �׷���, String Ÿ���� �����ڷ� ��ü�� �������� �ʰ�,
		  	���ͷ��� �����Ѵ�.
		 */
		/*
		 ��� Ŭ��������(*.class) ���� constant pool �̶��
		 ������� �־, Ŭ���� ���� ���Ǵ� ��� ���ͷ���
		 ������� ����Ǿ� �־�.
		 ����ϰ��� �ϴ� ���ڿ��� ��� Ǯ�� �̹� �����ϴ� ������
		 �� ���ڿ��� �ּҰ��� ��ȯ�Ѵ�. 
		 */
	}
}
