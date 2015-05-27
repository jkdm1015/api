package api.lang.String;
/*
 java.lang.String
 endWith(s) : s 로 끝나는지 여부 체크 
 */
public class EndWithDemo {
	public static void main(String[] args) {
		System.out.println(
				"Hello.txt".endsWith("txt") ? "텍스트 파일" : "텍스트 파일이 아님");
	}
}
