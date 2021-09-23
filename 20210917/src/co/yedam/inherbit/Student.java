package co.yedam.inherbit;

/*
 * People의 상속을 받는 클래스
 *   자식 extends People
 */
public class Student extends People {
	private int studentNo;

	Student(String name, String ssn) {
		super(name, ssn);
	}

	Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	// override - 부모가 가진 메소드를 재정의

	// Student -> People -> Object
	@Override
	public void showInfo() {
		System.out.println("Name: " + super.getName() + " SSN: " + this.getSsn() + " StudentNo " + this.getStudentNo());
	}

	@Override
	public String toString() {
		return "학생 [이름 " + this.getName() + " 주민번호 " + this.getSsn() + " 학번 " + this.getStudentNo() + "]";
	}

}
