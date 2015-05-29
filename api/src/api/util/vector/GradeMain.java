package api.util.vector;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeVO vo1 = new GradeVO();
		vo1.setHak("201509031122");
		vo1.setName("∂Û¿Ã∂«");
		vo1.setEng(80);
		vo1.setKor(90);
		vo1.setMath(100);
		
		GradeService gs = new GradeServiceImpl();
		gs.input(vo1);
		gs.print();
	}
}
