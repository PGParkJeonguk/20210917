package co.yedam.lesson;

/*
 * 실행클래스 하나 + 라이브러리용 클래스 여러개 => 프로그램의 구성
 * 객체구성(학생, 선생님, 반) => 실행클래스 =>객체지향언어
 * 학생이라는 객체를 표현하기 위해서 학생클래스를 사용
 * 실제있었던일(학생)-> 자바에서표현하기(학생-클래스)
 * 실제에 있는것을 자바에 만드는 방법 -> ex) new 학생() :인스턴스.
 */
public class LessonExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("홍길동", "국사");
		
		Student s1 = new Student("김소영", "010-1111", "대구 중구");
		Student s2 = new Student("정혜윤", "010-2222", "대구 서구");
		
		//  선생님 한명이랑 학생 여러명을 담을수 있도록
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3학년 1반");
		l1.addStudents(s1);
		l1.addStudents(s2);
		
		Teacher t2 = l1.getTeacher(); // Teacher
		System.out.println("선생님 이름: " + t2.getName());
		System.out.println("선생님 과목: " + l1.getTeacher().getMajor());
		
		l1.showStudents();
	}
}
