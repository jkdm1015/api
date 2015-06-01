package api.util.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{
	// ȸ������ ����� �ϴ� �޼ҵ�
	// HashMap�� �ؾ� id ���� ������ password �� ȣ���ؾ߰ڳ�
	MemberVO vo = new MemberVO();
	Map<String,Object> map = new HashMap<String,Object>();
	
	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		/*
		 �� ������ DB�� �����ϴ� ���ϰ� ��ġ�Ѵ�.
		 ��, ���� Ȱ���ϸ鼭 �����ǰų� ���� �� �� ���̰�
		 ���� ���� �������� DB�� �����ϰ� ����. 
		 */
		vo.setAddr(addr);
		vo.setAge(age);
		vo.setId(id);
		vo.setName(name);
		vo.setPassword(password);
		/*
		 Map ���� ��������
		 1. map.put(vo.getId(),vo.getPassword()); // Ű�� ����
		 2. map.put("age",vo.getAge()); // valueOf �� ��ȯ ����
		 3. map.get(id); �ݵ�� String ������ "" <-- ���ͷ� ���
		 */
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		// Ű�� ���� ���Ͽ��� �������� String ���� ���Ͻ�Ű����
		// int Ÿ���� age �� String Ÿ������ ��ȯ
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
		
	}
	/*
	 * ȸ������ �� �α��� ����� �ϴ� �޼ҵ����Ŀ� 
	 * ���ٸ� ���� �����ϱ� �α��� ����, ����, �޽������� ���⿡�� ����
	 */
	@Override
	public void logint(String id, String password) {
		if(map.get("id").equals(id) && map.get("password").equals(password)){
			System.out.println("ȯ���մϴ�."+vo.getAddr()+"�� ��� "+vo.getAge()+"�� "+vo.getName()+"��");
			
		}else if(!map.get("id").equals(id)&&map.get("password").equals(password)){
			System.out.println("�Է��Ͻ� ID�� �������� �ʰų�, ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���");
		}else{
			System.out.println("����� �ٸ��ϴ�. �ٽ� �Է��ϼ���");
		}
		
	}

}
