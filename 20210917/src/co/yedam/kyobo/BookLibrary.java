package co.yedam.kyobo;

import java.util.Scanner;

/*
 *  1. ������� 2. �������� 3.������� 4. ������˻� 5. �������� 9.����
 *  �������� = ��������/����/���ǻ�/����
 *  
 */
public class BookLibrary {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Book[] KyoboLib = new Book[1000];
		KyoboLib[0] = new Book("ȥ�ڰ����ϴ��ڹ�", "�ſ��", "�Ѻ����ǻ�", 25000);
		KyoboLib[1] = new Book("�̰��� �ڹٴ�", "�ſ��", "�Ѻ����ǻ�", 20000);
		KyoboLib[2] = new Book("ȥ�ڰ����ϴ� ������", "ȫ�浿", "�츮���ǻ�", 35000);
		
		while (true) {
			System.out.println("1. ������� 2. �������� 3.������� 4. ������˻� 5. �������� 9.����");
			int menu = readInt("�޴��� �����ϼ���.");
			if (menu == 1) {
				System.out.println("������� �޴��Դϴ�.");
				// ������� :����,����,���ǻ�,������ �Է�
				String title = readStr("å������ �Է��ϼ���.");
				String auth = readStr("���ڸ� �Է��ϼ���.");
				String press = readStr("���ǻ縦 �Է��ϼ���.");
				int price = readInt("������ �Է��ϼ���.");
				Book book = new Book(title, auth, press, price);
				for (int i = 0; i < KyoboLib.length; i++) {
					if (KyoboLib[i] == null) { // �迭�� ����ִ� ��ġ�� �����ϰڴ�.
						KyoboLib[i] = book;
						break;
					}
				}
				System.out.println("���� �Ϸ�.");
			} else if (menu == 2) {
				System.out.println("�������� �޴��Դϴ�.");
				// ���������� ã�ƿͼ� => ������(Ű) Ű�� ����:
				// Ű�� �ٲٴ� ����� �ƴ� , ����,���ǻ�,���ݿ� ���ؼ��� �ٲܲ���
				// �ٲ��� �ʴ°��� �����ļ� �Ѿ�� �������
				String search =readStr("������ �������� �Է��ϼ���.");
				String author =readStr("������ ���ڸ� �Է��ϼ���[������ҷ��� �����Ķ�]"); //  null �ƴϰ� ""���� ���°�
				String press = readStr("������ ���ǻ縦 �Է��ϼ���[������ҷ��� �����Ķ�]");
				String price = readStr("������ ������ �Է��ϼ���[������ҷ��� �����Ķ�]");
				boolean isExist = false;		//��ȸ�ϴ�å�� ����üũ
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
					System.out.println("���������� �����߽��ϴ�.");
				else
					System.out.println("�������� �ʴ� å�Դϴ�.");
			} else if (menu == 3) {
				System.out.println("������� �޴��Դϴ�.");
				for (Book book : KyoboLib) {
					if (book != null)
						book.showinfo();
				}
			} else if (menu == 4) {
				System.out.println("������˻� �޴��Դϴ�.");
				String search = readStr("��ȸ�� �������� �Է��ϼ���.");
				for (Book book : KyoboLib) {
					if (book != null && book.getTitle().indexOf(search) != -1)
						book.showinfo();
				}
			} else if (menu == 5) {
				System.out.println("�������� �޴��Դϴ�.");
				String search = readStr("������ �������� �Է��ϼ���.");
				for (int i= 0 ; i<KyoboLib.length; i++ ) {
					if (KyoboLib[i] != null && KyoboLib[i].getTitle().indexOf(search) != -1)
						KyoboLib[i] = null;
				}
				System.out.println("�����Ϸ�.");
			} else if (menu == 9) {
				System.out.println("���� �޴��Դϴ�.");
				break;
			}
		} // end of while
		System.out.println("��.");

	}// end of main

	// ������� �Է°��� ��ȯ���ִ� �޼ҵ� = ������� �Է°��� ������
	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	// ������� �Է°��� intŸ������ ��ȯ
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val); // "1000"(string) => 1000(int)
				break;
			} catch (Exception e) {
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���");
			}
		}
		return result;
	}
}// end of class
