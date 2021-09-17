package co.yedam;

public class Member {
	//필요한 필드만큼 생성
	//회원번호 , 이름, 연락처를 저장하고 싶다.
	int memberId;
	String name;
	String phone;
	
	
	// 메소드 (기능)
	public void showInfo() {
		System.out.println("아이디: " + memberId + ",이름 : " + name + ",연락처 " + phone);
	}
}
