package api.lang.String;
/*
 java.lang.String
 replace("OLD", "NEW") : String 문자열에서 OLD 글자를 NEW 로 바꾼다.
 만약 대체하는 글자가 복수이면 replaceAll 을 사용한다.
 */
public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Tom".replace("Tom", "Alex"));
		System.out.println("A B C D : A B C D".replaceAll("C D", "E F"));
		/*
		 위 문법은 자바 버전 5(JDK 1.5) 까지의 문법입니다.
		 버전 5 이후 replace() 기능이 확대되어 replaceAll() 처럼
		 복수의 글자에도 반응하게 되었습니다.
		 그렇다면 차이점은 없나? 아닙니다.
		 정규식에 대한 기능이 있는지 없는 여부에 따른 차이점이 있습니다. 
		 */
		System.out.println("[1] A B C D : A B C D".replace("C D", "E F"));
		System.out.println("[2] A B C D : A B C D".replaceAll("C D", "E F"));
		
		System.out.println("Hello Java !!".replace("!", ""));
		System.out.println("Hello Java !!".replaceAll(".!", ""));
		// .의 역할은 앞의 한자리를 의미
		// 느낌표랑 느낌표 한자리를 지움
		// 이 기능은 replaceAll() 에만 있습니다.
		// 따라서 replace() 보다는 정규식 처리까지 가능한 replaceAll() 을 권장
	}
}
