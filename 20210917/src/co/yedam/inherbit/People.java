package co.yedam.inherbit;
/*
 * 상속 : 부모의 모든 재산을 자식이 물려받는것,  자바클래스에서도 부모클래스가 가지고 있는 모든 클래스 등을 자식클래스에게 정보를 주는것.
 */
public class People {
	private String name;
	private String ssn;
	
	public People() {
		
	}
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void showInfo() {
		System.out.println("이름은 " + name + " 주민번호: " + ssn);
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}
	
	
	
}
