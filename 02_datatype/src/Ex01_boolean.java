public class Ex01_boolean {
	public static void main(String[] args) {
		//�������� ���� : ����ŸŸ�� ������
		//booleanŸ�� : true, false ���� ����
		boolean bool1 = true; //���ڿ� "true"�� �ƴ�
		boolean bool2 = false;
		System.out.println("bool1 : " + bool1);
		System.out.println("bool2 : " + bool2);
		System.out.println("------------------");
		
		bool1 = false;
		bool1 = 100 > 200; //�񱳿��� ����� ����
		if (bool1) {
			System.out.println("bool1�� ���� true");
		} else {
			System.out.println("bool1�� ���� false");
		}
		
	}
}