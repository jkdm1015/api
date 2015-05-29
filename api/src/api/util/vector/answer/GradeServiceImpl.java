package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	/*
	 * �޼ҵ帶�� �����ϴ� �ټ��� ��(�л��� �������̴�)�� �ʿ��ѵ�, 
	 * �ѱ����� ������ �÷����� �õ忡 �����ؾ߰ڴ�. �ʵ忡 �����ؾ�
	 * �޼ҵ���� ���� ������ �� �����ϱ�....
	 */
	private Vector<GradeVO> vc = new Vector<GradeVO>();
	GradeVO grade = new GradeVO();
	
	@Override
	/*
	 * �л����� ������ �Է¹޴� ���ΰ�. �׷� �Է¹޾Ƽ� ������ ������ 
	 * �ʿ��ϰڴµ�... �迭�� �ٸ� ������ �����ϴ� �����ε� �ѹ�
	 * �����ϸ� �߰��� �ø� �� ������ �������� Ȯ���ϴ� �÷����� �����ؾ߰ڱ�
	 *  �׷��� ���� ���� �ƴ°� ���� ���̴� ���Ϳ� �־����
	 */
	public void input(GradeVO vo) {
		vc.add(vo);
	}

	@Override
	// ����ϴ� ���ΰ�? �׷� vo ��ü�� toString() �����;���
	public void print() {
		System.out.println(vc.toString());
		
	}

	@Override
	/*
	 * �й����� ������ ��ȸ�ϴ� ����̱� �й��� ���� �� �л����Ը�
	 *  �����ϹǷ� ���ϰ��� String ���״� ������ for loop +
	 * ������ if �� �������
	 */
	public String searchGradeByHak(String hak) {
		String msg = "";
		for(int i = 0 ; i<vc.size(); i++){
			// myHak �� ���Ϳ��� i��° ��ҿ��� �й��� �����Ͽ� ���� ����
			String myHak = vc.elementAt(i).getHak();
			// �Ķ���ͷ� �޾ƿ� hak �� ���Ϳ� ����ִ� myHak �� ��ġ�ϴ��� üũ
			System.out.println("�Ķ���� ���� : "+hak);
			System.out.println("���� �й� : "+myHak);
			/*
			 �̷��� ����� �غ��� 
			 �Ķ���� ���� : 1111
			 �����й� : 1111�� �Ǿ��ִ�
			 */
			if(hak.equalsIgnoreCase(myHak)){
				msg = hak;
				break;
			}else{
				msg = "��ȸ�ϴ� �й��� �����ϴ�.";
			}
		}return msg;
	}

	@Override
	/*
	 * �̸����� ������ȸ�ε� ���ϰ��� �����ΰ��� ���� �������� String ��
	 * ó���ϰԲ� ����Ǿ��� ���ϰ��� �ϳ��� �������� for
	 * loop + if �����ۿ��� ���� ��� ��� ������ ������ �װ� ��߰ڴ�.
	 */
	public Vector<String> searchGradeByName(String name) {
		Vector<String> local = new Vector<String>();
		for(int i = 0 ; i<vc.size(); i++){
			// myHak �� ���Ϳ��� i��° ��ҿ��� �й��� �����Ͽ� ���� ����
			String myName = vc.elementAt(i).getName();
			// �Ķ���ͷ� �޾ƿ� hak �� ���Ϳ� ����ִ� myHak �� ��ġ�ϴ��� üũ
			if(name.equalsIgnoreCase(myName)){
				local.add(name);
			}else{
				 local.add("");
			}
		}return local;
	}

	@Override
	/*
	 * ���������ΰ����� Collections.sort ���� �ȴٴµ� ���� �׶� ó������
	 */
	public void descGradeTotal() {

	}

	@Override
	// ���������̸� Arrays.sort �� ���� �ǰڱ�
	public void ascGradeTotal() {

	}

}
