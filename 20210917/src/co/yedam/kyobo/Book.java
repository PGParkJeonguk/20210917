package co.yedam.kyobo;

public class Book {
	 /*
	  *   도서정보 = 도서제목/저자/출판사/가격
	  */
	// 필드
	private String title;
	private String author;
	private String press;
	private int price;
	
	//생성자
	public Book(String title, String author, String press, int price) {
		super();
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = price;
	}
	
	//메소드

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void showinfo() {
		System.out.printf("[책제목 : %s, 저자 : %s 출판사 : %s 가격: %d]\n",title,author,press,price);
	}
	
}
