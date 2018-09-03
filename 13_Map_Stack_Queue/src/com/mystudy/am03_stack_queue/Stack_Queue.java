package com.mystudy.am03_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//ť(Queue) �������̽� - LinkedList Ŭ����
// - ���»� ������ ���(���Լ���)

//����(Stack) 
//���»����� �ٴ��� ���� ���� ����(���Լ���)
public class Stack_Queue {

	public static void main(String[] args) {
		//ť(Queue) : ���Լ���
		System.out.println("--- ť(Queue) : ���Լ��� ---");
		Queue que = new LinkedList();
		que.offer("1.ù°"); //add���� ���
		que.offer("2.��°"); 
		que.offer("3.��°"); 
		que.offer("4.��°");
		System.out.println(que);
		System.out.println("---- peek() ---");
		//peek() : ����Ÿ Ȯ�θ�, �������� ����
		System.out.println("que.peek(): "+ que.peek());
		System.out.println("que.peek(): "+ que.peek());
		
		System.out.println("---- poll() ---");
		//poll() : ����Ÿ�� ������, ����Ÿ�� ������ null ����
//		System.out.println("que.poll(): " + que.poll());
//		System.out.println("que.poll(): " + que.poll());
//		System.out.println("que.poll(): " + que.poll());
//		System.out.println("que.poll(): " + que.poll());
//		System.out.println("que.poll(): " + que.poll());
//		System.out.println("que.poll(): " + que.poll());
		
		//��ü����Ÿ ����
		System.out.println("--- ��ü ����Ÿ ���� ---");
		System.out.println("que.isEmpty(): " + que.isEmpty());
		//ť�� ������� ������ ����Ÿ ����
		System.out.println("que.size(): " + que.size());
		//while (que.isEmpty() == false) {
		while (!que.isEmpty()) {
			System.out.println(que.poll());
		}
		System.out.println("que.size(): " + que.size());
		
		//////////////////////////////////////////////
		System.out.println("=======����(Stack) : LIFO(���Լ���) ======");
		Stack st = new Stack();
		st.push("1.ù°");
		st.push("2.��°");
		st.push("3.��°");
		st.push("4.��°");
		System.out.println(st);
		System.out.println("st.peek(): " + st.peek());
		System.out.println("st.size(): " + st.size());
		
		//peek(), pop() ����Ÿ ��ȸ �Ǵ� ������ �� �� ������ 
		//EmptyStackException ���ܹ߻�
//		System.out.println("st.pop(): " + st.pop());
//		System.out.println("st.pop(): " + st.pop());
//		System.out.println("st.pop(): " + st.pop());
//		System.out.println("st.pop(): " + st.pop());
//		System.out.println("st.pop(): " + st.pop()); //EmptyStackException
//		System.out.println("st.peek(): " + st.peek()); //EmptyStackException
		
		System.out.println("--- ��ü ����Ÿ ��ȸ ---");
		System.out.println(st.isEmpty());
		System.out.println(st.empty());
		System.out.println("st.size(): " + st.size());
		while (!st.empty()) { //������� ������
			System.out.println(st.pop());
			//System.out.println(st.peek());
		}
		System.out.println("st.size(): " + st.size());
	}

}













