package co.yedam.inherbit;

/*
 * People�� ����� �޴� Ŭ����
 *   �ڽ� extends People
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

	// override - �θ� ���� �޼ҵ带 ������

	// Student -> People -> Object
	@Override
	public void showInfo() {
		System.out.println("Name: " + super.getName() + " SSN: " + this.getSsn() + " StudentNo " + this.getStudentNo());
	}

	@Override
	public String toString() {
		return "�л� [�̸� " + this.getName() + " �ֹι�ȣ " + this.getSsn() + " �й� " + this.getStudentNo() + "]";
	}

}
