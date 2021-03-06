package com.mystudy.pm02_sungjuk_vo;

//빈(Bean) 객체 만들기
//VO(Value Object) : 값을 저장하기 위한 클래스(객체)
//DTO(Data Transfer Object) : 값을 서로 전달하기 위한 객체
//StudentVO, StudentDTO, StudentVo, StudentDto
public class StudentVO {
	private String name; //이름
	private int kor; //국어점수
	private int eng; //영어점수
	private int math; //수학점수
	private int tot; //총점
	private double avg; //평균
	
	//---- 실습 -----------
	//생성자 이름,국어,영어,수학 점수를 입력받는 생성자(tot, avg 자동계산)
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	
	//toString() 오버라이딩
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + "]";
	}

	//모든 필드(멤버변수)의 setter, getter 작성
	//(국어,영어,수학 점수가 바뀌면 tot, avg 자동 수정 되도록 처리)
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if (kor < 0 || kor > 100) {
			System.out.println("[예외발생] 범위(0<=점수<=100)를 벗어남");
			return;
		}
		this.kor = kor;
		computeTotAvg();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		computeTotAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		computeTotAvg();
	}

	public String getName() {
		return name;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}

	//tot, avg 계산하는 메소드 작성
	public void computeTotAvg() {
		this.tot = kor + eng + math;
		this.avg = (tot * 100) / 3 / 100.0;
	}
	
	//printData 메소드 추가
	//(이름\t국어\t영어\t...)
	public void printData() {
		System.out.println(name +"\t"+ kor +"\t"+ eng +"\t"+ 
				math +"\t"+ tot +"\t"+ avg);
	}
	
	public String getData() {
		return name +"\t"+ kor +"\t"+ eng +"\t"+ 
				math +"\t"+ tot +"\t"+ avg;
	}
	
}
