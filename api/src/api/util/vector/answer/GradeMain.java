package api.util.vector.answer;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		GradeVO g1 = new GradeVO("1111","�Ƕ���",100,95,87);
		GradeVO g2 = new GradeVO("2222","�̿˽�",60,55,42);
		GradeVO g3 = new GradeVO("3333","������",99,88,77);
		GradeVO g4 = new GradeVO("4444","������",100,98,95);
		
		service.input(g1);
		service.input(g2);
		service.input(g3);
		service.input(g4);
		service.print();
		/*
		 ����ǥ [�̸� : , �й� : , ���� : 0, ���� : 0, ���� : 0, ���� : 0] �� ���´�.. 
		 grade �� ����ϴµ�, ���Ϳ� ����ִ� �༮�� �ƴ϶� �׳� �ΰ��̴�
		 �׷� ���Ϳ� grade�� �������� �����?
		 grade ��ſ� vc.toString() �� �־��ָ� �ȴ�.
		 */
		String dummy = service.searchGradeByHak("1111");
		System.out.println(dummy);
		Vector<String> temp = new Vector<String>();
		temp = service.searchGradeByName("������");
		System.out.println(temp.toString());
	}
}
