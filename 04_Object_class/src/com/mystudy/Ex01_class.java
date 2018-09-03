package com.mystudy;

public class Ex01_class {
	int num; //�ʵ�(�������, �ν��Ͻ� ����), �Ӽ�(property, attribute)
	static int staticNum; //Ŭ��������, ����ƽ(static)����, �ν��Ͻ� ���� ���� 
	
	//public Ex01_class() {}

	public static void main(String[] args) {
		int num1 = 200;
		int num2 = 100;
		int result = 0;
		result = num1 + num2;
		System.out.println("result: " + result);
		System.out.println("-----------------");
		
		result = add(num1, num2); //
		System.out.println("result: " + result);
		System.out.println("-----------------");
		
		/////////////////////////////////////////////
		// ��ü ����(�ν��Ͻ� ����)
		// Ŭ����Ÿ�Ը� ������;
		// ������ = new Ŭ����������();
		// Ŭ����Ÿ�Ը� ������ = new Ŭ����������();
		Ex01_class ex01 = new Ex01_class(); //�⺻�����ڷ� ��ü����
		ex01.num = 1000;
		System.out.println("ex01.num : " + ex01.num);
		result = ex01.add(num1, num2);
		
		//Cannot make a static reference to the non-static field num
		//num = 2000; 
		
		//Cannot make a static reference to the non-static method sub(int, int) 
		//from the type Ex01_class
		//result = sub(num1, num2);
		
		//static �޼ҵ忡�� non-static �޼ҵ� ���
		//������ ��ü�� ���ؼ��� ���� ����
		result = ex01.sub(num1, num2);
		System.out.println("ex01.sub(num1, num2) : " + result);
		System.out.println("ex01: " + ex01);
	}
	//�޼ҵ� ����
	//void �޼ҵ��() {}
	//����Ÿ�� �޼ҵ��() {}
	//����Ÿ�� �޼ҵ��(�Ķ����Ÿ�� �Ķ���͸�, ...) {}
	
	//2���� �������� ���� �޾Ƽ� 2���� �������� ���� ����� �ǵ�����
	public static int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
}