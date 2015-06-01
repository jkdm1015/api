package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	// <Ŭ����Ÿ��> �� ���׸��̶�� �Ѵ�.
	Vector<GradeVO> grade = new Vector<GradeVO>();

	// GradeVO[] vo = new GradeVO[grade.size()];

	@Override
	public void input(GradeVO vo) {
		// vo ��ü�� Vector �� ����
		grade.addElement(vo);
	}

	@Override
	// ����ǥ�� ����ϴ� �޼ҵ�
	// vo.toString() ���� ó�� �����ϰ� ����.
	public void print() {
		for (int i = 0; i < grade.size(); i++) {
			System.out.println(grade.elementAt(i).toString());
		}
	}

	@Override
	// �й����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	public String searchGradeByHak(String hak) {
		for (GradeVO vo : grade) {
			if (vo.getHak().equalsIgnoreCase(hak)) {
				return vo.toString();
			}
		}
		return "����";
	}

	@Override
	// �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	public Vector<String> searchGradeByName(String name) {
		Vector<String> vc = new Vector<String>();
		// ���ͳ� ��Ÿ �÷��� ����� �ϰ� �Ǹ�..
		// ���ͷ����� �ƴϸ� Ȯ�� for ������ ó���Ѵ�.
		// �ֳ��ϸ� Ȯ�� for ���� �ε����� ������ �ʱ� ����.. ������ ��ü ���
		for (GradeVO vo : grade) {
			if (vo.getName().equalsIgnoreCase(name)) {
				/*
				 * �Ķ���ͷ� �Ѿ�� �̸��� ������ VO ��ü�� ã�Ƽ� String ���·� ���Ϳ� �����Ѵ�. �� vc ��
				 * String Ÿ���̶� �� ���� GradeVO Ÿ���� �ƴմϴ�.
				 */
				vc.add(vo.toString());
			}
		}
		return vc; 
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
