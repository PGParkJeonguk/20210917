package co.yedam.member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "�ڹ̸�", "�뱸 �߱� ���ϵ�");  //()=������ȣ��:ctr1 + click
		m1.showinfo();
		
//		m1.memberID = "user1";
		m1.setMemberID("user1");
//		m1.name = "Hong";
		m1.setName("�ڹ̸�");
//		m1.addres = "�߱� ���ϵ�";
		m1.setAddres("�߱� ���ϵ�");
		
//		System.out.println("���̵�: " +m1.memberID );
		System.out.println("���̵�: " +m1.getMemberID());
//		System.out.println("�̸�: " +m1.name);
		System.out.println("�̸�: " +m1.getName());
//		System.out.println("�ּ�: " +m1.addres);
		System.out.println("�ּ�: " +m1.getAddres());
		
		Member m2 = new Member("user2");
		m2.showinfo();
		Member m3 = new Member("user3","������","�뱸 ���� ����");
		m3.showinfo();
		m3.setName ("�ڱ浿");
		m3.showinfo();
		
		
	
//		m1.memberID = "user1";
//		m1.name = "Hong";
//		m1.addres = "�߱� ���ϵ�";
		
		
	}
}
