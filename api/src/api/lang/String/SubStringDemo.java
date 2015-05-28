package api.lang.String;

/*
 java.lang.String 
 substring() 메소드는 시작위치 (begin) 부터 끝위치 (end) 범위 문자열 리턴
 begin <= x < end
 */
public class SubStringDemo {
	public static void main(String[] args) {
		/*
		 인덱스는 0부터 시작해서 공백도 1로 처리한다.
		 */
		System.out.println("파라미터가 한개일때 : " + "Hello Java".substring(6));
		System.out.println("파라미터가 두개일때 : " + "Hello Java".substring(6, 8));
		/*
		 6이지만 7번째 숫자인 J 부터 9번째 미만 글자인 a까지 출력 
		 그래서 Ja 리턴!
		 */
	}
}
