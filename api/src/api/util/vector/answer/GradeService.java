package api.util.vector.answer;
/*
 1. VO, Interface Ŭ�������̾�׷�
 2. VO getter, setter .. implement
 3. ����߿� Total �� ���ϴ� ����� �ʿ��ѵ�..
  	Total�� ���ϱ� ���ؼ��� �������� ���� �ʿ��ϰ� ������
  	VO���� �� ���ϹǷ�...
  	�������ϴ� ��ɰ� toString() ����� VO ���� ����
 4. �ϴ� VO �� �ϼ��Ѱ����� ���� Ȧ��.
 5. * Impl �� ����.. 
 	1) input()
 	2) print()
 	3) searchGradeByHak(String hak)
 	4) Vector<String> searchGradeByName(String name)
 	5) descGradeTotal()
 	6) ascGradeTotal()
 	- �޼ҵ� �м� �� �������~
 6. ���� ����� �����ؼ� ����ǰ(������Ÿ��)�� �����.
  	�� �̶� �׽�Ʈ ���� ������ ���̶�� �ǹ��� ���̰��� �ش�.
 7. 
 */
import java.util.Vector;

public interface GradeService {
	public void input(GradeVO vo);
	public void print();
	public String searchGradeByHak(String hak);
	public Vector<String> searchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
}
