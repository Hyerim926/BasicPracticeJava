package _0729.lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

interface Fun_Info{
public void Num_compare(); // lotto ������ȣ �ߺ�üũ�Լ�
public void Num_output(); // �ζǹ�ȣ ����Լ�
public void User_input(); // ����� ��ȣ �Է� �Լ�
public void Num_check(); // ��ȣ Ȯ�� �Լ�
public void Win_output(); // ���� ��ȣ ��� �Լ�
public void Rank(); // ��� ��� �Լ�
public void MainMenu(); // ���θ޴��Լ�
public void Question(); // ó������ ���ư��� �Լ�
}

class Lotto{
	List<Integer> lotto_num = new ArrayList<Integer>(7); // lotto��ȣ�� 7�� �̾Ƽ� ���� ����Ʈ ����
	List<Integer> user_input = new ArrayList<Integer>(7); // user�� �Է��� ��ȣ�� ���� ����Ʈ ����
	List<Integer> list  = new ArrayList<Integer>(7); // ��÷�� �ζ� ��ȣ(���ĵ�)�� ����ִ� ArrayList
	List<Integer> win_number  = new ArrayList<Integer>(7); // ���� ��ȣ�� ��� ����Ʈ
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ���� �Է°� �ޱ� 
	int count = 0; // ��÷�� �ζ� ��ȣ ����
	int win_count = 0; // ���� ��ȣ ����
	int sel = 0; // �޴� ���� ����
	Random ran = new Random();
	Boolean check = true; // �ߺ�üũ ����
	
	// Num_compare() ����
	public void Num_compare() { // lotto ������ȣ �ߺ�üũ�Լ�
		while (count < 7) { // ��ȣ�� 7���� �̱� ����
			int random = ran.nextInt(45) + 1;
			//1~45 ��ȣ random ���� �Է� [0�������� ����+1����]
			for (int i = 0; i < count; i++) { // 0���� count���� �ݺ��ϸ鼭
				if (lotto_num.get(i) == random) {
					// lotto_num�� i��° ����, random�� ����Ǿ��ִ� ���� ���ٸ�
						check = false; // check�� false�� �����ϰ� �ݺ��� ����
				}
				
			}
			if (check == true) { // check�� true��
			/* check�� true��� ���� ���� �ݺ����� �ش���� �ʴ´ٴ°�
			(�ݺ����� ��ġ�� check�� false�� ��)�̹Ƿ� lotto_num�� ����Ǿ��ִ� ����,
			random�� ���� �Ǿ� �ִ� ���� �ٸ��ٴ� ���� �� */
				lotto_num.add(random); // lotto_num�� random�� ����Ǿ��ִ� �� ����
				count++; // count�� 1������Ŵ
			}
			check = true; // check�� true�� �ٽ� �ʱ�ȭ
		}
	}
	
	// Num_output() ����
	public void Num_output() {
		Num_compare();
		// Num_compare() ȣ��(Num_compare()�� ������ ����Ʈ�� ���� �����ϴ� �Լ��̹Ƿ�)
		for (int i = 0; i < lotto_num.size(); i++) {
			// lotto_num�� ũ�⸸ŭ �ݺ��� ����
			list.add(lotto_num.get(i));
			// lotto_num�� ����ִ� ���� �����ͼ�, ���ο� ����Ʈ�� list�� ����(������ ����)
		}
		Collections.sort(list); // list�� ������������ ����
		lotto_num.clear(); // ����÷���� �� ���� �ߺ��Ǵ� �� ����
		System.out.println("======== ��÷ ��ȣ ========");
		System.out.println(list); // list�� ����Ǿ��ִ� �� ���
		System.out.println("=======================");
		System.out.println("\t��ȣ ��÷ �Ϸ�\n");
		Question(); // �ʱ� �޴��� ���ư����� ���� �Լ� ȣ��
	}
	
