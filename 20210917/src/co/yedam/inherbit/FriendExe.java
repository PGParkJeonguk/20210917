package co.yedam.inherbit;

import co.yedam.ScanUtil;

public class FriendExe {

	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// 친구, 학교친구,회사친구 => 배열에 저장.
		// CompFriend -> Friend , UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("박수아", "1111-1211"); // ""
		friends[1] = new Friend("정수아", "2222-1211");
		friends[2] = new Friend("홍수영", "2222-1311");
		friends[3] = new UnivFriend("박수진", "2345-1234", "수학과");
		friends[4] = new CompFriend("김철수", "2222-1212", "영업부");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println(" 1.친구추가, 2. 친구조회 , 3. 친구수정, 4. 친구삭제, 5.종료");
			System.out.println("---------------------------------------------------");
			int menu = ScanUtil.readInt("메뉴를 선택하세요.");
			if (menu == 1) {
				System.out.println("추가");
				addFriend();
			} else if (menu == 2) {
				System.out.println("조회");
				showList();
			} else if (menu == 3) {
				System.out.println("수정");
				modify();
			} else if (menu == 4) {
				System.out.println("삭제");
				remove();
			} else if (menu == 5) {
				System.out.println("종료합니다.");
				break;
			}
		}
		System.out.println("끝.");
//		ScanUtil.readInt("메뉴를 선택하세요.");		//static 사용하면 그대로 들고온다.
	}

	private void addFriend() {
		// 그냥친구등록할지 학교친구(전공)를 등록할지 회사친구(부서)를 등록할지에 따라서 등록해야하는것이 달라진다.
		System.out.println("1.일반친구등록 2.학교친구등록 3.회사친구등록");
		int choice = ScanUtil.readInt("메뉴를 선택");

		String name = ScanUtil.readStr("친구이름 입력하세요.");
		String phone = ScanUtil.readStr("연락처를 입력하세요");
		Friend friend = null;
		if (choice == 1) {
			friend = new Friend(name, phone);

		} else if (choice == 2) {
			String major = ScanUtil.readStr("전공을 입력하세요");
			friend = new UnivFriend(name, phone, major);

		} else if (choice == 3) {
			String depart = ScanUtil.readStr("부서를 입력하세요");
			friend = new CompFriend(name, phone, depart);
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("등록완료.");
	}

	private void showList() {
		// 이름, 연락처 입력 => 이름을 기준으로 해서 조회 , 연락처를 기준으로 조회 둘다 되게. => 홍길동, 김길동 -> 길동으로 검색하면
		// 이렇게 나온다.(index.of)
		// 1111-1211, 2222-1211 "1211"로 조회하면 1211이 포함된 모든것이 나오게
		// 길동, 1211 -> && 이름 & 연락처를 넣으면 정확히 일치하게 나오게 조치 (&&조건)
		String search = ScanUtil.readStr("이름을 입력하세요."); // ""
		String num = ScanUtil.readStr("전화번호를 입력하세요."); // ""
		for (int i = 0; i < friends.length; i++) {
			// 아무것도 없으면 안찾겠다.
			if (friends[i] != null)
				// 이름과 연락처로 찾겠다
				if (!num.equals("") && !search.equals("")) { // 그냥 엔터는 스킵한다.
					if (friends[i].getPhone().indexOf(num) != -1 && friends[i].getName().indexOf(search) != -1)
						System.out.println(friends[i].toString());
				}
				// 연락처로 찾겠다
				else if (!num.equals("")) {
					if (friends[i].getPhone().indexOf(num) != -1)
						System.out.println(friends[i].toString());
					// 이름으로 찾겠다
				} else if (!search.equals("")) {
					if (friends[i].getName().indexOf(search) != -1)
						System.out.println(friends[i].toString());
					// 전부 보여줌
				} else {
					System.out.println(friends[i].toString());
				}
		}
	}

	private void modify() {

		System.out.println("[친구목록]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("수정할 친구를 선택하세요.");
		String phone = ScanUtil.readStr("바꿀번호를 입력하세요."); // "" ==> 전화번호를 안바꾸겠다.
		if (!phone.equals(""))
			friends[num].setPhone(phone);

		if (friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("바꿀 전공을 입력하세요.");// "" ==> 전공을 안바꾸겠다.
			if (!major.equals(""))
				((UnivFriend) friends[num]).setMajor(major);

		} else if (friends[num] instanceof CompFriend) {
			String depart = ScanUtil.readStr("바꿀 부서를 입력하세요.");// "" ==> 부서를 안바꾸겠다.
			if (!depart.equals("")) {
				((CompFriend) friends[num]).setDepart(depart);
			}
		}

		System.out.println("수정완료.");

	}

	private void remove() {
		System.out.println("[친구목록]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("삭제할 친구를 선택하세요.");
		
		if(friends[num] != null) {
		friends[num] = null;
		System.out.println("친구가 삭제되었습니다.");
		}else if (friends[num] == null) {
			System.out.println("이미 삭제된 친구입니다.");
		}
	}
	
	

//		showList	
//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] != null && friends[i].getPhone().indexOf(num) != -1
//					&& friends[i].getName().indexOf(search) != -1) {
//				System.out.println(friends[i].toString());
//			}
//		}
// ==> 깔끔한 버젼.		
}