package co.yedam.Account;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scn = new Scanner(System.in);
	static int num = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("==================================================");
			System.out.println("1. ���»��� || 2. ���¸�� || 3. �Ա� || 4. ���|| 5. ����");
			System.out.println("==================================================");
			System.out.println("���� >>>");

			int selectNo = scn.nextInt();
			scn.nextLine();

			if (selectNo == 1) {
				creatAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				whitedraw();
			} else if (selectNo == 5) {
				System.out.println("�����մϴ�.");
				run = false;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

		} // while ��

	} // main method ��

	private static void creatAccount() {
		System.out.println("===============");
		System.out.println("���µ�� �޴��Դϴ�.");
		System.out.println("===============");

		String acnum = readStr("���¹�ȣ: ");
		String name = readStr("�̸�: ");
		int seedmoney = readInt("�ʱ� �Աݱݾ�: ");
		Account accounts = new Account(acnum,name , seedmoney);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = accounts;
				break;
			}
		}
	}

	private static void accountList() {
		int cnt = 0;

		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.printf("���¹�ȣ: %s �̸�: %s ����: %d\n", accountArray[cnt].getAno(), accountArray[cnt].getOwner(),
						accountArray[cnt].getBalance());
			}
			break;
		}
	}

	private static Account findAccount(String serach) {
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null && accountArray[i].getAno().equals(serach))
				return accountArray[i];
		}
		System.out.println("�߸��Է��Ͽ����ϴ�.");
		return null;
	}

	private static void deposit() {
		System.out.println("===============");
		System.out.println("�Ա� �޴��Դϴ�.");
		System.out.println("===============");
		String serach = readStr("���¹�ȣ: ");
		int plus = readInt("�Աݾ�: ");
		if (findAccount(serach) != null) {
			int plusmoney = findAccount(serach).getBalance();
			findAccount(serach).setBalance(plusmoney + plus);
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");

		}

	}

	private static void whitedraw() {
		System.out.println("===============");
		System.out.println("��� �޴��Դϴ�.");
		System.out.println("===============");
		String serach = readStr("���¹�ȣ: ");
		int minus = readInt("��ݾ�");
		int nowMoney = findAccount(serach).getBalance();
		if (nowMoney  >= minus && findAccount(serach) != null) {
			findAccount(serach).setBalance(nowMoney - minus);
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
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
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
			}
		}
		return result;
	}

}