	// User_input() ����
	public void User_input() {
		int num = 0;
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.println("[" + (i+1) + "]��° ����� ��ȣ �Է� : ");
			
			try { // BufferedReader�� ��� ������ ����ó�� 
				num = Integer.parseInt(br.readLine());
				// �� Num_compare()������ ���������� ���ο� Integer������ �����ϰ� ����
				if (user_input.contains(num)) { // user_input ����Ʈ�� num�� ���� ���� ����ִٸ�
					System.out.println("�ߺ� �Է��� �� �����ϴ�.");
					i--; // �ٽ� �Է��ϱ� ���� ex. 2��° �ߺ� �Է� -> �� ��°�� ���Է��ϰԲ�
				} else if (num < 1 || num > 45) { // 1~45������ �Է°����ϰ��ϱ� ���� else if��
					System.out.println("1���� 45������ �Է� �����մϴ�.");
					i--;
				} else {
					user_input.add(num); // ���� if���ǿ� ��� �ش����� ������, user_input����Ʈ�� ���� ����
				}
			} catch (IOException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println();
		Question();
	}
	
	// Num_check() ���� , �Ʒ��� �ߺ� for���� list�� i��° ���� user_input�� j��° ���� ��� ���ϴ� ��
	public void Num_check() {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < user_input.get(i); j++) {
				if (list.get(i) == user_input.get(j)) {
					win_count++; // win_count 1����
					win_number.add(user_input.get(j));
					// list�� i��° ���� user_input�� j��° ���� �����Ƿ�(��÷��ȣ) win_number�� �� �� ����
				}
			}
		}
	}
	
	// Win_output() ����
	public void Win_output() {
		Num_check();
		System.out.println("\n����� ����ϰڽ��ϴ�.");
		System.out.println("5 ");
		for (int i = 4; i >= 1; i--) {
			for (int j = 0; j < 500000000; j++) {
				;
			}
			System.out.println(i + " ");
				
			}
		System.out.println();
		System.out.println("\n======= ��÷ ��ȣ =======");
		System.out.println(list); // list�� ����Ǿ��ִ� ���� ���
		System.out.println("=======================");
		System.out.println("-----------------");
		System.out.println("�Է¹�ȣ => ");
		for (int i = 0; i < user_input.size(); i++) {
			System.out.println(user_input.get(i) + " ");
		}
		System.out.println("\n---------------");
		for (int i = 0; i < 500000000; i++) { // 500000000�� ũ�⸸ŭ �ݺ��� ����
			;
		}
		System.out.println("���� ��ȣ : ");
		System.out.println(win_number.toString());
		System.out.println("���� ���� : ");
		System.out.println(win_count);
		Rank();
		Question();
		}
	
		// Rank() ����
		public void Rank() {
			System.out.println();
			switch (win_count) {
			case 7 :
				System.out.println("1�� : �ζ� ��ȣ 7���� ���߾����ϴ�");
				break;
			case 6 :
				System.out.println("2�� : �ζ� ��ȣ 6���� ���߾����ϴ�");
				break;
			case 5 :
				System.out.println("3�� : �ζ� ��ȣ 5���� ���߾����ϴ�");
				break;
			case 4 :
				System.out.println("4�� : �ζ� ��ȣ 4���� ���߾����ϴ�");
				break;
			case 3 :
				System.out.println("5�� : �ζ� ��ȣ 3���� ���߾����ϴ�");
				break;
			default:
				System.out.println("�ƽ����ϴ�. ���� ��ȸ�� �̿��� �ּ���.");
				break;
			}
			System.out.println();
		}
		
		//MainMenu() ����
		public void MainMenu() {
			System.out.println("\t################");
			System.out.println("\t#    1.��ȣ��÷       #");
			System.out.println("\t#    2.��ȣ�Է�       #");
			System.out.println("\t#    3.�������       #");
			System.out.println("\t#    0.����            #");
			System.out.println("\t################");
			System.out.print("\t�޴� ���� => ");
			
			try {
				sel = Integer.parseInt(br.readLine()); // user�κ��� ��ȣ �Է� �ޱ�
			} catch (IOException ie) {
				ie.printStackTrace();
			} // 0~3 �� �Է����� ���� ����
			switch (sel) {
			case 1 :
				Num_output();
				break;
			case 2 :
				User_input();
				break;
			case 3 :
				Win_output();
				break;
			case 0 :
				System.out.println("\nLotto���α׷��� �����մϴ�. �����մϴ�");
				System.exit(0);
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ʱ� �޴��� ���ư��ϴ�.");
				MainMenu();
				break;
			}
		}
		
		// Question() ����
		public void Question() {
			String choice = "";
			System.out.println("�ʱ�ȭ������ ���ư��ڽ��ϱ�? Y/N : ");
			
			try {
				choice = br.readLine(); // user�κ��� y/n �Է� �ޱ�
			} catch (IOException ie) {
				ie.printStackTrace();
			}
			// ��ҹ��� ��� �޾Ƽ� ó���� �� �ֵ��� ����
			if (choice.equals("Y") || choice.equals("y")) {
				MainMenu();
			} else if (choice.equals("N") || choice.equals("n")) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
				Question();
			}
		}
	}
	
	
public class Lotto_Main {

	public static void main(String[] args) {
		Lotto lt = new Lotto(); // Lotto ��ü ����
		
		System.out.println(" #     ####   #####   #####   #### ");
		System.out.println(" #    #    #    #       #    #    #");
		System.out.println(" #    #    #    #       #    #    #");
		System.out.println(" ####  ####     #       #     #### ");
		System.out.println("       HI~ NICE TO MEET YOU !      ");
		lt.MainMenu(); // MainMenu() ȣ��
	}

}
