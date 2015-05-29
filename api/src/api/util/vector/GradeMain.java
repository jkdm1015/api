package api.util.vector;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeVO vo1 = new GradeVO("1111","라이또",80,90,100);
		GradeVO vo2 = new GradeVO("2222","또라이",87,77,60);
		GradeVO vo3 = new GradeVO("3333","싸이코",89,96,55);

		GradeService gs = new GradeServiceImpl();
		gs.input(vo1);
		gs.input(vo2);
		gs.input(vo3);
		gs.print();
		System.out.println();
		System.out.println(gs.searchGradeByHak("3333"));
		System.out.println(gs.searchGradeByName("라이또"));
	}
}
