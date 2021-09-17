package co.yedam.person;

import co.yedam.lesson.Student;

public class PersonExample {
	public static void main(String[] args) {
		// p1 => 이름, 키, 몸무게, 혈액형, 나이
		// p2, p3
		// family 로 배열선언 => 가족정보(이름, 혈액형, 나이) :끝 1.

		// family => 키가 165 이상 가족만 출력(이름, 키, 몸무게) :끝 2.

		// family => 혈액형이 AB형인 가족만 출력(이름, 혈액형)

		Person p1 = new Person("박정욱", 178.3, 76, "AB형", 28);
		Person p2 = new Person("최수아", 158.9, 45, "A형", 22);
		Person p3 = new Person("정유라", 168.7, 50, "B형", 25);

		Person[] family = { p1, p2, p3 };
		for (int i = 0; i < family.length; i++) {
			System.out.println("이름 " + family[i].getPersonName() + " 키 " + family[i].getPersonHigh() + " 몸무게"
					+ family[i].getPersonWeight() + " 혈액형 " + family[i].getPersonBlood() + " 나이 "
					+ family[i].getPersonAge());

		}
		System.out.println("끝 1");

		for (int i = 0; i < family.length; i++) {
			if (family[i].getPersonHigh() > 165) {
				System.out.println("이름 " + family[i].getPersonName() + " 키 " + family[i].getPersonHigh() + " 몸무게"
						+ family[i].getPersonWeight() + " 혈액형 " + family[i].getPersonBlood() + " 나이 "
						+ family[i].getPersonAge());
			}
		}
		System.out.println("끝 2");
		for (int i = 0; i < family.length; i++) {
			if (family[i].getPersonBlood().equals("AB형")) {
				System.out.println("이름 " + family[i].getPersonName() + " 키 " + family[i].getPersonHigh() + " 몸무게"
						+ family[i].getPersonWeight() + " 혈액형 " + family[i].getPersonBlood() + " 나이 "
						+ family[i].getPersonAge());
			}
		}
		System.out.println("끝 3");

	}

}
