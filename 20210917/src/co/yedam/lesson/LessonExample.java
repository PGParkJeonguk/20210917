package co.yedam.lesson;

/*
 * ����Ŭ���� �ϳ� + ���̺귯���� Ŭ���� ������ => ���α׷��� ����
 * ��ü����(�л�, ������, ��) => ����Ŭ���� =>��ü������
 * �л��̶�� ��ü�� ǥ���ϱ� ���ؼ� �л�Ŭ������ ���
 * �����־�����(�л�)-> �ڹٿ���ǥ���ϱ�(�л�-Ŭ����)
 * ������ �ִ°��� �ڹٿ� ����� ��� -> ex) new �л�() :�ν��Ͻ�.
 */
public class LessonExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("ȫ�浿", "����");
		
		Student s1 = new Student("��ҿ�", "010-1111", "�뱸 �߱�");
		Student s2 = new Student("������", "010-2222", "�뱸 ����");
		
		//  ������ �Ѹ��̶� �л� �������� ������ �ֵ���
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3�г� 1��");
		l1.addStudents(s1);
		l1.addStudents(s2);
		
		Teacher t2 = l1.getTeacher(); // Teacher
		System.out.println("������ �̸�: " + t2.getName());
		System.out.println("������ ����: " + l1.getTeacher().getMajor());
		
		l1.showStudents();
	}
}
