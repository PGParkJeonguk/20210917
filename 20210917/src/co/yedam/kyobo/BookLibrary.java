package co.yedam.kyobo;

import java.util.Scanner;

/*
 *  1. 도서등록 2. 도서수정 3.도서목록 4. 도서명검색 5. 도서삭제 9.종료
 *  도서정보 = 도서제목/저자/출판사/가격
 *  
 */
public class BookLibrary {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Book[] KyoboLib = new Book[1000];
		KyoboLib[0] = new Book("혼자공부하는자바", "신용권", "한빛출판사", 25000);
		KyoboLib[1] = new Book("이것이 자바다", "신용권", "한빛출판사", 20000);
		KyoboLib[2] = new Book("혼자공부하는 도둑질", "홍길동", "우리출판사", 35000);
		
		while (true) {
			System.out.println("1. 도서등록 2. 도서수정 3.도서목록 4. 도서명검색 5. 도서삭제 9.종료");
			int menu = readInt("메뉴를 선택하세요.");
			if (menu == 1) {
				System.out.println("도서등록 메뉴입니다.");
				// 도서등록 :제목,저자,출판사,가격을 입력
				String title = readStr("책제목을 입력하세요.");
				String auth = readStr("저자를 입력하세요.");
				String press = readStr("출판사를 입력하세요.");
				int price = readInt("가격을 입력하세요.");
				Book book = new Book(title, auth, press, price);
				for (int i = 0; i < KyoboLib.length; i++) {
					if (KyoboLib[i] == null) { // 배열의 비어있는 위치에 저장하겠다.
						KyoboLib[i] = book;
						break;
					}
				}
				System.out.println("저장 완료.");
			} else if (menu == 2) {
				System.out.println("도서수정 메뉴입니다.");
				// 도서명으로 찾아와서 => 도서명(키) 키의 역할:
				// 키는 바꾸는 대상이 아님 , 저자,출판사,가격에 대해서만 바꿀꺼임
				// 바꾸지 않는것은 엔터쳐서 넘어가게 만들거임
				String search =readStr("수정할 도서명을 입력하세요.");
				String author =readStr("변경할 저자를 입력하세요[변경안할려면 엔터쳐라]"); //  null 아니고 ""값이 없는거
				String press = readStr("변경할 출판사를 입력하세요[변경안할려면 엔터쳐라]");
				String price = readStr("변경할 가격을 입력하세요[변경안할려면 엔터쳐라]");
				boolean isExist = false;		//조회하는책의 여부체크
				for(int i =0; i<KyoboLib.length; i++) {
					if(KyoboLib[i] != null && KyoboLib[i].getTitle().equals(search)) {
						if(!author.equals("")) {
							KyoboLib[i].setAuthor(author);							
						}if(!press.equals("")) {
							KyoboLib[i].setPress(press);							
						}if(!price.equals("")) {
							KyoboLib[i].setPrice(Integer.parseInt(price));							
						}
						isExist = true;
					}
				}
				if(isExist)
					System.out.println("정상적으로 수정했습니다.");
				else
					System.out.println("존재하지 않는 책입니다.");
			} else if (menu == 3) {
				System.out.println("도서목록 메뉴입니다.");
				for (Book book : KyoboLib) {
					if (book != null)
						book.showinfo();
				}
			} else if (menu == 4) {
				System.out.println("도서명검색 메뉴입니다.");
				String search = readStr("조회할 도서명을 입력하세요.");
				for (Book book : KyoboLib) {
					if (book != null && book.getTitle().indexOf(search) != -1)
						book.showinfo();
				}
			} else if (menu == 5) {
				System.out.println("도서삭제 메뉴입니다.");
				String search = readStr("삭제할 도서명을 입력하세요.");
				for (int i= 0 ; i<KyoboLib.length; i++ ) {
					if (KyoboLib[i] != null && KyoboLib[i].getTitle().indexOf(search) != -1)
						KyoboLib[i] = null;
				}
				System.out.println("삭제완료.");
			} else if (menu == 9) {
				System.out.println("종료 메뉴입니다.");
				break;
			}
		} // end of while
		System.out.println("끝.");

	}// end of main

	// 사용자의 입력값을 반환해주는 메소드 = 사용자의 입력값을 보여줌
	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	// 사용자의 입력값이 int타입으로 반환
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val); // "1000"(string) => 1000(int)
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력하였습니다. 다시 입력하세요");
			}
		}
		return result;
	}
}// end of class
