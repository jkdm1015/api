package api.util.vector.answer;

public class GradeVO {
	private int kor,eng,math;
	private String hak,name;
	
	@Override
	public String toString() {
		return "성적표 [이름 : " + name+", 학번 : " + hak + ", 국어 : " + kor 
				+ ", 영어 : " + eng + ", 수학 : " + math + ", 총점 : "+getTotal(kor, eng, math)+"]";
	}
	// 과목별 합계를 구하는 메소드
	// 국어 + 영어 + 수학
	public int getTotal(int kor, int eng, int math){
		int total = kor+eng+math;
		return total;
	}
	public GradeVO(){
		this("","",0,0,0);
	}
	public GradeVO(String hak, String name, int kor, int eng, int math) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
