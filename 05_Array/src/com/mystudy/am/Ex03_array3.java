package com.mystudy.am;

public class Ex03_array3 {

	public static void main(String[] args) {
		/* 문제
		*
		**
		***
		****
		*****
		*/
		////////////////
		//char 타입의 데이타 5개를 저장할 수 있는 배열을 만들고 출력
		//배열의 변수명 : ch
		//char[] ch = new char[5];
		//char[] ch = {'*','*','*','*','*'};
		//System.out.println("-" + ch[0] + "-");
		
		//방법1 배열 전체에 '*'로 채우고 선택적으로 출력
		//*
		//**
		char[] ch = new char[5];
		for (int i=0; i<ch.length; i++) {
			ch[i] = '*';
		}
		
		for (int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		System.out.println("--------------");
		for (int starCnt=1; starCnt<=5; starCnt++) {
			for (int i=0; i<starCnt; i++) {
				System.out.print(ch[i]);
			}
			System.out.println();
		}
		
		System.out.println("===================");
		//방법2 순차적으로 '*'를 넣으면서 배열값 전체 출력
		//*    
		//**   
		//***  
		//첫번째 위치에 '*' 입력후 전체 출력
		//두번째 위치에 '*' 입력후 전체 출력
		char[] stars = new char[5];
		
		//첫번째 위치에 '*' 입력후 전체 출력
//		stars[0] = '*';
//		for (int i=0; i<stars.length; i++) {
//			System.out.print(stars[i]);
//		}
//		System.out.println();
//		
//		stars[1] = '*';
//		for (int i=0; i<stars.length; i++) {
//			System.out.print(stars[i]);
//		}
//		System.out.println();
//		
//		stars[2] = '*';
//		printArray(stars);
//		
//		stars[3] = '*';
//		printArray(stars);
//		
//		stars[4] = '*';
//		printArray(stars);
		
		System.out.println("-------");
		for (int i=0; i<stars.length; i++) {
			stars[i] = '*';
			printArray(stars);
		}
		
	}
	
	static void printArray(char[] stars) {
		for (int i=0; i<stars.length; i++) {
			System.out.print(stars[i]);
		}
		System.out.println();
	}

}
