package api.util.calender;

import java.util.Calendar;

/*
 java.util.Calender
 */
public class CalenderDemo {
	public static void main(String[] args) {
		String[] months = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월",
				"9월", "10월", "11월", "12월" };
		// Calendar.getInstance(); 는 내부적으로
		// 스태틱이 싱글톤 패턴으로 객체를 생성하는 방식이다.
		// 여러개의 인스턴스를 생성하지 않도록 방지하려는
		// 목적에서 코딩되었다.
		Calendar date = Calendar.getInstance();
		
		System.out.print("날짜 : ");
		System.out.print(date.get(Calendar.YEAR)+"년 ");
		// 월은 0 부터 시작이라서 +1을 해줘야 한다.
		// calendars is JANUARY which is 0 <= API에 이렇게 되어있음
		// 만약 1을 더하지 않으면 현재 월이 5월이면 4월이 출력된다.
		System.out.print((date.get(Calendar.MONTH)+1)+"월 ");
		System.out.print(date.get(Calendar.DATE)+"일 \n");
		
		System.out.print("시간 : ");
		System.out.print(date.get(Calendar.HOUR)+"시 ");
		System.out.print(date.get(Calendar.MINUTE)+"분 ");
		System.out.print(date.get(Calendar.SECOND)+"초 \n");
		
		System.out.println("===== 1달 후 =====");
		date.add(Calendar.MONTH,1);  // 현재 날짜에 1달을 더한 모습
		System.out.println(toString(date));
		/*
		 출력된 결과값 : java.util.GregorianCalendar 이 출력되므로
		 오버라이딩이 필요하다. 
		 */
		System.out.println("===== 7일 전 =====");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));
		/*
		 출력된 결과값 : java.util.GregorianCalendar 이 출력되므로
		 오버라이딩이 필요하다. 
		 */
		System.out.println("특정 날짜로 세팅");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 46);
		
		System.out.println("수정된 시간 출력");
		System.out.print(Calendar.HOUR+"시 ");
		System.out.print(Calendar.MINUTE+"분 ");
		System.out.print(Calendar.SECOND+"초 \n");
		/*
		 수정된 시간 출력결과값이 10시 12분 13초 처럼 되어 오버라이딩이 필요 
		 */
		
	}
	// 월은 0 부터 시작이라서 +1을 해줘야 한다.
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR)+"년 "
				+ (date.get(Calendar.MONTH)+1)+"월 "
				+ date.get(Calendar.DATE)+"일";
	}
	// date.add(Calendar.MONTH, 1)
	
}
