package api.util.hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySetDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 Map �� ���� �Է��ϴ� ��� => �Ѱ����� ���� put(); 
		 */
		map.put("�迬��", new Integer(98));
		map.put("�ƻ�� ����", new Integer(66));
		map.put("��Ʈ�� �ڹ�", new Integer(10));

		/*
		 Gof �� ������ ���� �߿���
		 Iterator �����̶�� �Ҹ���
		 Map ���� ���� �����ϴ� ����ȭ�� �����̴�. 
		 */
		/*
		 Map ���� Ű���� �������� ���� ��Ȳ�� ���� ����Ҷ���
		 entrySet() ��� 
		 Map ���� Ű ���� ����� ��� KeySet() ���
		 ��, ��� ������ Set �̿�
		 ������...
		 Collection ���� interface�� Set, List, Map ���� ��ǥ���ε�..
		 Set �� Map�� �ε��� ���� ��� ��ȣ ȣȯ�� �ߵǰ�
		 Set �� �ߺ��� ���� ����� �־
		 Map ���� Ű������ �ߺ��� ����� �ϴ� �κа��� ��ġ�ؼ�
		 Set �� ���� Ű��, Ȥ�� Ű+�������� ����ϴµ� ���δ�.
		 ����� Map �� Iterator �� ���
		 Set �� Iterator �� ����ϱ� �����̴�.
		 */
		/*
		 Map ���� ���� ����ϴ� ���� 3�����ε�..
		 ù��°�� key + value ���·� �Բ� ����ϴ� ��� 
		 entrySet() + Iterator ���� ���
		 */
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("������ : "+e.getKey() + ", ���� : "+e.getValue());
		}
		/*
		 Map ���� ���� ����ϴ� ���� 3�����ε�..
		 �ι�°�� key �� ����ϴ� ��� 
		 KeySet() ���
		 */
		set = map.keySet();
		System.out.println("������ ��� : "+set);
		/*
		 Map ���� ���� ����ϴ� ���� 3�����ε�..
		 ����°�� value �� ����ϴ� ��� 
		 Collection ���
		 */
		// Collection ���� ��Ŭ���� ���� �߿��� java.util.Collection ����
		Collection values = map.values();
		it = values.iterator();
		int total = 0;
		while (it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("���� : "+total);
		// Set �� List �迭�� Ŭ����ó�� ����� ������ size() �� �Ѵ�.
		System.out.println("��� : "+total/set.size());
		// Collections.max �� �ִ밪, min �� �ּҰ����� �Ѵ�.
		System.out.println("���� : "+Collections.max(values));
		System.out.println("���� : "+Collections.min(values));
	}
}
