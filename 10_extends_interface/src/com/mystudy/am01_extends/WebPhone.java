package com.mystudy.am01_extends;

//Ŭ���� ���(extends) �ǽ�
/* �ǽ�1 : Phone Ŭ���� ��� Ȯ��(extends)
WebPhone Ŭ���� �ۼ�
Phone Ŭ������ ��� Ȯ��(extends)�ؼ� �ۼ�
������ ����
 -����ȣ(phoneNo)�� �޾Ƽ� ��ü����
 -Ÿ�� ���� "WebPhone"���� �Է�

��� �߰�
���˻� ��� �߰�
 - webSearch() : ">>WebPhone - �� �˻�" ���� ȭ�� ���
*/
public class WebPhone extends Mp3Phone {
	//������ ����
	public WebPhone(String phoneNo) {
		super("WebPhone", phoneNo);
	}
	
	//�� �˻� ��� ����
	public void webSearch() {
		System.out.println(">>webPhone - ���˻�");
	}
}