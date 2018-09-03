package com.mystudy.am;

public class Ex04_Wrapper {

	public static void main(String[] args) {
		//Wrapper Class : �⺻ ����Ÿ Ÿ���� ���Ȯ���س���  Ŭ���� ��Ī
		//�⺻����Ÿ Ÿ��: ��ü �ҹ���, char, int
		//Wrapper Class: �⺻ ����Ÿ Ÿ���� ù ���� �빮��. 
		// char - Character, int - Integer
		int num = 100;
		System.out.println("num: " + num);
		
		Integer intNum = new Integer(100);
		intNum = new Integer("100");
		
		System.out.println("intNum: " + intNum);
		
		intNum = 900; //Integer <- int : �ڵ�����ȯ
		num = intNum; //int <- Integer : �ڵ�����ȯ
		
		System.out.println("������ int �ִ밪: " + Integer.MAX_VALUE);
		System.out.println("������ int �ּҰ�: " + Integer.MIN_VALUE);
		
		num = Integer.parseInt("999"); //int <- String
		intNum = Integer.valueOf("999"); //Integer <- String
		
		//------------------------------------
		System.out.println("------ Boolean ----");
		Boolean bool = true;
		bool = new Boolean(true);
		bool = new Boolean("true");
		System.out.println("bool: " + bool);
		bool = new Boolean("true1");
		System.out.println("bool: " + bool);
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		//StringŸ�� -> Boolean
		bool = Boolean.valueOf("true"); //true
		System.out.println(bool);
		bool = Boolean.valueOf("true1");
		System.out.println(bool);
		bool = Boolean.valueOf("True"); //true
		System.out.println(bool);
		bool = Boolean.valueOf("TRUE"); //true
		System.out.println(bool);
		
		
		//------------------------------------
		//Float
		Float f = 10.5f; //Float <- float
		f = new Float(12.5f);
		f = new Float("12.5f");
		//f = new Float("12.a5f"); //java.lang.NumberFormatException
		//System.out.println("12.a5f : " + f);
		
		String str = String.valueOf(f);
		System.out.println(str);
		f = Float.valueOf(str);
		System.out.println(f);
		
		
		Double d = 10.5; //Double <-> double
		d = new Double(12.5d);
		d = new Double("12.5d");
		d = Double.valueOf("12.5");
		System.out.println(d);
		
	}

}