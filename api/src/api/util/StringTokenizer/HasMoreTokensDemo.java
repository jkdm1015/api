package api.util.StringTokenizer;

import java.util.StringTokenizer;

public class HasMoreTokensDemo {
	public static void main(String[] args) {
		/*
		 구분자 혹은 문법 요소 단위를 token 이라고 하는데
		 특정 구분자를 지정하면 그것을 기준으로
		 잘라내는 클래스와 메소드
		 */
		String date = "2015/05/24";
		StringTokenizer tok = new StringTokenizer(date,"/");
		/*
		 위 생성자 파라미터 중 앞에것은 String 대상 객체,
		 뒤의 것은 구분자
		 */
		int idx = 0;
		/*
		 whi 친후에 자동완성 제안중 with enumeration
		 제일 위에것 선택..
		 그리고 나서 hasMoreElements() 에서
		 hasMoreTokens() 로만 변경 
		 */
		while (tok.hasMoreElements()) {
			String token = tok.nextToken();
			System.out.println("["+idx+"] : " + token );
			idx++;
		}
	}
}
