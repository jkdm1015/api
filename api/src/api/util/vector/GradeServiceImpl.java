package api.util.vector;

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
		GradeVO vo = new GradeVO();
		System.out.println(vo.toString());
	}

	@Override
	// 학번으로 성적을 검색해서 출력하는 메소드
	public String searchGradeByHak(String hak) {
		return null;
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
