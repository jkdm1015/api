package api.lang.math;

import java.util.Scanner;

/*
 java.lang.math
 random() 메소드는 난수를 생성시키는 기능을 한다.
 */
public class RandomDemo {
	public static void main(String[] args) {
		int com = (int) (Math.random()*5)+1;
		int myVal;
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while(true){
			i++;
			System.out.println("1부터 5까지 수자 맞추기 입니다.");
			System.out.println("현재는 "+i+"번째 시도입니다.");
			myVal = scanner.nextInt();
			if(myVal == com){
				System.out.println("컴퓨터가 발생한 숫자 : "+com);
				System.out.println("빙고!! 정답입니다.");
				break;
			}
			if(i==3){
				System.out.println("3번 시도 끝!! 실패입니다.");
				break;
			}
		}scanner.close();
	}
}
