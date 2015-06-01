package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	// <클래스타입> 을 제네릭이라고 한다.
	Vector<GradeVO> grade = new Vector<GradeVO>();

	// GradeVO[] vo = new GradeVO[grade.size()];

	@Override
	public void input(GradeVO vo) {
		// vo 객체를 Vector 에 저장
		grade.addElement(vo);
	}

	@Override
	// 성적표를 출력하는 메소드
	// vo.toString() 으로 처리 예상하고 있음.
	public void print() {
		for (int i = 0; i < grade.size(); i++) {
			System.out.println(grade.elementAt(i).toString());
		}
	}

	@Override
	// 학번으로 성적을 검색해서 출력하는 메소드
	public String searchGradeByHak(String hak) {
		for (GradeVO vo : grade) {
			if (vo.getHak().equalsIgnoreCase(hak)) {
				return vo.toString();
			}
		}
		return "없음";
	}

	@Override
	// 이름으로 성적을 검색해서 출력하는 메소드
	public Vector<String> searchGradeByName(String name) {
		Vector<String> vc = new Vector<String>();
		// 벡터나 기타 컬렉션 출력을 하게 되면..
		// 이터레이터 아니면 확장 for 문으로 처리한다.
		// 왜냐하면 확장 for 문은 인덱스를 따지지 않기 때문.. 무조건 전체 출력
		for (GradeVO vo : grade) {
			if (vo.getName().equalsIgnoreCase(name)) {
				/*
				 * 파라미터로 넘어온 이름과 동일한 VO 객체를 찾아서 String 형태로 벡터에 저장한다. 즉 vc 는
				 * String 타입이란 것 주의 GradeVO 타입이 아닙니다.
				 */
				vc.add(vo.toString());
			}
		}
		return vc; 
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
