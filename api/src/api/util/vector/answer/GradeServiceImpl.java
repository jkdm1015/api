package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	/*
	 * 메소드마다 공유하는 다수의 값(학생이 여러명이니)이 필요한데, 
	 * 한군데에 저장할 컬렉션을 플드에 선언해야겠다. 필드에 선언해야
	 * 메소드들이 값을 공유할 수 있으니까....
	 */
	private Vector<GradeVO> vc = new Vector<GradeVO>();
	GradeVO grade = new GradeVO();
	
	@Override
	/*
	 * 학생별로 성적을 입력받는 것인가. 그럼 입력받아서 저장할 공간이 
	 * 필요하겠는데... 배열이 다른 변수를 저장하는 공간인데 한번
	 * 생성하면 추가로 늘릴 수 없으니 동적으로 확장하는 컬렉션을 선택해야겠군
	 *  그런데 내가 지금 아는건 벡터 뿐이니 벡터에 넣어야지
	 */
	public void input(GradeVO vo) {
		vc.add(vo);
	}

	@Override
	// 출력하는 것인가? 그럼 vo 객체의 toString() 가져와야지
	public void print() {
		System.out.println(vc.toString());
		
	}

	@Override
	/*
	 * 학번으로 성적을 조회하는 기능이군 학번은 오직 한 학생에게만
	 *  존재하므로 리턴값이 String 일테니 벡터의 for loop +
	 * 내부의 if 를 사용하자
	 */
	public String searchGradeByHak(String hak) {
		String msg = "";
		for(int i = 0 ; i<vc.size(); i++){
			// myHak 은 벡터에서 i번째 요소에서 학번을 리턴하여 담은 변수
			String myHak = vc.elementAt(i).getHak();
			// 파라미터로 받아온 hak 과 벡터에 담겨있는 myHak 이 일치하는지 체크
			System.out.println("파라미터 학점 : "+hak);
			System.out.println("마이 학번 : "+myHak);
			/*
			 이렇게 디버깅 해보니 
			 파라미터 학점 : 1111
			 마이학번 : 1111로 되어있다
			 */
			if(hak.equalsIgnoreCase(myHak)){
				msg = hak;
				break;
			}else{
				msg = "조회하는 학번이 없습니다.";
			}
		}return msg;
	}

	@Override
	/*
	 * 이름으로 성적조회인데 리턴값이 벡터인것을 보니 복수계의 String 을
	 * 처리하게끔 설계되었네 리턴값이 하나든 여러개든 for
	 * loop + if 구성밖에는 벡터 요소 출력 로직이 없으니 그걸 써야겠다.
	 */
	public Vector<String> searchGradeByName(String name) {
		Vector<String> local = new Vector<String>();
		for(int i = 0 ; i<vc.size(); i++){
			// myHak 은 벡터에서 i번째 요소에서 학번을 리턴하여 담은 변수
			String myName = vc.elementAt(i).getName();
			// 파라미터로 받아온 hak 과 벡터에 담겨있는 myHak 이 일치하는지 체크
			if(name.equalsIgnoreCase(myName)){
				local.add(name);
			}else{
				 local.add("");
			}
		}return local;
	}

	@Override
	/*
	 * 내림차순인가보다 Collections.sort 쓰면 된다는데 배우면 그때 처리하자
	 */
	public void descGradeTotal() {

	}

	@Override
	// 오름차순이면 Arrays.sort 를 쓰면 되겠군
	public void ascGradeTotal() {

	}

}
