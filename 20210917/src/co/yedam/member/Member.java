package co.yedam.member;

public class Member {
	// ID�� ���ڿ��� user1, �̸��� ���ڿ���, �ּҸ� ���ʹ�.
	private String memberID;
	private String name;
	private String addres;
	
	//������: �ʵ忡 ���� �ʱ�ȭ �ϴµ� ���� - ��ȯ�Ǵ� Ÿ���� ����,Ŭ�����̸��� �Ȱ��� ����
	public Member(){		
	}
	
	public Member(String mId){
		memberID = mId;
	}
	
	public Member(String mId, String n, String a){
		memberID = mId; 
		name = n ;
		addres = a;
	}
	
	public void setMemberID(String mid) {
		memberID = mid;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAddres(String a) {
		addres = a;
	}
	
	public String getMemberID() {
		return memberID; // ��ȯ���ִ� �ʵ�:���̵�.
	}
	
	public String getName() {
		return name;	// ��ȯ���ִ� �ʵ�:�̸�.
	}
	
	public String getAddres() {
		return addres; 		// ��ȯ���ִ� �ʵ�:�ּ�.
	}
	
	//�޼ҵ�
	public void showinfo() {
		System.out.println("���̵�: " + memberID + "�̸�: " + name + "�ּ�" + addres);
	}

	public void showMemberID() {
		System.out.println("���̵�: " + memberID);
	}

	public void showname() {
		System.out.println(" �̸�: " + name);
	}

	public void showaddres() {
		System.out.println(" �ּ�" + addres);
	}
}
