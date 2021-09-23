package co.yedam.Account;

import java.util.Scanner;

public class AppMain {
	
	//싱글톤 : 싱글톤을 쓰는 이유는  new 생성자 ==> 새로운 인스턴스를 계속 생성, 그래서 한번 만들어진 인스턴스를 계속 쓰고 싶을때.
	private static AppMain singleton = new AppMain();
	
	//생성자를 private 선언
	private AppMain() {
		
	}
	
	// method getInstance()
	public static AppMain getInstance() {
		return singleton;
	}
	

	private static Account[] accountArray = new Account[100];
	private static Scanner scn = new Scanner(System.in);
	static int num = 0;

	public void creatAccount() {
		System.out.println("===============");
		System.out.println("계좌등록 메뉴입니다.");
		System.out.println("===============");

		String acnum = readStr("계좌번호: ");
		String name = readStr("이름: ");
		int seedmoney = readInt("초기 입금금액: ");
		Account accounts = new Account(acnum, name, seedmoney);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = accounts;
				break;
			}
		}
	}

	public void accountList() {
		int cnt = 0;

		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.printf("계좌번호: %s 이름: %s 예금: %d\n", accountArray[cnt].getAno(), accountArray[cnt].getOwner(),
						accountArray[cnt].getBalance());
			}
			break;
		}
	}

	public void deposit() {
		System.out.println("===============");
		System.out.println("입금 메뉴입니다.");
		System.out.println("===============");
		String serach = readStr("계좌번호: ");
		int plus = readInt("입금액: ");
		if (findAccount(serach) != null) {
			int plusmoney = findAccount(serach).getBalance();
			findAccount(serach).setBalance(plusmoney + plus);
			System.out.println("예금이 완료되었습니다.");

		}
	}

	public void whitedraw() {
		System.out.println("===============");
		System.out.println("출금 메뉴입니다.");
		System.out.println("===============");
		String serach = readStr("계좌번호: ");
		int minus = readInt("출금액");
		int nowMoney = findAccount(serach).getBalance();
		if (nowMoney >= minus && findAccount(serach) != null) {
			findAccount(serach).setBalance(nowMoney - minus);
			System.out.println("출금이 완료되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	public Account findAccount(String serach) {
		int cnt = 0;

		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.printf("계좌번호: %s 이름: %s 예금: %d\n", accountArray[cnt].getAno(), accountArray[cnt].getOwner(),
						accountArray[cnt].getBalance());
			}
			break;
		}
		return null;
	}

	public void execute() {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("==================================================");
			System.out.println("1. 계좌생성 || 2. 계좌목록 || 3. 입금 || 4. 출금|| 5. 종료");
			System.out.println("==================================================");
			System.out.println("선택 >>>");
			
		int selectNo = scanner.nextInt();
		if (selectNo == 1) {
			creatAccount();
		} else if (selectNo == 2) {
			accountList();
		} else if (selectNo == 3) {
			deposit();
		} else if (selectNo == 4) {
			whitedraw();
		} else if (selectNo == 5) {
			run = false;
		}
	}
}

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