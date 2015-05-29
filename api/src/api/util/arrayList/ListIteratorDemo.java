package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		/*
		 * java api �� ����
		 * java.util.List ���������� ListIterator �� ����
		 * listIterator(int index) 
		 * Returns a list iterator over the elements in
		 * this list (in proper sequence), starting at the 
		 * specified position in the list.
		 * 
		 * �Ķ���Ͱ� ���� ���� ���������� �ѹ� ������ ������ 
		 * ����� �ǰ�, �Ķ����(list.size)�� ������
		 * �� �Ķ���Ͱ� �ε��� ������ �ؼ� �ٷ� ���������� ��µȴ�.
		 * ���� �Ķ���Ͱ� ���� ���¸� ��õ��
		 */
		ListIterator<String> it = list.listIterator(list.size());
		System.out.println("������ ���");
		/*
		 * ��Ŭ���� �������� �ڵ�������Ű�� �Ʒ� ���ǽĿ� it.hasNext() �� �����ȴ�. ���� ����� ���ؼ���
		 * hasPrevious() ��� �ٲ��ش�.
		 */
		while (it.hasPrevious()) {
			// �Ʒ� �޼ҵ嵵 previous() �ٲ�� �Ϳ� ����!!
			System.out.println(it.previous() + "\t");
		}
	}
}
