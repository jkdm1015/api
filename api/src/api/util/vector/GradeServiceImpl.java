package api.util.vector;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Vector;

public class GradeServiceImpl implements GradeService{
	
	Vector<GradeVO> grade = new Vector<GradeVO>();
	@Override
	public void input(GradeVO vo) {
			grade.addElement(vo);
		
	}

	@Override
	// ����ǥ�� ����ϴ� �޼ҵ�
	// vo.toString() ���� ó�� �����ϰ� ����.
	public void print() {
		for(int i = 0 ; i< grade.size(); i++){
		System.out.println(grade.elementAt(i).toString());
		}
	}

	@Override
	// �й����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	public String searchGradeByHak(String hak) {
		String gr = "";
				if(grade.elements().nextElement().getHak().contains(hak)){
					
				}
				return gr;
	}

	@Override
	// �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	public Vector<String> searchGradeByName(String name) {
		return null;
	}

	@Override
	// �������� �������� �������� ����
	public void descGradeTotal() {
		
	}

	@Override
	// �������� �������� �������� ����
	public void ascGradeTotal() {
		
	}

}
