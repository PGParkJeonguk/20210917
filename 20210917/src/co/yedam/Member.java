package co.yedam;

public class Member {
	//�ʿ��� �ʵ常ŭ ����
	//ȸ����ȣ , �̸�, ����ó�� �����ϰ� �ʹ�.
	int memberId;
	String name;
	String phone;
	
	
	// �޼ҵ� (���)
	public void showInfo() {
		System.out.println("���̵�: " + memberId + ",�̸� : " + name + ",����ó " + phone);
	}
}
