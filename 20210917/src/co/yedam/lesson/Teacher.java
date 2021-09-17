package co.yedam.lesson;

/*
* 선생님의 이름, 가르치는 과목
*/

public class Teacher {
	//필드 생성
	private String name;
	private String major;
	
	//생성자
	// Teacher t1 = new Teacher(); => 공간을 만드는것 = 인스턴스 생성.
	public Teacher (String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	//메소드
	public void setName(String name) {
		this.name = name;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {
		return this.major;
	}
	
}
