package api.util.vector.answer;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		GradeVO g1 = new GradeVO("1111","또라이",100,95,87);
		GradeVO g2 = new GradeVO("2222","뵤옹신",60,55,42);
		GradeVO g3 = new GradeVO("3333","싸이코",99,88,77);
		GradeVO g4 = new GradeVO("4444","싸이코",100,98,95);
		
		service.input(g1);
		service.input(g2);
		service.input(g3);
		service.input(g4);
		service.print();
		/*
		 성적표 [이름 : , 학번 : , 국어 : 0, 영어 : 0, 수학 : 0, 총점 : 0] 이 나온다.. 
		 grade 를 출력하는데, 벡터에 들어있는 녀석이 아니라 그냥 널값이다
		 그럼 벡터에 grade를 가져오는 방법은?
		 grade 대신에 vc.toString() 를 넣어주면 된다.
		 */
		String dummy = service.searchGradeByHak("1111");
		System.out.println(dummy);
		Vector<String> temp = new Vector<String>();
		temp = service.searchGradeByName("싸이코");
		System.out.println(temp.toString());
	}
}
