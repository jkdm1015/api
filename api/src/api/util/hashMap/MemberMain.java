package api.util.hashMap;

import java.util.Scanner;

import javax.print.attribute.standard.Severity;

public class MemberMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	/*	System.out.println("���̵� �Է��ϼ���");
		String id = scanner.next();
		System.out.println("��й�ȣ�� �Է��ϼ���");
		String password = scanner.next();
		System.out.println("�̸��� �Է��ϼ���");
		String name = scanner.next();
		System.out.println("���̸� �Է��ϼ���");
		int age = scanner.nextInt();
		System.out.println("�ּҸ� �Է��ϼ���");
		String addr = scanner.next();*/
		/*
		 ��ü�� �����ؼ� �ϼ���Ű����
		 ��ü�� �����ϴ� ������ �� �Ѱ���...
		 ��ü�� �ҷ����� �޼ҵ带 Ȱ���ϱ� ���ؼ�
		 */
		MemberService service = new MemberServiceImpl();
String		id = "hong";
String		password = "pass";
String		name = "ȫ�浿";
int			age = 20;
String		addr = "�����";
		service.join(id, password, name, age, addr);
				
		System.out.println("ȸ�������� �Ǿ����ϴ�");
		System.out.println("�α����� ���ּ���");
		System.out.println("ID�� �Է� ���ּ���");
	//	id = scanner.next();
		System.out.println("����� �Է����ּ���");
	//	password = scanner.next();
		id = "hong";
		password = "pass";
		service.logint(id, password);
		
		scanner.close();
	}
}
