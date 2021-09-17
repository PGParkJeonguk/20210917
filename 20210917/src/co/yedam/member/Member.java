package co.yedam.member;

public class Member {
	// ID를 문자열로 user1, 이름도 문자열로, 주소를 담고싶다.
	private String memberID;
	private String name;
	private String addres;
	
	//생성자: 필드에 값을 초기화 하는데 쓰임 - 반환되는 타입이 없음,클래스이름과 똑같이 생김
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
		return memberID; // 반환해주는 필드:아이디.
	}
	
	public String getName() {
		return name;	// 반환해주는 필드:이름.
	}
	
	public String getAddres() {
		return addres; 		// 반환해주는 필드:주소.
	}
	
	//메소드
	public void showinfo() {
		System.out.println("아이디: " + memberID + "이름: " + name + "주소" + addres);
	}

	public void showMemberID() {
		System.out.println("아이디: " + memberID);
	}

	public void showname() {
		System.out.println(" 이름: " + name);
	}

	public void showaddres() {
		System.out.println(" 주소" + addres);
	}
}
