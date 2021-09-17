package co.yedam.person;

import co.yedam.lesson.Student;

public class PersonExample {
	public static void main(String[] args) {
		// p1 => �̸�, Ű, ������, ������, ����
		// p2, p3
		// family �� �迭���� => ��������(�̸�, ������, ����) :�� 1.

		// family => Ű�� 165 �̻� ������ ���(�̸�, Ű, ������) :�� 2.

		// family => �������� AB���� ������ ���(�̸�, ������)

		Person p1 = new Person("������", 178.3, 76, "AB��", 28);
		Person p2 = new Person("�ּ���", 158.9, 45, "A��", 22);
		Person p3 = new Person("������", 168.7, 50, "B��", 25);

		Person[] family = { p1, p2, p3 };
		for (int i = 0; i < family.length; i++) {
			System.out.println("�̸� " + family[i].getPersonName() + " Ű " + family[i].getPersonHigh() + " ������"
					+ family[i].getPersonWeight() + " ������ " + family[i].getPersonBlood() + " ���� "
					+ family[i].getPersonAge());

		}
		System.out.println("�� 1");

		for (int i = 0; i < family.length; i++) {
			if (family[i].getPersonHigh() > 165) {
				System.out.println("�̸� " + family[i].getPersonName() + " Ű " + family[i].getPersonHigh() + " ������"
						+ family[i].getPersonWeight() + " ������ " + family[i].getPersonBlood() + " ���� "
						+ family[i].getPersonAge());
			}
		}
		System.out.println("�� 2");
		for (int i = 0; i < family.length; i++) {
			if (family[i].getPersonBlood().equals("AB��")) {
				System.out.println("�̸� " + family[i].getPersonName() + " Ű " + family[i].getPersonHigh() + " ������"
						+ family[i].getPersonWeight() + " ������ " + family[i].getPersonBlood() + " ���� "
						+ family[i].getPersonAge());
			}
		}
		System.out.println("�� 3");

	}

}
