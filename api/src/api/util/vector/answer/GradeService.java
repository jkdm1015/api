package api.util.vector.answer;
/*
 1. VO, Interface 클래스다이어그램
 2. VO getter, setter .. implement
 3. 기능중에 Total 을 구하는 기능이 필요한데..
  	Total을 구하기 위해서는 과목점수 역시 필요하고 접근이
  	VO에서 더 편하므로...
  	총점구하는 기능과 toString() 기능은 VO 에서 구현
 4. 일단 VO 는 완성한것으로 보고 홀딩.
 5. * Impl 을 보니.. 
 	1) input()
 	2) print()
 	3) searchGradeByHak(String hak)
 	4) Vector<String> searchGradeByName(String name)
 	5) descGradeTotal()
 	6) ascGradeTotal()
 	- 메소드 분석 내 생각대로~
 6. 대충 기능을 구현해서 시제품(프로토타입)을 만든다.
  	※ 이때 테스트 값을 쓰레기 값이라는 의미의 더미값을 준다.
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
