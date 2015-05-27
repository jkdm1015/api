package api.lang.String;
/*
 java.lang.String
 contain(s) : s라는 글자가 포함되었는지 여부 확인
 */
public class ContainDemo {
	public static void main(String[] args) {
		String str = "abcde";
		
		System.out.println(str.contains("f") ? "f 포함" : "f 미포함");
		
	}
}
