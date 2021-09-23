package co.yedam.inherbit;

import co.yedam.ScanUtil;

public class FriendExe {

	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// ģ��, �б�ģ��,ȸ��ģ�� => �迭�� ����.
		// CompFriend -> Friend , UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("�ڼ���", "1111-1211"); // ""
		friends[1] = new Friend("������", "2222-1211");
		friends[2] = new Friend("ȫ����", "2222-1311");
		friends[3] = new UnivFriend("�ڼ���", "2345-1234", "���а�");
		friends[4] = new CompFriend("��ö��", "2222-1212", "������");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println(" 1.ģ���߰�, 2. ģ����ȸ , 3. ģ������, 4. ģ������, 5.����");
			System.out.println("---------------------------------------------------");
			int menu = ScanUtil.readInt("�޴��� �����ϼ���.");
			if (menu == 1) {
				System.out.println("�߰�");
				addFriend();
			} else if (menu == 2) {
				System.out.println("��ȸ");
				showList();
			} else if (menu == 3) {
				System.out.println("����");
				modify();
			} else if (menu == 4) {
				System.out.println("����");
				remove();
			} else if (menu == 5) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
		System.out.println("��.");
//		ScanUtil.readInt("�޴��� �����ϼ���.");		//static ����ϸ� �״�� ���´�.
	}

	private void addFriend() {
		// �׳�ģ��������� �б�ģ��(����)�� ������� ȸ��ģ��(�μ�)�� ��������� ���� ����ؾ��ϴ°��� �޶�����.
		System.out.println("1.�Ϲ�ģ����� 2.�б�ģ����� 3.ȸ��ģ�����");
		int choice = ScanUtil.readInt("�޴��� ����");

		String name = ScanUtil.readStr("ģ���̸� �Է��ϼ���.");
		String phone = ScanUtil.readStr("����ó�� �Է��ϼ���");
		Friend friend = null;
		if (choice == 1) {
			friend = new Friend(name, phone);

		} else if (choice == 2) {
			String major = ScanUtil.readStr("������ �Է��ϼ���");
			friend = new UnivFriend(name, phone, major);

		} else if (choice == 3) {
			String depart = ScanUtil.readStr("�μ��� �Է��ϼ���");
			friend = new CompFriend(name, phone, depart);
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("��ϿϷ�.");
	}

	private void showList() {
		// �̸�, ����ó �Է� => �̸��� �������� �ؼ� ��ȸ , ����ó�� �������� ��ȸ �Ѵ� �ǰ�. => ȫ�浿, ��浿 -> �浿���� �˻��ϸ�
		// �̷��� ���´�.(index.of)
		// 1111-1211, 2222-1211 "1211"�� ��ȸ�ϸ� 1211�� ���Ե� ������ ������
		// �浿, 1211 -> && �̸� & ����ó�� ������ ��Ȯ�� ��ġ�ϰ� ������ ��ġ (&&����)
		String search = ScanUtil.readStr("�̸��� �Է��ϼ���."); // ""
		String num = ScanUtil.readStr("��ȭ��ȣ�� �Է��ϼ���."); // ""
		for (int i = 0; i < friends.length; i++) {
			// �ƹ��͵� ������ ��ã�ڴ�.
			if (friends[i] != null)
				// �̸��� ����ó�� ã�ڴ�
				if (!num.equals("") && !search.equals("")) { // �׳� ���ʹ� ��ŵ�Ѵ�.
					if (friends[i].getPhone().indexOf(num) != -1 && friends[i].getName().indexOf(search) != -1)
						System.out.println(friends[i].toString());
				}
				// ����ó�� ã�ڴ�
				else if (!num.equals("")) {
					if (friends[i].getPhone().indexOf(num) != -1)
						System.out.println(friends[i].toString());
					// �̸����� ã�ڴ�
				} else if (!search.equals("")) {
					if (friends[i].getName().indexOf(search) != -1)
						System.out.println(friends[i].toString());
					// ���� ������
				} else {
					System.out.println(friends[i].toString());
				}
		}
	}

	private void modify() {

		System.out.println("[ģ�����]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("������ ģ���� �����ϼ���.");
		String phone = ScanUtil.readStr("�ٲܹ�ȣ�� �Է��ϼ���."); // "" ==> ��ȭ��ȣ�� �ȹٲٰڴ�.
		if (!phone.equals(""))
			friends[num].setPhone(phone);

		if (friends[num] instanceof UnivFriend) {
			String major = ScanUtil.readStr("�ٲ� ������ �Է��ϼ���.");// "" ==> ������ �ȹٲٰڴ�.
			if (!major.equals(""))
				((UnivFriend) friends[num]).setMajor(major);

		} else if (friends[num] instanceof CompFriend) {
			String depart = ScanUtil.readStr("�ٲ� �μ��� �Է��ϼ���.");// "" ==> �μ��� �ȹٲٰڴ�.
			if (!depart.equals("")) {
				((CompFriend) friends[num]).setDepart(depart);
			}
		}

		System.out.println("�����Ϸ�.");

	}

	private void remove() {
		System.out.println("[ģ�����]");
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString());
		}
		int num = ScanUtil.readInt("������ ģ���� �����ϼ���.");
		
		if(friends[num] != null) {
		friends[num] = null;
		System.out.println("ģ���� �����Ǿ����ϴ�.");
		}else if (friends[num] == null) {
			System.out.println("�̹� ������ ģ���Դϴ�.");
		}
	}
	
	

//		showList	
//		for (int i = 0; i < friends.length; i++) {
//			if (friends[i] != null && friends[i].getPhone().indexOf(num) != -1
//					&& friends[i].getName().indexOf(search) != -1) {
//				System.out.println(friends[i].toString());
//			}
//		}
// ==> ����� ����.		
}