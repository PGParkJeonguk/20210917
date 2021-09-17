package co.yedam.member;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "박미림", "대구 중구 내일동");  //()=생성자호출:ctr1 + click
		m1.showinfo();
		
//		m1.memberID = "user1";
		m1.setMemberID("user1");
//		m1.name = "Hong";
		m1.setName("박미림");
//		m1.addres = "중구 남일동";
		m1.setAddres("중구 남일동");
		
//		System.out.println("아이디: " +m1.memberID );
		System.out.println("아이디: " +m1.getMemberID());
//		System.out.println("이름: " +m1.name);
		System.out.println("이름: " +m1.getName());
//		System.out.println("주소: " +m1.addres);
		System.out.println("주소: " +m1.getAddres());
		
		Member m2 = new Member("user2");
		m2.showinfo();
		Member m3 = new Member("user3","박정욱","대구 동구 도동");
		m3.showinfo();
		m3.setName ("박길동");
		m3.showinfo();
		
		
	
//		m1.memberID = "user1";
//		m1.name = "Hong";
//		m1.addres = "중구 남일동";
		
		
	}
}
