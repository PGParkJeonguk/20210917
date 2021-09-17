package co.yedam.friend;

import java.util.Scanner;

/*
 * 친구 목록 관리
 * 친구 이름, 연락처, E-mail, 키, 몸무게
 * 1.친구등록 2.친구수정  3.친구목록 4. 친구검색 5. 친구삭제 9.종료
 */
public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] Friends = new Friend[100];
		Friends[0] = new Friend("송중기","010-111-2222","abce.co.kr",180,80);
		Friends[1] = new Friend("강호동","010-333-4444","sadf.co.kr",172,90);
		Friends[2] = new Friend("이회수","010-555-6666","qwer.co.kr",165,45);


		while (true) {
			System.out.println("1.친구등록 2.친구수정  3.친구목록 4. 친구검색 5. 친구삭제 9.종료");
			int menu = readInt("메뉴를 선택하세요");
			if (menu == 1) {
				System.out.println("친구등록 메뉴입니다.");
				String name = readStr("친구이름을 입력하세요.");
				String phone = readStr("친구전화번호를 입력하세요.");
				String mail = readStr("친구E메일을 입력하세요.");
				int high = readInt("친구의 키를 입력하세요");
				int weight = readInt("친구의 몸무게를 입력하세요");
				Friend friends = new Friend(name, phone, mail, high, weight);
				for (int i = 0; i < Friends.length; i++) {
					if (Friends[i] == null) {
						Friends[i] = friends;
						break;
					}
				}
				System.out.println("저장 완료했습니다.");
			} else if (menu == 2) {
				System.out.println("친구수정 메뉴입니다.");
				String search = readStr("수정할 친구 이름을 입력하세요.");
				String renum = readStr("변경할 친구 핸드폰번호를 입력하세요[변경안할려면 엔터쳐라]");
				String remail = readStr("변경할 친구 이메일을 입력하세요[변경안할려면 엔터쳐라]");
				String rehigh = readStr("변경할 친구의 키를 입력하세요[변경안할려면 엔터쳐라]");
				String reweight = readStr("변경할 친구의 몸무게를 입력하세요[변경안할려면 엔터쳐라]");
				boolean isExist = false;
				for (int i = 0; i < Friends.length; i++) {
					if (Friends[i] != null && Friends[i].getName().equals(search)) {
						if (!renum.equals("")) {
							Friends[i].setPhone(renum);
						}
						if (!remail.equals("")) {
							Friends[i].setMail(remail);
						}
						if (!rehigh.equals("")) {
							Friends[i].setHigh(Integer.parseInt(rehigh));
						}
						if (!reweight.equals("")) {
							Friends[i].setWeight(Integer.parseInt(reweight));
						}
						isExist = true;			
					}
				}
				if(isExist)
					System.out.println("정상적으로 수정했습니다.");
				else
					System.out.println("존재하지 않는 친구입니다.");
			}else if(menu == 3) {
				System.out.println("친구목록 메뉴입니다.");
				for(Friend friends : Friends) {
					if(friends != null)
						friends.showinfo();
				}
			}else if(menu == 4) {
				System.out.println("친구검색 메뉴입니다.");
				String search = readStr("찾아볼 친구를 입력하세요.");
				for(Friend friends : Friends) {
					if(friends != null && friends.getName().indexOf(search) != -1)
						friends.showinfo();
				}	
			}else if (menu == 5) {
				System.out.println("친구삭제 메뉴입니다.");
				String search = readStr("삭제할 친구명을 입력하세요.");
				for(int i = 0; i < Friends.length; i++) {
					if (Friends[i] != null && Friends[i].getName().indexOf(search) != -1)
						Friends[i] = null;
				}
				System.out.println("삭제완료.");
			}else if (menu == 9) {
				System.out.println("종료 메뉴입니다.");
				break;
			}
		} // end of while
		System.out.println("끝.");
	}// end of main

	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 값을 입력하였습니다. 다시 입력하세요");
			}
		}
		return result;
	}

}
