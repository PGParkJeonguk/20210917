package co.yedam.lesson;

/*
 * 학생이름, 연락처, 학생주소 
 */
public class Student {
	private String Studentname;
	private String phone;
	private String address;
	
	public Student(String name, String phone, String address) {
		this.Studentname = name;
		this.phone = phone;
		this.address = address;
	}
	
	public void setStudentName(String name) {
		this.Studentname = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddres(String address) {
		this.address = address;
	}
	
	public String getStudentName() {
		return this.Studentname;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getAddress() {
		return this.address;
	}
}
