package co.yedam.lesson;

public class Lesson {
	private Teacher teacher;
	private String group; //몇학년 몇반인지의 정보를 담음
	private Student[] students;
	
	public Lesson() {
		students = new Student[3];
		
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void setGroup(String group) {
		this.group = group;
	}
	
	public void addStudents(Student student) {
		for(int i = 0 ; i <students.length; i++) {
			if(students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}
	public Teacher getTeacher() {
		return this.teacher;
	}
	
	public String getGrop() {
		return this.group;
	}
	
	public void showStudents() {
		for(int i =0; i<students.length; i++) {
			if(students[i] != null) {
				System.out.println("이름: "+ students[i].getStudentName() + "연락처: " + students[i].getPhone() + "주소: " + students[i].getAddress());
			}
			
		}
	}
}
