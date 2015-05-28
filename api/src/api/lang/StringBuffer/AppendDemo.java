package api.lang.StringBuffer;
/*
 StringBuffer Ŭ����
 - String Ŭ������ �������� �ν��Ͻ� ������
  	���ڿ��� �ٲ� �� �ְ� ������ �ִ�.
 */
/*
 java.lang.StringBuffer �� �޼ҵ��� 
 append() �� �Ķ���ͷ� ���� String ����
 ���� ���ڿ��� �ڿ� ���δ�.
 */
public class AppendDemo {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		StringBuffer buf1 = new StringBuffer("A B C ");
		StringBuffer buf2 = buf1.append("D E F");
		String msg;
		
		if(buf1 == buf2){
			msg = "buf1 == buf2";
		}else{
			msg = "buf1 != buf2";
		}
		System.out.println(msg);
		System.out.println(buf1.toString());
		System.out.println(buf2.toString());
		/*
		 buf2 �� ���Ӱ� �����Ǿ� ���޵� ��ü�� �ƴϸ�
		 buf1 �� ���������� �����Ǿ� ���� �������ν�
		 ������ �ּҰ��� �����Ѵ�.
		 
		  String Buffer Ŭ������ String Ŭ������ �ٸ���
		  ���к��ϰ� ��ü ������ ���� �ʴ´�.
		  �׸���, ���� ������ �� �ִ� �������� Ư¡�� �ִ�.
		  �׷��Ƿ� ����� ���ڿ� ���� �۾��� �ʿ��� ���
		  String Ŭ���� ���� StringBuffer Ŭ������ �� �����ϴ�.
		  
		  ��� �� : ī�忡�� ���ڸ� ���� �� ������� ���ٰ�
		  �ٽ� ����� ���ۼ� �ؼ� ������ ��찡 ��ü���̴�.
		  ��, Buffer �� ������Ѵٰ� ����ڰ� �������� ���͸�
		  ������ �۾��� Buffer���� ��ü�� �������Ѽ�
		  ������ �ó������� ����ȴ�.
		 */
	}
}