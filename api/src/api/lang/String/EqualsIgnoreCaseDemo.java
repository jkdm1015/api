package api.lang.String;

public class EqualsIgnoreCaseDemo {
	public static void main(String[] args) {
		// 비교 대상의 대소문자 구분을 한다.
		System.out.println(
				"Hello".equals("hello") ? "같습니다" : "다릅니다"
				);
		// 비교 대상의 대소문자 구분을 하지 않는다.
		System.out.println(
				"Hello".equalsIgnoreCase("hello") ? "같습니다" : "다릅니다"
				);
	}
}
