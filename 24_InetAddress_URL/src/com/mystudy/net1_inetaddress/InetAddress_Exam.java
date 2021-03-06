package com.mystudy.net1_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Exam {

	public static void main(String[] args) throws UnknownHostException {
		//InetAddress : IP주소 관련 클래스
		InetAddress iaddr = InetAddress.getLocalHost();
		System.out.printf("호스트이름: %s \n", iaddr);
		System.out.printf("호스트 IP주소: %s \n", iaddr.getHostAddress());

		//---------------------------
		System.out.println("---- 네이버 주소 검색 ----");
		iaddr = InetAddress.getByName("www.naver.com");
		System.out.printf("호스트이름: %s %n", iaddr.getHostName());
		System.out.printf("호스트IP주소: %s %n", iaddr.getHostAddress());
		
		//---------------------------
		System.out.println("---- 네이버 IP주소들 검색 ----");
		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		
		for (InetAddress ia : iaArr) {
			System.out.printf("호스트이름: %s %n", ia.getHostName());
			System.out.printf("호스트IP주소: %s %n", ia.getHostAddress());
		}
		
	}

}
