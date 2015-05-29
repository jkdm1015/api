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
	// 성적표를 출력하는 메소드
	// vo.toString() 으로 처리 예상하고 있음.
	public void print() {
		for(int i = 0 ; i< grade.size(); i++){
		System.out.println(grade.elementAt(i).toString());
		}
	}

	@Override
	// 학번으로 성적을 검색해서 출력하는 메소드
	public String searchGradeByHak(String hak) {
		String gr = "";
				if(grade.elements().nextElement().getHak().contains(hak)){
					
				}
				return gr;
	}

	@Override
	// 이름으로 성적을 검색해서 출력하는 메소드
	public Vector<String> searchGradeByName(String name) {
		return null;
	}

	@Override
	// 종합점수 기준으로 내림차순 정렬
	public void descGradeTotal() {
		
	}

	@Override
	// 종합점수 기준으로 오름차순 정렬
	public void ascGradeTotal() {
		
	}

}
