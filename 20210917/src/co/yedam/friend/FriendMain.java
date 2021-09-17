package co.yedam.friend;

import java.util.Scanner;

/*
 * ģ�� ��� ����
 * ģ�� �̸�, ����ó, E-mail, Ű, ������
 * 1.ģ����� 2.ģ������  3.ģ����� 4. ģ���˻� 5. ģ������ 9.����
 */
public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] Friends = new Friend[100];
		Friends[0] = new Friend("���߱�","010-111-2222","abce.co.kr",180,80);
		Friends[1] = new Friend("��ȣ��","010-333-4444","sadf.co.kr",172,90);
		Friends[2] = new Friend("��ȸ��","010-555-6666","qwer.co.kr",165,45);


		while (true) {
			System.out.println("1.ģ����� 2.ģ������  3.ģ����� 4. ģ���˻� 5. ģ������ 9.����");
			int menu = readInt("�޴��� �����ϼ���");
			if (menu == 1) {
				System.out.println("ģ����� �޴��Դϴ�.");
				String name = readStr("ģ���̸��� �Է��ϼ���.");
				String phone = readStr("ģ����ȭ��ȣ�� �Է��ϼ���.");
				String mail = readStr("ģ��E������ �Է��ϼ���.");
				int high = readInt("ģ���� Ű�� �Է��ϼ���");
				int weight = readInt("ģ���� �����Ը� �Է��ϼ���");
				Friend friends = new Friend(name, phone, mail, high, weight);
				for (int i = 0; i < Friends.length; i++) {
					if (Friends[i] == null) {
						Friends[i] = friends;
						break;
					}
				}
				System.out.println("���� �Ϸ��߽��ϴ�.");
			} else if (menu == 2) {
				System.out.println("ģ������ �޴��Դϴ�.");
				String search = readStr("������ ģ�� �̸��� �Է��ϼ���.");
				String renum = readStr("������ ģ�� �ڵ�����ȣ�� �Է��ϼ���[������ҷ��� �����Ķ�]");
				String remail = readStr("������ ģ�� �̸����� �Է��ϼ���[������ҷ��� �����Ķ�]");
				String rehigh = readStr("������ ģ���� Ű�� �Է��ϼ���[������ҷ��� �����Ķ�]");
				String reweight = readStr("������ ģ���� �����Ը� �Է��ϼ���[������ҷ��� �����Ķ�]");
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
					System.out.println("���������� �����߽��ϴ�.");
				else
					System.out.println("�������� �ʴ� ģ���Դϴ�.");
			}else if(menu == 3) {
				System.out.println("ģ����� �޴��Դϴ�.");
				for(Friend friends : Friends) {
					if(friends != null)
						friends.showinfo();
				}
			}else if(menu == 4) {
				System.out.println("ģ���˻� �޴��Դϴ�.");
				String search = readStr("ã�ƺ� ģ���� �Է��ϼ���.");
				for(Friend friends : Friends) {
					if(friends != null && friends.getName().indexOf(search) != -1)
						friends.showinfo();
				}	
			}else if (menu == 5) {
				System.out.println("ģ������ �޴��Դϴ�.");
				String search = readStr("������ ģ������ �Է��ϼ���.");
				for(int i = 0; i < Friends.length; i++) {
					if (Friends[i] != null && Friends[i].getName().indexOf(search) != -1)
						Friends[i] = null;
				}
				System.out.println("�����Ϸ�.");
			}else if (menu == 9) {
				System.out.println("���� �޴��Դϴ�.");
				break;
			}
		} // end of while
		System.out.println("��.");
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
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
			}
		}
		return result;
	}

}
