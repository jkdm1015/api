package api.util.vector;

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
		GradeVO vo = new GradeVO();
		System.out.println(vo.toString());
	}

	@Override
	// �й����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	public String searchGradeByHak(String hak) {
		return null;
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
