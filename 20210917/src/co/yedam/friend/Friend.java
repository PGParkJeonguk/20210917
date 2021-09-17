package co.yedam.friend;

public class Friend {

	// 鞘靛
	private String name;
	private String phone;
	private String mail;
	private int high;
	private int weight;

	// 积己磊
	public Friend(String name, String phone, String mail, int high, int weight) {
		this.name = name;
		this.phone = phone;
		this.mail = mail;
		this.high = high;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void showinfo() {
		System.out.printf("[模备捞抚 : %s, 模备锅龋 : %s 模备E皋老 : %s 模备虐: %d  模备个公霸: %d]\n",name,phone,mail,high,weight);
	}
}
