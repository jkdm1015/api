package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/*
  java.util.ArrayList�� �޼ҵ���
  add() �� Vector �� �����ϴ�
 */
public class AddDemo {
	public static void main(String[] args) {
		/*
		 ���ʹ� ���������� String �� ���.
		 ����ȭ�� �����ϱ⿡ �ӵ��� ������.
		 ArrayList�� ���������� StringBuffer �� ����Ѵ�.
		 ����ȭ ��������. 
		 */
		ArrayList<String> lists = new ArrayList<String>();
		
		// �׸��߰�
		lists.add("����");
		lists.add("�λ�");
		lists.add("�뱸");
		/*
		 ��� 1. iterator() ��� 
		 Iterator ��ü�� �����ϸ� ��Ŭ���� ���ȿ�
		 3���� ���û����� ���
		 ���߿��� with Iterator�� ����
		 */
		Iterator<String> it1 = lists.iterator();
		while (it1.hasNext()) {
			System.out.printf("1%s",it1.next());
		}
		System.out.println();
		/*
		 ��� 2. listIterator() �� �̿� 
		 */
		ListIterator<String> it2 = lists.listIterator();
		while (it2.hasNext()) {
			System.out.printf("2%s",it2.next());
			// �ٿ�ĳ������ �ʿ����. String �� �� �����̴�.
		}
		System.out.println();
		/*
		 ��� 3. previous() �̿� 
		 */
		while (it2.hasPrevious()) {
			// �޼ҵ���� �ٲ� �κ� üũ !!
			System.out.printf("3%s",it2.previous());
			// �� �޼ҵ�� ListIterator ������ ��밡��
		}
		// ��ü ��Ҹ� �ѹ��� �Է�
		// List �������̽��� java.util �Դϴ�.
		List<String> list2 = new ArrayList<String>();
		// �������̽�<���׸�> �������� = new ������ ��ü<���׸�>();
		// �����Դϴ�.
		list2.addAll(lists); // ����,�λ�,�뱸�� �����ؼ� ���� ���� ����
		/*
		 ��� 4. Ȯ�� for��
		 �ݷ����� �ε����� ���� ������ ���� �־����� �ʴ�
		 ������°� ���� ������ Ȯ�� for ���� ��� ���ȴ�
		 */
		for(String s : list2){
			System.out.printf("4%s",s);
		}
		System.out.println();
		// �˻� ����� ���� ������ �߰�(���̰� �߰�..)
		list2.add("����");
		list2.add("��õ");
		list2.add("����");
		/*
		 ��� 5. �˻��ؼ� ��� 
		 */
		Iterator<String> it3 = list2.iterator();
		String str;
		while (it3.hasNext()) {
			str = it3.next();
			if(str.startsWith("��")){ // "��" �ڷ� �����ϴ� ���ڿ� �˻�
				System.out.printf("5%s",str);
			}
		}
		System.out.println();
		// ������ �ڷ� �Է� ����.. �� �ߺ����� �����
		list2.add("��õ");
		list2.add("��õ");
		list2.add("��õ");
		
		Iterator<String> it4 = list2.iterator();
		while (it4.hasNext()) {
			System.out.printf("6%s",it4.next());
			// ����� printf ����
			// 10���� ���ڰ��� %d �� d �� decimal �� �����Դϴ�.
		}
		System.out.println();
	}
}
