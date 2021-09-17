package co.yedam.person;
/*
 * 이름, 키, 몸무게, 혈액형, 나이
 */
public class Person {
	private String name;
	private double high;
	private int weight;
	private String blood;
	private int age;
	
	
	public Person(String name, double high, int weight, String blood, int age) {
		this.name = name;
		this.high = high;
		this.weight = weight;
		this.blood = blood;
		this.age = age;
	}
	public void setPersonName(String name) {
		this.name = name;
	}
	public void setPersonHigh(double high) {
		this.high = high;
	}
	public void setPersonWeight(int weight) {
		this.weight = weight;
	}
	public void setPersonblood(String blood) {
		this.blood = blood;
	}
	public void setPersonAge(int age) {
		this.age = age;
	}
	
	public String getPersonName() {
		return this.name;
	}
	public double getPersonHigh() {
		return this.high;
	}
	public int getPersonWeight() {
		return this.weight;
	}
	public String getPersonBlood() {
		return this.blood;
	}
	public int getPersonAge() {
		return this.age;
	}
	
	public void showinfo() {
		System.out.println("이름: " + name + " 키: " + high + " 몸무게: " + weight + " 혈액형: " + blood + " 나이: " + age );
	}
}
